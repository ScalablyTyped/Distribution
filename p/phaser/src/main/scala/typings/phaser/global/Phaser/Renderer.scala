package typings.phaser.global.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.phaser.integer
import typings.std.ArrayBuffer
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.Uint8Array
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  object Canvas {
    
    @JSGlobal("Phaser.Renderer.Canvas")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The Canvas Renderer is responsible for managing 2D canvas rendering contexts, including the one used by the Game's canvas. It tracks the internal state of a given context and can renderer textured Game Objects to it, taking into account alpha, blending, and scaling.
      */
    @JSGlobal("Phaser.Renderer.Canvas.CanvasRenderer")
    @js.native
    class CanvasRenderer protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer {
      /**
        * 
        * @param game The Phaser Game instance that owns this renderer.
        */
      def this(game: typings.phaser.Phaser.Game) = this()
    }
    
    /**
      * Returns an array which maps the default blend modes to supported Canvas blend modes.
      * 
      * If the browser doesn't support a blend mode, it will default to the normal `source-over` blend mode.
      */
    inline def GetBlendModes(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBlendModes")().asInstanceOf[js.Array[js.Any]]
    
    /**
      * Takes a reference to the Canvas Renderer, a Canvas Rendering Context, a Game Object, a Camera and a parent matrix
      * and then performs the following steps:
      * 
      * 1. Checks the alpha of the source combined with the Camera alpha. If 0 or less it aborts.
      * 2. Takes the Camera and Game Object matrix and multiplies them, combined with the parent matrix if given.
      * 3. Sets the blend mode of the context to be that used by the Game Object.
      * 4. Sets the alpha value of the context to be that used by the Game Object combined with the Camera.
      * 5. Saves the context state.
      * 6. Sets the final matrix values into the context via setTransform.
      * 7. If Renderer.antialias, or the frame.source.scaleMode is set, then imageSmoothingEnabled is set.
      * 
      * This function is only meant to be used internally. Most of the Canvas Renderer classes use it.
      * @param renderer A reference to the current active Canvas renderer.
      * @param ctx The canvas context to set the transform on.
      * @param src The Game Object being rendered. Can be any type that extends the base class.
      * @param camera The Camera that is rendering the Game Object.
      * @param parentMatrix A parent transform matrix to apply to the Game Object before rendering.
      */
    inline def SetTransform(
      renderer: typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer,
      ctx: CanvasRenderingContext2D,
      src: GameObject,
      camera: Camera
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTransform")(renderer.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], src.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def SetTransform(
      renderer: typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer,
      ctx: CanvasRenderingContext2D,
      src: GameObject,
      camera: Camera,
      parentMatrix: TransformMatrix
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTransform")(renderer.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], src.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], parentMatrix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object Snapshot {
    
    @JSGlobal("Phaser.Renderer.Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes a snapshot of an area from the current frame displayed by a canvas.
      * 
      * This is then copied to an Image object. When this loads, the results are sent
      * to the callback provided in the Snapshot Configuration object.
      * @param sourceCanvas The canvas to take a snapshot of.
      * @param config The snapshot configuration object.
      */
    inline def Canvas(sourceCanvas: HTMLCanvasElement, config: SnapshotState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canvas")(sourceCanvas.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Takes a snapshot of an area from the current frame displayed by a WebGL canvas.
      * 
      * This is then copied to an Image object. When this loads, the results are sent
      * to the callback provided in the Snapshot Configuration object.
      * @param sourceCanvas The canvas to take a snapshot of.
      * @param config The snapshot configuration object.
      */
    inline def WebGL(sourceCanvas: HTMLCanvasElement, config: SnapshotState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WebGL")(sourceCanvas.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      @JSGlobal("Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline")
      @js.native
      class BitmapMaskPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline {
        /**
          * 
          * @param config Used for overriding shader an pipeline properties if extending this pipeline.
          */
        def this(config: js.Object) = this()
        
        /**
          * Indicates if the current pipeline is active or not for this frame only.
          * Reset in the onRender method.
          */
        /* CompleteClass */
        var active: Boolean = js.native
        
        /**
          * Adds a description of vertex attribute to the pipeline
          * @param name Name of the vertex attribute
          * @param size Vertex component size
          * @param type Type of the attribute
          * @param normalized Is the value normalized to a range
          * @param offset Byte offset to the beginning of the first element in the vertex
          */
        /* CompleteClass */
        override def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
        
        /**
          * Array of objects that describe the vertex attributes
          */
        /* CompleteClass */
        var attributes: js.Object = js.native
        
        /**
          * Binds necessary resources and renders the mask to a separated framebuffer.
          * The framebuffer for the masked object is also bound for further use.
          * @param mask GameObject used as mask.
          * @param maskedObject GameObject masked by the mask GameObject.
          * @param camera The camera rendering the current mask.
          */
        /* CompleteClass */
        override def beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera): Unit = js.native
        
        /**
          * Binds the pipeline resources, including programs, vertex buffers and binds attributes
          */
        /* CompleteClass */
        override def bind(): this.type = js.native
        
        /**
          * Called when the Game has fully booted and the Renderer has finished setting up.
          * 
          * By this stage all Game level systems are now in place and you can perform any final
          * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
          */
        /* CompleteClass */
        override def boot(): Unit = js.native
        
        /**
          * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
          * to the GPU.
          */
        /* CompleteClass */
        var bytes: Uint8Array = js.native
        
        /**
          * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
          */
        /* CompleteClass */
        override def destroy(): this.type = js.native
        
        /**
          * The masked game objects framebuffer is unbound and its texture 
          * is bound together with the mask texture and the mask shader and 
          * a draw call with a single quad is processed. Here is where the
          * masking effect is applied.
          * @param mask GameObject used as a mask.
          */
        /* CompleteClass */
        override def endMask(mask: GameObject): Unit = js.native
        
        /**
          * Uploads the vertex data and emits a draw call
          * for the current batch of vertices.
          */
        /* CompleteClass */
        override def flush(): this.type = js.native
        
        /**
          * Indicates if the current pipeline is flushing the contents to the GPU.
          * When the variable is set the flush function will be locked.
          */
        /* CompleteClass */
        var flushLocked: Boolean = js.native
        
        /**
          * The Game which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var game: typings.phaser.Phaser.Game = js.native
        
        /**
          * The WebGL context this WebGL Pipeline uses.
          */
        /* CompleteClass */
        var gl: WebGLRenderingContext = js.native
        
        /**
          * Height of the current viewport
          */
        /* CompleteClass */
        var height: Double = js.native
        
        /**
          * Size of the batch.
          */
        /* CompleteClass */
        var maxQuads: Double = js.native
        
        /**
          * Name of the Pipeline. Used for identifying
          */
        /* CompleteClass */
        var name: String = js.native
        
        /**
          * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
          * 
          * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
          */
        /* CompleteClass */
        override def onBind(): this.type = js.native
        
        /**
          * Called after each frame has been completely rendered and snapshots have been taken.
          */
        /* CompleteClass */
        override def onPostRender(): this.type = js.native
        
        /**
          * Called before each frame is rendered, but after the canvas has been cleared.
          */
        /* CompleteClass */
        override def onPreRender(): this.type = js.native
        
        /**
          * Called before a Scene's Camera is rendered.
          * @param scene The Scene being rendered.
          * @param camera The Scene Camera being rendered with.
          */
        /* CompleteClass */
        override def onRender(scene: typings.phaser.Phaser.Scene, camera: Camera): this.type = js.native
        
        /**
          * The handle to a WebGL program
          */
        /* CompleteClass */
        var program: WebGLProgram = js.native
        
        /**
          * The WebGL Renderer which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer = js.native
        
        /**
          * Resizes the properties used to describe the viewport
          * @param width The new width of this WebGL Pipeline.
          * @param height The new height of this WebGL Pipeline.
          * @param resolution The resolution this WebGL Pipeline should be resized to.
          */
        /* CompleteClass */
        override def resize(width: Double, height: Double, resolution: Double): this.type = js.native
        
        /**
          * Used to store the current game resolution
          */
        /* CompleteClass */
        var resolution: Double = js.native
        
        /**
          * Dirty flag to check if resolution properties need to be updated on the 
          * masking shader.
          */
        /* CompleteClass */
        var resolutionDirty: Boolean = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `float` uniform.
          */
        /* CompleteClass */
        override def setFloat1(name: String, x: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat1v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec2` uniform.
          * @param y The new Y component of the `vec2` uniform.
          */
        /* CompleteClass */
        override def setFloat2(name: String, x: Double, y: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat2v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec3` uniform.
          * @param y The new Y component of the `vec3` uniform.
          * @param z The new Z component of the `vec3` uniform.
          */
        /* CompleteClass */
        override def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat3v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat4v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `int` uniform.
          */
        /* CompleteClass */
        override def setInt1(name: String, x: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec2` uniform.
          * @param y The new Y component of the `ivec2` uniform.
          */
        /* CompleteClass */
        override def setInt2(name: String, x: integer, y: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec3` uniform.
          * @param y The new Y component of the `ivec3` uniform.
          * @param z The new Z component of the `ivec3` uniform.
          */
        /* CompleteClass */
        override def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat2` uniform.
          */
        /* CompleteClass */
        override def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat3` uniform.
          */
        /* CompleteClass */
        override def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Should the matrix be transpose
          * @param matrix Matrix data
          */
        /* CompleteClass */
        override def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Check if the current batch of vertices is full.
          */
        /* CompleteClass */
        override def shouldFlush(): Boolean = js.native
        
        /**
          * The primitive topology which the pipeline will use to submit draw calls
          */
        /* CompleteClass */
        var topology: integer = js.native
        
        /**
          * The handle to a WebGL vertex buffer object.
          */
        /* CompleteClass */
        var vertexBuffer: WebGLBuffer = js.native
        
        /**
          * The limit of vertices that the pipeline can hold
          */
        /* CompleteClass */
        var vertexCapacity: integer = js.native
        
        /**
          * This will store the amount of components of 32 bit length
          */
        /* CompleteClass */
        var vertexComponentCount: integer = js.native
        
        /**
          * How many vertices have been fed to the current pipeline.
          */
        /* CompleteClass */
        var vertexCount: Double = js.native
        
        /**
          * Raw byte buffer of vertices.
          */
        /* CompleteClass */
        var vertexData: ArrayBuffer = js.native
        
        /**
          * The size in bytes of the vertex
          */
        /* CompleteClass */
        var vertexSize: integer = js.native
        
        /**
          * Float32 view of the array buffer containing the pipeline's vertices.
          */
        /* CompleteClass */
        var vertexViewF32: Float32Array = js.native
        
        /**
          * The canvas which this WebGL Pipeline renders to.
          */
        /* CompleteClass */
        var view: HTMLCanvasElement = js.native
        
        /**
          * Width of the current viewport
          */
        /* CompleteClass */
        var width: Double = js.native
      }
      
      /**
        * ForwardDiffuseLightPipeline implements a forward rendering approach for 2D lights.
        * This pipeline extends TextureTintPipeline so it implements all it's rendering functions
        * and batching system.
        */
      @JSGlobal("Phaser.Renderer.WebGL.Pipelines.ForwardDiffuseLightPipeline")
      @js.native
      class ForwardDiffuseLightPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.ForwardDiffuseLightPipeline {
        /**
          * 
          * @param config The configuration of the pipeline, same as the {@link Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline}. The fragment shader will be replaced with the lighting shader.
          */
        def this(config: js.Object) = this()
        
        /**
          * Indicates if the current pipeline is active or not for this frame only.
          * Reset in the onRender method.
          */
        /* CompleteClass */
        var active: Boolean = js.native
        
        /**
          * Adds a description of vertex attribute to the pipeline
          * @param name Name of the vertex attribute
          * @param size Vertex component size
          * @param type Type of the attribute
          * @param normalized Is the value normalized to a range
          * @param offset Byte offset to the beginning of the first element in the vertex
          */
        /* CompleteClass */
        override def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
        
        /**
          * Array of objects that describe the vertex attributes
          */
        /* CompleteClass */
        var attributes: js.Object = js.native
        
        /**
          * Binds the pipeline resources, including programs, vertex buffers and binds attributes
          */
        /* CompleteClass */
        override def bind(): this.type = js.native
        
        /**
          * Called when the Game has fully booted and the Renderer has finished setting up.
          * 
          * By this stage all Game level systems are now in place and you can perform any final
          * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
          */
        /* CompleteClass */
        override def boot(): Unit = js.native
        
        /**
          * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
          * to the GPU.
          */
        /* CompleteClass */
        var bytes: Uint8Array = js.native
        
        /**
          * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
          */
        /* CompleteClass */
        override def destroy(): this.type = js.native
        
        /**
          * Uploads the vertex data and emits a draw call
          * for the current batch of vertices.
          */
        /* CompleteClass */
        override def flush(): this.type = js.native
        
        /**
          * Indicates if the current pipeline is flushing the contents to the GPU.
          * When the variable is set the flush function will be locked.
          */
        /* CompleteClass */
        var flushLocked: Boolean = js.native
        
        /**
          * The Game which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var game: typings.phaser.Phaser.Game = js.native
        
        /**
          * The WebGL context this WebGL Pipeline uses.
          */
        /* CompleteClass */
        var gl: WebGLRenderingContext = js.native
        
        /**
          * Height of the current viewport
          */
        /* CompleteClass */
        var height: Double = js.native
        
        /**
          * Name of the Pipeline. Used for identifying
          */
        /* CompleteClass */
        var name: String = js.native
        
        /**
          * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
          * 
          * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
          */
        /* CompleteClass */
        override def onBind(): this.type = js.native
        
        /**
          * Called after each frame has been completely rendered and snapshots have been taken.
          */
        /* CompleteClass */
        override def onPostRender(): this.type = js.native
        
        /**
          * Called before each frame is rendered, but after the canvas has been cleared.
          */
        /* CompleteClass */
        override def onPreRender(): this.type = js.native
        
        /**
          * Called before a Scene's Camera is rendered.
          * @param scene The Scene being rendered.
          * @param camera The Scene Camera being rendered with.
          */
        /* CompleteClass */
        override def onRender(scene: typings.phaser.Phaser.Scene, camera: Camera): this.type = js.native
        
        /**
          * The handle to a WebGL program
          */
        /* CompleteClass */
        var program: WebGLProgram = js.native
        
        /**
          * The WebGL Renderer which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer = js.native
        
        /**
          * Resizes the properties used to describe the viewport
          * @param width The new width of this WebGL Pipeline.
          * @param height The new height of this WebGL Pipeline.
          * @param resolution The resolution this WebGL Pipeline should be resized to.
          */
        /* CompleteClass */
        override def resize(width: Double, height: Double, resolution: Double): this.type = js.native
        
        /**
          * Used to store the current game resolution
          */
        /* CompleteClass */
        var resolution: Double = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `float` uniform.
          */
        /* CompleteClass */
        override def setFloat1(name: String, x: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat1v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec2` uniform.
          * @param y The new Y component of the `vec2` uniform.
          */
        /* CompleteClass */
        override def setFloat2(name: String, x: Double, y: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat2v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec3` uniform.
          * @param y The new Y component of the `vec3` uniform.
          * @param z The new Z component of the `vec3` uniform.
          */
        /* CompleteClass */
        override def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat3v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat4v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `int` uniform.
          */
        /* CompleteClass */
        override def setInt1(name: String, x: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec2` uniform.
          * @param y The new Y component of the `ivec2` uniform.
          */
        /* CompleteClass */
        override def setInt2(name: String, x: integer, y: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec3` uniform.
          * @param y The new Y component of the `ivec3` uniform.
          * @param z The new Z component of the `ivec3` uniform.
          */
        /* CompleteClass */
        override def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat2` uniform.
          */
        /* CompleteClass */
        override def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat3` uniform.
          */
        /* CompleteClass */
        override def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Should the matrix be transpose
          * @param matrix Matrix data
          */
        /* CompleteClass */
        override def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Check if the current batch of vertices is full.
          */
        /* CompleteClass */
        override def shouldFlush(): Boolean = js.native
        
        /**
          * The primitive topology which the pipeline will use to submit draw calls
          */
        /* CompleteClass */
        var topology: integer = js.native
        
        /**
          * The handle to a WebGL vertex buffer object.
          */
        /* CompleteClass */
        var vertexBuffer: WebGLBuffer = js.native
        
        /**
          * The limit of vertices that the pipeline can hold
          */
        /* CompleteClass */
        var vertexCapacity: integer = js.native
        
        /**
          * This will store the amount of components of 32 bit length
          */
        /* CompleteClass */
        var vertexComponentCount: integer = js.native
        
        /**
          * How many vertices have been fed to the current pipeline.
          */
        /* CompleteClass */
        var vertexCount: Double = js.native
        
        /**
          * Raw byte buffer of vertices.
          */
        /* CompleteClass */
        var vertexData: ArrayBuffer = js.native
        
        /**
          * The size in bytes of the vertex
          */
        /* CompleteClass */
        var vertexSize: integer = js.native
        
        /**
          * The canvas which this WebGL Pipeline renders to.
          */
        /* CompleteClass */
        var view: HTMLCanvasElement = js.native
        
        /**
          * Width of the current viewport
          */
        /* CompleteClass */
        var width: Double = js.native
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
      @JSGlobal("Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline")
      @js.native
      class TextureTintPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline {
        /**
          * 
          * @param config The configuration options for this Texture Tint Pipeline, as described above.
          */
        def this(config: js.Object) = this()
        
        /**
          * Indicates if the current pipeline is active or not for this frame only.
          * Reset in the onRender method.
          */
        /* CompleteClass */
        var active: Boolean = js.native
        
        /**
          * Adds a description of vertex attribute to the pipeline
          * @param name Name of the vertex attribute
          * @param size Vertex component size
          * @param type Type of the attribute
          * @param normalized Is the value normalized to a range
          * @param offset Byte offset to the beginning of the first element in the vertex
          */
        /* CompleteClass */
        override def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
        
        /**
          * Array of objects that describe the vertex attributes
          */
        /* CompleteClass */
        var attributes: js.Object = js.native
        
        /**
          * Binds the pipeline resources, including programs, vertex buffers and binds attributes
          */
        /* CompleteClass */
        override def bind(): this.type = js.native
        
        /**
          * Called when the Game has fully booted and the Renderer has finished setting up.
          * 
          * By this stage all Game level systems are now in place and you can perform any final
          * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
          */
        /* CompleteClass */
        override def boot(): Unit = js.native
        
        /**
          * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
          * to the GPU.
          */
        /* CompleteClass */
        var bytes: Uint8Array = js.native
        
        /**
          * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
          */
        /* CompleteClass */
        override def destroy(): this.type = js.native
        
        /**
          * Uploads the vertex data and emits a draw call
          * for the current batch of vertices.
          */
        /* CompleteClass */
        override def flush(): this.type = js.native
        
        /**
          * Indicates if the current pipeline is flushing the contents to the GPU.
          * When the variable is set the flush function will be locked.
          */
        /* CompleteClass */
        var flushLocked: Boolean = js.native
        
        /**
          * The Game which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var game: typings.phaser.Phaser.Game = js.native
        
        /**
          * The WebGL context this WebGL Pipeline uses.
          */
        /* CompleteClass */
        var gl: WebGLRenderingContext = js.native
        
        /**
          * Height of the current viewport
          */
        /* CompleteClass */
        var height: Double = js.native
        
        /**
          * Name of the Pipeline. Used for identifying
          */
        /* CompleteClass */
        var name: String = js.native
        
        /**
          * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
          * 
          * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
          */
        /* CompleteClass */
        override def onBind(): this.type = js.native
        
        /**
          * Called after each frame has been completely rendered and snapshots have been taken.
          */
        /* CompleteClass */
        override def onPostRender(): this.type = js.native
        
        /**
          * Called before each frame is rendered, but after the canvas has been cleared.
          */
        /* CompleteClass */
        override def onPreRender(): this.type = js.native
        
        /**
          * Called before a Scene's Camera is rendered.
          * @param scene The Scene being rendered.
          * @param camera The Scene Camera being rendered with.
          */
        /* CompleteClass */
        override def onRender(scene: typings.phaser.Phaser.Scene, camera: Camera): this.type = js.native
        
        /**
          * The handle to a WebGL program
          */
        /* CompleteClass */
        var program: WebGLProgram = js.native
        
        /**
          * The WebGL Renderer which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer = js.native
        
        /**
          * Resizes the properties used to describe the viewport
          * @param width The new width of this WebGL Pipeline.
          * @param height The new height of this WebGL Pipeline.
          * @param resolution The resolution this WebGL Pipeline should be resized to.
          */
        /* CompleteClass */
        override def resize(width: Double, height: Double, resolution: Double): this.type = js.native
        
        /**
          * Used to store the current game resolution
          */
        /* CompleteClass */
        var resolution: Double = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `float` uniform.
          */
        /* CompleteClass */
        override def setFloat1(name: String, x: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat1v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec2` uniform.
          * @param y The new Y component of the `vec2` uniform.
          */
        /* CompleteClass */
        override def setFloat2(name: String, x: Double, y: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat2v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec3` uniform.
          * @param y The new Y component of the `vec3` uniform.
          * @param z The new Z component of the `vec3` uniform.
          */
        /* CompleteClass */
        override def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat3v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat4v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `int` uniform.
          */
        /* CompleteClass */
        override def setInt1(name: String, x: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec2` uniform.
          * @param y The new Y component of the `ivec2` uniform.
          */
        /* CompleteClass */
        override def setInt2(name: String, x: integer, y: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec3` uniform.
          * @param y The new Y component of the `ivec3` uniform.
          * @param z The new Z component of the `ivec3` uniform.
          */
        /* CompleteClass */
        override def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat2` uniform.
          */
        /* CompleteClass */
        override def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat3` uniform.
          */
        /* CompleteClass */
        override def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Should the matrix be transpose
          * @param matrix Matrix data
          */
        /* CompleteClass */
        override def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Check if the current batch of vertices is full.
          */
        /* CompleteClass */
        override def shouldFlush(): Boolean = js.native
        
        /**
          * The primitive topology which the pipeline will use to submit draw calls
          */
        /* CompleteClass */
        var topology: integer = js.native
        
        /**
          * The handle to a WebGL vertex buffer object.
          */
        /* CompleteClass */
        var vertexBuffer: WebGLBuffer = js.native
        
        /**
          * The limit of vertices that the pipeline can hold
          */
        /* CompleteClass */
        var vertexCapacity: integer = js.native
        
        /**
          * This will store the amount of components of 32 bit length
          */
        /* CompleteClass */
        var vertexComponentCount: integer = js.native
        
        /**
          * How many vertices have been fed to the current pipeline.
          */
        /* CompleteClass */
        var vertexCount: Double = js.native
        
        /**
          * Raw byte buffer of vertices.
          */
        /* CompleteClass */
        var vertexData: ArrayBuffer = js.native
        
        /**
          * The size in bytes of the vertex
          */
        /* CompleteClass */
        var vertexSize: integer = js.native
        
        /**
          * The canvas which this WebGL Pipeline renders to.
          */
        /* CompleteClass */
        var view: HTMLCanvasElement = js.native
        
        /**
          * Width of the current viewport
          */
        /* CompleteClass */
        var width: Double = js.native
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
      @JSGlobal("Phaser.Renderer.WebGL.Pipelines.TextureTintStripPipeline")
      @js.native
      class TextureTintStripPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.TextureTintStripPipeline {
        /**
          * 
          * @param config The configuration options for this Texture Tint Pipeline, as described above.
          */
        def this(config: js.Object) = this()
        
        /**
          * Indicates if the current pipeline is active or not for this frame only.
          * Reset in the onRender method.
          */
        /* CompleteClass */
        var active: Boolean = js.native
        
        /**
          * Adds a description of vertex attribute to the pipeline
          * @param name Name of the vertex attribute
          * @param size Vertex component size
          * @param type Type of the attribute
          * @param normalized Is the value normalized to a range
          * @param offset Byte offset to the beginning of the first element in the vertex
          */
        /* CompleteClass */
        override def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
        
        /**
          * Array of objects that describe the vertex attributes
          */
        /* CompleteClass */
        var attributes: js.Object = js.native
        
        /**
          * Binds the pipeline resources, including programs, vertex buffers and binds attributes
          */
        /* CompleteClass */
        override def bind(): this.type = js.native
        
        /**
          * Called when the Game has fully booted and the Renderer has finished setting up.
          * 
          * By this stage all Game level systems are now in place and you can perform any final
          * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
          */
        /* CompleteClass */
        override def boot(): Unit = js.native
        
        /**
          * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
          * to the GPU.
          */
        /* CompleteClass */
        var bytes: Uint8Array = js.native
        
        /**
          * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
          */
        /* CompleteClass */
        override def destroy(): this.type = js.native
        
        /**
          * Uploads the vertex data and emits a draw call
          * for the current batch of vertices.
          */
        /* CompleteClass */
        override def flush(): this.type = js.native
        
        /**
          * Indicates if the current pipeline is flushing the contents to the GPU.
          * When the variable is set the flush function will be locked.
          */
        /* CompleteClass */
        var flushLocked: Boolean = js.native
        
        /**
          * The Game which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var game: typings.phaser.Phaser.Game = js.native
        
        /**
          * The WebGL context this WebGL Pipeline uses.
          */
        /* CompleteClass */
        var gl: WebGLRenderingContext = js.native
        
        /**
          * Height of the current viewport
          */
        /* CompleteClass */
        var height: Double = js.native
        
        /**
          * Name of the Pipeline. Used for identifying
          */
        /* CompleteClass */
        var name: String = js.native
        
        /**
          * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
          * 
          * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
          */
        /* CompleteClass */
        override def onBind(): this.type = js.native
        
        /**
          * Called after each frame has been completely rendered and snapshots have been taken.
          */
        /* CompleteClass */
        override def onPostRender(): this.type = js.native
        
        /**
          * Called before each frame is rendered, but after the canvas has been cleared.
          */
        /* CompleteClass */
        override def onPreRender(): this.type = js.native
        
        /**
          * Called before a Scene's Camera is rendered.
          * @param scene The Scene being rendered.
          * @param camera The Scene Camera being rendered with.
          */
        /* CompleteClass */
        override def onRender(scene: typings.phaser.Phaser.Scene, camera: Camera): this.type = js.native
        
        /**
          * The handle to a WebGL program
          */
        /* CompleteClass */
        var program: WebGLProgram = js.native
        
        /**
          * The WebGL Renderer which owns this WebGL Pipeline.
          */
        /* CompleteClass */
        var renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer = js.native
        
        /**
          * Resizes the properties used to describe the viewport
          * @param width The new width of this WebGL Pipeline.
          * @param height The new height of this WebGL Pipeline.
          * @param resolution The resolution this WebGL Pipeline should be resized to.
          */
        /* CompleteClass */
        override def resize(width: Double, height: Double, resolution: Double): this.type = js.native
        
        /**
          * Used to store the current game resolution
          */
        /* CompleteClass */
        var resolution: Double = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `float` uniform.
          */
        /* CompleteClass */
        override def setFloat1(name: String, x: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat1v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec2` uniform.
          * @param y The new Y component of the `vec2` uniform.
          */
        /* CompleteClass */
        override def setFloat2(name: String, x: Double, y: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat2v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `vec3` uniform.
          * @param y The new Y component of the `vec3` uniform.
          * @param z The new Z component of the `vec3` uniform.
          */
        /* CompleteClass */
        override def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat3v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param arr The new value to be used for the uniform variable.
          */
        /* CompleteClass */
        override def setFloat4v(name: String, arr: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new value of the `int` uniform.
          */
        /* CompleteClass */
        override def setInt1(name: String, x: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec2` uniform.
          * @param y The new Y component of the `ivec2` uniform.
          */
        /* CompleteClass */
        override def setInt2(name: String, x: integer, y: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x The new X component of the `ivec3` uniform.
          * @param y The new Y component of the `ivec3` uniform.
          * @param z The new Z component of the `ivec3` uniform.
          */
        /* CompleteClass */
        override def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param x X component of the uniform
          * @param y Y component of the uniform
          * @param z Z component of the uniform
          * @param w W component of the uniform
          */
        /* CompleteClass */
        override def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat2` uniform.
          */
        /* CompleteClass */
        override def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Whether to transpose the matrix. Should be `false`.
          * @param matrix The new values for the `mat3` uniform.
          */
        /* CompleteClass */
        override def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Set a uniform value of the current pipeline program.
          * @param name The name of the uniform to look-up and modify.
          * @param transpose Should the matrix be transpose
          * @param matrix Matrix data
          */
        /* CompleteClass */
        override def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
        
        /**
          * Check if the current batch of vertices is full.
          */
        /* CompleteClass */
        override def shouldFlush(): Boolean = js.native
        
        /**
          * The primitive topology which the pipeline will use to submit draw calls
          */
        /* CompleteClass */
        var topology: integer = js.native
        
        /**
          * The handle to a WebGL vertex buffer object.
          */
        /* CompleteClass */
        var vertexBuffer: WebGLBuffer = js.native
        
        /**
          * The limit of vertices that the pipeline can hold
          */
        /* CompleteClass */
        var vertexCapacity: integer = js.native
        
        /**
          * This will store the amount of components of 32 bit length
          */
        /* CompleteClass */
        var vertexComponentCount: integer = js.native
        
        /**
          * How many vertices have been fed to the current pipeline.
          */
        /* CompleteClass */
        var vertexCount: Double = js.native
        
        /**
          * Raw byte buffer of vertices.
          */
        /* CompleteClass */
        var vertexData: ArrayBuffer = js.native
        
        /**
          * The size in bytes of the vertex
          */
        /* CompleteClass */
        var vertexSize: integer = js.native
        
        /**
          * The canvas which this WebGL Pipeline renders to.
          */
        /* CompleteClass */
        var view: HTMLCanvasElement = js.native
        
        /**
          * Width of the current viewport
          */
        /* CompleteClass */
        var width: Double = js.native
      }
    }
    
    object Utils {
      
      @JSGlobal("Phaser.Renderer.WebGL.Utils")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Counts how many attributes of 32 bits a vertex has
        * @param attributes Array of attributes
        * @param glContext WebGLContext used for check types
        */
      inline def getComponentCount(attributes: js.Array[js.Any], glContext: WebGLRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentCount")(attributes.asInstanceOf[js.Any], glContext.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Unpacks a Uint24 RGB into an array of floats of ranges of 0.0 and 1.0
        * @param rgb RGB packed as a Uint24
        */
      inline def getFloatsFromUintRGB(rgb: Double): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatsFromUintRGB")(rgb.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
      
      /**
        * Packs a Uint24, representing RGB components, with a Float32, representing
        * the alpha component, with a range between 0.0 and 1.0 and return a Uint32
        * @param rgb Uint24 representing RGB components
        * @param a Float32 representing Alpha component
        */
      inline def getTintAppendFloatAlpha(rgb: Double, a: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTintAppendFloatAlpha")(rgb.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Packs a Uint24, representing RGB components, with a Float32, representing
        * the alpha component, with a range between 0.0 and 1.0 and return a 
        * swizzled Uint32
        * @param rgb Uint24 representing RGB components
        * @param a Float32 representing Alpha component
        */
      inline def getTintAppendFloatAlphaAndSwap(rgb: Double, a: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTintAppendFloatAlphaAndSwap")(rgb.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Packs four floats on a range from 0.0 to 1.0 into a single Uint32
        * @param r Red component in a range from 0.0 to 1.0
        * @param g Green component in a range from 0.0 to 1.0
        * @param b Blue component in a range from 0.0 to 1.0
        * @param a Alpha component in a range from 0.0 to 1.0
        */
      inline def getTintFromFloats(r: Double, g: Double, b: Double, a: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTintFromFloats")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double]
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
    @JSGlobal("Phaser.Renderer.WebGL.WebGLPipeline")
    @js.native
    class WebGLPipeline protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline {
      /**
        * 
        * @param config The configuration object for this WebGL Pipeline, as described above.
        */
      def this(config: js.Object) = this()
      
      /**
        * Indicates if the current pipeline is active or not for this frame only.
        * Reset in the onRender method.
        */
      /* CompleteClass */
      var active: Boolean = js.native
      
      /**
        * Adds a description of vertex attribute to the pipeline
        * @param name Name of the vertex attribute
        * @param size Vertex component size
        * @param type Type of the attribute
        * @param normalized Is the value normalized to a range
        * @param offset Byte offset to the beginning of the first element in the vertex
        */
      /* CompleteClass */
      override def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
      
      /**
        * Array of objects that describe the vertex attributes
        */
      /* CompleteClass */
      var attributes: js.Object = js.native
      
      /**
        * Binds the pipeline resources, including programs, vertex buffers and binds attributes
        */
      /* CompleteClass */
      override def bind(): this.type = js.native
      
      /**
        * Called when the Game has fully booted and the Renderer has finished setting up.
        * 
        * By this stage all Game level systems are now in place and you can perform any final
        * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
        */
      /* CompleteClass */
      override def boot(): Unit = js.native
      
      /**
        * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
        * to the GPU.
        */
      /* CompleteClass */
      var bytes: Uint8Array = js.native
      
      /**
        * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
        */
      /* CompleteClass */
      override def destroy(): this.type = js.native
      
      /**
        * Uploads the vertex data and emits a draw call
        * for the current batch of vertices.
        */
      /* CompleteClass */
      override def flush(): this.type = js.native
      
      /**
        * Indicates if the current pipeline is flushing the contents to the GPU.
        * When the variable is set the flush function will be locked.
        */
      /* CompleteClass */
      var flushLocked: Boolean = js.native
      
      /**
        * The Game which owns this WebGL Pipeline.
        */
      /* CompleteClass */
      var game: typings.phaser.Phaser.Game = js.native
      
      /**
        * The WebGL context this WebGL Pipeline uses.
        */
      /* CompleteClass */
      var gl: WebGLRenderingContext = js.native
      
      /**
        * Height of the current viewport
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * Name of the Pipeline. Used for identifying
        */
      /* CompleteClass */
      var name: String = js.native
      
      /**
        * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
        * 
        * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
        */
      /* CompleteClass */
      override def onBind(): this.type = js.native
      
      /**
        * Called after each frame has been completely rendered and snapshots have been taken.
        */
      /* CompleteClass */
      override def onPostRender(): this.type = js.native
      
      /**
        * Called before each frame is rendered, but after the canvas has been cleared.
        */
      /* CompleteClass */
      override def onPreRender(): this.type = js.native
      
      /**
        * Called before a Scene's Camera is rendered.
        * @param scene The Scene being rendered.
        * @param camera The Scene Camera being rendered with.
        */
      /* CompleteClass */
      override def onRender(scene: typings.phaser.Phaser.Scene, camera: Camera): this.type = js.native
      
      /**
        * The handle to a WebGL program
        */
      /* CompleteClass */
      var program: WebGLProgram = js.native
      
      /**
        * The WebGL Renderer which owns this WebGL Pipeline.
        */
      /* CompleteClass */
      var renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer = js.native
      
      /**
        * Resizes the properties used to describe the viewport
        * @param width The new width of this WebGL Pipeline.
        * @param height The new height of this WebGL Pipeline.
        * @param resolution The resolution this WebGL Pipeline should be resized to.
        */
      /* CompleteClass */
      override def resize(width: Double, height: Double, resolution: Double): this.type = js.native
      
      /**
        * Used to store the current game resolution
        */
      /* CompleteClass */
      var resolution: Double = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new value of the `float` uniform.
        */
      /* CompleteClass */
      override def setFloat1(name: String, x: Double): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      /* CompleteClass */
      override def setFloat1v(name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `vec2` uniform.
        * @param y The new Y component of the `vec2` uniform.
        */
      /* CompleteClass */
      override def setFloat2(name: String, x: Double, y: Double): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      /* CompleteClass */
      override def setFloat2v(name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `vec3` uniform.
        * @param y The new Y component of the `vec3` uniform.
        * @param z The new Z component of the `vec3` uniform.
        */
      /* CompleteClass */
      override def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      /* CompleteClass */
      override def setFloat3v(name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      /* CompleteClass */
      override def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param arr The new value to be used for the uniform variable.
        */
      /* CompleteClass */
      override def setFloat4v(name: String, arr: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new value of the `int` uniform.
        */
      /* CompleteClass */
      override def setInt1(name: String, x: integer): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `ivec2` uniform.
        * @param y The new Y component of the `ivec2` uniform.
        */
      /* CompleteClass */
      override def setInt2(name: String, x: integer, y: integer): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x The new X component of the `ivec3` uniform.
        * @param y The new Y component of the `ivec3` uniform.
        * @param z The new Z component of the `ivec3` uniform.
        */
      /* CompleteClass */
      override def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param x X component of the uniform
        * @param y Y component of the uniform
        * @param z Z component of the uniform
        * @param w W component of the uniform
        */
      /* CompleteClass */
      override def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat2` uniform.
        */
      /* CompleteClass */
      override def setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Whether to transpose the matrix. Should be `false`.
        * @param matrix The new values for the `mat3` uniform.
        */
      /* CompleteClass */
      override def setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Set a uniform value of the current pipeline program.
        * @param name The name of the uniform to look-up and modify.
        * @param transpose Should the matrix be transpose
        * @param matrix Matrix data
        */
      /* CompleteClass */
      override def setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
      
      /**
        * Check if the current batch of vertices is full.
        */
      /* CompleteClass */
      override def shouldFlush(): Boolean = js.native
      
      /**
        * The primitive topology which the pipeline will use to submit draw calls
        */
      /* CompleteClass */
      var topology: integer = js.native
      
      /**
        * The handle to a WebGL vertex buffer object.
        */
      /* CompleteClass */
      var vertexBuffer: WebGLBuffer = js.native
      
      /**
        * The limit of vertices that the pipeline can hold
        */
      /* CompleteClass */
      var vertexCapacity: integer = js.native
      
      /**
        * This will store the amount of components of 32 bit length
        */
      /* CompleteClass */
      var vertexComponentCount: integer = js.native
      
      /**
        * How many vertices have been fed to the current pipeline.
        */
      /* CompleteClass */
      var vertexCount: Double = js.native
      
      /**
        * Raw byte buffer of vertices.
        */
      /* CompleteClass */
      var vertexData: ArrayBuffer = js.native
      
      /**
        * The size in bytes of the vertex
        */
      /* CompleteClass */
      var vertexSize: integer = js.native
      
      /**
        * The canvas which this WebGL Pipeline renders to.
        */
      /* CompleteClass */
      var view: HTMLCanvasElement = js.native
      
      /**
        * Width of the current viewport
        */
      /* CompleteClass */
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
    @JSGlobal("Phaser.Renderer.WebGL.WebGLRenderer")
    @js.native
    class WebGLRenderer protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer {
      /**
        * 
        * @param game The Game instance which owns this WebGL Renderer.
        */
      def this(game: typings.phaser.Phaser.Game) = this()
    }
  }
}
