package typings.phaser.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.BaseCamera
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.DisplayList
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Image
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotCallback
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.phaser.integer
import typings.std.ArrayBuffer
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.GLenum
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  object Canvas {
    
    /**
      * The Canvas Renderer is responsible for managing 2D canvas rendering contexts, including the one used by the Game's canvas. It tracks the internal state of a given context and can renderer textured Game Objects to it, taking into account alpha, blending, and scaling.
      */
    @js.native
    trait CanvasRenderer extends StObject {
      
      /**
        * Should the Canvas use Image Smoothing or not when drawing Sprites?
        */
      var antialias: Boolean = js.native
      
      /**
        * Takes a Sprite Game Object, or any object that extends it, and draws it to the current context.
        * @param sprite The texture based Game Object to draw.
        * @param frame The frame to draw, doesn't have to be that owned by the Game Object.
        * @param camera The Camera to use for the rendering transform.
        * @param parentTransformMatrix The transform matrix of the parent container, if set.
        */
      def batchSprite(sprite: GameObject, frame: Frame, camera: Camera): Unit = js.native
      def batchSprite(sprite: GameObject, frame: Frame, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
      
      /**
        * The blend modes supported by the Canvas Renderer.
        * 
        * This object maps the {@link Phaser.BlendModes} to canvas compositing operations.
        */
      var blendModes: js.Array[js.Any] = js.native
      
      /**
        * The local configuration settings of the CanvasRenderer.
        */
      var config: js.Object = js.native
      
      /**
        * The canvas context currently used by the CanvasRenderer for all rendering operations.
        */
      var currentContext: CanvasRenderingContext2D = js.native
      
      /**
        * Destroys all object references in the Canvas Renderer.
        */
      def destroy(): Unit = js.native
      
      /**
        * The total number of Game Objects which were rendered in a frame.
        */
      var drawCount: Double = js.native
      
      /**
        * The Phaser Game instance that owns this renderer.
        */
      var game: Game = js.native
      
      /**
        * The canvas element which the Game uses.
        */
      var gameCanvas: HTMLCanvasElement = js.native
      
      /**
        * The canvas context used to render all Cameras in all Scenes during the game loop.
        */
      var gameContext: CanvasRenderingContext2D = js.native
      
      /**
        * The height of the canvas being rendered to.
        */
      var height: integer = js.native
      
      /**
        * Prepares the game canvas for rendering.
        */
      def init(): Unit = js.native
      
      /**
        * The event handler that manages the `resize` event dispatched by the Scale Manager.
        * @param gameSize The default Game Size object. This is the un-modified game dimensions.
        * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
        * @param displaySize The display Size object. The size of the canvas style width / height attributes.
        * @param resolution The Scale Manager resolution setting.
        */
      def onResize(gameSize: Size, baseSize: Size, displaySize: Size): Unit = js.native
      def onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Double): Unit = js.native
      
      /**
        * Restores the game context's global settings and takes a snapshot if one is scheduled.
        * 
        * The post-render step happens after all Cameras in all Scenes have been rendered.
        */
      def postRender(): Unit = js.native
      
      /**
        * Called at the start of the render loop.
        */
      def preRender(): Unit = js.native
      
      /**
        * Renders the Scene to the given Camera.
        * @param scene The Scene to render.
        * @param children The Game Objects within the Scene to be rendered.
        * @param interpolationPercentage The interpolation percentage to apply. Currently unused.
        * @param camera The Scene Camera to render with.
        */
      def render(scene: Scene, children: DisplayList, interpolationPercentage: Double, camera: Camera): Unit = js.native
      
      /**
        * Resets the transformation matrix of the current context to the identity matrix, thus resetting any transformation.
        */
      def resetTransform(): Unit = js.native
      
      /**
        * Resize the main game canvas.
        * @param width The new width of the renderer.
        * @param height The new height of the renderer.
        */
      def resize(): Unit = js.native
      def resize(width: Double): Unit = js.native
      def resize(width: Double, height: Double): Unit = js.native
      def resize(width: Unit, height: Double): Unit = js.native
      
      /**
        * Sets the global alpha of the current context.
        * @param alpha The new alpha to use, where 0 is fully transparent and 1 is fully opaque.
        */
      def setAlpha(alpha: Double): this.type = js.native
      
      /**
        * Sets the blend mode (compositing operation) of the current context.
        * @param blendMode The new blend mode which should be used.
        */
      def setBlendMode(blendMode: String): this.type = js.native
      
      /**
        * Changes the Canvas Rendering Context that all draw operations are performed against.
        * @param ctx The new Canvas Rendering Context to draw everything to. Leave empty to reset to the Game Canvas.
        */
      def setContext(): this.type = js.native
      def setContext(ctx: CanvasRenderingContext2D): this.type = js.native
      
      /**
        * Schedules a snapshot of the entire game viewport to be taken after the current frame is rendered.
        * 
        * To capture a specific area see the `snapshotArea` method. To capture a specific pixel, see `snapshotPixel`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
        * calling this method will override it.
        * 
        * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
        * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshot(callback: SnapshotCallback): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: Unit, encoderOptions: Double): this.type = js.native
      
      /**
        * Schedules a snapshot of the given area of the game viewport to be taken after the current frame is rendered.
        * 
        * To capture the whole game viewport see the `snapshot` method. To capture a specific pixel, see `snapshotPixel`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
        * calling this method will override it.
        * 
        * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
        * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param x The x coordinate to grab from.
        * @param y The y coordinate to grab from.
        * @param width The width of the area to grab.
        * @param height The height of the area to grab.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: String
      ): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: String,
        encoderOptions: Double
      ): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: Unit,
        encoderOptions: Double
      ): this.type = js.native
      
      /**
        * Takes a snapshot of the given area of the given canvas.
        * 
        * Unlike the other snapshot methods, this one is processed immediately and doesn't wait for the next render.
        * 
        * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
        * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param canvas The canvas to grab from.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param getPixel Grab a single pixel as a Color object, or an area as an Image object? Default false.
        * @param x The x coordinate to grab from. Default 0.
        * @param y The y coordinate to grab from. Default 0.
        * @param width The width of the area to grab. Default canvas.width.
        * @param height The height of the area to grab. Default canvas.height.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshotCanvas(
        canvas: HTMLCanvasElement,
        callback: SnapshotCallback,
        getPixel: js.UndefOr[Boolean],
        x: js.UndefOr[integer],
        y: js.UndefOr[integer],
        width: js.UndefOr[integer],
        height: js.UndefOr[integer],
        `type`: js.UndefOr[String],
        encoderOptions: js.UndefOr[Double]
      ): this.type = js.native
      
      /**
        * Schedules a snapshot of the given pixel from the game viewport to be taken after the current frame is rendered.
        * 
        * To capture the whole game viewport see the `snapshot` method. To capture a specific area, see `snapshotArea`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotArea`, for example, then
        * calling this method will override it.
        * 
        * Unlike the other two snapshot methods, this one will return a `Color` object containing the color data for
        * the requested pixel. It doesn't need to create an internal Canvas or Image object, so is a lot faster to execute,
        * using less memory.
        * @param x The x coordinate of the pixel to get.
        * @param y The y coordinate of the pixel to get.
        * @param callback The Function to invoke after the snapshot pixel data is extracted.
        */
      def snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): this.type = js.native
      
      /**
        * Details about the currently scheduled snapshot.
        * 
        * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
        */
      var snapshotState: SnapshotState = js.native
      
      /**
        * A constant which allows the renderer to be easily identified as a Canvas Renderer.
        */
      var `type`: integer = js.native
      
      /**
        * The width of the canvas being rendered to.
        */
      var width: integer = js.native
    }
  }
  
  object WebGL {
    
    object Pipelines {
      
      /**
        * BitmapMaskPipeline handles all bitmap masking rendering in WebGL. It works by using 
        * sampling two texture on the fragment shader and using the fragment's alpha to clip the region.
        * The config properties are:
        * - game: Current game instance.
        * - renderer: Current WebGL renderer.
        * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
        *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
        * - vertShader: Source for vertex shader as a string.
        * - fragShader: Source for fragment shader as a string.
        * - vertexCapacity: The amount of vertices that shall be allocated
        * - vertexSize: The size of a single vertex in bytes.
        */
      trait BitmapMaskPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * Binds necessary resources and renders the mask to a separated framebuffer.
          * The framebuffer for the masked object is also bound for further use.
          * @param mask GameObject used as mask.
          * @param maskedObject GameObject masked by the mask GameObject.
          * @param camera The camera rendering the current mask.
          */
        def beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera): Unit
        
        /**
          * The masked game objects framebuffer is unbound and its texture 
          * is bound together with the mask texture and the mask shader and 
          * a draw call with a single quad is processed. Here is where the
          * masking effect is applied.
          * @param mask GameObject used as a mask.
          */
        def endMask(mask: GameObject): Unit
        
        /**
          * Size of the batch.
          */
        var maxQuads: Double
        
        /**
          * Dirty flag to check if resolution properties need to be updated on the 
          * masking shader.
          */
        var resolutionDirty: Boolean
        
        /**
          * Float32 view of the array buffer containing the pipeline's vertices.
          */
        var vertexViewF32: Float32Array
      }
      object BitmapMaskPipeline {
        
        @scala.inline
        def apply(
          active: Boolean,
          addAttribute: (String, integer, integer, Boolean, integer) => BitmapMaskPipeline,
          attributes: js.Object,
          beginMask: (GameObject, GameObject, Camera) => Unit,
          bind: () => BitmapMaskPipeline,
          boot: () => Unit,
          bytes: Uint8Array,
          destroy: () => BitmapMaskPipeline,
          endMask: GameObject => Unit,
          flush: () => BitmapMaskPipeline,
          flushLocked: Boolean,
          game: Game,
          gl: WebGLRenderingContext,
          height: Double,
          maxQuads: Double,
          name: String,
          onBind: () => BitmapMaskPipeline,
          onPostRender: () => BitmapMaskPipeline,
          onPreRender: () => BitmapMaskPipeline,
          onRender: (Scene, Camera) => BitmapMaskPipeline,
          program: WebGLProgram,
          renderer: WebGLRenderer,
          resize: (Double, Double, Double) => BitmapMaskPipeline,
          resolution: Double,
          resolutionDirty: Boolean,
          setFloat1: (String, Double) => BitmapMaskPipeline,
          setFloat1v: (String, Float32Array) => BitmapMaskPipeline,
          setFloat2: (String, Double, Double) => BitmapMaskPipeline,
          setFloat2v: (String, Float32Array) => BitmapMaskPipeline,
          setFloat3: (String, Double, Double, Double) => BitmapMaskPipeline,
          setFloat3v: (String, Float32Array) => BitmapMaskPipeline,
          setFloat4: (String, Double, Double, Double, Double) => BitmapMaskPipeline,
          setFloat4v: (String, Float32Array) => BitmapMaskPipeline,
          setInt1: (String, integer) => BitmapMaskPipeline,
          setInt2: (String, integer, integer) => BitmapMaskPipeline,
          setInt3: (String, integer, integer, integer) => BitmapMaskPipeline,
          setInt4: (String, integer, integer, integer, integer) => BitmapMaskPipeline,
          setMatrix2: (String, Boolean, Float32Array) => BitmapMaskPipeline,
          setMatrix3: (String, Boolean, Float32Array) => BitmapMaskPipeline,
          setMatrix4: (String, Boolean, Float32Array) => BitmapMaskPipeline,
          shouldFlush: () => Boolean,
          topology: integer,
          vertexBuffer: WebGLBuffer,
          vertexCapacity: integer,
          vertexComponentCount: integer,
          vertexCount: Double,
          vertexData: ArrayBuffer,
          vertexSize: integer,
          vertexViewF32: Float32Array,
          view: HTMLCanvasElement,
          width: Double
        ): BitmapMaskPipeline = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAttribute = js.Any.fromFunction5(addAttribute), attributes = attributes.asInstanceOf[js.Any], beginMask = js.Any.fromFunction3(beginMask), bind = js.Any.fromFunction0(bind), boot = js.Any.fromFunction0(boot), bytes = bytes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), endMask = js.Any.fromFunction1(endMask), flush = js.Any.fromFunction0(flush), flushLocked = flushLocked.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxQuads = maxQuads.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBind = js.Any.fromFunction0(onBind), onPostRender = js.Any.fromFunction0(onPostRender), onPreRender = js.Any.fromFunction0(onPreRender), onRender = js.Any.fromFunction2(onRender), program = program.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resize = js.Any.fromFunction3(resize), resolution = resolution.asInstanceOf[js.Any], resolutionDirty = resolutionDirty.asInstanceOf[js.Any], setFloat1 = js.Any.fromFunction2(setFloat1), setFloat1v = js.Any.fromFunction2(setFloat1v), setFloat2 = js.Any.fromFunction3(setFloat2), setFloat2v = js.Any.fromFunction2(setFloat2v), setFloat3 = js.Any.fromFunction4(setFloat3), setFloat3v = js.Any.fromFunction2(setFloat3v), setFloat4 = js.Any.fromFunction5(setFloat4), setFloat4v = js.Any.fromFunction2(setFloat4v), setInt1 = js.Any.fromFunction2(setInt1), setInt2 = js.Any.fromFunction3(setInt2), setInt3 = js.Any.fromFunction4(setInt3), setInt4 = js.Any.fromFunction5(setInt4), setMatrix2 = js.Any.fromFunction3(setMatrix2), setMatrix3 = js.Any.fromFunction3(setMatrix3), setMatrix4 = js.Any.fromFunction3(setMatrix4), shouldFlush = js.Any.fromFunction0(shouldFlush), topology = topology.asInstanceOf[js.Any], vertexBuffer = vertexBuffer.asInstanceOf[js.Any], vertexCapacity = vertexCapacity.asInstanceOf[js.Any], vertexComponentCount = vertexComponentCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], vertexSize = vertexSize.asInstanceOf[js.Any], vertexViewF32 = vertexViewF32.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[BitmapMaskPipeline]
        }
        
        @scala.inline
        implicit class BitmapMaskPipelineMutableBuilder[Self <: BitmapMaskPipeline] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBeginMask(value: (GameObject, GameObject, Camera) => Unit): Self = StObject.set(x, "beginMask", js.Any.fromFunction3(value))
          
          @scala.inline
          def setEndMask(value: GameObject => Unit): Self = StObject.set(x, "endMask", js.Any.fromFunction1(value))
          
          @scala.inline
          def setMaxQuads(value: Double): Self = StObject.set(x, "maxQuads", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolutionDirty(value: Boolean): Self = StObject.set(x, "resolutionDirty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVertexViewF32(value: Float32Array): Self = StObject.set(x, "vertexViewF32", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * ForwardDiffuseLightPipeline implements a forward rendering approach for 2D lights.
        * This pipeline extends TextureTintPipeline so it implements all it's rendering functions
        * and batching system.
        */
      @js.native
      trait ForwardDiffuseLightPipeline
        extends StObject
           with TextureTintPipeline {
        
        /**
          * Generic function for batching a textured quad
          * @param gameObject Source GameObject
          * @param texture Raw WebGLTexture associated with the quad
          * @param textureWidth Real texture width
          * @param textureHeight Real texture height
          * @param srcX X coordinate of the quad
          * @param srcY Y coordinate of the quad
          * @param srcWidth Width of the quad
          * @param srcHeight Height of the quad
          * @param scaleX X component of scale
          * @param scaleY Y component of scale
          * @param rotation Rotation of the quad
          * @param flipX Indicates if the quad is horizontally flipped
          * @param flipY Indicates if the quad is vertically flipped
          * @param scrollFactorX By which factor is the quad affected by the camera horizontal scroll
          * @param scrollFactorY By which factor is the quad effected by the camera vertical scroll
          * @param displayOriginX Horizontal origin in pixels
          * @param displayOriginY Vertical origin in pixels
          * @param frameX X coordinate of the texture frame
          * @param frameY Y coordinate of the texture frame
          * @param frameWidth Width of the texture frame
          * @param frameHeight Height of the texture frame
          * @param tintTL Tint for top left
          * @param tintTR Tint for top right
          * @param tintBL Tint for bottom left
          * @param tintBR Tint for bottom right
          * @param tintEffect The tint effect (0 for additive, 1 for replacement)
          * @param uOffset Horizontal offset on texture coordinate
          * @param vOffset Vertical offset on texture coordinate
          * @param camera Current used camera
          * @param parentTransformMatrix Parent container
          */
        def batchTexture(
          gameObject: GameObject,
          texture: WebGLTexture,
          textureWidth: integer,
          textureHeight: integer,
          srcX: Double,
          srcY: Double,
          srcWidth: Double,
          srcHeight: Double,
          scaleX: Double,
          scaleY: Double,
          rotation: Double,
          flipX: Boolean,
          flipY: Boolean,
          scrollFactorX: Double,
          scrollFactorY: Double,
          displayOriginX: Double,
          displayOriginY: Double,
          frameX: Double,
          frameY: Double,
          frameWidth: Double,
          frameHeight: Double,
          tintTL: integer,
          tintTR: integer,
          tintBL: integer,
          tintBR: integer,
          tintEffect: Double,
          uOffset: Double,
          vOffset: Double,
          camera: Camera,
          parentTransformMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Sets the Game Objects normal map as the active texture.
          * @param gameObject The Game Object to update.
          */
        def setNormalMap(gameObject: GameObject): Unit = js.native
        
        /**
          * Rotates the normal map vectors inversely by the given angle.
          * Only works in 2D space.
          * @param rotation The angle of rotation in radians.
          */
        def setNormalMapRotation(rotation: Double): Unit = js.native
      }
      
      /**
        * Implements a model view projection matrices.
        * Pipelines can implement this for doing 2D and 3D rendering.
        */
      trait ModelViewProjection extends StObject {
        
        /**
          * Loads an identity matrix to the model matrix
          */
        def modelIdentity(): Unit
        
        /**
          * Model matrix
          */
        var modelMatrix: Float32Array
        
        /**
          * Dirty flag for checking if model matrix needs to be updated on GPU.
          */
        var modelMatrixDirty: Boolean
        
        /**
          * Rotates the model matrix in the X axis.
          * @param radians The amount to rotate by.
          */
        def modelRotateX(radians: Double): this.type
        
        /**
          * Rotates the model matrix in the Y axis.
          * @param radians The amount to rotate by.
          */
        def modelRotateY(radians: Double): this.type
        
        /**
          * Rotates the model matrix in the Z axis.
          * @param radians The amount to rotate by.
          */
        def modelRotateZ(radians: Double): this.type
        
        /**
          * Scale model matrix
          * @param x The x component.
          * @param y The y component.
          * @param z The z component.
          */
        def modelScale(x: Double, y: Double, z: Double): this.type
        
        /**
          * Translate model matrix
          * @param x The x component.
          * @param y The y component.
          * @param z The z component.
          */
        def modelTranslate(x: Double, y: Double, z: Double): this.type
        
        /**
          * Initializes MVP matrices with an identity matrix
          */
        def mvpInit(): Unit
        
        /**
          * If dirty flags are set then the matrices are uploaded to the GPU.
          */
        def mvpUpdate(): Unit
        
        /**
          * Loads identity matrix into the projection matrix.
          */
        def projIdentity(): this.type
        
        /**
          * Sets up an orthographic projection matrix
          * @param left The left value.
          * @param right The right value.
          * @param bottom The bottom value.
          * @param top The top value.
          * @param near The near value.
          * @param far The far value.
          */
        def projOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type
        
        /**
          * Sets up a perspective projection matrix
          * @param fovY The fov value.
          * @param aspectRatio The aspectRatio value.
          * @param near The near value.
          * @param far The far value.
          */
        def projPersp(fovY: Double, aspectRatio: Double, near: Double, far: Double): this.type
        
        /**
          * Projection matrix
          */
        var projectionMatrix: Float32Array
        
        /**
          * Dirty flag for checking if projection matrix needs to be updated on GPU.
          */
        var projectionMatrixDirty: Boolean
        
        /**
          * Loads identity matrix into the view matrix
          */
        def viewIdentity(): this.type
        
        /**
          * Copies a 4x4 matrix into the view matrix
          * @param matrix The Matrix2D.
          */
        def viewLoad(matrix: Float32Array): this.type
        
        /**
          * Loads a 2D view matrix (3x2 matrix) into a 4x4 view matrix
          * @param matrix2D The Matrix2D.
          */
        def viewLoad2D(matrix2D: Float32Array): this.type
        
        /**
          * View matrix
          */
        var viewMatrix: Float32Array
        
        /**
          * Dirty flag for checking if view matrix needs to be updated on GPU.
          */
        var viewMatrixDirty: Boolean
        
        /**
          * Rotates view matrix in the X axis.
          * @param radians The amount to rotate by.
          */
        def viewRotateX(radians: Double): this.type
        
        /**
          * Rotates view matrix in the Y axis.
          * @param radians The amount to rotate by.
          */
        def viewRotateY(radians: Double): this.type
        
        /**
          * Rotates view matrix in the Z axis.
          * @param radians The amount to rotate by.
          */
        def viewRotateZ(radians: Double): this.type
        
        /**
          * Scales view matrix
          * @param x The x component.
          * @param y The y component.
          * @param z The z component.
          */
        def viewScale(x: Double, y: Double, z: Double): this.type
        
        /**
          * Translates view matrix
          * @param x The x component.
          * @param y The y component.
          * @param z The z component.
          */
        def viewTranslate(x: Double, y: Double, z: Double): this.type
      }
      object ModelViewProjection {
        
        @scala.inline
        def apply(
          modelIdentity: () => Unit,
          modelMatrix: Float32Array,
          modelMatrixDirty: Boolean,
          modelRotateX: Double => ModelViewProjection,
          modelRotateY: Double => ModelViewProjection,
          modelRotateZ: Double => ModelViewProjection,
          modelScale: (Double, Double, Double) => ModelViewProjection,
          modelTranslate: (Double, Double, Double) => ModelViewProjection,
          mvpInit: () => Unit,
          mvpUpdate: () => Unit,
          projIdentity: () => ModelViewProjection,
          projOrtho: (Double, Double, Double, Double, Double, Double) => ModelViewProjection,
          projPersp: (Double, Double, Double, Double) => ModelViewProjection,
          projectionMatrix: Float32Array,
          projectionMatrixDirty: Boolean,
          viewIdentity: () => ModelViewProjection,
          viewLoad: Float32Array => ModelViewProjection,
          viewLoad2D: Float32Array => ModelViewProjection,
          viewMatrix: Float32Array,
          viewMatrixDirty: Boolean,
          viewRotateX: Double => ModelViewProjection,
          viewRotateY: Double => ModelViewProjection,
          viewRotateZ: Double => ModelViewProjection,
          viewScale: (Double, Double, Double) => ModelViewProjection,
          viewTranslate: (Double, Double, Double) => ModelViewProjection
        ): ModelViewProjection = {
          val __obj = js.Dynamic.literal(modelIdentity = js.Any.fromFunction0(modelIdentity), modelMatrix = modelMatrix.asInstanceOf[js.Any], modelMatrixDirty = modelMatrixDirty.asInstanceOf[js.Any], modelRotateX = js.Any.fromFunction1(modelRotateX), modelRotateY = js.Any.fromFunction1(modelRotateY), modelRotateZ = js.Any.fromFunction1(modelRotateZ), modelScale = js.Any.fromFunction3(modelScale), modelTranslate = js.Any.fromFunction3(modelTranslate), mvpInit = js.Any.fromFunction0(mvpInit), mvpUpdate = js.Any.fromFunction0(mvpUpdate), projIdentity = js.Any.fromFunction0(projIdentity), projOrtho = js.Any.fromFunction6(projOrtho), projPersp = js.Any.fromFunction4(projPersp), projectionMatrix = projectionMatrix.asInstanceOf[js.Any], projectionMatrixDirty = projectionMatrixDirty.asInstanceOf[js.Any], viewIdentity = js.Any.fromFunction0(viewIdentity), viewLoad = js.Any.fromFunction1(viewLoad), viewLoad2D = js.Any.fromFunction1(viewLoad2D), viewMatrix = viewMatrix.asInstanceOf[js.Any], viewMatrixDirty = viewMatrixDirty.asInstanceOf[js.Any], viewRotateX = js.Any.fromFunction1(viewRotateX), viewRotateY = js.Any.fromFunction1(viewRotateY), viewRotateZ = js.Any.fromFunction1(viewRotateZ), viewScale = js.Any.fromFunction3(viewScale), viewTranslate = js.Any.fromFunction3(viewTranslate))
          __obj.asInstanceOf[ModelViewProjection]
        }
        
        @scala.inline
        implicit class ModelViewProjectionMutableBuilder[Self <: ModelViewProjection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setModelIdentity(value: () => Unit): Self = StObject.set(x, "modelIdentity", js.Any.fromFunction0(value))
          
          @scala.inline
          def setModelMatrix(value: Float32Array): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModelMatrixDirty(value: Boolean): Self = StObject.set(x, "modelMatrixDirty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModelRotateX(value: Double => ModelViewProjection): Self = StObject.set(x, "modelRotateX", js.Any.fromFunction1(value))
          
          @scala.inline
          def setModelRotateY(value: Double => ModelViewProjection): Self = StObject.set(x, "modelRotateY", js.Any.fromFunction1(value))
          
          @scala.inline
          def setModelRotateZ(value: Double => ModelViewProjection): Self = StObject.set(x, "modelRotateZ", js.Any.fromFunction1(value))
          
          @scala.inline
          def setModelScale(value: (Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "modelScale", js.Any.fromFunction3(value))
          
          @scala.inline
          def setModelTranslate(value: (Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "modelTranslate", js.Any.fromFunction3(value))
          
          @scala.inline
          def setMvpInit(value: () => Unit): Self = StObject.set(x, "mvpInit", js.Any.fromFunction0(value))
          
          @scala.inline
          def setMvpUpdate(value: () => Unit): Self = StObject.set(x, "mvpUpdate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setProjIdentity(value: () => ModelViewProjection): Self = StObject.set(x, "projIdentity", js.Any.fromFunction0(value))
          
          @scala.inline
          def setProjOrtho(value: (Double, Double, Double, Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "projOrtho", js.Any.fromFunction6(value))
          
          @scala.inline
          def setProjPersp(value: (Double, Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "projPersp", js.Any.fromFunction4(value))
          
          @scala.inline
          def setProjectionMatrix(value: Float32Array): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProjectionMatrixDirty(value: Boolean): Self = StObject.set(x, "projectionMatrixDirty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setViewIdentity(value: () => ModelViewProjection): Self = StObject.set(x, "viewIdentity", js.Any.fromFunction0(value))
          
          @scala.inline
          def setViewLoad(value: Float32Array => ModelViewProjection): Self = StObject.set(x, "viewLoad", js.Any.fromFunction1(value))
          
          @scala.inline
          def setViewLoad2D(value: Float32Array => ModelViewProjection): Self = StObject.set(x, "viewLoad2D", js.Any.fromFunction1(value))
          
          @scala.inline
          def setViewMatrix(value: Float32Array): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setViewMatrixDirty(value: Boolean): Self = StObject.set(x, "viewMatrixDirty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setViewRotateX(value: Double => ModelViewProjection): Self = StObject.set(x, "viewRotateX", js.Any.fromFunction1(value))
          
          @scala.inline
          def setViewRotateY(value: Double => ModelViewProjection): Self = StObject.set(x, "viewRotateY", js.Any.fromFunction1(value))
          
          @scala.inline
          def setViewRotateZ(value: Double => ModelViewProjection): Self = StObject.set(x, "viewRotateZ", js.Any.fromFunction1(value))
          
          @scala.inline
          def setViewScale(value: (Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "viewScale", js.Any.fromFunction3(value))
          
          @scala.inline
          def setViewTranslate(value: (Double, Double, Double) => ModelViewProjection): Self = StObject.set(x, "viewTranslate", js.Any.fromFunction3(value))
        }
      }
      
      /**
        * TextureTintPipeline implements the rendering infrastructure
        * for displaying textured objects
        * The config properties are:
        * - game: Current game instance.
        * - renderer: Current WebGL renderer.
        * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
        *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
        * - vertShader: Source for vertex shader as a string.
        * - fragShader: Source for fragment shader as a string.
        * - vertexCapacity: The amount of vertices that shall be allocated
        * - vertexSize: The size of a single vertex in bytes.
        */
      @js.native
      trait TextureTintPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * Adds the given path to the vertex batch for rendering.
          * 
          * It works by taking the array of path data and then passing it through Earcut, which
          * creates a list of polygons. Each polygon is then added to the batch.
          * 
          * The path is always automatically closed because it's filled.
          * @param path Collection of points that represent the path.
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchFillPath(path: js.Array[js.Any], currentMatrix: TransformMatrix, parentMatrix: TransformMatrix): Unit = js.native
        
        /**
          * Pushes a filled rectangle into the vertex batch.
          * Rectangle factors in the given transform matrices before adding to the batch.
          * @param x Horizontal top left coordinate of the rectangle.
          * @param y Vertical top left coordinate of the rectangle.
          * @param width Width of the rectangle.
          * @param height Height of the rectangle.
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchFillRect(
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Pushes a filled triangle into the vertex batch.
          * Triangle factors in the given transform matrices before adding to the batch.
          * @param x0 Point 0 x coordinate.
          * @param y0 Point 0 y coordinate.
          * @param x1 Point 1 x coordinate.
          * @param y1 Point 1 y coordinate.
          * @param x2 Point 2 x coordinate.
          * @param y2 Point 2 y coordinate.
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchFillTriangle(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Creates a quad and adds it to the vertex batch based on the given line values.
          * @param ax X coordinate to the start of the line
          * @param ay Y coordinate to the start of the line
          * @param bx X coordinate to the end of the line
          * @param by Y coordinate to the end of the line
          * @param aLineWidth Width of the start of the line
          * @param bLineWidth Width of the end of the line
          * @param currentMatrix Parent matrix, generally used by containers
          */
        def batchLine(
          ax: Double,
          ay: Double,
          bx: Double,
          by: Double,
          aLineWidth: Double,
          bLineWidth: Double,
          currentMatrix: Float32Array
        ): Unit = js.native
        
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Boolean
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Boolean,
          texture: Unit,
          unit: integer
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Boolean,
          texture: WebGLTexture
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Boolean,
          texture: WebGLTexture,
          unit: integer
        ): Boolean = js.native
        /**
          * Adds the vertices data into the batch and flushes if full.
          * 
          * Assumes 6 vertices in the following arrangement:
          * 
          * ```
          * 0----3
          * |\  B|
          * | \  |
          * |  \ |
          * | A \|
          * |    \
          * 1----2
          * ```
          * 
          * Where tx0/ty0 = 0, tx1/ty1 = 1, tx2/ty2 = 2 and tx3/ty3 = 3
          * @param x0 The top-left x position.
          * @param y0 The top-left y position.
          * @param x1 The bottom-left x position.
          * @param y1 The bottom-left y position.
          * @param x2 The bottom-right x position.
          * @param y2 The bottom-right y position.
          * @param x3 The top-right x position.
          * @param y3 The top-right y position.
          * @param u0 UV u0 value.
          * @param v0 UV v0 value.
          * @param u1 UV u1 value.
          * @param v1 UV v1 value.
          * @param tintTL The top-left tint color value.
          * @param tintTR The top-right tint color value.
          * @param tintBL The bottom-left tint color value.
          * @param tintBR The bottom-right tint color value.
          * @param tintEffect The tint effect for the shader to use.
          * @param texture WebGLTexture that will be assigned to the current batch if a flush occurs.
          * @param unit Texture unit to which the texture needs to be bound. Default 0.
          */
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Double
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Double,
          texture: Unit,
          unit: integer
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Double,
          texture: WebGLTexture
        ): Boolean = js.native
        def batchQuad(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Double,
          texture: WebGLTexture,
          unit: integer
        ): Boolean = js.native
        
        /**
          * Takes a Sprite Game Object, or any object that extends it, and adds it to the batch.
          * @param sprite The texture based Game Object to add to the batch.
          * @param camera The Camera to use for the rendering transform.
          * @param parentTransformMatrix The transform matrix of the parent container, if set.
          */
        def batchSprite(sprite: Image, camera: Camera): Unit = js.native
        def batchSprite(sprite: Image, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
        def batchSprite(sprite: Sprite, camera: Camera): Unit = js.native
        def batchSprite(sprite: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
        
        /**
          * Adds the given path to the vertex batch for rendering.
          * 
          * It works by taking the array of path data and calling `batchLine` for each section
          * of the path.
          * 
          * The path is optionally closed at the end.
          * @param path Collection of points that represent the path.
          * @param lineWidth The width of the line segments in pixels.
          * @param pathOpen Indicates if the path should be closed or left open.
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchStrokePath(
          path: js.Array[js.Any],
          lineWidth: Double,
          pathOpen: Boolean,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Pushes a stroked triangle into the vertex batch.
          * Triangle factors in the given transform matrices before adding to the batch.
          * The triangle is created from 3 lines and drawn using the `batchStrokePath` method.
          * @param x0 Point 0 x coordinate.
          * @param y0 Point 0 y coordinate.
          * @param x1 Point 1 x coordinate.
          * @param y1 Point 1 y coordinate.
          * @param x2 Point 2 x coordinate.
          * @param y2 Point 2 y coordinate.
          * @param lineWidth The width of the line in pixels.
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchStrokeTriangle(
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          lineWidth: Double,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Generic function for batching a textured quad using argument values instead of a Game Object.
          * @param gameObject Source GameObject.
          * @param texture Raw WebGLTexture associated with the quad.
          * @param textureWidth Real texture width.
          * @param textureHeight Real texture height.
          * @param srcX X coordinate of the quad.
          * @param srcY Y coordinate of the quad.
          * @param srcWidth Width of the quad.
          * @param srcHeight Height of the quad.
          * @param scaleX X component of scale.
          * @param scaleY Y component of scale.
          * @param rotation Rotation of the quad.
          * @param flipX Indicates if the quad is horizontally flipped.
          * @param flipY Indicates if the quad is vertically flipped.
          * @param scrollFactorX By which factor is the quad affected by the camera horizontal scroll.
          * @param scrollFactorY By which factor is the quad effected by the camera vertical scroll.
          * @param displayOriginX Horizontal origin in pixels.
          * @param displayOriginY Vertical origin in pixels.
          * @param frameX X coordinate of the texture frame.
          * @param frameY Y coordinate of the texture frame.
          * @param frameWidth Width of the texture frame.
          * @param frameHeight Height of the texture frame.
          * @param tintTL Tint for top left.
          * @param tintTR Tint for top right.
          * @param tintBL Tint for bottom left.
          * @param tintBR Tint for bottom right.
          * @param tintEffect The tint effect.
          * @param uOffset Horizontal offset on texture coordinate.
          * @param vOffset Vertical offset on texture coordinate.
          * @param camera Current used camera.
          * @param parentTransformMatrix Parent container.
          * @param skipFlip Skip the renderTexture check. Default false.
          */
        def batchTexture(
          gameObject: GameObject,
          texture: WebGLTexture,
          textureWidth: integer,
          textureHeight: integer,
          srcX: Double,
          srcY: Double,
          srcWidth: Double,
          srcHeight: Double,
          scaleX: Double,
          scaleY: Double,
          rotation: Double,
          flipX: Boolean,
          flipY: Boolean,
          scrollFactorX: Double,
          scrollFactorY: Double,
          displayOriginX: Double,
          displayOriginY: Double,
          frameX: Double,
          frameY: Double,
          frameWidth: Double,
          frameHeight: Double,
          tintTL: integer,
          tintTR: integer,
          tintBL: integer,
          tintBR: integer,
          tintEffect: Double,
          uOffset: Double,
          vOffset: Double,
          camera: Camera,
          parentTransformMatrix: TransformMatrix,
          skipFlip: js.UndefOr[Boolean]
        ): Unit = js.native
        
        /**
          * Adds a Texture Frame into the batch for rendering.
          * @param frame The Texture Frame to be rendered.
          * @param x The horizontal position to render the texture at.
          * @param y The vertical position to render the texture at.
          * @param tint The tint color.
          * @param alpha The alpha value.
          * @param transformMatrix The Transform Matrix to use for the texture.
          * @param parentTransformMatrix A parent Transform Matrix.
          */
        def batchTextureFrame(frame: Frame, x: Double, y: Double, tint: Double, alpha: Double, transformMatrix: TransformMatrix): Unit = js.native
        def batchTextureFrame(
          frame: Frame,
          x: Double,
          y: Double,
          tint: Double,
          alpha: Double,
          transformMatrix: TransformMatrix,
          parentTransformMatrix: TransformMatrix
        ): Unit = js.native
        
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Boolean
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Boolean,
          texture: Unit,
          unit: integer
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Boolean,
          texture: WebGLTexture
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Boolean,
          texture: WebGLTexture,
          unit: integer
        ): Boolean = js.native
        /**
          * Adds the vertices data into the batch and flushes if full.
          * 
          * Assumes 3 vertices in the following arrangement:
          * 
          * ```
          * 0
          * |\
          * | \
          * |  \
          * |   \
          * |    \
          * 1-----2
          * ```
          * @param x1 The bottom-left x position.
          * @param y1 The bottom-left y position.
          * @param x2 The bottom-right x position.
          * @param y2 The bottom-right y position.
          * @param x3 The top-right x position.
          * @param y3 The top-right y position.
          * @param u0 UV u0 value.
          * @param v0 UV v0 value.
          * @param u1 UV u1 value.
          * @param v1 UV v1 value.
          * @param tintTL The top-left tint color value.
          * @param tintTR The top-right tint color value.
          * @param tintBL The bottom-left tint color value.
          * @param tintEffect The tint effect for the shader to use.
          * @param texture WebGLTexture that will be assigned to the current batch if a flush occurs.
          * @param unit Texture unit to which the texture needs to be bound. Default 0.
          */
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Double
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Double,
          texture: Unit,
          unit: integer
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Double,
          texture: WebGLTexture
        ): Boolean = js.native
        def batchTri(
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          u0: Double,
          v0: Double,
          u1: Double,
          v1: Double,
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintEffect: Double,
          texture: WebGLTexture,
          unit: integer
        ): Boolean = js.native
        
        /**
          * Collection of batch information
          */
        var batches: js.Array[js.Any] = js.native
        
        /**
          * Pushes a filled rectangle into the vertex batch.
          * Rectangle has no transform values and isn't transformed into the local space.
          * Used for directly batching untransformed rectangles, such as Camera background colors.
          * @param x Horizontal top left coordinate of the rectangle.
          * @param y Vertical top left coordinate of the rectangle.
          * @param width Width of the rectangle.
          * @param height Height of the rectangle.
          * @param color Color of the rectangle to draw.
          * @param alpha Alpha value of the rectangle to draw.
          */
        def drawFillRect(x: Double, y: Double, width: Double, height: Double, color: Double, alpha: Double): Unit = js.native
        
        /**
          * Size of the batch.
          */
        var maxQuads: integer = js.native
        
        /**
          * Creates a new batch object and pushes it to a batch array.
          * The batch object contains information relevant to the current 
          * vertex batch like the offset in the vertex buffer, vertex count and 
          * the textures used by that batch.
          * @param texture Optional WebGLTexture that will be assigned to the created batch.
          * @param unit Texture unit to which the texture needs to be bound.
          */
        def pushBatch(texture: WebGLTexture, unit: integer): Unit = js.native
        
        /**
          * Checks if the current batch has the same texture and texture unit, or if we need to create a new batch.
          * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
          * @param unit Texture unit to which the texture needs to be bound.
          */
        def requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean = js.native
        
        /**
          * Assigns a texture to the current batch. If a different texture is already set it creates a new batch object.
          * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
          * @param unit Texture unit to which the texture needs to be bound. Default 0.
          */
        def setTexture2D(): TextureTintPipeline = js.native
        def setTexture2D(texture: Unit, unit: integer): TextureTintPipeline = js.native
        def setTexture2D(texture: WebGLTexture): TextureTintPipeline = js.native
        def setTexture2D(texture: WebGLTexture, unit: integer): TextureTintPipeline = js.native
        
        /**
          * Float32 view of the array buffer containing the pipeline's vertices.
          */
        var vertexViewF32: Float32Array = js.native
        
        /**
          * Uint32 view of the array buffer containing the pipeline's vertices.
          */
        var vertexViewU32: Uint32Array = js.native
      }
      
      /**
        * TextureTintStripPipeline implements the rendering infrastructure
        * for displaying textured objects
        * The config properties are:
        * - game: Current game instance.
        * - renderer: Current WebGL renderer.
        * - vertShader: Source for vertex shader as a string.
        * - fragShader: Source for fragment shader as a string.
        * - vertexCapacity: The amount of vertices that shall be allocated
        * - vertexSize: The size of a single vertex in bytes.
        */
      @js.native
      trait TextureTintStripPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * Collection of batch information
          */
        var batches: js.Array[js.Any] = js.native
        
        /**
          * Size of the batch.
          */
        var maxQuads: integer = js.native
        
        /**
          * Creates a new batch object and pushes it to a batch array.
          * The batch object contains information relevant to the current 
          * vertex batch like the offset in the vertex buffer, vertex count and 
          * the textures used by that batch.
          * @param texture Optional WebGLTexture that will be assigned to the created batch.
          * @param unit Texture unit to which the texture needs to be bound.
          */
        def pushBatch(texture: WebGLTexture, unit: integer): Unit = js.native
        
        /**
          * Checks if the current batch has the same texture and texture unit, or if we need to create a new batch.
          * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
          * @param unit Texture unit to which the texture needs to be bound.
          */
        def requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean = js.native
        
        /**
          * Assigns a texture to the current batch. If a different texture is already set it creates a new batch object.
          * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
          * @param unit Texture unit to which the texture needs to be bound. Default 0.
          */
        def setTexture2D(): TextureTintStripPipeline = js.native
        def setTexture2D(texture: Unit, unit: integer): TextureTintStripPipeline = js.native
        def setTexture2D(texture: WebGLTexture): TextureTintStripPipeline = js.native
        def setTexture2D(texture: WebGLTexture, unit: integer): TextureTintStripPipeline = js.native
        
        /**
          * Float32 view of the array buffer containing the pipeline's vertices.
          */
        var vertexViewF32: Float32Array = js.native
        
        /**
          * Uint32 view of the array buffer containing the pipeline's vertices.
          */
        var vertexViewU32: Uint32Array = js.native
      }
    }
    
    /**
      * WebGLPipeline is a class that describes the way elements will be renderered
      * in WebGL, specially focused on batching vertices (batching is not provided).
      * Pipelines are mostly used for describing 2D rendering passes but it's
      * flexible enough to be used for any type of rendering including 3D.
      * Internally WebGLPipeline will handle things like compiling shaders,
      * creating vertex buffers, assigning primitive topology and binding
      * vertex attributes.
      * 
      * The config properties are:
      * - game: Current game instance.
      * - renderer: Current WebGL renderer.
      * - gl: Current WebGL context.
      * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
      *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
      * - vertShader: Source for vertex shader as a string.
      * - fragShader: Source for fragment shader as a string.
      * - vertexCapacity: The amount of vertices that shall be allocated
      * - vertexSize: The size of a single vertex in bytes.
      * - vertices: An optional buffer of vertices
      * - attributes: An array describing the vertex attributes
      * 
      * The vertex attributes properties are:
      * - name : String - Name of the attribute in the vertex shader
      * - size : integer - How many components describe the attribute. For ex: vec3 = size of 3, float = size of 1
      * - type : GLenum - WebGL type (gl.BYTE, gl.SHORT, gl.UNSIGNED_BYTE, gl.UNSIGNED_SHORT, gl.FLOAT)
      * - normalized : boolean - Is the attribute normalized
      * - offset : integer - The offset in bytes to the current attribute in the vertex. Equivalent to offsetof(vertex, attrib) in C
      * Here you can find more information of how to describe an attribute:
      * - https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer
      */
    trait WebGLPipeline extends StObject {
      
      /**
        * Indicates if the current pipeline is active or not for this frame only.
        * Reset in the onRender method.
        */
      var active: Boolean
      
      /**
        * Adds a description of vertex attribute to the pipeline
        * @param name Name of the vertex attribute
        * @param size Vertex component size
        * @param type Type of the attribute
        * @param normalized Is the value normalized to a range
        * @param offset Byte offset to the beginning of the first element in the vertex
        */
      def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type
      
      /**
        * Array of objects that describe the vertex attributes
        */
      var attributes: js.Object
      
      /**
        * Binds the pipeline resources, including programs, vertex buffers and binds attributes
        */
      def bind(): this.type
      
      /**
        * Called when the Game has fully booted and the Renderer has finished setting up.
        * 
        * By this stage all Game level systems are now in place and you can perform any final
        * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
        */
      def boot(): Unit
      
      /**
        * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
        * to the GPU.
        */
      var bytes: Uint8Array
      
      /**
        * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
        */
      def destroy(): this.type
      
      /**
        * Uploads the vertex data and emits a draw call
        * for the current batch of vertices.
        */
      def flush(): this.type
      
      /**
        * Indicates if the current pipeline is flushing the contents to the GPU.
        * When the variable is set the flush function will be locked.
        */
      var flushLocked: Boolean
      
      /**
        * The Game which owns this WebGL Pipeline.
        */
      var game: Game
      
      /**
        * The WebGL context this WebGL Pipeline uses.
        */
      var gl: WebGLRenderingContext
      
      /**
        * Height of the current viewport
        */
      var height: Double
      
      /**
        * Name of the Pipeline. Used for identifying
        */
      var name: String
      
      /**
        * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
        * 
        * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
        */
      def onBind(): this.type
      
      /**
        * Called after each frame has been completely rendered and snapshots have been taken.
        */
      def onPostRender(): this.type
      
      /**
        * Called before each frame is rendered, but after the canvas has been cleared.
        */
      def onPreRender(): this.type
      
      /**
        * Called before a Scene's Camera is rendered.
        * @param scene The Scene being rendered.
        * @param camera The Scene Camera being rendered with.
        */
      def onRender(scene: Scene, camera: Camera): this.type
      
      /**
        * The handle to a WebGL program
        */
      var program: WebGLProgram
      
      /**
        * The WebGL Renderer which owns this WebGL Pipeline.
        */
      var renderer: WebGLRenderer
      
      /**
        * Resizes the properties used to describe the viewport
        * @param width The new width of this WebGL Pipeline.
        * @param height The new height of this WebGL Pipeline.
        * @param resolution The resolution this WebGL Pipeline should be resized to.
        */
      def resize(width: Double, height: Double, resolution: Double): this.type
      
      /**
        * Used to store the current game resolution
        */
      var resolution: Double
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new value of the `float` uniform.
        */
      def setFloat1(name: String, x: Double): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat1v(name: String, arr: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `vec2` uniform.
        * @param y The new Y component of the `vec2` uniform.
        */
      def setFloat2(name: String, x: Double, y: Double): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat2v(name: String, arr: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `vec3` uniform.
        * @param y The new Y component of the `vec3` uniform.
        * @param z The new Z component of the `vec3` uniform.
        */
      def setFloat3(name: String, x: Double, y: Double, z: Double): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat3v(name: String, arr: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat4v(name: String, arr: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new value of the `int` uniform.
        */
      def setInt1(name: String, x: integer): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `ivec2` uniform.
        * @param y The new Y component of the `ivec2` uniform.
        */
      def setInt2(name: String, x: integer, y: integer): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `ivec3` uniform.
        * @param y The new Y component of the `ivec3` uniform.
        * @param z The new Z component of the `ivec3` uniform.
        */
      def setInt3(name: String, x: integer, y: integer, z: integer): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat2` uniform.
        */
      def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat3` uniform.
        */
      def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Should the matrix be transpose
        * @param matrix Matrix data
        */
      def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type
      
      /**
        * Check if the current batch of vertices is full.
        */
      def shouldFlush(): Boolean
      
      /**
        * The primitive topology which the pipeline will use to submit draw calls
        */
      var topology: integer
      
      /**
        * The handle to a WebGL vertex buffer object.
        */
      var vertexBuffer: WebGLBuffer
      
      /**
        * The limit of vertices that the pipeline can hold
        */
      var vertexCapacity: integer
      
      /**
        * This will store the amount of components of 32 bit length
        */
      var vertexComponentCount: integer
      
      /**
        * How many vertices have been fed to the current pipeline.
        */
      var vertexCount: Double
      
      /**
        * Raw byte buffer of vertices.
        */
      var vertexData: ArrayBuffer
      
      /**
        * The size in bytes of the vertex
        */
      var vertexSize: integer
      
      /**
        * The canvas which this WebGL Pipeline renders to.
        */
      var view: HTMLCanvasElement
      
      /**
        * Width of the current viewport
        */
      var width: Double
    }
    object WebGLPipeline {
      
      @scala.inline
      def apply(
        active: Boolean,
        addAttribute: (String, integer, integer, Boolean, integer) => WebGLPipeline,
        attributes: js.Object,
        bind: () => WebGLPipeline,
        boot: () => Unit,
        bytes: Uint8Array,
        destroy: () => WebGLPipeline,
        flush: () => WebGLPipeline,
        flushLocked: Boolean,
        game: Game,
        gl: WebGLRenderingContext,
        height: Double,
        name: String,
        onBind: () => WebGLPipeline,
        onPostRender: () => WebGLPipeline,
        onPreRender: () => WebGLPipeline,
        onRender: (Scene, Camera) => WebGLPipeline,
        program: WebGLProgram,
        renderer: WebGLRenderer,
        resize: (Double, Double, Double) => WebGLPipeline,
        resolution: Double,
        setFloat1: (String, Double) => WebGLPipeline,
        setFloat1v: (String, Float32Array) => WebGLPipeline,
        setFloat2: (String, Double, Double) => WebGLPipeline,
        setFloat2v: (String, Float32Array) => WebGLPipeline,
        setFloat3: (String, Double, Double, Double) => WebGLPipeline,
        setFloat3v: (String, Float32Array) => WebGLPipeline,
        setFloat4: (String, Double, Double, Double, Double) => WebGLPipeline,
        setFloat4v: (String, Float32Array) => WebGLPipeline,
        setInt1: (String, integer) => WebGLPipeline,
        setInt2: (String, integer, integer) => WebGLPipeline,
        setInt3: (String, integer, integer, integer) => WebGLPipeline,
        setInt4: (String, integer, integer, integer, integer) => WebGLPipeline,
        setMatrix2: (String, Boolean, Float32Array) => WebGLPipeline,
        setMatrix3: (String, Boolean, Float32Array) => WebGLPipeline,
        setMatrix4: (String, Boolean, Float32Array) => WebGLPipeline,
        shouldFlush: () => Boolean,
        topology: integer,
        vertexBuffer: WebGLBuffer,
        vertexCapacity: integer,
        vertexComponentCount: integer,
        vertexCount: Double,
        vertexData: ArrayBuffer,
        vertexSize: integer,
        view: HTMLCanvasElement,
        width: Double
      ): WebGLPipeline = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAttribute = js.Any.fromFunction5(addAttribute), attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction0(bind), boot = js.Any.fromFunction0(boot), bytes = bytes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), flushLocked = flushLocked.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBind = js.Any.fromFunction0(onBind), onPostRender = js.Any.fromFunction0(onPostRender), onPreRender = js.Any.fromFunction0(onPreRender), onRender = js.Any.fromFunction2(onRender), program = program.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resize = js.Any.fromFunction3(resize), resolution = resolution.asInstanceOf[js.Any], setFloat1 = js.Any.fromFunction2(setFloat1), setFloat1v = js.Any.fromFunction2(setFloat1v), setFloat2 = js.Any.fromFunction3(setFloat2), setFloat2v = js.Any.fromFunction2(setFloat2v), setFloat3 = js.Any.fromFunction4(setFloat3), setFloat3v = js.Any.fromFunction2(setFloat3v), setFloat4 = js.Any.fromFunction5(setFloat4), setFloat4v = js.Any.fromFunction2(setFloat4v), setInt1 = js.Any.fromFunction2(setInt1), setInt2 = js.Any.fromFunction3(setInt2), setInt3 = js.Any.fromFunction4(setInt3), setInt4 = js.Any.fromFunction5(setInt4), setMatrix2 = js.Any.fromFunction3(setMatrix2), setMatrix3 = js.Any.fromFunction3(setMatrix3), setMatrix4 = js.Any.fromFunction3(setMatrix4), shouldFlush = js.Any.fromFunction0(shouldFlush), topology = topology.asInstanceOf[js.Any], vertexBuffer = vertexBuffer.asInstanceOf[js.Any], vertexCapacity = vertexCapacity.asInstanceOf[js.Any], vertexComponentCount = vertexComponentCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], vertexSize = vertexSize.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipeline]
      }
      
      @scala.inline
      implicit class WebGLPipelineMutableBuilder[Self <: WebGLPipeline] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddAttribute(value: (String, integer, integer, Boolean, integer) => WebGLPipeline): Self = StObject.set(x, "addAttribute", js.Any.fromFunction5(value))
        
        @scala.inline
        def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBind(value: () => WebGLPipeline): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBoot(value: () => Unit): Self = StObject.set(x, "boot", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBytes(value: Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => WebGLPipeline): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setFlush(value: () => WebGLPipeline): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
        
        @scala.inline
        def setFlushLocked(value: Boolean): Self = StObject.set(x, "flushLocked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnBind(value: () => WebGLPipeline): Self = StObject.set(x, "onBind", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnPostRender(value: () => WebGLPipeline): Self = StObject.set(x, "onPostRender", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnPreRender(value: () => WebGLPipeline): Self = StObject.set(x, "onPreRender", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnRender(value: (Scene, Camera) => WebGLPipeline): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
        
        @scala.inline
        def setProgram(value: WebGLProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: WebGLRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResize(value: (Double, Double, Double) => WebGLPipeline): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
        
        @scala.inline
        def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetFloat1(value: (String, Double) => WebGLPipeline): Self = StObject.set(x, "setFloat1", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetFloat1v(value: (String, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setFloat1v", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetFloat2(value: (String, Double, Double) => WebGLPipeline): Self = StObject.set(x, "setFloat2", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetFloat2v(value: (String, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setFloat2v", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetFloat3(value: (String, Double, Double, Double) => WebGLPipeline): Self = StObject.set(x, "setFloat3", js.Any.fromFunction4(value))
        
        @scala.inline
        def setSetFloat3v(value: (String, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setFloat3v", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetFloat4(value: (String, Double, Double, Double, Double) => WebGLPipeline): Self = StObject.set(x, "setFloat4", js.Any.fromFunction5(value))
        
        @scala.inline
        def setSetFloat4v(value: (String, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setFloat4v", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetInt1(value: (String, integer) => WebGLPipeline): Self = StObject.set(x, "setInt1", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetInt2(value: (String, integer, integer) => WebGLPipeline): Self = StObject.set(x, "setInt2", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetInt3(value: (String, integer, integer, integer) => WebGLPipeline): Self = StObject.set(x, "setInt3", js.Any.fromFunction4(value))
        
        @scala.inline
        def setSetInt4(value: (String, integer, integer, integer, integer) => WebGLPipeline): Self = StObject.set(x, "setInt4", js.Any.fromFunction5(value))
        
        @scala.inline
        def setSetMatrix2(value: (String, Boolean, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setMatrix2", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetMatrix3(value: (String, Boolean, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setMatrix3", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetMatrix4(value: (String, Boolean, Float32Array) => WebGLPipeline): Self = StObject.set(x, "setMatrix4", js.Any.fromFunction3(value))
        
        @scala.inline
        def setShouldFlush(value: () => Boolean): Self = StObject.set(x, "shouldFlush", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTopology(value: integer): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexBuffer(value: WebGLBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexCapacity(value: integer): Self = StObject.set(x, "vertexCapacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexComponentCount(value: integer): Self = StObject.set(x, "vertexComponentCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexData(value: ArrayBuffer): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexSize(value: integer): Self = StObject.set(x, "vertexSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebGLRenderer is a class that contains the needed functionality to keep the
      * WebGLRenderingContext state clean. The main idea of the WebGLRenderer is to keep track of
      * any context change that happens for WebGL rendering inside of Phaser. This means
      * if raw webgl functions are called outside the WebGLRenderer of the Phaser WebGL
      * rendering ecosystem they might pollute the current WebGLRenderingContext state producing
      * unexpected behavior. It's recommended that WebGL interaction is done through
      * WebGLRenderer and/or WebGLPipeline.
      */
    @js.native
    trait WebGLRenderer extends StObject {
      
      /**
        * Creates a new custom blend mode for the renderer.
        * 
        * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Blending_modes
        * @param func An array containing the WebGL functions to use for the source and the destination blending factors, respectively. See the possible constants for {@link WebGLRenderingContext#blendFunc()}.
        * @param equation The equation to use for combining the RGB and alpha components of a new pixel with a rendered one. See the possible constants for {@link WebGLRenderingContext#blendEquation()}.
        */
      def addBlendMode(func: js.Array[GLenum], equation: GLenum): integer = js.native
      
      /**
        * Adds a pipeline instance into the collection of pipelines
        * @param pipelineName A unique string-based key for the pipeline.
        * @param pipelineInstance A pipeline instance which must extend WebGLPipeline.
        */
      def addPipeline(pipelineName: String, pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
      
      /**
        * A blank 32x32 transparent texture, as used by the Graphics system where needed.
        * This is set in the `boot` method.
        */
      val blankTexture: WebGLTexture = js.native
      
      /**
        * An array of blend modes supported by the WebGL Renderer.
        * 
        * This array includes the default blend modes as well as any custom blend modes added through {@link #addBlendMode}.
        */
      var blendModes: js.Array[js.Any] = js.native
      
      /**
        * The canvas which this WebGL Renderer draws to.
        */
      var canvas: HTMLCanvasElement = js.native
      
      /**
        * Creates a new WebGL Texture based on the given Canvas Element.
        * 
        * If the `dstTexture` parameter is given, the WebGL Texture is updated, rather than created fresh.
        * @param srcCanvas The Canvas to create the WebGL Texture from
        * @param dstTexture The destination WebGL Texture to set.
        * @param noRepeat Should this canvas be allowed to set `REPEAT` (such as for Text objects?) Default false.
        * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
        */
      def canvasToTexture(srcCanvas: HTMLCanvasElement): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: Unit, noRepeat: Boolean): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: Unit, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: Unit, noRepeat: Unit, flipY: Boolean): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, noRepeat: Boolean): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
      def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, noRepeat: Unit, flipY: Boolean): WebGLTexture = js.native
      
      /**
        * Flushes the current WebGLPipeline being used and then clears it, along with the
        * the current shader program and vertex buffer. Then resets the blend mode to NORMAL.
        * Call this before jumping to your own gl context handler, and then call `rebindPipeline` when
        * you wish to return control to Phaser again.
        */
      def clearPipeline(): Unit = js.native
      
      /**
        * Stores the supported WebGL texture compression formats.
        */
      var compression: js.Array[js.Any] = js.native
      
      /**
        * The local configuration settings of this WebGL Renderer.
        */
      var config: js.Object = js.native
      
      /**
        * This property is set to `true` if the WebGL context of the renderer is lost.
        */
      var contextLost: Boolean = js.native
      
      /**
        * The handler to invoke when the context is lost.
        * This should not be changed and is set in the boot method.
        */
      var contextLostHandler: js.Function = js.native
      
      /**
        * The handler to invoke when the context is restored.
        * This should not be changed and is set in the boot method.
        */
      var contextRestoredHandler: js.Function = js.native
      
      /**
        * Creates a new WebGL Texture based on the given Canvas Element.
        * @param srcCanvas The Canvas to create the WebGL Texture from
        * @param noRepeat Should this canvas be allowed to set `REPEAT` (such as for Text objects?) Default false.
        * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
        */
      def createCanvasTexture(srcCanvas: HTMLCanvasElement): WebGLTexture = js.native
      def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Boolean): WebGLTexture = js.native
      def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
      def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Unit, flipY: Boolean): WebGLTexture = js.native
      
      /**
        * Wrapper for creating WebGLFramebuffer.
        * @param width Width in pixels of the framebuffer
        * @param height Height in pixels of the framebuffer
        * @param renderTexture The color texture to where the color pixels are written
        * @param addDepthStencilBuffer Indicates if the current framebuffer support depth and stencil buffers
        */
      def createFramebuffer(width: integer, height: integer, renderTexture: WebGLTexture, addDepthStencilBuffer: Boolean): WebGLFramebuffer = js.native
      
      /**
        * Wrapper for creating a vertex buffer.
        * @param initialDataOrSize Either ArrayBuffer or an integer indicating the size of the vbo.
        * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW.
        */
      def createIndexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer = js.native
      
      /**
        * Wrapper for creating a WebGLProgram
        * @param vertexShader Source to the vertex shader
        * @param fragmentShader Source to the fragment shader
        */
      def createProgram(vertexShader: String, fragmentShader: String): WebGLProgram = js.native
      
      /**
        * A wrapper for creating a WebGLTexture. If no pixel data is passed it will create an empty texture.
        * @param mipLevel Mip level of the texture.
        * @param minFilter Filtering of the texture.
        * @param magFilter Filtering of the texture.
        * @param wrapT Wrapping mode of the texture.
        * @param wrapS Wrapping mode of the texture.
        * @param format Which format does the texture use.
        * @param pixels pixel data.
        * @param width Width of the texture in pixels.
        * @param height Height of the texture in pixels.
        * @param pma Does the texture have premultiplied alpha? Default true.
        * @param forceSize If `true` it will use the width and height passed to this method, regardless of the pixels dimension. Default false.
        * @param flipY Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload. Default false.
        */
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Boolean,
        forceSize: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Boolean,
        forceSize: Boolean,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Boolean,
        forceSize: Unit,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Unit,
        forceSize: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Unit,
        forceSize: Boolean,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: integer,
        minFilter: integer,
        magFilter: integer,
        wrapT: integer,
        wrapS: integer,
        format: integer,
        pixels: js.Object,
        width: integer,
        height: integer,
        pma: Unit,
        forceSize: Unit,
        flipY: Boolean
      ): WebGLTexture = js.native
      
      /**
        * Creates a texture from an image source. If the source is not valid it creates an empty texture.
        * @param source The source of the texture.
        * @param width The width of the texture.
        * @param height The height of the texture.
        * @param scaleMode The scale mode to be used by the texture.
        */
      def createTextureFromSource(source: js.Object, width: integer, height: integer, scaleMode: integer): WebGLTexture = js.native
      
      /**
        * Wrapper for creating a vertex buffer.
        * @param initialDataOrSize It's either ArrayBuffer or an integer indicating the size of the vbo
        * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW
        */
      def createVertexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer = js.native
      
      /**
        * Creates a new WebGL Texture based on the given HTML Video Element.
        * @param srcVideo The Video to create the WebGL Texture from
        * @param noRepeat Should this canvas be allowed to set `REPEAT`? Default false.
        * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
        */
      def createVideoTexture(srcVideo: HTMLVideoElement): WebGLTexture = js.native
      def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Boolean): WebGLTexture = js.native
      def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
      def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Unit, flipY: Boolean): WebGLTexture = js.native
      
      /**
        * Cached value for the last texture unit that was used
        */
      var currentActiveTextureUnit: integer = js.native
      
      /**
        * Current blend mode in use
        */
      var currentBlendMode: integer = js.native
      
      /**
        * Internal property that tracks the currently set camera mask.
        */
      var currentCameraMask: js.Any = js.native
      
      /**
        * Current framebuffer in use
        */
      var currentFramebuffer: WebGLFramebuffer = js.native
      
      /**
        * Current WebGLBuffer (Index buffer) in use
        */
      var currentIndexBuffer: WebGLBuffer = js.native
      
      /**
        * Internal property that tracks the currently set mask.
        */
      var currentMask: js.Any = js.native
      
      /**
        * Current WebGLPipeline in use
        */
      var currentPipeline: WebGLPipeline = js.native
      
      /**
        * Current WebGLProgram in use
        */
      var currentProgram: WebGLProgram = js.native
      
      /**
        * Stores the current scissor data
        */
      var currentScissor: Uint32Array = js.native
      
      /**
        * Indicates if the the scissor state is enabled in WebGLRenderingContext
        */
      var currentScissorEnabled: Boolean = js.native
      
      /**
        * An array of the last texture handles that were bound to the WebGLRenderingContext
        */
      var currentTextures: js.Array[js.Any] = js.native
      
      /**
        * The `type` of the Game Object being currently rendered.
        * This can be used by advanced render functions for batching look-ahead.
        */
      var currentType: String = js.native
      
      /**
        * Current WebGLBuffer (Vertex buffer) in use
        */
      var currentVertexBuffer: WebGLBuffer = js.native
      
      /**
        * A default Camera used in calls when no other camera has been provided.
        */
      var defaultCamera: BaseCamera = js.native
      
      /**
        * Deletes a WebGLBuffer from the GL instance.
        * @param vertexBuffer The WebGLBuffer to be deleted.
        */
      def deleteBuffer(vertexBuffer: WebGLBuffer): this.type = js.native
      
      /**
        * Deletes a WebGLFramebuffer from the GL instance.
        * @param framebuffer The Framebuffer to be deleted.
        */
      def deleteFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
      
      /**
        * Deletes a WebGLProgram from the GL instance.
        * @param program The shader program to be deleted.
        */
      def deleteProgram(program: WebGLProgram): this.type = js.native
      
      /**
        * Removes the given texture from the nativeTextures array and then deletes it from the GPU.
        * @param texture The WebGL Texture to be deleted.
        */
      def deleteTexture(texture: WebGLTexture): this.type = js.native
      
      /**
        * Destroy this WebGLRenderer, cleaning up all related resources such as pipelines, native textures, etc.
        */
      def destroy(): Unit = js.native
      
      /**
        * Cached drawing buffer height to reduce gl calls.
        */
      val drawingBufferHeight: Double = js.native
      
      /**
        * Extensions loaded into the current context
        */
      var extensions: js.Object = js.native
      
      /**
        * Flushes the current pipeline if the pipeline is bound
        */
      def flush(): Unit = js.native
      
      /**
        * The Game instance which owns this WebGL Renderer.
        */
      var game: Game = js.native
      
      /**
        * Loads a WebGL extension
        * @param extensionName The name of the extension to load.
        */
      def getExtension(extensionName: String): js.Object = js.native
      
      /**
        * Returns the largest texture size (either width or height) that can be created.
        * Note that VRAM may not allow a texture of any given size, it just expresses
        * hardware / driver support for a given size.
        */
      def getMaxTextureSize(): integer = js.native
      
      /**
        * Returns the maximum number of texture units that can be used in a fragment shader.
        */
      def getMaxTextures(): integer = js.native
      
      /**
        * Returns the pipeline by name if the pipeline exists
        * @param pipelineName The name of the pipeline.
        */
      def getPipeline(pipelineName: String): WebGLPipeline = js.native
      
      /**
        * The underlying WebGL context of the renderer.
        */
      var gl: WebGLRenderingContext = js.native
      
      /**
        * Stores the current WebGL component formats for further use
        */
      var glFormats: js.Array[js.Any] = js.native
      
      /**
        * Internal gl function mapping for uniform look-up.
        * https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform
        */
      var glFuncMap: js.Any = js.native
      
      /**
        * Is there an active stencil mask?
        */
      def hasActiveStencilMask(): Boolean = js.native
      
      /**
        * Checks if a WebGL extension is supported
        * @param extensionName Name of the WebGL extension
        */
      def hasExtension(extensionName: String): Boolean = js.native
      
      /**
        * Checks if a pipeline is present in the current WebGLRenderer
        * @param pipelineName The name of the pipeline.
        */
      def hasPipeline(pipelineName: String): Boolean = js.native
      
      /**
        * The height of the canvas being rendered to.
        * This is populated in the onResize event handler.
        */
      var height: integer = js.native
      
      /**
        * Creates a new WebGLRenderingContext and initializes all internal state.
        * @param config The configuration object for the renderer.
        */
      def init(config: js.Object): this.type = js.native
      
      /**
        * The total number of masks currently stacked.
        */
      var maskCount: integer = js.native
      
      /**
        * The mask stack.
        */
      var maskStack: js.Array[GeometryMask] = js.native
      
      /**
        * The mipmap magFilter to be used when creating textures.
        * 
        * You can specify this as a string in the game config, i.e.:
        * 
        * `renderer: { mipmapFilter: 'NEAREST_MIPMAP_LINEAR' }`
        * 
        * The 6 options for WebGL1 are, in order from least to most computationally expensive:
        * 
        * NEAREST (for pixel art)
        * LINEAR (the default)
        * NEAREST_MIPMAP_NEAREST
        * LINEAR_MIPMAP_NEAREST
        * NEAREST_MIPMAP_LINEAR
        * LINEAR_MIPMAP_LINEAR
        * 
        * Mipmaps only work with textures that are fully power-of-two in size.
        * 
        * For more details see https://webglfundamentals.org/webgl/lessons/webgl-3d-textures.html
        */
      var mipmapFilter: GLenum = js.native
      
      /**
        * Keeps track of any WebGLTexture created with the current WebGLRenderingContext
        */
      var nativeTextures: js.Array[js.Any] = js.native
      
      /**
        * Is the `type` of the Game Object being currently rendered different than the
        * type of the object before it in the display list? I.e. it's a 'new' type.
        */
      var newType: Boolean = js.native
      
      /**
        * Does the `type` of the next Game Object in the display list match that
        * of the object being currently rendered?
        */
      var nextTypeMatch: Boolean = js.native
      
      /**
        * The event handler that manages the `resize` event dispatched by the Scale Manager.
        * @param gameSize The default Game Size object. This is the un-modified game dimensions.
        * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
        * @param displaySize The display Size object. The size of the canvas style width / height attributes.
        * @param resolution The Scale Manager resolution setting.
        */
      def onResize(gameSize: Size, baseSize: Size, displaySize: Size): Unit = js.native
      def onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Double): Unit = js.native
      
      /**
        * This object will store all pipelines created through addPipeline
        */
      var pipelines: js.Object = js.native
      
      /**
        * Pops the last scissor state and sets it.
        */
      def popScissor(): Unit = js.native
      
      /**
        * The post-render step happens after all Cameras in all Scenes have been rendered.
        */
      def postRender(): Unit = js.native
      
      /**
        * Controls the post-render operations for the given camera.
        * Renders the foreground camera effects like flash and fading. It resets the current scissor state.
        * @param camera The Camera to post-render.
        */
      def postRenderCamera(camera: Camera): Unit = js.native
      
      /**
        * Clears the current vertex buffer and updates pipelines.
        */
      def preRender(): Unit = js.native
      
      /**
        * Controls the pre-render operations for the given camera.
        * Handles any clipping needed by the camera and renders the background color if a color is visible.
        * @param camera The Camera to pre-render.
        */
      def preRenderCamera(camera: Camera): Unit = js.native
      
      /**
        * Pushes a new scissor state. This is used to set nested scissor states.
        * @param x The x position of the scissor.
        * @param y The y position of the scissor.
        * @param width The width of the scissor.
        * @param height The height of the scissor.
        * @param drawingBufferHeight Optional drawingBufferHeight override value.
        */
      def pushScissor(x: integer, y: integer, width: integer, height: integer): js.Array[integer] = js.native
      def pushScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer): js.Array[integer] = js.native
      
      /**
        * Use this to reset the gl context to the state that Phaser requires to continue rendering.
        * Calling this will:
        * 
        * * Disable `DEPTH_TEST`, `CULL_FACE` and `STENCIL_TEST`.
        * * Clear the depth buffer and stencil buffers.
        * * Reset the viewport size.
        * * Reset the blend mode.
        * * Bind a blank texture as the active texture on texture unit zero.
        * * Rebinds the given pipeline instance.
        * 
        * You should call this having previously called `clearPipeline` and then wishing to return
        * control to Phaser again.
        * @param pipelineInstance The pipeline instance to be activated.
        */
      def rebindPipeline(pipelineInstance: WebGLPipeline): Unit = js.native
      
      /**
        * Removes a custom blend mode from the renderer.
        * Any Game Objects still using this blend mode will error, so be sure to clear them first.
        * @param index The index of the custom blend mode to be removed.
        */
      def removeBlendMode(index: integer): this.type = js.native
      
      /**
        * Removes a pipeline by name.
        * @param pipelineName The name of the pipeline to be removed.
        */
      def removePipeline(pipelineName: String): this.type = js.native
      
      /**
        * The core render step for a Scene Camera.
        * 
        * Iterates through the given Game Object's array and renders them with the given Camera.
        * 
        * This is called by the `CameraManager.render` method. The Camera Manager instance belongs to a Scene, and is invoked
        * by the Scene Systems.render method.
        * 
        * This method is not called if `Camera.visible` is `false`, or `Camera.alpha` is zero.
        * @param scene The Scene to render.
        * @param children The Game Object's within the Scene to be rendered.
        * @param interpolationPercentage The interpolation percentage to apply. Currently un-used.
        * @param camera The Scene Camera to render with.
        */
      def render(scene: Scene, children: GameObject, interpolationPercentage: Double, camera: Camera): Unit = js.native
      
      /**
        * Resizes the drawing buffer to match that required by the Scale Manager.
        * @param width The new width of the renderer.
        * @param height The new height of the renderer.
        * @param resolution The new resolution of the renderer.
        */
      def resize(): this.type = js.native
      def resize(width: Double): this.type = js.native
      def resize(width: Double, height: Double): this.type = js.native
      def resize(width: Double, height: Double, resolution: Double): this.type = js.native
      def resize(width: Double, height: Unit, resolution: Double): this.type = js.native
      def resize(width: Unit, height: Double): this.type = js.native
      def resize(width: Unit, height: Double, resolution: Double): this.type = js.native
      def resize(width: Unit, height: Unit, resolution: Double): this.type = js.native
      
      /**
        * Stack of scissor data
        */
      var scissorStack: Uint32Array = js.native
      
      /**
        * Sets the blend mode to the value given.
        * 
        * If the current blend mode is different from the one given, the pipeline is flushed and the new
        * blend mode is enabled.
        * @param blendModeId The blend mode to be set. Can be a `BlendModes` const or an integer value.
        * @param force Force the blend mode to be set, regardless of the currently set blend mode. Default false.
        */
      def setBlendMode(blendModeId: integer): Boolean = js.native
      def setBlendMode(blendModeId: integer, force: Boolean): Boolean = js.native
      
      /**
        * Sets a 1f uniform value on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 1f value to set on the named uniform.
        */
      def setFloat1(program: WebGLProgram, name: String, x: Double): this.type = js.native
      
      /**
        * Sets the value of a 1fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat1v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Sets the 2f uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 2f x value to set on the named uniform.
        * @param y The 2f y value to set on the named uniform.
        */
      def setFloat2(program: WebGLProgram, name: String, x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the value of a 2fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat2v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Sets the 3f uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 3f x value to set on the named uniform.
        * @param y The 3f y value to set on the named uniform.
        * @param z The 3f z value to set on the named uniform.
        */
      def setFloat3(program: WebGLProgram, name: String, x: Double, y: Double, z: Double): this.type = js.native
      
      /**
        * Sets the value of a 3fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat3v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Sets the 4f uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 4f x value to set on the named uniform.
        * @param y The 4f y value to set on the named uniform.
        * @param z The 4f z value to set on the named uniform.
        * @param w The 4f w value to set on the named uniform.
        */
      def setFloat4(program: WebGLProgram, name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      
      /**
        * Sets the value of a 4fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      def setFloat4v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Binds a framebuffer. If there was another framebuffer already bound it will force a pipeline flush.
        * @param framebuffer The framebuffer that needs to be bound.
        * @param updateScissor If a framebuffer is given, set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
        */
      def setFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean): this.type = js.native
      
      /**
        * Bounds a index buffer. If there is a index buffer already bound it'll force a pipeline flush.
        * @param indexBuffer The buffer the needs to be bound.
        */
      def setIndexBuffer(indexBuffer: WebGLBuffer): this.type = js.native
      
      /**
        * Sets a 1i uniform value on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 1i value to set on the named uniform.
        */
      def setInt1(program: WebGLProgram, name: String, x: integer): this.type = js.native
      
      /**
        * Sets the 2i uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 2i x value to set on the named uniform.
        * @param y The 2i y value to set on the named uniform.
        */
      def setInt2(program: WebGLProgram, name: String, x: integer, y: integer): this.type = js.native
      
      /**
        * Sets the 3i uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 3i x value to set on the named uniform.
        * @param y The 3i y value to set on the named uniform.
        * @param z The 3i z value to set on the named uniform.
        */
      def setInt3(program: WebGLProgram, name: String, x: integer, y: integer, z: integer): this.type = js.native
      
      /**
        * Sets the 4i uniform values on the given shader.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param x The 4i x value to set on the named uniform.
        * @param y The 4i y value to set on the named uniform.
        * @param z The 4i z value to set on the named uniform.
        * @param w The 4i w value to set on the named uniform.
        */
      def setInt4(program: WebGLProgram, name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
      
      /**
        * Sets the value of a matrix 2fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose The value indicating whether to transpose the matrix. Must be false.
        * @param matrix A Float32Array or sequence of 4 float values.
        */
      def setMatrix2(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Sets the value of a matrix 3fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose The value indicating whether to transpose the matrix. Must be false.
        * @param matrix A Float32Array or sequence of 9 float values.
        */
      def setMatrix3(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Sets the value of a matrix 4fv uniform variable in the given WebGLProgram.
        * 
        * If the shader is not currently active, it is made active first.
        * @param program The target WebGLProgram from which the uniform location will be looked-up.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose The value indicating whether to transpose the matrix. Must be false.
        * @param matrix A Float32Array or sequence of 16 float values.
        */
      def setMatrix4(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Binds a WebGLPipeline and sets it as the current pipeline to be used.
        * @param pipelineInstance The pipeline instance to be activated.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        */
      def setPipeline(pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
      def setPipeline(pipelineInstance: WebGLPipeline, gameObject: GameObject): WebGLPipeline = js.native
      
      /**
        * Binds a program. If there was another program already bound it will force a pipeline flush.
        * @param program The program that needs to be bound.
        */
      def setProgram(program: WebGLProgram): this.type = js.native
      
      /**
        * Sets the current scissor state.
        * @param x The x position of the scissor.
        * @param y The y position of the scissor.
        * @param width The width of the scissor.
        * @param height The height of the scissor.
        * @param drawingBufferHeight Optional drawingBufferHeight override value.
        */
      def setScissor(x: integer, y: integer, width: integer, height: integer): Unit = js.native
      def setScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer): Unit = js.native
      
      /**
        * Binds a texture at a texture unit. If a texture is already
        * bound to that unit it will force a flush on the current pipeline.
        * @param texture The WebGL texture that needs to be bound.
        * @param textureUnit The texture unit to which the texture will be bound.
        * @param flush Will the current pipeline be flushed if this is a new texture, or not? Default true.
        */
      def setTexture2D(texture: WebGLTexture, textureUnit: integer): this.type = js.native
      def setTexture2D(texture: WebGLTexture, textureUnit: integer, flush: Boolean): this.type = js.native
      
      /**
        * Sets the minification and magnification filter for a texture.
        * @param texture The texture to set the filter for.
        * @param filter The filter to set. 0 for linear filtering, 1 for nearest neighbor (blocky) filtering.
        */
      def setTextureFilter(texture: integer, filter: integer): this.type = js.native
      
      /**
        * Bounds a vertex buffer. If there is a vertex buffer already bound it'll force a pipeline flush.
        * @param vertexBuffer The buffer that needs to be bound.
        */
      def setVertexBuffer(vertexBuffer: WebGLBuffer): this.type = js.native
      
      /**
        * Schedules a snapshot of the entire game viewport to be taken after the current frame is rendered.
        * 
        * To capture a specific area see the `snapshotArea` method. To capture a specific pixel, see `snapshotPixel`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
        * calling this method will override it.
        * 
        * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
        * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
        * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
        * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshot(callback: SnapshotCallback): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
      def snapshot(callback: SnapshotCallback, `type`: Unit, encoderOptions: Double): this.type = js.native
      
      /**
        * Schedules a snapshot of the given area of the game viewport to be taken after the current frame is rendered.
        * 
        * To capture the whole game viewport see the `snapshot` method. To capture a specific pixel, see `snapshotPixel`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
        * calling this method will override it.
        * 
        * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
        * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
        * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
        * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param x The x coordinate to grab from.
        * @param y The y coordinate to grab from.
        * @param width The width of the area to grab.
        * @param height The height of the area to grab.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: String
      ): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: String,
        encoderOptions: Double
      ): this.type = js.native
      def snapshotArea(
        x: integer,
        y: integer,
        width: integer,
        height: integer,
        callback: SnapshotCallback,
        `type`: Unit,
        encoderOptions: Double
      ): this.type = js.native
      
      /**
        * Takes a snapshot of the given area of the given frame buffer.
        * 
        * Unlike the other snapshot methods, this one is processed immediately and doesn't wait for the next render.
        * 
        * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
        * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
        * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
        * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
        * @param framebuffer The framebuffer to grab from.
        * @param bufferWidth The width of the framebuffer.
        * @param bufferHeight The height of the framebuffer.
        * @param callback The Function to invoke after the snapshot image is created.
        * @param getPixel Grab a single pixel as a Color object, or an area as an Image object? Default false.
        * @param x The x coordinate to grab from. Default 0.
        * @param y The y coordinate to grab from. Default 0.
        * @param width The width of the area to grab. Default bufferWidth.
        * @param height The height of the area to grab. Default bufferHeight.
        * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
        * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
        */
      def snapshotFramebuffer(
        framebuffer: WebGLFramebuffer,
        bufferWidth: integer,
        bufferHeight: integer,
        callback: SnapshotCallback,
        getPixel: js.UndefOr[Boolean],
        x: js.UndefOr[integer],
        y: js.UndefOr[integer],
        width: js.UndefOr[integer],
        height: js.UndefOr[integer],
        `type`: js.UndefOr[String],
        encoderOptions: js.UndefOr[Double]
      ): this.type = js.native
      
      /**
        * Schedules a snapshot of the given pixel from the game viewport to be taken after the current frame is rendered.
        * 
        * To capture the whole game viewport see the `snapshot` method. To capture a specific area, see `snapshotArea`.
        * 
        * Only one snapshot can be active _per frame_. If you have already called `snapshotArea`, for example, then
        * calling this method will override it.
        * 
        * Unlike the other two snapshot methods, this one will return a `Color` object containing the color data for
        * the requested pixel. It doesn't need to create an internal Canvas or Image object, so is a lot faster to execute,
        * using less memory.
        * @param x The x coordinate of the pixel to get.
        * @param y The y coordinate of the pixel to get.
        * @param callback The Function to invoke after the snapshot pixel data is extracted.
        */
      def snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): this.type = js.native
      
      /**
        * Details about the currently scheduled snapshot.
        * 
        * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
        */
      var snapshotState: SnapshotState = js.native
      
      /**
        * Array of strings that indicate which WebGL extensions are supported by the browser
        */
      var supportedExtensions: js.Object = js.native
      
      /**
        * A constant which allows the renderer to be easily identified as a WebGL Renderer.
        */
      var `type`: integer = js.native
      
      /**
        * Updates the function bound to a given custom blend mode.
        * @param index The index of the custom blend mode.
        * @param func The function to use for the blend mode.
        * @param equation The equation to use for the blend mode.
        */
      def updateBlendMode(index: integer, func: js.Function, equation: js.Function): this.type = js.native
      
      /**
        * Updates a WebGL Texture based on the given Canvas Element.
        * @param srcCanvas The Canvas to update the WebGL Texture from.
        * @param dstTexture The destination WebGL Texture to update.
        * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
        */
      def updateCanvasTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture): WebGLTexture = js.native
      def updateCanvasTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, flipY: Boolean): WebGLTexture = js.native
      
      /**
        * Updates a WebGL Texture based on the given HTML Video Element.
        * @param srcVideo The Video to update the WebGL Texture with.
        * @param dstTexture The destination WebGL Texture to update.
        * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
        */
      def updateVideoTexture(srcVideo: HTMLVideoElement, dstTexture: WebGLTexture): WebGLTexture = js.native
      def updateVideoTexture(srcVideo: HTMLVideoElement, dstTexture: WebGLTexture, flipY: Boolean): WebGLTexture = js.native
      
      /**
        * The width of the canvas being rendered to.
        * This is populated in the onResize event handler.
        */
      var width: integer = js.native
    }
  }
}
