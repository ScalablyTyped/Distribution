package typings.phaser.Phaser

import typings.phaser.Class
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.ColorMatrix
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Image
import typings.phaser.Phaser.GameObjects.PointLight
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Math.Matrix4
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.MultiPipeline
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.UtilityPipeline
import typings.phaser.Phaser.Structs.Map
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.TextureSource
import typings.phaser.Phaser.Types.Core.PipelineConfig
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotCallback
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineAttribute
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineAttributeConfig
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineConfig
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineUniformsConfig
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLTextureCompression
import typings.std.ANGLEInstancedArrays
import typings.std.CanvasRenderingContext2D
import typings.std.GLenum
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.OESVertexArrayObject
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
      * The Canvas Renderer is responsible for managing 2D canvas rendering contexts,
      * including the one used by the Games canvas. It tracks the internal state of a
      * given context and can renderer textured Game Objects to it, taking into
      * account alpha, blending, and scaling.
      */
    @js.native
    trait CanvasRenderer
      extends StObject
         with EventEmitter {
      
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
      var blendModes: js.Array[Any] = js.native
      
      /**
        * The local configuration settings of the CanvasRenderer.
        */
      var config: js.Object = js.native
      
      /**
        * The canvas context currently used by the CanvasRenderer for all rendering operations.
        */
      var currentContext: CanvasRenderingContext2D = js.native
      
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
      var height: Double = js.native
      
      /**
        * Prepares the game canvas for rendering.
        */
      def init(): Unit = js.native
      
      /**
        * Has this renderer fully booted yet?
        */
      var isBooted: Boolean = js.native
      
      /**
        * The event handler that manages the `resize` event dispatched by the Scale Manager.
        * @param gameSize The default Game Size object. This is the un-modified game dimensions.
        * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
        */
      def onResize(gameSize: Size, baseSize: Size): Unit = js.native
      
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
        * The core render step for a Scene Camera.
        * 
        * Iterates through the given array of Game Objects and renders them with the given Camera.
        * 
        * This is called by the `CameraManager.render` method. The Camera Manager instance belongs to a Scene, and is invoked
        * by the Scene Systems.render method.
        * 
        * This method is not called if `Camera.visible` is `false`, or `Camera.alpha` is zero.
        * @param scene The Scene to render.
        * @param children An array of filtered Game Objects that can be rendered by the given Camera.
        * @param camera The Scene Camera to render with.
        */
      def render(scene: Scene, children: js.Array[GameObject], camera: Camera): Unit = js.native
      
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
      def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback): this.type = js.native
      def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback, `type`: String): this.type = js.native
      def snapshotArea(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        callback: SnapshotCallback,
        `type`: String,
        encoderOptions: Double
      ): this.type = js.native
      def snapshotArea(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
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
        x: js.UndefOr[Double],
        y: js.UndefOr[Double],
        width: js.UndefOr[Double],
        height: js.UndefOr[Double],
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
      def snapshotPixel(x: Double, y: Double, callback: SnapshotCallback): this.type = js.native
      
      /**
        * Details about the currently scheduled snapshot.
        * 
        * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
        */
      var snapshotState: SnapshotState = js.native
      
      /**
        * A constant which allows the renderer to be easily identified as a Canvas Renderer.
        */
      var `type`: Double = js.native
      
      /**
        * The width of the canvas being rendered to.
        */
      var width: Double = js.native
    }
  }
  
  object WebGL {
    
    /**
      * The Pipeline Manager is responsible for the creation, activation, running and destruction
      * of WebGL Pipelines and Post FX Pipelines in Phaser 3.
      * 
      * The `WebGLRenderer` owns a single instance of the Pipeline Manager, which you can access
      * via the `WebGLRenderer.pipelines` property.
      * 
      * By default, there are 8 pipelines installed into the Pipeline Manager when Phaser boots:
      * 
      * 1. The Multi Pipeline. Responsible for all multi-texture rendering, i.e. Sprites and Tilemaps.
      * 2. The Graphics Pipeline. Responsible for rendering Graphics and Shape objects.
      * 3. The Rope Pipeline. Responsible for rendering the Rope Game Object.
      * 4. The Light Pipeline. Responsible for rendering the Light Game Object.
      * 5. The Point Light Pipeline. Responsible for rendering the Point Light Game Object.
      * 6. The Single Pipeline. Responsible for rendering Game Objects that explicitly require one bound texture.
      * 7. The Bitmap Mask Pipeline. Responsible for Bitmap Mask rendering.
      * 8. The Utility Pipeline. Responsible for providing lots of handy texture manipulation functions.
      * 
      * You can add your own custom pipeline via the `PipelineManager.add` method. Pipelines are
      * identified by unique string-based keys.
      */
    @js.native
    trait PipelineManager extends StObject {
      
      /**
        * A constant-style reference to the Bitmap Mask Pipeline Instance.
        * 
        * This is the default Phaser 3 mask pipeline and is used Game Objects using
        * a Bitmap Mask. This property is set during the `boot` method.
        */
      var BITMAPMASK_PIPELINE: BitmapMaskPipeline = js.native
      
      /**
        * A constant-style reference to the Multi Pipeline Instance.
        * 
        * This is the default Phaser 3 pipeline and is used by the WebGL Renderer to manage
        * camera effects and more. This property is set during the `boot` method.
        */
      var MULTI_PIPELINE: MultiPipeline = js.native
      
      /**
        * A constant-style reference to the Utility Pipeline Instance.
        */
      var UTILITY_PIPELINE: UtilityPipeline = js.native
      
      /**
        * Adds a pipeline instance to this Pipeline Manager.
        * 
        * The name of the instance must be unique within this manager.
        * 
        * Make sure to pass an instance to this method, not a base class.
        * 
        * For example, you should pass it like this:
        * 
        * ```javascript
        * this.add('yourName', new CustomPipeline());`
        * ```
        * 
        * and **not** like this:
        * 
        * ```javascript
        * this.add('yourName', CustomPipeline);`
        * ```
        * 
        * To add a **Post Pipeline**, see `addPostPipeline` instead.
        * @param name A unique string-based key for the pipeline within the manager.
        * @param pipeline A pipeline _instance_ which must extend `WebGLPipeline`.
        */
      def add(name: String, pipeline: WebGLPipeline): WebGLPipeline = js.native
      
      /**
        * Adds a Post Pipeline to this Pipeline Manager.
        * 
        * Make sure to pass a base class to this method, not an instance.
        * 
        * For example, you should pass it like this:
        * 
        * ```javascript
        * this.addPostPipeline('yourName', CustomPipeline);`
        * ```
        * 
        * and **not** like this:
        * 
        * ```javascript
        * this.addPostPipeline('yourName', new CustomPipeline());`
        * ```
        * 
        * To add a regular pipeline, see the `add` method instead.
        * @param name A unique string-based key for the pipeline within the manager.
        * @param pipeline A pipeline class which must extend `PostFXPipeline`.
        */
      def addPostPipeline(name: String, pipeline: js.Function): this.type = js.native
      
      /**
        * Draws the `source1` and `source2` Render Targets to the `target` Render Target
        * using a linear blend effect, which is controlled by the `strength` parameter.
        * 
        * The draw itself is handled by the Utility Pipeline.
        * @param source1 The first source Render Target.
        * @param source2 The second source Render Target.
        * @param target The target Render Target.
        * @param strength The strength of the blend. Default 1.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        */
      def blendFrames(source1: RenderTarget, source2: RenderTarget): this.type = js.native
      def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): this.type = js.native
      def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): this.type = js.native
      def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): this.type = js.native
      def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): this.type = js.native
      def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): this.type = js.native
      def blendFrames(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget,
        strength: Double,
        clearAlpha: Boolean
      ): this.type = js.native
      def blendFrames(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget,
        strength: Unit,
        clearAlpha: Boolean
      ): this.type = js.native
      
      /**
        * Draws the `source1` and `source2` Render Targets to the `target` Render Target
        * using an additive blend effect, which is controlled by the `strength` parameter.
        * 
        * The draw itself is handled by the Utility Pipeline.
        * @param source1 The first source Render Target.
        * @param source2 The second source Render Target.
        * @param target The target Render Target.
        * @param strength The strength of the blend. Default 1.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        */
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget): this.type = js.native
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): this.type = js.native
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): this.type = js.native
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): this.type = js.native
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): this.type = js.native
      def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): this.type = js.native
      def blendFramesAdditive(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget,
        strength: Double,
        clearAlpha: Boolean
      ): this.type = js.native
      def blendFramesAdditive(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget,
        strength: Unit,
        clearAlpha: Boolean
      ): this.type = js.native
      
      /**
        * Copy the `source` Render Target to the `target` Render Target.
        * 
        * The difference with this copy is that no resizing takes place. If the `source`
        * Render Target is larger than the `target` then only a portion the same size as
        * the `target` dimensions is copied across.
        * 
        * You can optionally set the brightness factor of the copy.
        * @param source The source Render Target.
        * @param target The target Render Target.
        * @param brightness The brightness value applied to the frame copy. Default 1.
        * @param clear Clear the target before copying? Default true.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        * @param eraseMode Erase source from target using ERASE Blend Mode? Default false.
        */
      def blitFrame(source: RenderTarget, target: RenderTarget): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Boolean,
        clearAlpha: Boolean
      ): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Boolean,
        clearAlpha: Boolean,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Boolean,
        clearAlpha: Unit,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Unit,
        clearAlpha: Boolean,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Unit,
        clearAlpha: Unit,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Unit,
        clear: Boolean,
        clearAlpha: Boolean,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Unit,
        clear: Boolean,
        clearAlpha: Unit,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Unit,
        clear: Unit,
        clearAlpha: Boolean,
        eraseMode: Boolean
      ): this.type = js.native
      def blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Unit,
        clear: Unit,
        clearAlpha: Unit,
        eraseMode: Boolean
      ): this.type = js.native
      
      /**
        * Internal boot handler, called by the WebGLRenderer durings its boot process.
        * 
        * Adds all of the default pipelines, based on the game config, and then calls
        * the `boot` method on each one of them.
        * 
        * Finally, the default pipeline is set.
        * @param pipelineConfig The pipeline configuration object as set in the Game Config.
        */
      def boot(): Unit = js.native
      def boot(pipelineConfig: PipelineConfig): Unit = js.native
      
      /**
        * This map stores all pipeline classes available in this manager.
        * 
        * The Utility Class must always come first.
        */
      var classes: Map[String, Class] = js.native
      
      /**
        * Flushes the current pipeline being used and then clears it, along with the
        * the current shader program and vertex buffer from the `WebGLRenderer`.
        * 
        * Then resets the blend mode to NORMAL.
        * 
        * Call this before jumping to your own gl context handler, and then call `rebind` when
        * you wish to return control to Phaser again.
        */
      def clear(): Unit = js.native
      
      /**
        * Clears the given Render Target.
        * @param target The Render Target to clear.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        */
      def clearFrame(target: RenderTarget): this.type = js.native
      def clearFrame(target: RenderTarget, clearAlpha: Boolean): this.type = js.native
      
      /**
        * Copy the `source` Render Target to the `target` Render Target.
        * 
        * You can optionally set the brightness factor of the copy.
        * 
        * The difference between this method and `drawFrame` is that this method
        * uses a faster copy shader, where only the brightness can be modified.
        * If you need color level manipulation, see `drawFrame` instead.
        * 
        * The copy itself is handled by the Utility Pipeline.
        * @param source The source Render Target.
        * @param target The target Render Target.
        * @param brightness The brightness value applied to the frame copy. Default 1.
        * @param clear Clear the target before copying? Default true.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        */
      def copyFrame(source: RenderTarget): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Double): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Unit, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Unit, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): this.type = js.native
      def copyFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Double,
        clear: Boolean,
        clearAlpha: Boolean
      ): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): this.type = js.native
      def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): this.type = js.native
      
      /**
        * Binds the `source` Render Target and then copies a section of it to the `target` Render Target.
        * 
        * This method is extremely fast because it uses `gl.copyTexSubImage2D` and doesn't
        * require the use of any shaders. Remember the coordinates are given in standard WebGL format,
        * where x and y specify the lower-left corner of the section, not the top-left. Also, the
        * copy entirely replaces the contents of the target texture, no 'merging' or 'blending' takes
        * place.
        * @param source The source Render Target.
        * @param target The target Render Target.
        * @param x The x coordinate of the lower left corner where to start copying.
        * @param y The y coordinate of the lower left corner where to start copying.
        * @param width The width of the texture.
        * @param height The height of the texture.
        * @param clear Clear the target before copying? Default true.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        */
      def copyFrameRect(source: RenderTarget, target: RenderTarget, x: Double, y: Double, width: Double, height: Double): this.type = js.native
      def copyFrameRect(
        source: RenderTarget,
        target: RenderTarget,
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        clear: Boolean
      ): this.type = js.native
      def copyFrameRect(
        source: RenderTarget,
        target: RenderTarget,
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        clear: Boolean,
        clearAlpha: Boolean
      ): this.type = js.native
      def copyFrameRect(
        source: RenderTarget,
        target: RenderTarget,
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        clear: Unit,
        clearAlpha: Boolean
      ): this.type = js.native
      
      /**
        * Pops the framebuffer from the renderers FBO stack and sets that as the active target,
        * then draws the `source` Render Target to it. It then resets the renderer textures.
        * 
        * This should be done when you need to draw the _final_ results of a pipeline to the game
        * canvas, or the next framebuffer in line on the FBO stack. You should only call this once
        * in the `onDraw` handler and it should be the final thing called. Be careful not to call
        * this if you need to actually use the pipeline shader, instead of the copy shader. In
        * those cases, use the `bindAndDraw` method.
        * @param source The Render Target to draw from.
        */
      def copyToGame(source: RenderTarget): Unit = js.native
      
      /**
        * Current pipeline in use by the WebGLRenderer.
        */
      var current: WebGLPipeline = js.native
      
      /**
        * Destroy the Pipeline Manager, cleaning up all related resources and references.
        */
      def destroy(): Unit = js.native
      
      /**
        * Copy the `source` Render Target to the `target` Render Target, using the
        * given Color Matrix.
        * 
        * The difference between this method and `copyFrame` is that this method
        * uses a color matrix shader, where you have full control over the luminance
        * values used during the copy. If you don't need this, you can use the faster
        * `copyFrame` method instead.
        * 
        * The copy itself is handled by the Utility Pipeline.
        * @param source The source Render Target.
        * @param target The target Render Target.
        * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
        * @param colorMatrix The Color Matrix to use when performing the draw.
        */
      def drawFrame(source: RenderTarget): this.type = js.native
      def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Boolean): this.type = js.native
      def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Boolean, colorMatrix: ColorMatrix): this.type = js.native
      def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Unit, colorMatrix: ColorMatrix): this.type = js.native
      def drawFrame(source: RenderTarget, target: RenderTarget): this.type = js.native
      def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Boolean): this.type = js.native
      def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Boolean, colorMatrix: ColorMatrix): this.type = js.native
      def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Unit, colorMatrix: ColorMatrix): this.type = js.native
      
      /**
        * Flushes the current pipeline, if one is bound.
        */
      def flush(): Unit = js.native
      
      /**
        * Returns `true` if the current pipeline is forced to use texture unit zero.
        */
      def forceZero(): Boolean = js.native
      
      /**
        * A reference to the Full Frame 1 Render Target that belongs to the
        * Utility Pipeline. This property is set during the `boot` method.
        * 
        * This Render Target is the full size of the renderer.
        * 
        * You can use this directly in Post FX Pipelines for multi-target effects.
        * However, be aware that these targets are shared between all post fx pipelines.
        */
      var fullFrame1: RenderTarget = js.native
      
      /**
        * A reference to the Full Frame 2 Render Target that belongs to the
        * Utility Pipeline. This property is set during the `boot` method.
        * 
        * This Render Target is the full size of the renderer.
        * 
        * You can use this directly in Post FX Pipelines for multi-target effects.
        * However, be aware that these targets are shared between all post fx pipelines.
        */
      var fullFrame2: RenderTarget = js.native
      
      /**
        * A reference to the Game instance.
        */
      var game: Game = js.native
      
      /**
        * Returns the pipeline instance based on the given name, or instance.
        * 
        * If no instance, or matching name, exists in this manager, it returns `undefined`.
        * @param pipeline Either the string-based name of the pipeline to get, or a pipeline instance to look-up.
        */
      def get(pipeline: String): WebGLPipeline = js.native
      def get(pipeline: WebGLPipeline): WebGLPipeline = js.native
      
      /**
        * Returns a _new instance_ of the post pipeline based on the given name, or class.
        * 
        * If no instance, or matching name, exists in this manager, it returns `undefined`.
        * @param pipeline Either the string-based name of the pipeline to get, or a pipeline instance, or class to look-up.
        * @param gameObject If this post pipeline is being installed into a Game Object or Camera, this is a reference to it.
        */
      def getPostPipeline(pipeline: String): PostFXPipeline = js.native
      def getPostPipeline(pipeline: String, gameObject: GameObject): PostFXPipeline = js.native
      def getPostPipeline(pipeline: js.Function): PostFXPipeline = js.native
      def getPostPipeline(pipeline: js.Function, gameObject: GameObject): PostFXPipeline = js.native
      def getPostPipeline(pipeline: PostFXPipeline): PostFXPipeline = js.native
      def getPostPipeline(pipeline: PostFXPipeline, gameObject: GameObject): PostFXPipeline = js.native
      
      /**
        * A reference to the Half Frame 1 Render Target that belongs to the
        * Utility Pipeline. This property is set during the `boot` method.
        * 
        * This Render Target is half the size of the renderer.
        * 
        * You can use this directly in Post FX Pipelines for multi-target effects.
        * However, be aware that these targets are shared between all post fx pipelines.
        */
      var halfFrame1: RenderTarget = js.native
      
      /**
        * A reference to the Half Frame 2 Render Target that belongs to the
        * Utility Pipeline. This property is set during the `boot` method.
        * 
        * This Render Target is half the size of the renderer.
        * 
        * You can use this directly in Post FX Pipelines for multi-target effects.
        * However, be aware that these targets are shared between all post fx pipelines.
        */
      var halfFrame2: RenderTarget = js.native
      
      /**
        * Checks if a pipeline is present in this Pipeline Manager.
        * @param pipeline Either the string-based name of the pipeline to get, or a pipeline instance to look-up.
        */
      def has(pipeline: String): Boolean = js.native
      def has(pipeline: WebGLPipeline): Boolean = js.native
      
      /**
        * Checks to see if the given pipeline is already the active pipeline, both within this
        * Pipeline Manager and also has the same shader set in the Renderer.
        * @param pipeline The pipeline instance to be checked.
        * @param currentShader The shader to set as being current.
        */
      def isCurrent(pipeline: WebGLPipeline): Boolean = js.native
      def isCurrent(pipeline: WebGLPipeline, currentShader: WebGLShader): Boolean = js.native
      
      /**
        * This map stores all pipeline instances in this manager.
        * 
        * This is populated with the default pipelines in the `boot` method.
        */
      var pipelines: Map[String, WebGLPipeline] = js.native
      
      /**
        * This method is called by the `WebGLPipeline.batchQuad` method, right after a quad
        * belonging to a Game Object has been added to the batch. It causes a batch
        * flush, then calls the `postBatch` method on the post-fx pipelines belonging to the
        * Game Object.
        * @param gameObject The Game Object that was just added to the batch.
        */
      def postBatch(gameObject: GameObject): Unit = js.native
      
      /**
        * Called at the end of the `WebGLRenderer.postRenderCamera` method.
        * 
        * If the Camera has post pipelines set, it will flush the batch and then call the
        * `postBatch` method on the post-fx pipelines belonging to the Camera.
        * @param camera The Camera that was just rendered.
        */
      def postBatchCamera(camera: Camera): Unit = js.native
      
      /**
        * This map stores all Post FX Pipeline classes available in this manager.
        */
      var postPipelineClasses: Map[String, Class] = js.native
      
      /**
        * This method is called by the `WebGLPipeline.batchQuad` method, right before a quad
        * belonging to a Game Object is about to be added to the batch. It causes a batch
        * flush, then calls the `preBatch` method on the post-fx pipelines belonging to the
        * Game Object.
        * @param gameObject The Game Object about to be batched.
        */
      def preBatch(gameObject: GameObject): Unit = js.native
      
      /**
        * Called at the start of the `WebGLRenderer.preRenderCamera` method.
        * 
        * If the Camera has post pipelines set, it will flush the batch and then call the
        * `preBatch` method on the post-fx pipelines belonging to the Camera.
        * @param camera The Camera about to be rendered.
        */
      def preBatchCamera(camera: Camera): Unit = js.native
      
      /**
        * The previous WebGLPipeline that was in use.
        * 
        * This is set when `clearPipeline` is called and restored in `rebindPipeline` if none is given.
        */
      var previous: WebGLPipeline = js.native
      
      /**
        * Use this to reset the gl context to the state that Phaser requires to continue rendering.
        * 
        * Calling this will:
        * 
        * * Disable `DEPTH_TEST`, `CULL_FACE` and `STENCIL_TEST`.
        * * Clear the depth buffer and stencil buffers.
        * * Reset the viewport size.
        * * Reset the blend mode.
        * * Bind a blank texture as the active texture on texture unit zero.
        * * Rebinds the given pipeline instance.
        * 
        * You should call this if you have previously called `clear`, and then wish to return
        * rendering control to Phaser again.
        * @param pipeline The pipeline instance to be rebound. If not given, the previous pipeline will be bound.
        */
      def rebind(): Unit = js.native
      def rebind(pipeline: WebGLPipeline): Unit = js.native
      
      /**
        * Removes a pipeline instance based on the given name.
        * 
        * If no pipeline matches the name, this method does nothing.
        * 
        * Note that the pipeline will not be flushed or destroyed, it's simply removed from
        * this manager.
        * @param name The name of the pipeline to be removed.
        * @param removeClass Remove the pipeline class as well as the instance? Default true.
        * @param removePostPipelineClass Remove the post pipeline class as well as the instance? Default true.
        */
      def remove(name: String): Unit = js.native
      def remove(name: String, removeClass: Boolean): Unit = js.native
      def remove(name: String, removeClass: Boolean, removePostPipelineClass: Boolean): Unit = js.native
      def remove(name: String, removeClass: Unit, removePostPipelineClass: Boolean): Unit = js.native
      
      /**
        * A reference to the WebGL Renderer instance.
        */
      var renderer: WebGLRenderer = js.native
      
      /**
        * Sets the current pipeline to be used by the `WebGLRenderer`.
        * 
        * This method accepts a pipeline instance as its parameter, not the name.
        * 
        * If the pipeline isn't already the current one it will call `WebGLPipeline.bind` and then `onBind`.
        * 
        * You cannot set Post FX Pipelines using this method. To use a Post FX Pipeline, you should
        * apply it to either a Camera, Container or other supporting Game Object.
        * @param pipeline The pipeline instance to be set as current.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        * @param currentShader The shader to set as being current.
        */
      def set(pipeline: WebGLPipeline): WebGLPipeline = js.native
      def set(pipeline: WebGLPipeline, gameObject: Unit, currentShader: WebGLShader): WebGLPipeline = js.native
      def set(pipeline: WebGLPipeline, gameObject: GameObject): WebGLPipeline = js.native
      def set(pipeline: WebGLPipeline, gameObject: GameObject, currentShader: WebGLShader): WebGLPipeline = js.native
      
      /**
        * Sets the Multi Pipeline to be the currently bound pipeline.
        * 
        * This is the default Phaser 3 rendering pipeline.
        */
      def setMulti(): MultiPipeline = js.native
      
      /**
        * Sets the Utility Pipeline to be the currently bound pipeline.
        * @param currentShader The shader to set as being current.
        */
      def setUtility(): UtilityPipeline = js.native
      def setUtility(currentShader: WebGLShader): UtilityPipeline = js.native
    }
    
    object Pipelines {
      
      /**
        * The Bitmap Mask Pipeline handles all of the bitmap mask rendering in WebGL for applying
        * alpha masks to Game Objects. It works by sampling two texture on the fragment shader and
        * using the fragments alpha to clip the region.
        * 
        * The fragment shader it uses can be found in `shaders/src/BitmapMask.frag`.
        * The vertex shader it uses can be found in `shaders/src/BitmapMask.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uResolution` (vec2)
        * `uMainSampler` (sampler2D)
        * `uMaskSampler` (sampler2D)
        * `uInvertMaskAlpha` (bool)
        */
      @js.native
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
        def beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera): Unit = js.native
        
        /**
          * The masked game objects framebuffer is unbound and its texture
          * is bound together with the mask texture and the mask shader and
          * a draw call with a single quad is processed. Here is where the
          * masking effect is applied.
          * @param mask GameObject used as a mask.
          */
        def endMask(mask: GameObject): Unit = js.native
      }
      
      /**
        * The Graphics Pipeline is the rendering pipeline used by Phaser in WebGL when drawing
        * primitive geometry objects, such as the Graphics Game Object, or the Shape Game Objects
        * such as Arc, Line, Rectangle and Star. It handles the preperation and batching of related vertices.
        * 
        * Prior to Phaser v3.50 the functions of this pipeline were merged with the `TextureTintPipeline`.
        * 
        * The fragment shader it uses can be found in `shaders/src/Graphics.frag`.
        * The vertex shader it uses can be found in `shaders/src/Graphics.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2)
        * `inColor` (vec4, normalized)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uProjectionMatrix` (mat4)
        */
      @js.native
      trait GraphicsPipeline
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
        def batchFillPath(path: js.Array[Vector2Like], currentMatrix: TransformMatrix, parentMatrix: TransformMatrix): Unit = js.native
        
        /**
          * Pushes a filled rectangle into the vertex batch.
          * 
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
          * 
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
          * Creates a line out of 4 quads and adds it to the vertex batch based on the given line values.
          * @param ax x coordinate of the start of the line.
          * @param ay y coordinate of the start of the line.
          * @param bx x coordinate of the end of the line.
          * @param by y coordinate of the end of the line.
          * @param aLineWidth Width of the start of the line.
          * @param bLineWidth Width of the end of the line.
          * @param index If this line is part of a multi-line draw, the index of the line in the draw.
          * @param closePath Does this line close a multi-line path?
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchLine(
          ax: Double,
          ay: Double,
          bx: Double,
          by: Double,
          aLineWidth: Double,
          bLineWidth: Double,
          index: Double,
          closePath: Boolean,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
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
          path: js.Array[Vector2Like],
          lineWidth: Double,
          pathOpen: Boolean,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Pushes a stroked triangle into the vertex batch.
          * 
          * Triangle factors in the given transform matrices before adding to the batch.
          * 
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
          * Adds a single vertex to the current vertex buffer and increments the
          * `vertexCount` property by 1.
          * 
          * This method is called directly by `batchTri` and `batchQuad`.
          * 
          * It does not perform any batch limit checking itself, so if you need to call
          * this method directly, do so in the same way that `batchQuad` does, for example.
          * @param x The vertex x position.
          * @param y The vertex y position.
          * @param tint The tint color value.
          */
        def batchVert(x: Double, y: Double, tint: Double): Unit = js.native
        
        /**
          * A temporary Transform Matrix, re-used internally during batching by the
          * Shape Game Objects.
          */
        var calcMatrix: TransformMatrix = js.native
      }
      
      /**
        * The Light Pipeline is an extension of the Multi Pipeline and uses a custom shader
        * designed to handle forward diffused rendering of 2D lights in a Scene.
        * 
        * The shader works in tandem with Light Game Objects, and optionally texture normal maps,
        * to provide an ambient illumination effect.
        * 
        * If you wish to provide your own shader, you can use the `%LIGHT_COUNT%` declaration in the source,
        * and it will be automatically replaced at run-time with the total number of configured lights.
        * 
        * The maximum number of lights can be set in the Render Config `maxLights` property and defaults to 10.
        * 
        * Prior to Phaser v3.50 this pipeline was called the `ForwardDiffuseLightPipeline`.
        * 
        * The fragment shader it uses can be found in `shaders/src/Light.frag`.
        * The vertex shader it uses can be found in `shaders/src/Multi.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * `inTexId` (float, offset 16)
        * `inTintEffect` (float, offset 20)
        * `inTint` (vec4, offset 24, normalized)
        * 
        * The default shader uniforms for this pipeline are those from the Multi Pipeline, plus:
        * 
        * `uMainSampler` (sampler2D)
        * `uNormSampler` (sampler2D)
        * `uCamera` (vec4)
        * `uResolution` (vec2)
        * `uAmbientLightColor` (vec3)
        * `uInverseRotationMatrix` (mat3)
        * `uLights` (Light struct)
        */
      @js.native
      trait LightPipeline
        extends StObject
           with MultiPipeline {
        
        /**
          * Stores a default normal map, which is an object with a `glTexture` property that
          * maps to a 1x1 texture of the color #7f7fff created in the `boot` method.
          */
        var defaultNormalMap: js.Object = js.native
        
        /**
          * Returns the normal map WebGLTexture from the given Game Object.
          * If the Game Object doesn't have one, it returns the default normal map from this pipeline instead.
          * @param gameObject The Game Object to get the normal map from.
          */
        def getNormalMap(): WebGLTexture = js.native
        def getNormalMap(gameObject: GameObject): WebGLTexture = js.native
        
        /**
          * A boolean that is set automatically during `onRender` that determines
          * if the Scene LightManager is active, or not.
          */
        val lightsActive: Boolean = js.native
        
        /**
          * Rotates the normal map vectors inversely by the given angle.
          * Only works in 2D space.
          * @param rotation The angle of rotation in radians.
          */
        def setNormalMapRotation(rotation: Double): Unit = js.native
      }
      
      /**
        * The Multi Pipeline is the core 2D texture rendering pipeline used by Phaser in WebGL.
        * Virtually all Game Objects use this pipeline by default, including Sprites, Graphics
        * and Tilemaps. It handles the batching of quads and tris, as well as methods for
        * drawing and batching geometry data.
        * 
        * Prior to Phaser v3.50 this pipeline was called the `TextureTintPipeline`.
        * 
        * In previous versions of Phaser only one single texture unit was supported at any one time.
        * The Multi Pipeline is an evolution of the old Texture Tint Pipeline, updated to support
        * multi-textures for increased performance.
        * 
        * The fragment shader it uses can be found in `shaders/src/Multi.frag`.
        * The vertex shader it uses can be found in `shaders/src/Multi.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * `inTexId` (float, offset 16)
        * `inTintEffect` (float, offset 20)
        * `inTint` (vec4, offset 24, normalized)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uProjectionMatrix` (mat4)
        * `uMainSampler` (sampler2D array)
        * 
        * If you wish to create a custom pipeline extending from this one, you can use two string
        * declarations in your fragment shader source: `%count%` and `%forloop%`, where `count` is
        * used to set the number of `sampler2Ds` available, and `forloop` is a block of GLSL code
        * that will get the currently bound texture unit.
        * 
        * This pipeline will automatically inject that code for you, should those values exist
        * in your shader source. If you wish to handle this yourself, you can also use the
        * function `Utils.parseFragmentShaderMaxTextures`.
        * 
        * If you wish to create a pipeline that works from a single texture, or that doesn't have
        * internal texture iteration, please see the `SinglePipeline` instead.
        */
      @js.native
      trait MultiPipeline
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
        def batchFillPath(path: js.Array[Vector2Like], currentMatrix: TransformMatrix, parentMatrix: TransformMatrix): Unit = js.native
        
        /**
          * Pushes a filled rectangle into the vertex batch.
          * 
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
          * 
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
          * Creates a line out of 4 quads and adds it to the vertex batch based on the given line values.
          * @param ax x coordinate of the start of the line.
          * @param ay y coordinate of the start of the line.
          * @param bx x coordinate of the end of the line.
          * @param by y coordinate of the end of the line.
          * @param aLineWidth Width of the start of the line.
          * @param bLineWidth Width of the end of the line.
          * @param index If this line is part of a multi-line draw, the index of the line in the draw.
          * @param closePath Does this line close a multi-line path?
          * @param currentMatrix The current transform.
          * @param parentMatrix The parent transform.
          */
        def batchLine(
          ax: Double,
          ay: Double,
          bx: Double,
          by: Double,
          aLineWidth: Double,
          bLineWidth: Double,
          index: Double,
          closePath: Boolean,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Takes a Sprite Game Object, or any object that extends it, and adds it to the batch.
          * @param gameObject The texture based Game Object to add to the batch.
          * @param camera The Camera to use for the rendering transform.
          * @param parentTransformMatrix The transform matrix of the parent container, if set.
          */
        def batchSprite(gameObject: Image, camera: Camera): Unit = js.native
        def batchSprite(gameObject: Image, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
        def batchSprite(gameObject: Sprite, camera: Camera): Unit = js.native
        def batchSprite(gameObject: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
        
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
          path: js.Array[Vector2Like],
          lineWidth: Double,
          pathOpen: Boolean,
          currentMatrix: TransformMatrix,
          parentMatrix: TransformMatrix
        ): Unit = js.native
        
        /**
          * Pushes a stroked triangle into the vertex batch.
          * 
          * Triangle factors in the given transform matrices before adding to the batch.
          * 
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
          * @param textureUnit Use the currently bound texture unit?
          */
        def batchTexture(
          gameObject: GameObject,
          texture: WebGLTexture,
          textureWidth: Double,
          textureHeight: Double,
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
          tintTL: Double,
          tintTR: Double,
          tintBL: Double,
          tintBR: Double,
          tintEffect: Double,
          uOffset: Double,
          vOffset: Double,
          camera: Camera,
          parentTransformMatrix: TransformMatrix,
          skipFlip: js.UndefOr[Boolean],
          textureUnit: js.UndefOr[Double]
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
        
        /**
          * A temporary Transform Matrix, re-used internally during batching by the
          * Shape Game Objects.
          */
        var calcMatrix: TransformMatrix = js.native
      }
      
      /**
        * The Point Light Pipeline handles rendering the Point Light Game Objects in WebGL.
        * 
        * The fragment shader it uses can be found in `shaders/src/PointLight.frag`.
        * The vertex shader it uses can be found in `shaders/src/PointLight.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2)
        * `inLightPosition` (vec2)
        * `inLightRadius` (float)
        * `inLightAttenuation` (float)
        * `inLightColor` (vec4)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uProjectionMatrix` (mat4)
        * `uResolution` (vec2)
        * `uCameraZoom` (sampler2D)
        */
      @js.native
      trait PointLightPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * Adds a single Point Light vertex to the current vertex buffer and increments the
          * `vertexCount` property by 1.
          * 
          * This method is called directly by `batchPointLight`.
          * @param x The vertex x position.
          * @param y The vertex y position.
          * @param lightX The horizontal center of the light.
          * @param lightY The vertical center of the light.
          * @param radius The radius of the light.
          * @param attenuation The attenuation of the light.
          * @param r The red color channel of the light.
          * @param g The green color channel of the light.
          * @param b The blue color channel of the light.
          * @param a The alpha color channel of the light.
          */
        def batchLightVert(
          x: Double,
          y: Double,
          lightX: Double,
          lightY: Double,
          radius: Double,
          attenuation: Double,
          r: Double,
          g: Double,
          b: Double,
          a: Double
        ): Unit = js.native
        
        /**
          * Adds a Point Light Game Object to the batch, flushing if required.
          * @param light The Point Light Game Object.
          * @param camera The camera rendering the Point Light.
          * @param x0 The top-left x position.
          * @param y0 The top-left y position.
          * @param x1 The bottom-left x position.
          * @param y1 The bottom-left y position.
          * @param x2 The bottom-right x position.
          * @param y2 The bottom-right y position.
          * @param x3 The top-right x position.
          * @param y3 The top-right y position.
          * @param lightX The horizontal center of the light.
          * @param lightY The vertical center of the light.
          */
        def batchPointLight(
          light: PointLight,
          camera: Camera,
          x0: Double,
          y0: Double,
          x1: Double,
          y1: Double,
          x2: Double,
          y2: Double,
          x3: Double,
          y3: Double,
          lightX: Double,
          lightY: Double
        ): Unit = js.native
      }
      
      /**
        * The Post FX Pipeline is a special kind of pipeline specifically for handling post
        * processing effects. Where-as a standard Pipeline allows you to control the process
        * of rendering Game Objects by configuring the shaders and attributes used to draw them,
        * a Post FX Pipeline is designed to allow you to apply processing _after_ the Game Object/s
        * have been rendered. Typical examples of post processing effects are bloom filters,
        * blurs, light effects and color manipulation.
        * 
        * The pipeline works by creating a tiny vertex buffer with just one single hard-coded quad
        * in it. Game Objects can have a Post Pipeline set on them. Those objects are then rendered
        * using their standard pipeline, but are redirected to the Render Targets owned by the
        * post pipeline, which can then apply their own shaders and effects, before passing them
        * back to the main renderer.
        * 
        * Please see the Phaser 3 examples for further details on this extensive subject.
        * 
        * The default fragment shader it uses can be found in `shaders/src/PostFX.frag`.
        * The default vertex shader it uses can be found in `shaders/src/Quad.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * 
        * The vertices array layout is:
        * 
        * -1,  1   B----C   1,  1
        *  0,  1   |   /|   1,  1
        *          |  / |
        *          | /  |
        *          |/   |
        * -1, -1   A----D   1, -1
        *  0,  0            1,  0
        * 
        * A = -1, -1 (pos) and 0, 0 (uv)
        * B = -1,  1 (pos) and 0, 1 (uv)
        * C =  1,  1 (pos) and 1, 1 (uv)
        * D =  1, -1 (pos) and 1, 0 (uv)
        * 
        * First tri: A, B, C
        * Second tri: A, C, D
        * 
        * Array index:
        * 
        * 0  = Tri 1 - Vert A - x pos
        * 1  = Tri 1 - Vert A - y pos
        * 2  = Tri 1 - Vert A - uv u
        * 3  = Tri 1 - Vert A - uv v
        * 
        * 4  = Tri 1 - Vert B - x pos
        * 5  = Tri 1 - Vert B - y pos
        * 6  = Tri 1 - Vert B - uv u
        * 7  = Tri 1 - Vert B - uv v
        * 
        * 8  = Tri 1 - Vert C - x pos
        * 9  = Tri 1 - Vert C - y pos
        * 10 = Tri 1 - Vert C - uv u
        * 11 = Tri 1 - Vert C - uv v
        * 
        * 12 = Tri 2 - Vert A - x pos
        * 13 = Tri 2 - Vert A - y pos
        * 14 = Tri 2 - Vert A - uv u
        * 15 = Tri 2 - Vert A - uv v
        * 
        * 16 = Tri 2 - Vert C - x pos
        * 17 = Tri 2 - Vert C - y pos
        * 18 = Tri 2 - Vert C - uv u
        * 19 = Tri 2 - Vert C - uv v
        * 
        * 20 = Tri 2 - Vert D - x pos
        * 21 = Tri 2 - Vert D - y pos
        * 22 = Tri 2 - Vert D - uv u
        * 23 = Tri 2 - Vert D - uv v
        */
      @js.native
      trait PostFXPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * Binds this pipeline and draws the `source` Render Target to the `target` Render Target.
          * 
          * If no `target` is specified, it will pop the framebuffer from the Renderers FBO stack
          * and use that instead, which should be done when you need to draw the final results of
          * this pipeline to the game canvas.
          * 
          * You can optionally set the shader to be used for the draw here, if this is a multi-shader
          * pipeline. By default `currentShader` will be used. If you need to set a shader but not
          * a target, just pass `null` as the `target` parameter.
          * @param source The Render Target to draw from.
          * @param target The Render Target to draw to. If not set, it will pop the fbo from the stack.
          * @param clear Clear the target before copying? Only used if `target` parameter is set. Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          * @param currentShader The shader to use during the draw.
          */
        def bindAndDraw(source: RenderTarget): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Boolean): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def bindAndDraw(
          source: RenderTarget,
          target: Unit,
          clear: Boolean,
          clearAlpha: Boolean,
          currentShader: WebGLShader
        ): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Boolean, clearAlpha: Unit, currentShader: WebGLShader): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Unit, clearAlpha: Boolean, currentShader: WebGLShader): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: Unit, clear: Unit, clearAlpha: Unit, currentShader: WebGLShader): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: RenderTarget): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: RenderTarget, clear: Boolean): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: RenderTarget, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def bindAndDraw(
          source: RenderTarget,
          target: RenderTarget,
          clear: Boolean,
          clearAlpha: Boolean,
          currentShader: WebGLShader
        ): Unit = js.native
        def bindAndDraw(
          source: RenderTarget,
          target: RenderTarget,
          clear: Boolean,
          clearAlpha: Unit,
          currentShader: WebGLShader
        ): Unit = js.native
        def bindAndDraw(source: RenderTarget, target: RenderTarget, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def bindAndDraw(
          source: RenderTarget,
          target: RenderTarget,
          clear: Unit,
          clearAlpha: Boolean,
          currentShader: WebGLShader
        ): Unit = js.native
        def bindAndDraw(
          source: RenderTarget,
          target: RenderTarget,
          clear: Unit,
          clearAlpha: Unit,
          currentShader: WebGLShader
        ): Unit = js.native
        
        /**
          * Draws the `source1` and `source2` Render Targets to the `target` Render Target
          * using a linear blend effect, which is controlled by the `strength` parameter.
          * @param source1 The first source Render Target.
          * @param source2 The second source Render Target.
          * @param target The target Render Target.
          * @param strength The strength of the blend. Default 1.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def blendFrames(source1: RenderTarget, source2: RenderTarget): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Boolean
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        
        /**
          * Draws the `source1` and `source2` Render Targets to the `target` Render Target
          * using an additive blend effect, which is controlled by the `strength` parameter.
          * @param source1 The first source Render Target.
          * @param source2 The second source Render Target.
          * @param target The target Render Target.
          * @param strength The strength of the blend. Default 1.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): Unit = js.native
        def blendFramesAdditive(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Boolean
        ): Unit = js.native
        def blendFramesAdditive(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target.
          * 
          * The difference with this copy is that no resizing takes place. If the `source`
          * Render Target is larger than the `target` then only a portion the same size as
          * the `target` dimensions is copied across.
          * 
          * You can optionally set the brightness factor of the copy.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param brightness The brightness value applied to the frame copy. Default 1.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          * @param eraseMode Erase source from target using ERASE Blend Mode? Default false.
          */
        def blitFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Unit,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Unit,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Boolean,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Boolean,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Unit,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Unit,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        
        /**
          * Clears the given Render Target.
          * @param target The Render Target to clear.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def clearFrame(target: RenderTarget): Unit = js.native
        def clearFrame(target: RenderTarget, clearAlpha: Boolean): Unit = js.native
        
        /**
          * A Color Matrix instance belonging to this pipeline.
          * 
          * Used during calls to the `drawFrame` method.
          */
        var colorMatrix: ColorMatrix = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target.
          * 
          * You can optionally set the brightness factor of the copy.
          * 
          * The difference between this method and `drawFrame` is that this method
          * uses a faster copy shader, where only the brightness can be modified.
          * If you need color level manipulation, see `drawFrame` instead.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param brightness The brightness value applied to the frame copy. Default 1.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def copyFrame(source: RenderTarget): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): Unit = js.native
        def copyFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        
        /**
          * Binds the `source` Render Target and then copies a section of it to the `target` Render Target.
          * 
          * This method is extremely fast because it uses `gl.copyTexSubImage2D` and doesn't
          * require the use of any shaders. Remember the coordinates are given in standard WebGL format,
          * where x and y specify the lower-left corner of the section, not the top-left. Also, the
          * copy entirely replaces the contents of the target texture, no 'merging' or 'blending' takes
          * place.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param x The x coordinate of the lower left corner where to start copying.
          * @param y The y coordinate of the lower left corner where to start copying.
          * @param width The width of the texture.
          * @param height The height of the texture.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def copyFrameRect(source: RenderTarget, target: RenderTarget, x: Double, y: Double, width: Double, height: Double): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Boolean
        ): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        
        /**
          * Pops the framebuffer from the renderers FBO stack and sets that as the active target,
          * then draws the `source` Render Target to it. It then resets the renderer textures.
          * 
          * This should be done when you need to draw the _final_ results of a pipeline to the game
          * canvas, or the next framebuffer in line on the FBO stack. You should only call this once
          * in the `onDraw` handler and it should be the final thing called. Be careful not to call
          * this if you need to actually use the pipeline shader, instead of the copy shader. In
          * those cases, use the `bindAndDraw` method.
          * @param source The Render Target to draw from.
          */
        def copyToGame(source: RenderTarget): Unit = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target, using the
          * given Color Matrix.
          * 
          * The difference between this method and `copyFrame` is that this method
          * uses a color matrix shader, where you have full control over the luminance
          * values used during the copy. If you don't need this, you can use the faster
          * `copyFrame` method instead.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def drawFrame(source: RenderTarget): Unit = js.native
        def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Boolean): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Boolean): Unit = js.native
        
        /**
          * A reference to the Full Frame 1 Render Target that belongs to the
          * Utility Pipeline. This property is set during the `boot` method.
          * 
          * This Render Target is the full size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var fullFrame1: RenderTarget = js.native
        
        /**
          * A reference to the Full Frame 2 Render Target that belongs to the
          * Utility Pipeline. This property is set during the `boot` method.
          * 
          * This Render Target is the full size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var fullFrame2: RenderTarget = js.native
        
        /**
          * If this post-pipeline belongs to a Game Object or Camera, this contains a reference to it.
          */
        var gameObject: GameObject = js.native
        
        /**
          * A reference to the Half Frame 1 Render Target that belongs to the
          * Utility Pipeline. This property is set during the `boot` method.
          * 
          * This Render Target is half the size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var halfFrame1: RenderTarget = js.native
        
        /**
          * A reference to the Half Frame 2 Render Target that belongs to the
          * Utility Pipeline. This property is set during the `boot` method.
          * 
          * This Render Target is half the size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var halfFrame2: RenderTarget = js.native
      }
      
      /**
        * The Rope Pipeline is a variation of the Multi Pipeline that uses a `TRIANGLE_STRIP` for
        * its topology, instead of TRIANGLES. This is primarily used by the Rope Game Object,
        * or anything that extends it.
        * 
        * Prior to Phaser v3.50 this pipeline was called the `TextureTintStripPipeline`.
        * 
        * The fragment shader it uses can be found in `shaders/src/Multi.frag`.
        * The vertex shader it uses can be found in `shaders/src/Multi.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * `inTexId` (float, offset 16)
        * `inTintEffect` (float, offset 20)
        * `inTint` (vec4, offset 24, normalized)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uProjectionMatrix` (mat4)
        * `uMainSampler` (sampler2D array)
        * 
        * The pipeline is structurally identical to the Multi Pipeline and should be treated as such.
        */
      type RopePipeline = MultiPipeline
      
      /**
        * The Single Pipeline is a special version of the Multi Pipeline that only ever
        * uses one texture, bound to texture unit zero. Although not as efficient as the
        * Multi Pipeline, it provides an easier way to create custom pipelines that only require
        * a single bound texture.
        * 
        * Prior to Phaser v3.50 this pipeline didn't exist, but could be compared to the old `TextureTintPipeline`.
        * 
        * The fragment shader it uses can be found in `shaders/src/Single.frag`.
        * The vertex shader it uses can be found in `shaders/src/Single.vert`.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * `inTexId` (float, offset 16) - this value is always zero in the Single Pipeline
        * `inTintEffect` (float, offset 20)
        * `inTint` (vec4, offset 24, normalized)
        * 
        * The default shader uniforms for this pipeline are:
        * 
        * `uProjectionMatrix` (mat4)
        * `uMainSampler` (sampler2D)
        */
      type SinglePipeline = MultiPipeline
      
      /**
        * The Utility Pipeline is a special-use pipeline that belongs to the Pipeline Manager.
        * 
        * It provides 4 shaders and handy associated methods:
        * 
        * 1) Copy Shader. A fast texture to texture copy shader with optional brightness setting.
        * 2) Additive Blend Mode Shader. Blends two textures using an additive blend mode.
        * 3) Linear Blend Mode Shader. Blends two textures using a linear blend mode.
        * 4) Color Matrix Copy Shader. Draws a texture to a target using a Color Matrix.
        * 
        * You do not extend this pipeline, but instead get a reference to it from the Pipeline
        * Manager via the `setUtility` method. You can also access methods such as `copyFrame`
        * directly from the Pipeline Manager.
        * 
        * This pipeline provides methods for manipulating framebuffer backed textures, such as
        * copying or blending one texture to another, copying a portion of a texture, additively
        * blending two textures, flipping textures and more.
        * 
        * The default shader attributes for this pipeline are:
        * 
        * `inPosition` (vec2, offset 0)
        * `inTexCoord` (vec2, offset 8)
        * 
        * This pipeline has a hard-coded batch size of 1 and a hard coded set of vertices.
        */
      @js.native
      trait UtilityPipeline
        extends StObject
           with WebGLPipeline {
        
        /**
          * A reference to the Additive Blend Shader belonging to this Utility Pipeline.
          * 
          * This property is set during the `boot` method.
          */
        var addShader: WebGLShader = js.native
        
        /**
          * Draws the `source1` and `source2` Render Targets to the `target` Render Target
          * using a linear blend effect, which is controlled by the `strength` parameter.
          * @param source1 The first source Render Target.
          * @param source2 The second source Render Target.
          * @param target The target Render Target.
          * @param strength The strength of the blend. Default 1.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          * @param blendShader The shader to use during the blend copy.
          */
        def blendFrames(source1: RenderTarget, source2: RenderTarget): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: Unit,
          strength: Double,
          clearAlpha: Boolean,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: Unit,
          strength: Double,
          clearAlpha: Unit,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: Unit,
          strength: Unit,
          clearAlpha: Boolean,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: Unit,
          strength: Unit,
          clearAlpha: Unit,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): Unit = js.native
        def blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Boolean
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Boolean,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Unit,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Boolean,
          blendShader: WebGLShader
        ): Unit = js.native
        def blendFrames(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Unit,
          blendShader: WebGLShader
        ): Unit = js.native
        
        /**
          * Draws the `source1` and `source2` Render Targets to the `target` Render Target
          * using an additive blend effect, which is controlled by the `strength` parameter.
          * @param source1 The first source Render Target.
          * @param source2 The second source Render Target.
          * @param target The target Render Target.
          * @param strength The strength of the blend. Default 1.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Double, clearAlpha: Boolean): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: Unit, strength: Unit, clearAlpha: Boolean): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget): Unit = js.native
        def blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget, strength: Double): Unit = js.native
        def blendFramesAdditive(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Double,
          clearAlpha: Boolean
        ): Unit = js.native
        def blendFramesAdditive(
          source1: RenderTarget,
          source2: RenderTarget,
          target: RenderTarget,
          strength: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target.
          * 
          * The difference with this copy is that no resizing takes place. If the `source`
          * Render Target is larger than the `target` then only a portion the same size as
          * the `target` dimensions is copied across.
          * 
          * You can optionally set the brightness factor of the copy.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param brightness The brightness value applied to the frame copy. Default 1.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          * @param eraseMode Erase source from target using ERASE Blend Mode? Default false.
          */
        def blitFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Unit,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Unit,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Boolean,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Boolean,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Unit,
          clearAlpha: Boolean,
          eraseMode: Boolean
        ): Unit = js.native
        def blitFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Unit,
          clear: Unit,
          clearAlpha: Unit,
          eraseMode: Boolean
        ): Unit = js.native
        
        /**
          * Clears the given Render Target.
          * @param target The Render Target to clear.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def clearFrame(target: RenderTarget): Unit = js.native
        def clearFrame(target: RenderTarget, clearAlpha: Boolean): Unit = js.native
        
        /**
          * A default Color Matrix, used by the Color Matrix Shader when one
          * isn't provided.
          */
        var colorMatrix: ColorMatrix = js.native
        
        /**
          * A reference to the Color Matrix Shader belonging to this Utility Pipeline.
          * 
          * This property is set during the `boot` method.
          */
        var colorMatrixShader: WebGLShader = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target.
          * 
          * You can optionally set the brightness factor of the copy.
          * 
          * The difference between this method and `drawFrame` is that this method
          * uses a faster copy shader, where only the brightness can be modified.
          * If you need color level manipulation, see `drawFrame` instead.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param brightness The brightness value applied to the frame copy. Default 1.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def copyFrame(source: RenderTarget): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: Unit, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Boolean): Unit = js.native
        def copyFrame(
          source: RenderTarget,
          target: RenderTarget,
          brightness: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Double, clear: Unit, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Boolean, clearAlpha: Boolean): Unit = js.native
        def copyFrame(source: RenderTarget, target: RenderTarget, brightness: Unit, clear: Unit, clearAlpha: Boolean): Unit = js.native
        
        /**
          * Binds the `source` Render Target and then copies a section of it to the `target` Render Target.
          * 
          * This method is extremely fast because it uses `gl.copyTexSubImage2D` and doesn't
          * require the use of any shaders. Remember the coordinates are given in standard WebGL format,
          * where x and y specify the lower-left corner of the section, not the top-left. Also, the
          * copy entirely replaces the contents of the target texture, no 'merging' or 'blending' takes
          * place.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param x The x coordinate of the lower left corner where to start copying.
          * @param y The y coordinate of the lower left corner where to start copying.
          * @param width The width of the texture.
          * @param height The height of the texture.
          * @param clear Clear the target before copying? Default true.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          */
        def copyFrameRect(source: RenderTarget, target: RenderTarget, x: Double, y: Double, width: Double, height: Double): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Boolean
        ): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Boolean,
          clearAlpha: Boolean
        ): Unit = js.native
        def copyFrameRect(
          source: RenderTarget,
          target: RenderTarget,
          x: Double,
          y: Double,
          width: Double,
          height: Double,
          clear: Unit,
          clearAlpha: Boolean
        ): Unit = js.native
        
        /**
          * A reference to the Copy Shader belonging to this Utility Pipeline.
          * 
          * This property is set during the `boot` method.
          */
        var copyShader: WebGLShader = js.native
        
        /**
          * Pops the framebuffer from the renderers FBO stack and sets that as the active target,
          * then draws the `source` Render Target to it. It then resets the renderer textures.
          * 
          * This should be done when you need to draw the _final_ results of a pipeline to the game
          * canvas, or the next framebuffer in line on the FBO stack. You should only call this once
          * in the `onDraw` handler and it should be the final thing called. Be careful not to call
          * this if you need to actually use the pipeline shader, instead of the copy shader. In
          * those cases, use the `bindAndDraw` method.
          * @param source The Render Target to draw from.
          */
        def copyToGame(source: RenderTarget): Unit = js.native
        
        /**
          * Copy the `source` Render Target to the `target` Render Target, using the
          * given Color Matrix.
          * 
          * The difference between this method and `copyFrame` is that this method
          * uses a color matrix shader, where you have full control over the luminance
          * values used during the copy. If you don't need this, you can use the faster
          * `copyFrame` method instead.
          * @param source The source Render Target.
          * @param target The target Render Target.
          * @param clearAlpha Clear the alpha channel when running `gl.clear` on the target? Default true.
          * @param colorMatrix The Color Matrix to use when performing the draw.
          */
        def drawFrame(source: RenderTarget): Unit = js.native
        def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Boolean): Unit = js.native
        def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Boolean, colorMatrix: ColorMatrix): Unit = js.native
        def drawFrame(source: RenderTarget, target: Unit, clearAlpha: Unit, colorMatrix: ColorMatrix): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Boolean): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Boolean, colorMatrix: ColorMatrix): Unit = js.native
        def drawFrame(source: RenderTarget, target: RenderTarget, clearAlpha: Unit, colorMatrix: ColorMatrix): Unit = js.native
        
        /**
          * Horizontally flips the UV coordinates of the quad used by the shaders in this
          * Utility Pipeline.
          * 
          * Be sure to call `resetUVs` once you have finished manipulating the UV coordinates.
          */
        def flipX(): Unit = js.native
        
        /**
          * Vertically flips the UV coordinates of the quad used by the shaders in this
          * Utility Pipeline.
          * 
          * Be sure to call `resetUVs` once you have finished manipulating the UV coordinates.
          */
        def flipY(): Unit = js.native
        
        /**
          * A reference to the Full Frame 1 Render Target.
          * 
          * This property is set during the `boot` method.
          * 
          * This Render Target is the full size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var fullFrame1: RenderTarget = js.native
        
        /**
          * A reference to the Full Frame 2 Render Target.
          * 
          * This property is set during the `boot` method.
          * 
          * This Render Target is the full size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var fullFrame2: RenderTarget = js.native
        
        /**
          * A reference to the Half Frame 1 Render Target.
          * 
          * This property is set during the `boot` method.
          * 
          * This Render Target is half the size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var halfFrame1: RenderTarget = js.native
        
        /**
          * A reference to the Half Frame 2 Render Target.
          * 
          * This property is set during the `boot` method.
          * 
          * This Render Target is half the size of the renderer.
          * 
          * You can use this directly in Post FX Pipelines for multi-target effects.
          * However, be aware that these targets are shared between all post fx pipelines.
          */
        var halfFrame2: RenderTarget = js.native
        
        /**
          * A reference to the Linear Blend Shader belonging to this Utility Pipeline.
          * 
          * This property is set during the `boot` method.
          */
        var linearShader: WebGLShader = js.native
        
        /**
          * Resets the quad vertice UV values to their default settings.
          * 
          * The quad is used by all shaders of the Utility Pipeline.
          */
        def resetUVs(): Unit = js.native
        
        /**
          * Sets the vertex UV coordinates of the quad used by the shaders in the Utility Pipeline
          * so that they correctly adjust the texture coordinates for a blit frame effect.
          * 
          * Be sure to call `resetUVs` once you have finished manipulating the UV coordinates.
          * @param source The source Render Target.
          * @param target The target Render Target.
          */
        def setTargetUVs(source: RenderTarget, target: RenderTarget): Unit = js.native
        
        /**
          * Set the UV values for the 6 vertices that make up the quad used by the shaders
          * in the Utility Pipeline.
          * 
          * Be sure to call `resetUVs` once you have finished manipulating the UV coordinates.
          * @param uA The u value of vertex A.
          * @param vA The v value of vertex A.
          * @param uB The u value of vertex B.
          * @param vB The v value of vertex B.
          * @param uC The u value of vertex C.
          * @param vC The v value of vertex C.
          * @param uD The u value of vertex D.
          * @param vD The v value of vertex D.
          */
        def setUVs(uA: Double, vA: Double, uB: Double, vB: Double, uC: Double, vC: Double, uD: Double, vD: Double): Unit = js.native
      }
    }
    
    /**
      * A Render Target encapsulates a WebGL framebuffer and the WebGL Texture that displays it.
      * 
      * Instances of this class are typically created by, and belong to WebGL Pipelines, however
      * other Game Objects and classes can take advantage of Render Targets as well.
      */
    @js.native
    trait RenderTarget extends StObject {
      
      /**
        * Adjusts the GL viewport to match the width and height of this Render Target.
        * 
        * Also disables `SCISSOR_TEST`.
        */
      def adjustViewport(): Unit = js.native
      
      /**
        * Controls if this Render Target is automatically cleared (via `gl.COLOR_BUFFER_BIT`)
        * during the `RenderTarget.bind` method.
        * 
        * If you need more control over how, or if, the target is cleared, you can disable
        * this via the config on creation, or even toggle it directly at runtime.
        */
      var autoClear: Boolean = js.native
      
      /**
        * Does this Render Target automatically resize when the WebGL Renderer does?
        * 
        * Modify this property via the `setAutoResize` method.
        */
      val autoResize: Boolean = js.native
      
      /**
        * Pushes this Render Target as the current frame buffer of the renderer.
        * 
        * If `autoClear` is set, then clears the texture.
        * 
        * If `adjustViewport` is `true` then it will flush the renderer and then adjust the GL viewport.
        * @param adjustViewport Adjust the GL viewport by calling `RenderTarget.adjustViewport` ? Default false.
        * @param width Optional new width of this Render Target.
        * @param height Optional new height of this Render Target.
        */
      def bind(): Unit = js.native
      def bind(adjustViewport: Boolean): Unit = js.native
      def bind(adjustViewport: Boolean, width: Double): Unit = js.native
      def bind(adjustViewport: Boolean, width: Double, height: Double): Unit = js.native
      def bind(adjustViewport: Boolean, width: Unit, height: Double): Unit = js.native
      def bind(adjustViewport: Unit, width: Double): Unit = js.native
      def bind(adjustViewport: Unit, width: Double, height: Double): Unit = js.native
      def bind(adjustViewport: Unit, width: Unit, height: Double): Unit = js.native
      
      /**
        * Clears this Render Target.
        */
      def clear(): Unit = js.native
      
      /**
        * Removes all external references from this class and deletes the
        * WebGL framebuffer and texture instances.
        * 
        * Does not remove this Render Target from the parent pipeline.
        */
      var destroy: Any = js.native
      
      /**
        * The WebGLFramebuffer of this Render Target.
        * 
        * This is created in the `RenderTarget.resize` method.
        */
      var framebuffer: WebGLFramebuffer = js.native
      
      /**
        * The height of the texture.
        */
      val height: Double = js.native
      
      /**
        * The minFilter mode of the texture. 0 is `LINEAR`, 1 is `NEAREST`.
        */
      var minFilter: Double = js.native
      
      /**
        * A reference to the WebGLRenderer instance.
        */
      var renderer: WebGLRenderer = js.native
      
      /**
        * Resizes this Render Target.
        * 
        * Deletes both the frame buffer and texture, if they exist and then re-creates
        * them using the new sizes.
        * 
        * This method is called automatically by the pipeline during its resize handler.
        * @param width The new width of this Render Target.
        * @param height The new height of this Render Target.
        */
      def resize(width: Double, height: Double): this.type = js.native
      
      /**
        * A value between 0 and 1. Controls the size of this Render Target in relation to the Renderer.
        * 
        * A value of 1 matches it. 0.5 makes the Render Target half the size of the renderer, etc.
        */
      var scale: Double = js.native
      
      /**
        * Sets if this Render Target should automatically resize when the WebGL Renderer
        * emits a resize event.
        * @param autoResize Automatically resize this Render Target when the WebGL Renderer resizes?
        */
      def setAutoResize(autoResize: Boolean): this.type = js.native
      
      /**
        * The WebGLTexture of this Render Target.
        * 
        * This is created in the `RenderTarget.resize` method.
        */
      var texture: WebGLTexture = js.native
      
      /**
        * Unbinds this Render Target and optionally flushes the WebGL Renderer first.
        */
      var unbind: Any = js.native
      
      /**
        * The width of the texture.
        */
      val width: Double = js.native
    }
    
    /**
      * The `WebGLPipeline` is a base class used by all of the core Phaser pipelines.
      * 
      * It describes the way elements will be rendered in WebGL. Internally, it handles
      * compiling the shaders, creating vertex buffers, assigning primitive topology and
      * binding vertex attributes, all based on the given configuration data.
      * 
      * The pipeline is configured by passing in a `WebGLPipelineConfig` object. Please
      * see the documentation for this type to fully understand the configuration options
      * available to you.
      * 
      * Usually, you would not extend from this class directly, but would instead extend
      * from one of the core pipelines, such as the Multi Pipeline.
      * 
      * The pipeline flow per render-step is as follows:
      * 
      * 1) onPreRender - called once at the start of the render step
      * 2) onRender - call for each Scene Camera that needs to render (so can be multiple times per render step)
      * 3) Internal flow:
      * 3a)   bind (only called if a Game Object is using this pipeline and it's not currently active)
      * 3b)   onBind (called for every Game Object that uses this pipeline)
      * 3c)   flush (can be called by a Game Object, internal method or from outside by changing pipeline)
      * 4) onPostRender - called once at the end of the render step
      */
    @js.native
    trait WebGLPipeline
      extends StObject
         with EventEmitter {
      
      /**
        * Indicates if the current pipeline is active, or not.
        * 
        * Toggle this property to enable or disable a pipeline from rendering anything.
        */
      var active: Boolean = js.native
      
      def batchQuad(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
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
        * @param gameObject The Game Object, if any, drawing this quad.
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
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      def batchQuad(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      
      def batchTri(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: Null,
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
        gameObject: Null,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
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
        * @param gameObject The Game Object, if any, drawing this quad.
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
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      def batchTri(
        gameObject: GameObject,
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
        gameObject: GameObject,
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
        unit: Double
      ): Boolean = js.native
      
      def batchVert(x: Double, y: Double, u: Double, v: Double, unit: Double, tintEffect: Boolean, tint: Double): Unit = js.native
      /**
        * Adds a single vertex to the current vertex buffer and increments the
        * `vertexCount` property by 1.
        * 
        * This method is called directly by `batchTri` and `batchQuad`.
        * 
        * It does not perform any batch limit checking itself, so if you need to call
        * this method directly, do so in the same way that `batchQuad` does, for example.
        * @param x The vertex x position.
        * @param y The vertex y position.
        * @param u UV u value.
        * @param v UV v value.
        * @param unit Texture unit to which the texture needs to be bound.
        * @param tintEffect The tint effect for the shader to use.
        * @param tint The tint color value.
        */
      def batchVert(x: Double, y: Double, u: Double, v: Double, unit: Double, tintEffect: Double, tint: Double): Unit = js.native
      
      /**
        * This method is called every time the Pipeline Manager makes this pipeline the currently active one.
        * 
        * It binds the resources and shader needed for this pipeline, including setting the vertex buffer
        * and attribute pointers.
        * @param currentShader The shader to set as being current.
        */
      def bind(): this.type = js.native
      def bind(currentShader: WebGLShader): this.type = js.native
      
      /**
        * Activates the given Render Target texture and binds it to the
        * requested WebGL texture slot.
        * @param target The Render Target to activate and bind.
        * @param unit The WebGL texture ID to activate. Defaults to `gl.TEXTURE0`. Default 0.
        */
      def bindRenderTarget(): this.type = js.native
      def bindRenderTarget(target: Unit, unit: Double): this.type = js.native
      def bindRenderTarget(target: RenderTarget): this.type = js.native
      def bindRenderTarget(target: RenderTarget, unit: Double): this.type = js.native
      
      /**
        * Activates the given WebGL Texture and binds it to the requested texture slot.
        * @param target The WebGLTexture to activate and bind.
        * @param unit The WebGL texture ID to activate. Defaults to `gl.TEXTURE0`. Default 0.
        */
      def bindTexture(): this.type = js.native
      def bindTexture(target: Unit, unit: Double): this.type = js.native
      def bindTexture(target: WebGLTexture): this.type = js.native
      def bindTexture(target: WebGLTexture, unit: Double): this.type = js.native
      
      /**
        * Called when the Game has fully booted and the Renderer has finished setting up.
        * 
        * By this stage all Game level systems are now in place. You can perform any final tasks that the
        * pipeline may need, that relies on game systems such as the Texture Manager being ready.
        */
      def boot(): Unit = js.native
      
      /**
        * Uint8 view to the `vertexData` ArrayBuffer. Used for uploading vertex buffer resources to the GPU.
        */
      var bytes: js.typedarray.Uint8Array = js.native
      
      /**
        * The configuration object that was used to create this pipeline.
        * 
        * Treat this object as 'read only', because changing it post-creation will not
        * impact this pipeline in any way. However, it is used internally for cloning
        * and post-boot set-up.
        */
      var config: WebGLPipelineConfig = js.native
      
      /**
        * A reference to the currently bound Render Target instance from the `WebGLPipeline.renderTargets` array.
        */
      var currentRenderTarget: RenderTarget = js.native
      
      /**
        * A reference to the currently bound WebGLShader instance from the `WebGLPipeline.shaders` array.
        * 
        * For lots of pipelines, this is the only shader, so it is a quick way to reference it without
        * an array look-up.
        */
      var currentShader: WebGLShader = js.native
      
      /**
        * Holds the most recently assigned texture unit.
        * 
        * Treat this value as read-only.
        */
      var currentUnit: Double = js.native
      
      /**
        * Pushes a filled rectangle into the vertex batch.
        * 
        * The dimensions are run through `Math.floor` before the quad is generated.
        * 
        * Rectangle has no transform values and isn't transformed into the local space.
        * 
        * Used for directly batching untransformed rectangles, such as Camera background colors.
        * @param x Horizontal top left coordinate of the rectangle.
        * @param y Vertical top left coordinate of the rectangle.
        * @param width Width of the rectangle.
        * @param height Height of the rectangle.
        * @param color Color of the rectangle to draw.
        * @param alpha Alpha value of the rectangle to draw.
        * @param texture WebGLTexture that will be assigned to the current batch if a flush occurs.
        * @param flipUV Flip the vertical UV coordinates of the texture before rendering? Default true.
        */
      def drawFillRect(x: Double, y: Double, width: Double, height: Double, color: Double, alpha: Double): Unit = js.native
      def drawFillRect(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        color: Double,
        alpha: Double,
        texture: Unit,
        flipUV: Boolean
      ): Unit = js.native
      def drawFillRect(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        color: Double,
        alpha: Double,
        texture: WebGLTexture
      ): Unit = js.native
      def drawFillRect(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        color: Double,
        alpha: Double,
        texture: WebGLTexture,
        flipUV: Boolean
      ): Unit = js.native
      
      /**
        * Uploads the vertex data and emits a draw call for the current batch of vertices.
        * @param isPostFlush Was this flush invoked as part of a post-process, or not? Default false.
        */
      def flush(): this.type = js.native
      def flush(isPostFlush: Boolean): this.type = js.native
      
      /**
        * Some pipelines require the forced use of texture zero (like the light pipeline).
        * 
        * This property should be set when that is the case.
        */
      var forceZero: Boolean = js.native
      
      /**
        * The Phaser Game instance to which this pipeline is bound.
        */
      var game: Game = js.native
      
      /**
        * Searches all shaders in this pipeline for one matching the given name, then returns it.
        * @param name The index of the shader to set.
        */
      def getShaderByName(name: String): WebGLShader = js.native
      
      /**
        * The WebGL context this WebGL Pipeline uses.
        */
      var gl: WebGLRenderingContext = js.native
      
      /**
        * Has the GL Context been reset to the Phaser defaults since the last time
        * this pipeline was bound? This is set automatically when the Pipeline Manager
        * resets itself, usually after handing off to a 3rd party renderer like Spine.
        * 
        * You should treat this property as read-only.
        */
      var glReset: Boolean = js.native
      
      /**
        * Indicates if this pipeline has booted or not.
        * 
        * A pipeline boots only when the Game instance itself, and all associated systems, is
        * fully ready.
        */
      val hasBooted: Boolean = js.native
      
      /**
        * Height of the current viewport.
        */
      var height: Double = js.native
      
      /**
        * Indicates if this is a Post FX Pipeline, or not.
        */
      val isPostFX: Boolean = js.native
      
      /**
        * A reference to the WebGL Pipeline Manager.
        * 
        * This is initially undefined and only set when this pipeline is added
        * to the manager.
        */
      var manager: PipelineManager = js.native
      
      /**
        * Name of the pipeline. Used for identification and setting from Game Objects.
        */
      var name: String = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called every time the Pipeline Manager makes this the active pipeline. It is called
        * at the end of the `WebGLPipeline.bind` method, after the current shader has been set. The current
        * shader is passed to this hook.
        * 
        * For example, if a display list has 3 Sprites in it that all use the same pipeline, this hook will
        * only be called for the first one, as the 2nd and 3rd Sprites do not cause the pipeline to be changed.
        * 
        * If you need to listen for that event instead, use the `onBind` hook.
        * @param currentShader The shader that was set as current.
        */
      def onActive(currentShader: WebGLShader): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called immediately after this pipeline has finished flushing its batch.
        * 
        * It is called after the `gl.drawArrays` call.
        * 
        * You can perform additional post-render effects, but be careful not to call `flush`
        * on this pipeline from within this method, or you'll cause an infinite loop.
        * 
        * To apply changes pre-render, see `onBeforeFlush`.
        * @param isPostFlush Was this flush invoked as part of a post-process, or not? Default false.
        */
      def onAfterFlush(): Unit = js.native
      def onAfterFlush(isPostFlush: Boolean): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called every time the `batchQuad` or `batchTri` methods are called. If this was
        * as a result of a Game Object, then the Game Object reference is passed to this hook too.
        * 
        * This hook is called _after_ the quad (or tri) has been added to the batch, so you can safely
        * call 'flush' from within this.
        * 
        * Note that Game Objects may call `batchQuad` or `batchTri` multiple times for a single draw,
        * for example the Graphics Game Object.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        */
      def onBatch(): Unit = js.native
      def onBatch(gameObject: GameObject): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called every time this pipeline is asked to flush its batch.
        * 
        * It is called immediately before the `gl.bufferData` and `gl.drawArrays` calls are made, so you can
        * perform any final pre-render modifications. To apply changes post-render, see `onAfterFlush`.
        * @param isPostFlush Was this flush invoked as part of a post-process, or not? Default false.
        */
      def onBeforeFlush(): Unit = js.native
      def onBeforeFlush(isPostFlush: Boolean): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called every time a **Game Object** asks the Pipeline Manager to use this pipeline,
        * even if the pipeline is already active.
        * 
        * Unlike the `onActive` method, which is only called when the Pipeline Manager makes this pipeline
        * active, this hook is called for every Game Object that requests use of this pipeline, allowing you to
        * perform per-object set-up, such as loading shader uniform data.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        */
      def onBind(): Unit = js.native
      def onBind(gameObject: GameObject): Unit = js.native
      
      /**
        * This method is called once when this pipeline has finished being set-up
        * at the end of the boot process. By the time this method is called, all
        * of the shaders are ready and configured.
        */
      def onBoot(): Unit = js.native
      
      /**
        * This method is only used by Post FX Pipelines and those that extend from them.
        * 
        * This method is called every time the `postBatch` method is called and is passed a
        * reference to the current render target.
        * 
        * At the very least a Post FX Pipeline should call `this.bindAndDraw(renderTarget)`,
        * however, you can do as much additional processing as you like in this method if
        * you override it from within your own pipelines.
        * @param renderTarget The Render Target.
        */
      def onDraw(renderTarget: RenderTarget): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called immediately after a **Game Object** has been added to the batch.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        */
      def onPostBatch(): Unit = js.native
      def onPostBatch(gameObject: GameObject): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called _once per frame_, after all rendering has happened and snapshots have been taken.
        * 
        * It is called at the very end of the rendering process, once all Cameras, for all Scenes, have
        * been rendered.
        */
      def onPostRender(): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called immediately before a **Game Object** is about to add itself to the batch.
        * @param gameObject The Game Object that invoked this pipeline, if any.
        */
      def onPreBatch(): Unit = js.native
      def onPreBatch(gameObject: GameObject): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called once per frame, right before anything has been rendered, but after the canvas
        * has been cleared. If this pipeline has a render target, it will also have been cleared by this point.
        */
      def onPreRender(): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called when the Pipeline Manager needs to rebind this pipeline. This happens after a
        * pipeline has been cleared, usually when passing control over to a 3rd party WebGL library, like Spine,
        * and then returing to Phaser again.
        */
      def onRebind(): Unit = js.native
      
      /**
        * By default this is an empty method hook that you can override and use in your own custom pipelines.
        * 
        * This method is called _once per frame_, by every Camera in a Scene that wants to render.
        * 
        * It is called at the start of the rendering process, before anything has been drawn to the Camera.
        * @param scene The Scene being rendered.
        * @param camera The Scene Camera being rendered with.
        */
      def onRender(scene: Scene, camera: Camera): Unit = js.native
      
      /**
        * This method is called once when this pipeline has finished being set-up
        * at the end of the boot process. By the time this method is called, all
        * of the shaders are ready and configured. It's also called if the renderer
        * changes size.
        * @param width The new width of this WebGL Pipeline.
        * @param height The new height of this WebGL Pipeline.
        */
      def onResize(width: Double, height: Double): Unit = js.native
      
      /**
        * This method is called as a result of the `WebGLPipeline.batchQuad` method, right after a quad
        * belonging to a Game Object has been added to the batch. When this is called, the
        * renderer has just performed a flush.
        * 
        * It calls the `onDraw` hook followed by the `onPostBatch` hook, which can be used to perform
        * additional Post FX Pipeline processing.
        * @param gameObject The Game Object or Camera that invoked this pipeline, if any.
        */
      def postBatch(): this.type = js.native
      def postBatch(gameObject: Camera): this.type = js.native
      def postBatch(gameObject: GameObject): this.type = js.native
      
      /**
        * This method is called as a result of the `WebGLPipeline.batchQuad` method, right before a quad
        * belonging to a Game Object is about to be added to the batch. When this is called, the
        * renderer has just performed a flush. It will bind the current render target, if any are set
        * and finally call the `onPreBatch` hook.
        * @param gameObject The Game Object or Camera that invoked this pipeline, if any.
        */
      def preBatch(): this.type = js.native
      def preBatch(gameObject: Camera): this.type = js.native
      def preBatch(gameObject: GameObject): this.type = js.native
      
      /**
        * The cached height of the Projection matrix.
        */
      var projectionHeight: Double = js.native
      
      /**
        * The Projection matrix, used by shaders as 'uProjectionMatrix' uniform.
        */
      var projectionMatrix: Matrix4 = js.native
      
      /**
        * The cached width of the Projection matrix.
        */
      var projectionWidth: Double = js.native
      
      /**
        * This method is called every time the Pipeline Manager rebinds this pipeline.
        * 
        * It resets all shaders this pipeline uses, setting their attributes again.
        * @param currentShader The shader to set as being current.
        */
      def rebind(): this.type = js.native
      def rebind(currentShader: WebGLShader): this.type = js.native
      
      /**
        * An array of RenderTarget instances that belong to this pipeline.
        */
      var renderTargets: js.Array[RenderTarget] = js.native
      
      /**
        * The WebGL Renderer instance to which this pipeline is bound.
        */
      var renderer: WebGLRenderer = js.native
      
      /**
        * Resizes the properties used to describe the viewport.
        * 
        * This method is called automatically by the renderer during its resize handler.
        * @param width The new width of this WebGL Pipeline.
        * @param height The new height of this WebGL Pipeline.
        */
      def resize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets a 1f uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new value of the `float` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set1f(name: String, x: Double): this.type = js.native
      def set1f(name: String, x: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 1fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set1fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set1fv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set1fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set1fv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 1i uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new value of the `int` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set1i(name: String, x: Double): this.type = js.native
      def set1i(name: String, x: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 1iv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set1iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set1iv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set1iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set1iv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 2f uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `vec2` uniform.
        * @param y The new Y component of the `vec2` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set2f(name: String, x: Double, y: Double): this.type = js.native
      def set2f(name: String, x: Double, y: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 2fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set2fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set2fv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set2fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set2fv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 2i uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `ivec2` uniform.
        * @param y The new Y component of the `ivec2` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set2i(name: String, x: Double, y: Double): this.type = js.native
      def set2i(name: String, x: Double, y: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 2iv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set2iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set2iv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set2iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set2iv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 3f uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `vec3` uniform.
        * @param y The new Y component of the `vec3` uniform.
        * @param z The new Z component of the `vec3` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set3f(name: String, x: Double, y: Double, z: Double): this.type = js.native
      def set3f(name: String, x: Double, y: Double, z: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 3fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set3fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set3fv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set3fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set3fv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 3i uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `ivec3` uniform.
        * @param y The new Y component of the `ivec3` uniform.
        * @param z The new Z component of the `ivec3` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set3i(name: String, x: Double, y: Double, z: Double): this.type = js.native
      def set3i(name: String, x: Double, y: Double, z: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 3iv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set3iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set3iv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set3iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set3iv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 4f uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set4f(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      def set4f(name: String, x: Double, y: Double, z: Double, w: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 4fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set4fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set4fv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set4fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set4fv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 4i uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param x X component of the uniform.
        * @param y Y component of the uniform.
        * @param z Z component of the uniform.
        * @param w W component of the uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set4i(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      def set4i(name: String, x: Double, y: Double, z: Double, w: Double, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a 4iv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def set4iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set4iv(name: String, arr: js.Array[Double], shader: WebGLShader): this.type = js.native
      def set4iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      def set4iv(name: String, arr: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Custom pipelines can use this method in order to perform any required pre-batch tasks
        * for the given Game Object. It must return the texture unit the Game Object was assigned.
        * @param gameObject The Game Object being rendered or added to the batch.
        * @param frame Optional frame to use. Can override that of the Game Object.
        */
      def setGameObject(gameObject: GameObject): Double = js.native
      def setGameObject(gameObject: GameObject, frame: Frame): Double = js.native
      
      /**
        * Sets a matrix 2fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat2` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.Array[Double]): this.type = js.native
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.Array[Double], shader: WebGLShader): this.type = js.native
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a matrix 3fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat3` uniform.
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def setMatrix3fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      def setMatrix3fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Sets a matrix 4fv uniform value based on the given name on the currently set shader.
        * 
        * The current shader is bound, before the uniform is set, making it active within the
        * WebGLRenderer. This means you can safely call this method from a location such as
        * a Scene `create` or `update` method. However, when working within a Shader file
        * directly, use the `WebGLShader` method equivalent instead, to avoid the program
        * being set.
        * @param name The name of the uniform to set.
        * @param transpose Should the matrix be transpose
        * @param matrix Matrix data
        * @param shader The shader to set the value on. If not given, the `currentShader` is used.
        */
      def setMatrix4fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      def setMatrix4fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array, shader: WebGLShader): this.type = js.native
      
      /**
        * Adjusts this pipelines ortho Projection Matrix to use the given dimensions
        * and resets the `uProjectionMatrix` uniform on all bound shaders.
        * 
        * This method is called automatically by the renderer during its resize handler.
        * @param width The new width of this WebGL Pipeline.
        * @param height The new height of this WebGL Pipeline.
        */
      def setProjectionMatrix(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the currently active shader within this pipeline.
        * @param shader The shader to set as being current.
        * @param setAttributes Should the vertex attribute pointers be set? Default false.
        */
      def setShader(shader: WebGLShader): this.type = js.native
      def setShader(shader: WebGLShader, setAttributes: Boolean): this.type = js.native
      
      /**
        * Destroys all shaders currently set in the `WebGLPipeline.shaders` array and then parses the given
        * `config` object, extracting the shaders from it, creating `WebGLShader` instances and finally
        * setting them into the `shaders` array of this pipeline.
        * 
        * This is a destructive process. Be very careful when you call it, should you need to.
        * @param config The configuration object for this WebGL Pipeline.
        */
      def setShadersFromConfig(config: WebGLPipelineConfig): this.type = js.native
      
      /**
        * Sets the texture to be bound to the next available texture unit and returns
        * the unit id.
        * @param texture WebGLTexture that will be assigned to the current batch. If not given uses `whiteTexture`.
        */
      def setTexture2D(): Double = js.native
      def setTexture2D(texture: WebGLTexture): Double = js.native
      
      /**
        * Sets the current duration into a 1f uniform value based on the given name.
        * 
        * This can be used for mapping time uniform values, such as `iTime`.
        * @param name The name of the uniform to set.
        */
      def setTime(name: String): this.type = js.native
      
      /**
        * Binds the vertex buffer to be the active ARRAY_BUFFER on the WebGL context.
        * 
        * It first checks to see if it's already set as the active buffer and only
        * binds itself if not.
        */
      def setVertexBuffer(): Boolean = js.native
      
      /**
        * An array of all the WebGLShader instances that belong to this pipeline.
        * 
        * Shaders manage their own attributes and uniforms, but share the same vertex data buffer,
        * which belongs to this pipeline.
        * 
        * Shaders are set in a call to the `setShadersFromConfig` method, which happens automatically,
        * but can also be called at any point in your game. See the method documentation for details.
        */
      var shaders: js.Array[WebGLShader] = js.native
      
      /**
        * Check if the current batch of vertices is full.
        * 
        * You can optionally provide an `amount` parameter. If given, it will check if the batch
        * needs to flush _if_ the `amount` is added to it. This allows you to test if you should
        * flush before populating the batch.
        * @param amount Will the batch need to flush if this many vertices are added to it? Default 0.
        */
      def shouldFlush(): Boolean = js.native
      def shouldFlush(amount: Double): Boolean = js.native
      
      /**
        * The primitive topology which the pipeline will use to submit draw calls.
        * 
        * Defaults to GL_TRIANGLES if not otherwise set in the config.
        */
      var topology: GLenum = js.native
      
      /**
        * This method is called every time the Pipeline Manager deactivates this pipeline, swapping from
        * it to another one. This happens after a call to `flush` and before the new pipeline is bound.
        */
      def unbind(): Unit = js.native
      
      /**
        * Adjusts this pipelines ortho Projection Matrix to match that of the global
        * WebGL Renderer Projection Matrix.
        * 
        * This method is called automatically by the Pipeline Manager when this
        * pipeline is set.
        */
      def updateProjectionMatrix(): Unit = js.native
      
      /**
        * The WebGLBuffer that holds the vertex data.
        * 
        * Created from the `vertexData` ArrayBuffer. If `vertices` are set in the config, a `STATIC_DRAW` buffer
        * is created. If not, a `DYNAMIC_DRAW` buffer is created.
        */
      val vertexBuffer: WebGLBuffer = js.native
      
      /**
        * The total number of vertices that this pipeline batch can hold before it will flush.
        * 
        * This defaults to `renderer batchSize * 6`, where `batchSize` is defined in the Renderer Game Config.
        */
      var vertexCapacity: Double = js.native
      
      /**
        * The current number of vertices that have been added to the pipeline batch.
        */
      var vertexCount: Double = js.native
      
      /**
        * Raw byte buffer of vertices.
        * 
        * Either set via the config object `vertices` property, or generates a new Array Buffer of
        * size `vertexCapacity * vertexSize`.
        */
      val vertexData: js.typedarray.ArrayBuffer = js.native
      
      /**
        * Float32 view of the array buffer containing the pipeline's vertices.
        */
      var vertexViewF32: js.typedarray.Float32Array = js.native
      
      /**
        * Uint32 view of the array buffer containing the pipeline's vertices.
        */
      var vertexViewU32: js.typedarray.Uint32Array = js.native
      
      /**
        * The canvas which this WebGL Pipeline renders to.
        */
      var view: HTMLCanvasElement = js.native
      
      /**
        * Width of the current viewport.
        */
      var width: Double = js.native
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
    trait WebGLRenderer
      extends StObject
         with EventEmitter {
      
      /**
        * Creates a new custom blend mode for the renderer.
        * 
        * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Blending_modes
        * @param func An array containing the WebGL functions to use for the source and the destination blending factors, respectively. See the possible constants for {@link WebGLRenderingContext#blendFunc()}.
        * @param equation The equation to use for combining the RGB and alpha components of a new pixel with a rendered one. See the possible constants for {@link WebGLRenderingContext#blendEquation()}.
        */
      def addBlendMode(func: js.Array[GLenum], equation: GLenum): Double = js.native
      
      /**
        * Binds the WebGL Renderers Render Target, so all drawn content is now redirected to it.
        * 
        * Make sure to call `endCapture` when you are finished.
        * @param width Optional new width of the Render Target.
        * @param height Optional new height of the Render Target.
        */
      def beginCapture(): Unit = js.native
      def beginCapture(width: Double): Unit = js.native
      def beginCapture(width: Double, height: Double): Unit = js.native
      def beginCapture(width: Unit, height: Double): Unit = js.native
      
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
      var blendModes: js.Array[Any] = js.native
      
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
        * Clears the texture that was directly bound to texture unit one and
        * increases the start active texture counter.
        */
      def clearNormalMap(): Unit = js.native
      
      /**
        * Clears the texture that was directly bound to texture unit zero.
        */
      def clearTextureZero(): Unit = js.native
      
      /**
        * Stores the supported WebGL texture compression formats.
        */
      var compression: WebGLTextureCompression = js.native
      
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
        * Creates a WebGL Framebuffer object and optionally binds a depth stencil render buffer.
        * @param width If `addDepthStencilBuffer` is true, this controls the width of the depth stencil.
        * @param height If `addDepthStencilBuffer` is true, this controls the height of the depth stencil.
        * @param renderTexture The color texture where the color pixels are written.
        * @param addDepthStencilBuffer Create a Renderbuffer for the depth stencil? Default false.
        */
      def createFramebuffer(width: Double, height: Double, renderTexture: WebGLTexture): WebGLFramebuffer = js.native
      def createFramebuffer(width: Double, height: Double, renderTexture: WebGLTexture, addDepthStencilBuffer: Boolean): WebGLFramebuffer = js.native
      
      /**
        * Wrapper for creating a vertex buffer.
        * @param initialDataOrSize Either ArrayBuffer or an integer indicating the size of the vbo.
        * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW.
        */
      def createIndexBuffer(initialDataOrSize: js.typedarray.ArrayBuffer, bufferUsage: Double): WebGLBuffer = js.native
      
      /**
        * Creates a WebGLProgram instance based on the given vertex and fragment shader source.
        * 
        * Then compiles, attaches and links the program before returning it.
        * @param vertexShader The vertex shader source code as a single string.
        * @param fragmentShader The fragment shader source code as a single string.
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
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Boolean,
        forceSize: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Boolean,
        forceSize: Boolean,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Boolean,
        forceSize: Unit,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Unit,
        forceSize: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
        pma: Unit,
        forceSize: Boolean,
        flipY: Boolean
      ): WebGLTexture = js.native
      def createTexture2D(
        mipLevel: Double,
        minFilter: Double,
        magFilter: Double,
        wrapT: Double,
        wrapS: Double,
        format: Double,
        pixels: js.Object,
        width: Double,
        height: Double,
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
      def createTextureFromSource(source: js.Object, width: Double, height: Double, scaleMode: Double): WebGLTexture = js.native
      
      /**
        * Wrapper for creating a vertex buffer.
        * @param initialDataOrSize It's either ArrayBuffer or an integer indicating the size of the vbo
        * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW
        */
      def createVertexBuffer(initialDataOrSize: js.typedarray.ArrayBuffer, bufferUsage: Double): WebGLBuffer = js.native
      
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
        * Cached value for the last texture unit that was used.
        */
      var currentActiveTexture: Double = js.native
      
      /**
        * Current blend mode in use
        */
      var currentBlendMode: Double = js.native
      
      /**
        * Internal property that tracks the currently set camera mask.
        */
      var currentCameraMask: Any = js.native
      
      /**
        * The currently bound framebuffer in use.
        */
      var currentFramebuffer: WebGLFramebuffer = js.native
      
      /**
        * Internal property that tracks the currently set mask.
        */
      var currentMask: Any = js.native
      
      /**
        * Current WebGLProgram in use.
        */
      var currentProgram: WebGLProgram = js.native
      
      /**
        * Stores the current scissor data
        */
      var currentScissor: js.typedarray.Uint32Array = js.native
      
      /**
        * Indicates if the the scissor state is enabled in WebGLRenderingContext
        */
      var currentScissorEnabled: Boolean = js.native
      
      /**
        * The `type` of the Game Object being currently rendered.
        * This can be used by advanced render functions for batching look-ahead.
        */
      var currentType: String = js.native
      
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
        * Calls `GL.deleteTexture` on the given WebGLTexture and also optionally
        * resets the currently defined textures.
        * @param texture The WebGL Texture to be deleted.
        * @param reset Call the `resetTextures` method after deleting this texture? Default false.
        */
      def deleteTexture(texture: WebGLTexture): this.type = js.native
      def deleteTexture(texture: WebGLTexture, reset: Boolean): this.type = js.native
      
      /**
        * Cached drawing buffer height to reduce gl calls.
        */
      val drawingBufferHeight: Double = js.native
      
      /**
        * Unbinds the WebGL Renderers Render Target and returns it, stopping any further content being drawn to it.
        * 
        * If the viewport or scissors were modified during the capture, you should reset them by calling
        * `resetViewport` and `resetScissor` accordingly.
        */
      def endCapture(): RenderTarget = js.native
      
      /**
        * The WebGL Extensions loaded into the current context.
        */
      var extensions: js.Object = js.native
      
      /**
        * A stack into which the frame buffer objects are pushed and popped.
        */
      var fboStack: js.Array[WebGLFramebuffer] = js.native
      
      /**
        * Is the Game Object being currently rendered the final one in the list?
        */
      var finalType: Boolean = js.native
      
      /**
        * Flushes the current pipeline if the pipeline is bound
        */
      def flush(): Unit = js.native
      
      /**
        * The Game instance which owns this WebGL Renderer.
        */
      var game: Game = js.native
      
      /**
        * Gets the aspect ratio of the WebGLRenderer dimensions.
        */
      def getAspectRatio(): Double = js.native
      
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
      def getMaxTextureSize(): Double = js.native
      
      /**
        * The underlying WebGL context of the renderer.
        */
      var gl: WebGLRenderingContext = js.native
      
      /**
        * Stores the current WebGL component formats for further use.
        */
      var glFormats: js.Array[Any] = js.native
      
      /**
        * Internal gl function mapping for uniform look-up.
        * https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform
        */
      var glFuncMap: Any = js.native
      
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
        * The height of the canvas being rendered to.
        * This is populated in the onResize event handler.
        */
      var height: Double = js.native
      
      /**
        * Creates a new WebGLRenderingContext and initializes all internal state.
        * @param config The configuration object for the renderer.
        */
      def init(config: js.Object): this.type = js.native
      
      /**
        * If the browser supports the `ANGLE_instanced_arrays` extension, this property will hold
        * a reference to the glExtension for it.
        */
      var instancedArraysExtension: ANGLEInstancedArrays = js.native
      
      /**
        * Has this renderer fully booted yet?
        */
      var isBooted: Boolean = js.native
      
      /**
        * Checks to see if the given diffuse and normal map textures are already bound, or not.
        * @param texture The WebGL diffuse texture.
        * @param normalMap The WebGL normal map texture.
        */
      def isNewNormalMap(texture: WebGLTexture, normalMap: WebGLTexture): Boolean = js.native
      
      /**
        * Are the WebGL Textures in their default state?
        * 
        * Used to avoid constant gl binds.
        */
      var isTextureClean: Boolean = js.native
      
      /**
        * The total number of masks currently stacked.
        */
      var maskCount: Double = js.native
      
      /**
        * The mask stack.
        */
      var maskStack: js.Array[GeometryMask] = js.native
      
      /**
        * The maximum number of textures the GPU can handle. The minimum under the WebGL1 spec is 8.
        * This is set via the Game Config `maxTextures` property and should never be changed after boot.
        */
      var maxTextures: Double = js.native
      
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
        * The currently bound normal map texture at texture unit one, if any.
        */
      var normalTexture: WebGLTexture = js.native
      
      /**
        * The event handler that manages the `resize` event dispatched by the Scale Manager.
        * @param gameSize The default Game Size object. This is the un-modified game dimensions.
        * @param baseSize The base Size object. The game dimensions. The canvas width / height values match this.
        */
      def onResize(gameSize: Size, baseSize: Size): Unit = js.native
      
      /**
        * An instance of the Pipeline Manager class, that handles all WebGL Pipelines.
        * 
        * Use this to manage all of your interactions with pipelines, such as adding, getting,
        * setting and rendering them.
        * 
        * The Pipeline Manager class is created in the `init` method and then populated
        * with pipelines during the `boot` method.
        * 
        * Prior to Phaser v3.50.0 this was just a plain JavaScript object, not a class.
        */
      var pipelines: PipelineManager = js.native
      
      /**
        * Pops the previous framebuffer from the fbo stack and sets it.
        * @param updateScissor If a framebuffer is given, set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
        * @param resetTextures Should the WebGL Textures be reset after the new framebuffer is bound? Default false.
        * @param setViewport Should the WebGL viewport be set? Default true.
        */
      def popFramebuffer(): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Boolean, resetTextures: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Boolean, resetTextures: Boolean, setViewport: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Boolean, resetTextures: Unit, setViewport: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Unit, resetTextures: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Unit, resetTextures: Boolean, setViewport: Boolean): WebGLFramebuffer = js.native
      def popFramebuffer(updateScissor: Unit, resetTextures: Unit, setViewport: Boolean): WebGLFramebuffer = js.native
      
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
        * 
        * Renders the foreground camera effects like flash and fading, then resets the current scissor state.
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
        * The cached height of the Projection matrix.
        */
      var projectionHeight: Double = js.native
      
      /**
        * The global game Projection matrix, used by shaders as 'uProjectionMatrix' uniform.
        */
      var projectionMatrix: Matrix4 = js.native
      
      /**
        * The cached width of the Projection matrix.
        */
      var projectionWidth: Double = js.native
      
      /**
        * Pushes a new framebuffer onto the FBO stack and makes it the currently bound framebuffer.
        * 
        * If there was another framebuffer already bound it will force a pipeline flush.
        * 
        * Call `popFramebuffer` to remove it again.
        * @param framebuffer The framebuffer that needs to be bound.
        * @param updateScissor Set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
        * @param resetTextures Should the WebGL Textures be reset after the new framebuffer is bound? Default false.
        * @param setViewport Should the WebGL viewport be set? Default true.
        */
      def pushFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean, resetTextures: Boolean): this.type = js.native
      def pushFramebuffer(
        framebuffer: WebGLFramebuffer,
        updateScissor: Boolean,
        resetTextures: Boolean,
        setViewport: Boolean
      ): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean, resetTextures: Unit, setViewport: Boolean): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Boolean): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Boolean, setViewport: Boolean): this.type = js.native
      def pushFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Unit, setViewport: Boolean): this.type = js.native
      
      /**
        * Pushes a new scissor state. This is used to set nested scissor states.
        * @param x The x position of the scissor.
        * @param y The y position of the scissor.
        * @param width The width of the scissor.
        * @param height The height of the scissor.
        * @param drawingBufferHeight Optional drawingBufferHeight override value.
        */
      def pushScissor(x: Double, y: Double, width: Double, height: Double): js.Array[Double] = js.native
      def pushScissor(x: Double, y: Double, width: Double, height: Double, drawingBufferHeight: Double): js.Array[Double] = js.native
      
      /**
        * Removes a custom blend mode from the renderer.
        * Any Game Objects still using this blend mode will error, so be sure to clear them first.
        * @param index The index of the custom blend mode to be removed.
        */
      def removeBlendMode(index: Double): this.type = js.native
      
      /**
        * The core render step for a Scene Camera.
        * 
        * Iterates through the given array of Game Objects and renders them with the given Camera.
        * 
        * This is called by the `CameraManager.render` method. The Camera Manager instance belongs to a Scene, and is invoked
        * by the Scene Systems.render method.
        * 
        * This method is not called if `Camera.visible` is `false`, or `Camera.alpha` is zero.
        * @param scene The Scene to render.
        * @param children An array of filtered Game Objects that can be rendered by the given Camera.
        * @param camera The Scene Camera to render with.
        */
      def render(scene: Scene, children: js.Array[GameObject], camera: Camera): Unit = js.native
      
      /**
        * A Render Target you can use to capture the current state of the Renderer.
        * 
        * A Render Target encapsulates a framebuffer and texture for the WebGL Renderer.
        */
      var renderTarget: RenderTarget = js.native
      
      /**
        * Rebinds whatever program `WebGLRenderer.currentProgram` is set as, without
        * changing anything, or flushing.
        */
      def resetProgram(): this.type = js.native
      
      /**
        * Resets the Projection Matrix back to this renderers width and height.
        * 
        * This is called during `endCapture`, should the matrix have been changed
        * as a result of the capture process.
        */
      def resetProjectionMatrix(): Unit = js.native
      
      /**
        * Resets the gl scissor state to be whatever the current scissor is, if there is one, without
        * modifying the scissor stack.
        */
      def resetScissor(): Unit = js.native
      
      /**
        * Flushes the current pipeline, then resets the first two textures
        * back to the default temporary textures, resets the start active
        * counter and sets texture unit 1 as being active.
        * @param all Reset all textures, or just the first two? Default false.
        */
      def resetTextures(): Unit = js.native
      def resetTextures(all: Boolean): Unit = js.native
      
      /**
        * Resets the gl viewport to the current renderer dimensions.
        */
      def resetViewport(): Unit = js.native
      
      /**
        * Resizes the drawing buffer to match that required by the Scale Manager.
        * @param width The new width of the renderer.
        * @param height The new height of the renderer.
        */
      def resize(): this.type = js.native
      def resize(width: Double): this.type = js.native
      def resize(width: Double, height: Double): this.type = js.native
      def resize(width: Unit, height: Double): this.type = js.native
      
      /**
        * Stack of scissor data
        */
      var scissorStack: js.typedarray.Uint32Array = js.native
      
      /**
        * Sets the blend mode to the value given.
        * 
        * If the current blend mode is different from the one given, the pipeline is flushed and the new
        * blend mode is enabled.
        * @param blendModeId The blend mode to be set. Can be a `BlendModes` const or an integer value.
        * @param force Force the blend mode to be set, regardless of the currently set blend mode. Default false.
        */
      def setBlendMode(blendModeId: Double): Boolean = js.native
      def setBlendMode(blendModeId: Double, force: Boolean): Boolean = js.native
      
      /**
        * Sets the given framebuffer as the active and currently bound framebuffer.
        * 
        * If there was another framebuffer already bound it will force a pipeline flush.
        * 
        * Typically, you should call `pushFramebuffer` instead of this method.
        * @param framebuffer The framebuffer that needs to be bound.
        * @param updateScissor If a framebuffer is given, set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
        * @param resetTextures Should the WebGL Textures be reset after the new framebuffer is bound? Default false.
        * @param setViewport Should the WebGL viewport be set? Default true.
        */
      def setFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean, resetTextures: Boolean): this.type = js.native
      def setFramebuffer(
        framebuffer: WebGLFramebuffer,
        updateScissor: Boolean,
        resetTextures: Boolean,
        setViewport: Boolean
      ): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean, resetTextures: Unit, setViewport: Boolean): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Boolean): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Boolean, setViewport: Boolean): this.type = js.native
      def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Unit, resetTextures: Unit, setViewport: Boolean): this.type = js.native
      
      /**
        * Binds a texture directly to texture unit one then activates it.
        * If the texture is already at unit one, it skips the bind.
        * Make sure to call `clearNormalMap` after using this method.
        * @param texture The WebGL texture that needs to be bound.
        */
      def setNormalMap(texture: WebGLTexture): Unit = js.native
      
      /**
        * Binds a shader program.
        * 
        * If there was a different program already bound it will force a pipeline flush first.
        * 
        * If the same program given to this method is already set as the current program, no change
        * will take place and this method will return `false`.
        * @param program The program that needs to be bound.
        */
      def setProgram(program: WebGLProgram): Boolean = js.native
      
      /**
        * Sets the Projection Matrix of this renderer to the given dimensions.
        * @param width The new width of the Projection Matrix.
        * @param height The new height of the Projection Matrix.
        */
      def setProjectionMatrix(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the current scissor state.
        * @param x The x position of the scissor.
        * @param y The y position of the scissor.
        * @param width The width of the scissor.
        * @param height The height of the scissor.
        * @param drawingBufferHeight Optional drawingBufferHeight override value.
        */
      def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
      def setScissor(x: Double, y: Double, width: Double, height: Double, drawingBufferHeight: Double): Unit = js.native
      
      /**
        * Binds a texture at a texture unit. If a texture is already
        * bound to that unit it will force a flush on the current pipeline.
        * @param texture The WebGL texture that needs to be bound.
        */
      def setTexture2D(texture: WebGLTexture): Double = js.native
      
      /**
        * Sets the minification and magnification filter for a texture.
        * @param texture The texture to set the filter for.
        * @param filter The filter to set. 0 for linear filtering, 1 for nearest neighbor (blocky) filtering.
        */
      def setTextureFilter(texture: Double, filter: Double): this.type = js.native
      
      /**
        * Activates the Texture Source and assigns it the next available texture unit.
        * If none are available, it will flush the current pipeline first.
        * @param textureSource The Texture Source to be assigned the texture unit.
        */
      def setTextureSource(textureSource: TextureSource): Double = js.native
      
      /**
        * Binds a texture directly to texture unit zero then activates it.
        * If the texture is already at unit zero, it skips the bind.
        * Make sure to call `clearTextureZero` after using this method.
        * @param texture The WebGL texture that needs to be bound.
        * @param flush Flush the pipeline if the texture is different? Default false.
        */
      def setTextureZero(texture: WebGLTexture): Unit = js.native
      def setTextureZero(texture: WebGLTexture, flush: Boolean): Unit = js.native
      
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
      def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback): this.type = js.native
      def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback, `type`: String): this.type = js.native
      def snapshotArea(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
        callback: SnapshotCallback,
        `type`: String,
        encoderOptions: Double
      ): this.type = js.native
      def snapshotArea(
        x: Double,
        y: Double,
        width: Double,
        height: Double,
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
        bufferWidth: Double,
        bufferHeight: Double,
        callback: SnapshotCallback,
        getPixel: js.UndefOr[Boolean],
        x: js.UndefOr[Double],
        y: js.UndefOr[Double],
        width: js.UndefOr[Double],
        height: js.UndefOr[Double],
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
      def snapshotPixel(x: Double, y: Double, callback: SnapshotCallback): this.type = js.native
      
      /**
        * Details about the currently scheduled snapshot.
        * 
        * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
        */
      var snapshotState: SnapshotState = js.native
      
      /**
        * Contains the current starting active texture unit.
        * This value is constantly updated and should be treated as read-only by your code.
        */
      var startActiveTexture: Double = js.native
      
      /**
        * Array of strings that indicate which WebGL extensions are supported by the browser.
        * This is populated in the `boot` method.
        */
      var supportedExtensions: js.Array[String] = js.native
      
      /**
        * An array of default temporary WebGL Textures.
        * 
        * This array is populated during the init phase and should never be changed after boot.
        */
      var tempTextures: js.Array[Any] = js.native
      
      /**
        * The number of times the renderer had to flush this frame, due to running out of texture units.
        */
      var textureFlush: Double = js.native
      
      /**
        * An array of the available WebGL texture units, used to populate the uSampler uniforms.
        * 
        * This array is populated during the init phase and should never be changed after boot.
        */
      var textureIndexes: js.Array[Any] = js.native
      
      /**
        * The currently bound texture at texture unit zero, if any.
        */
      var textureZero: WebGLTexture = js.native
      
      /**
        * A constant which allows the renderer to be easily identified as a WebGL Renderer.
        */
      var `type`: Double = js.native
      
      /**
        * Activates each texture, in turn, then binds them all to `null`.
        * @param all Reset all textures, or just the first two? Default false.
        */
      def unbindTextures(): Unit = js.native
      def unbindTextures(all: Boolean): Unit = js.native
      
      /**
        * Updates the function bound to a given custom blend mode.
        * @param index The index of the custom blend mode.
        * @param func The function to use for the blend mode.
        * @param equation The equation to use for the blend mode.
        */
      def updateBlendMode(index: Double, func: js.Function, equation: js.Function): this.type = js.native
      
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
        * If the browser supports the `OES_vertex_array_object` extension, this property will hold
        * a reference to the glExtension for it.
        */
      var vaoExtension: OESVertexArrayObject = js.native
      
      /**
        * A pure white 4x4 texture, as used by the Graphics system where needed.
        * This is set in the `boot` method.
        */
      val whiteTexture: WebGLTexture = js.native
      
      /**
        * The width of the canvas being rendered to.
        * This is populated in the onResize event handler.
        */
      var width: Double = js.native
    }
    
    /**
      * Instances of the WebGLShader class belong to the WebGL Pipeline classes. When the pipeline is
      * created it will create an instance of this class for each one of its shaders, as defined in
      * the pipeline configuration.
      * 
      * This class encapsulates everything needed to manage a shader in a pipeline, including the
      * shader attributes and uniforms, as well as lots of handy methods such as `set2f`, for setting
      * uniform values on this shader.
      * 
      * Typically, you do not create an instance of this class directly, as it works in unison with
      * the pipeline to which it belongs. You can gain access to this class via a pipeline's `shaders`
      * array, post-creation.
      */
    @js.native
    trait WebGLShader extends StObject {
      
      /**
        * Array of objects that describe the vertex attributes.
        */
      var attributes: js.Array[WebGLPipelineAttribute] = js.native
      
      /**
        * Sets the program this shader uses as being the active shader in the WebGL Renderer.
        * 
        * This method is called every time the parent pipeline is made the current active pipeline.
        * @param setAttributes Should the vertex attribute pointers be set? Default false.
        * @param flush Flush the pipeline before binding this shader? Default false.
        */
      def bind(): this.type = js.native
      def bind(setAttributes: Boolean): this.type = js.native
      def bind(setAttributes: Boolean, flush: Boolean): this.type = js.native
      def bind(setAttributes: Unit, flush: Boolean): this.type = js.native
      
      /**
        * Takes the vertex attributes config and parses it, creating the resulting array that is stored
        * in this shaders `attributes` property, calculating the offset, normalization and location
        * in the process.
        * 
        * Calling this method resets `WebGLShader.attributes`, `WebGLShader.vertexSize` and
        * `WebGLShader.vertexComponentCount`.
        * 
        * It is called automatically when this class is created, but can be called manually if required.
        * @param attributes An array of attributes configs.
        */
      def createAttributes(attributes: js.Array[WebGLPipelineAttributeConfig]): Unit = js.native
      
      /**
        * Sets up the `WebGLShader.uniforms` object, populating it with the names
        * and locations of the shader uniforms this shader requires.
        * 
        * It works by first calling `gl.getProgramParameter(program, gl.ACTIVE_UNIFORMS)` to
        * find out how many active uniforms this shader has. It then iterates through them,
        * calling `gl.getActiveUniform` to get the WebGL Active Info from each one. Finally,
        * the name and location are stored in the local array.
        * 
        * This method is called automatically when this class is created.
        */
      def createUniforms(): this.type = js.native
      
      /**
        * Removes all external references from this class and deletes the WebGL program from the WebGL context.
        * 
        * Does not remove this shader from the parent pipeline.
        */
      def destroy(): Unit = js.native
      
      /**
        * A reference to the WebGL Rendering Context the WebGL Renderer is using.
        */
      var gl: WebGLRenderingContext = js.native
      
      /**
        * Checks to see if the given uniform name exists and is active in this shader.
        * @param name The name of the uniform to check for.
        */
      def hasUniform(name: String): Boolean = js.native
      
      /**
        * The name of this shader.
        */
      var name: String = js.native
      
      /**
        * A reference to the WebGLPipeline that owns this Shader.
        * 
        * A Shader class can only belong to a single pipeline.
        */
      var pipeline: WebGLPipeline = js.native
      
      /**
        * The WebGLProgram created from the vertex and fragment shaders.
        */
      var program: WebGLProgram = js.native
      
      /**
        * Sets the program this shader uses as being the active shader in the WebGL Renderer.
        * 
        * Then resets all of the attribute pointers.
        */
      def rebind(): this.type = js.native
      
      /**
        * A reference to the WebGLRenderer instance.
        */
      var renderer: WebGLRenderer = js.native
      
      /**
        * Resets the cached values of the given uniform.
        * @param name The name of the uniform to reset.
        */
      def resetUniform(name: String): this.type = js.native
      
      /**
        * Sets a 1f uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new value of the `float` uniform.
        */
      def set1f(name: String, x: Double): this.type = js.native
      
      /**
        * Sets a 1fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set1fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set1fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 1i uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new value of the `int` uniform.
        */
      def set1i(name: String, x: Double): this.type = js.native
      
      /**
        * Sets a 1iv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set1iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set1iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 2f uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `vec2` uniform.
        * @param y The new Y component of the `vec2` uniform.
        */
      def set2f(name: String, x: Double, y: Double): this.type = js.native
      
      /**
        * Sets a 2fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set2fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set2fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 2i uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `ivec2` uniform.
        * @param y The new Y component of the `ivec2` uniform.
        */
      def set2i(name: String, x: Double, y: Double): this.type = js.native
      
      /**
        * Sets a 2iv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set2iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set2iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 3f uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `vec3` uniform.
        * @param y The new Y component of the `vec3` uniform.
        * @param z The new Z component of the `vec3` uniform.
        */
      def set3f(name: String, x: Double, y: Double, z: Double): this.type = js.native
      
      /**
        * Sets a 3fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set3fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set3fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 3i uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x The new X component of the `ivec3` uniform.
        * @param y The new Y component of the `ivec3` uniform.
        * @param z The new Z component of the `ivec3` uniform.
        */
      def set3i(name: String, x: Double, y: Double, z: Double): this.type = js.native
      
      /**
        * Sets a 3iv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set3iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set3iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 4f uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      def set4f(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      
      /**
        * Sets a 4fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set4fv(name: String, arr: js.Array[Double]): this.type = js.native
      def set4fv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a 4i uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      def set4i(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      
      /**
        * Sets a 4iv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param arr The new value to be used for the uniform variable.
        */
      def set4iv(name: String, arr: js.Array[Double]): this.type = js.native
      def set4iv(name: String, arr: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets the vertex attribute pointers.
        * 
        * This should only be called after the vertex buffer has been bound.
        * 
        * It is called automatically during the `bind` method.
        * @param reset Reset the vertex attribute locations? Default false.
        */
      def setAttribPointers(): this.type = js.native
      def setAttribPointers(reset: Boolean): this.type = js.native
      
      /**
        * Sets a matrix 2fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat2` uniform.
        */
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.Array[Double]): this.type = js.native
      def setMatrix2fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a matrix 3fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat3` uniform.
        */
      def setMatrix3fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      
      /**
        * Sets a matrix 4fv uniform value based on the given name on this shader.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param name The name of the uniform to set.
        * @param transpose Should the matrix be transpose
        * @param matrix Matrix data
        */
      def setMatrix4fv(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
      
      def setUniform1(setter: js.Function, name: String, value1: js.Array[Double]): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: js.Array[Double], skipCheck: Boolean): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: js.typedarray.Float32Array): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: js.typedarray.Float32Array, skipCheck: Boolean): this.type = js.native
      /**
        * Sets the given uniform value/s based on the name and GL function.
        * 
        * This method is called internally by other methods such as `set1f` and `set3iv`.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param setter The GL function to call.
        * @param name The name of the uniform to set.
        * @param value1 The new value of the uniform.
        * @param skipCheck Skip the value comparison? Default false.
        */
      def setUniform1(setter: js.Function, name: String, value1: Boolean): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: Boolean, skipCheck: Boolean): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: Double): this.type = js.native
      def setUniform1(setter: js.Function, name: String, value1: Double, skipCheck: Boolean): this.type = js.native
      
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: js.Array[Double]): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.Array[Double],
        value2: js.Array[Double],
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: js.typedarray.Float32Array): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.Array[Double],
        value2: js.typedarray.Float32Array,
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: Boolean, skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: Double): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.Array[Double], value2: Double, skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.typedarray.Float32Array, value2: js.Array[Double]): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.typedarray.Float32Array,
        value2: js.Array[Double],
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.typedarray.Float32Array,
        value2: js.typedarray.Float32Array
      ): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.typedarray.Float32Array,
        value2: js.typedarray.Float32Array,
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.typedarray.Float32Array, value2: Boolean): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.typedarray.Float32Array,
        value2: Boolean,
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: js.typedarray.Float32Array, value2: Double): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: js.typedarray.Float32Array,
        value2: Double,
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: js.Array[Double]): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: js.Array[Double], skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: js.typedarray.Float32Array): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: Boolean,
        value2: js.typedarray.Float32Array,
        skipCheck: Boolean
      ): this.type = js.native
      /**
        * Sets the given uniform value/s based on the name and GL function.
        * 
        * This method is called internally by other methods such as `set1f` and `set3iv`.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param setter The GL function to call.
        * @param name The name of the uniform to set.
        * @param value1 The new value of the uniform.
        * @param value2 The new value of the uniform.
        * @param skipCheck Skip the value comparison? Default false.
        */
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: Boolean, skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: Double): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Boolean, value2: Double, skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: js.Array[Double]): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: js.Array[Double], skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: js.typedarray.Float32Array): this.type = js.native
      def setUniform2(
        setter: js.Function,
        name: String,
        value1: Double,
        value2: js.typedarray.Float32Array,
        skipCheck: Boolean
      ): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: Boolean, skipCheck: Boolean): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: Double): this.type = js.native
      def setUniform2(setter: js.Function, name: String, value1: Double, value2: Double, skipCheck: Boolean): this.type = js.native
      
      /**
        * Sets the given uniform value/s based on the name and GL function.
        * 
        * This method is called internally by other methods such as `set1f` and `set3iv`.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param setter The GL function to call.
        * @param name The name of the uniform to set.
        * @param value1 The new value of the uniform.
        * @param value2 The new value of the uniform.
        * @param value3 The new value of the uniform.
        * @param skipCheck Skip the value comparison? Default false.
        */
      def setUniform3(
        setter: js.Function,
        name: String,
        value1: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        value2: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        value3: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        skipCheck: js.UndefOr[Boolean]
      ): this.type = js.native
      
      /**
        * Sets the given uniform value/s based on the name and GL function.
        * 
        * This method is called internally by other methods such as `set1f` and `set3iv`.
        * 
        * The uniform is only set if the value/s given are different to those previously set.
        * 
        * This method works by first setting this shader as being the current shader within the
        * WebGL Renderer, if it isn't already. It also sets this shader as being the current
        * one within the pipeline it belongs to.
        * @param setter The GL function to call.
        * @param name The name of the uniform to set.
        * @param value1 The new value of the uniform.
        * @param value2 The new value of the uniform.
        * @param value3 The new value of the uniform.
        * @param value4 The new value of the uniform.
        * @param skipCheck Skip the value comparison? Default false.
        */
      def setUniform4(
        setter: js.Function,
        name: String,
        value1: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        value2: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        value3: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        value4: Boolean | Double | js.Array[Double] | js.typedarray.Float32Array,
        skipCheck: js.UndefOr[Boolean]
      ): this.type = js.native
      
      /**
        * The active uniforms that this shader has.
        * 
        * This is an object that maps the uniform names to their WebGL location and cached values.
        * 
        * It is populated automatically via the `createUniforms` method.
        */
      var uniforms: WebGLPipelineUniformsConfig = js.native
      
      /**
        * The amount of vertex attribute components of 32 bit length.
        */
      var vertexComponentCount: Double = js.native
      
      /**
        * The size, in bytes, of a single vertex.
        * 
        * This is derived by adding together all of the vertex attributes.
        * 
        * For example, the Multi Pipeline has the following attributes:
        * 
        * inPosition - (size 2 x gl.FLOAT) = 8
        * inTexCoord - (size 2 x gl.FLOAT) = 8
        * inTexId - (size 1 x gl.FLOAT) = 4
        * inTintEffect - (size 1 x gl.FLOAT) = 4
        * inTint - (size 4 x gl.UNSIGNED_BYTE) = 4
        * 
        * The total, in this case, is 8 + 8 + 4 + 4 + 4 = 28.
        * 
        * This is calculated automatically during the `createAttributes` method.
        */
      val vertexSize: Double = js.native
    }
  }
}
