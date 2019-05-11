package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Renderer")
@js.native
object RendererNs extends js.Object {
  @JSName("Canvas")
  @js.native
  object CanvasNs extends js.Object {
    /**
      * The Canvas Renderer is responsible for managing 2D canvas rendering contexts, including the one used by the Game's canvas. It tracks the internal state of a given context and can renderer textured Game Objects to it, taking into account alpha, blending, and scaling.
      */
    @js.native
    class CanvasRenderer protected ()
      extends phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer {
      /**
        * 
        * @param game The Phaser Game instance that owns this renderer.
        */
      def this(game: phaserLib.PhaserNs.Game) = this()
    }
    
    /**
      * Returns an array which maps the default blend modes to supported Canvas blend modes.
      * 
      * If the browser doesn't support a blend mode, it will default to the normal `source-over` blend mode.
      */
    def GetBlendModes(): js.Array[_] = js.native
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
      * 
      * This function is only meant to be used internally. Most of the Canvas Renderer classes use it.
      * @param renderer A reference to the current active Canvas renderer.
      * @param ctx The canvas context to set the transform on.
      * @param src The Game Object being rendered. Can be any type that extends the base class.
      * @param camera The Camera that is rendering the Game Object.
      * @param parentMatrix A parent transform matrix to apply to the Game Object before rendering.
      */
    def SetTransform(
      renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer,
      ctx: stdLib.CanvasRenderingContext2D,
      src: phaserLib.PhaserNs.GameObjectsNs.GameObject,
      camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
    ): scala.Boolean = js.native
    def SetTransform(
      renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer,
      ctx: stdLib.CanvasRenderingContext2D,
      src: phaserLib.PhaserNs.GameObjectsNs.GameObject,
      camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera,
      parentMatrix: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.TransformMatrix
    ): scala.Boolean = js.native
  }
  
  @JSName("Snapshot")
  @js.native
  object SnapshotNs extends js.Object {
    /**
      * Takes a snapshot of an area from the current frame displayed by a canvas.
      * 
      * This is then copied to an Image object. When this loads, the results are sent
      * to the callback provided in the Snapshot Configuration object.
      * @param sourceCanvas The canvas to take a snapshot of.
      * @param config The snapshot configuration object.
      */
    def Canvas(
      sourceCanvas: stdLib.HTMLCanvasElement,
      config: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState
    ): scala.Unit = js.native
    /**
      * Takes a snapshot of an area from the current frame displayed by a WebGL canvas.
      * 
      * This is then copied to an Image object. When this loads, the results are sent
      * to the callback provided in the Snapshot Configuration object.
      * @param sourceCanvas The canvas to take a snapshot of.
      * @param config The snapshot configuration object.
      */
    def WebGL(
      sourceCanvas: stdLib.HTMLCanvasElement,
      config: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState
    ): scala.Unit = js.native
  }
  
  @JSName("WebGL")
  @js.native
  object WebGLNs extends js.Object {
    /**
      * WebGLPipeline is a class that describes the way elements will be rendererd
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
    @js.native
    class WebGLPipeline protected ()
      extends phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLPipeline {
      /**
        * 
        * @param config The configuration object for this WebGL Pipeline, as described above.
        */
      def this(config: js.Object) = this()
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
    class WebGLRenderer protected ()
      extends phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer {
      /**
        * 
        * @param game The Game instance which owns this WebGL Renderer.
        */
      def this(game: phaserLib.PhaserNs.Game) = this()
    }
    
    @JSName("Pipelines")
    @js.native
    object PipelinesNs extends js.Object {
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
      @js.native
      class BitmapMaskPipeline protected ()
        extends phaserLib.PhaserNs.RendererNs.WebGLNs.PipelinesNs.BitmapMaskPipeline {
        /**
          * 
          * @param config Used for overriding shader an pipeline properties if extending this pipeline.
          */
        def this(config: js.Object) = this()
      }
      
      /**
        * ForwardDiffuseLightPipeline implements a forward rendering approach for 2D lights.
        * This pipeline extends TextureTintPipeline so it implements all it's rendering functions
        * and batching system.
        */
      @js.native
      class ForwardDiffuseLightPipeline protected ()
        extends phaserLib.PhaserNs.RendererNs.WebGLNs.PipelinesNs.ForwardDiffuseLightPipeline {
        /**
          * 
          * @param config The configuration of the pipeline, same as the {@link Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline}. The fragment shader will be replaced with the lighting shader.
          */
        def this(config: js.Object) = this()
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
      class TextureTintPipeline protected ()
        extends phaserLib.PhaserNs.RendererNs.WebGLNs.PipelinesNs.TextureTintPipeline {
        /**
          * 
          * @param config The configuration options for this Texture Tint Pipeline, as described above.
          */
        def this(config: js.Object) = this()
      }
      
    }
    
    @JSName("Utils")
    @js.native
    object UtilsNs extends js.Object {
      /**
        * Counts how many attributes of 32 bits a vertex has
        * @param attributes Array of attributes
        * @param glContext WebGLContext used for check types
        */
      def getComponentCount(attributes: js.Array[_], glContext: stdLib.WebGLRenderingContext): scala.Double = js.native
      /**
        * Unpacks a Uint24 RGB into an array of floats of ranges of 0.0 and 1.0
        * @param rgb RGB packed as a Uint24
        */
      def getFloatsFromUintRGB(rgb: scala.Double): js.Array[_] = js.native
      /**
        * Packs a Uint24, representing RGB components, with a Float32, representing
        * the alpha component, with a range between 0.0 and 1.0 and return a Uint32
        * @param rgb Uint24 representing RGB components
        * @param a Float32 representing Alpha component
        */
      def getTintAppendFloatAlpha(rgb: scala.Double, a: scala.Double): scala.Double = js.native
      /**
        * Packs a Uint24, representing RGB components, with a Float32, representing
        * the alpha component, with a range between 0.0 and 1.0 and return a 
        * swizzled Uint32
        * @param rgb Uint24 representing RGB components
        * @param a Float32 representing Alpha component
        */
      def getTintAppendFloatAlphaAndSwap(rgb: scala.Double, a: scala.Double): scala.Double = js.native
      /**
        * Packs four floats on a range from 0.0 to 1.0 into a single Uint32
        * @param r Red component in a range from 0.0 to 1.0
        * @param g Green component in a range from 0.0 to 1.0
        * @param b Blue component in a range from 0.0 to 1.0
        * @param a Alpha component in a range from 0.0 to 1.0
        */
      def getTintFromFloats(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Double = js.native
    }
    
  }
  
}

