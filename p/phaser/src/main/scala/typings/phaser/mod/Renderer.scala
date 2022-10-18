package typings.phaser.mod

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLConst
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineAttributeConfig
import typings.phaser.Phaser.Types.Renderer.WebGL.WebGLPipelineConfig
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  object Canvas {
    
    @JSImport("phaser", "Renderer.Canvas")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The Canvas Renderer is responsible for managing 2D canvas rendering contexts,
      * including the one used by the Games canvas. It tracks the internal state of a
      * given context and can renderer textured Game Objects to it, taking into
      * account alpha, blending, and scaling.
      */
    @JSImport("phaser", "Renderer.Canvas.CanvasRenderer")
    @js.native
    open class CanvasRenderer protected ()
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
    inline def GetBlendModes(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBlendModes")().asInstanceOf[js.Array[Any]]
    
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
  
  object Events {
    
    /**
      * The Post-Render Event.
      * 
      * This event is dispatched by the Renderer when all rendering, for all cameras in all Scenes,
      * has completed, but before any pending snap shots have been taken.
      */
    @JSImport("phaser", "Renderer.Events.POST_RENDER")
    @js.native
    val POST_RENDER: Any = js.native
    
    /**
      * The Pre-Render Event.
      * 
      * This event is dispatched by the Phaser Renderer. This happens right at the start of the render
      * process, after the context has been cleared, the scissors enabled (WebGL only) and everything has been
      * reset ready for the render.
      */
    @JSImport("phaser", "Renderer.Events.PRE_RENDER")
    @js.native
    val PRE_RENDER: Any = js.native
    
    /**
      * The Render Event.
      * 
      * This event is dispatched by the Phaser Renderer for every camera in every Scene.
      * 
      * It is dispatched before any of the children in the Scene have been rendered.
      */
    @JSImport("phaser", "Renderer.Events.RENDER")
    @js.native
    val RENDER: Any = js.native
    
    /**
      * The Renderer Resize Event.
      * 
      * This event is dispatched by the Phaser Renderer when it is resized, usually as a result
      * of the Scale Manager resizing.
      */
    @JSImport("phaser", "Renderer.Events.RESIZE")
    @js.native
    val RESIZE: Any = js.native
  }
  
  object Snapshot {
    
    @JSImport("phaser", "Renderer.Snapshot")
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
    
    @JSImport("phaser", "Renderer.WebGL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 8-bit twos complement signed integer.
      */
    @JSImport("phaser", "Renderer.WebGL.BYTE")
    @js.native
    def BYTE: WebGLConst = js.native
    inline def BYTE_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BYTE")(x.asInstanceOf[js.Any])
    
    /**
      * 32-bit IEEE floating point number.
      */
    @JSImport("phaser", "Renderer.WebGL.FLOAT")
    @js.native
    def FLOAT: WebGLConst = js.native
    inline def FLOAT_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    /**
      * 32-bit twos complement signed integer.
      */
    @JSImport("phaser", "Renderer.WebGL.INT")
    @js.native
    def INT: WebGLConst = js.native
    inline def INT_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
    
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
    @JSImport("phaser", "Renderer.WebGL.PipelineManager")
    @js.native
    open class PipelineManager protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.PipelineManager {
      /**
        * 
        * @param renderer A reference to the WebGL Renderer that owns this Pipeline Manager.
        */
      def this(renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer) = this()
    }
    
    object Pipelines {
      
      /**
        * The Bitmap Mask Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.BITMAPMASK_PIPELINE")
      @js.native
      val BITMAPMASK_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.BitmapMaskPipeline")
      @js.native
      open class BitmapMaskPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      object Events {
        
        /**
          * The WebGLPipeline After Flush Event.
          * 
          * This event is dispatched by a WebGLPipeline right after it has issued a drawArrays command
          * and cleared its vertex count.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.AFTER_FLUSH")
        @js.native
        val AFTER_FLUSH: Any = js.native
        
        /**
          * The WebGLPipeline Before Flush Event.
          * 
          * This event is dispatched by a WebGLPipeline right before it is about to
          * flush and issue a bufferData and drawArrays command.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.BEFORE_FLUSH")
        @js.native
        val BEFORE_FLUSH: Any = js.native
        
        /**
          * The WebGLPipeline Bind Event.
          * 
          * This event is dispatched by a WebGLPipeline when it is bound by the Pipeline Manager.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.BIND")
        @js.native
        val BIND: Any = js.native
        
        /**
          * The WebGLPipeline Boot Event.
          * 
          * This event is dispatched by a WebGLPipeline when it has completed its `boot` phase.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.BOOT")
        @js.native
        val BOOT: Any = js.native
        
        /**
          * The WebGLPipeline Destroy Event.
          * 
          * This event is dispatched by a WebGLPipeline when it is starting its destroy process.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.DESTROY")
        @js.native
        val DESTROY: Any = js.native
        
        /**
          * The WebGLPipeline ReBind Event.
          * 
          * This event is dispatched by a WebGLPipeline when it is re-bound by the Pipeline Manager.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.REBIND")
        @js.native
        val REBIND: Any = js.native
        
        /**
          * The WebGLPipeline Resize Event.
          * 
          * This event is dispatched by a WebGLPipeline when it is resized, usually as a result
          * of the Renderer resizing.
          */
        @JSImport("phaser", "Renderer.WebGL.Pipelines.Events.RESIZE")
        @js.native
        val RESIZE: Any = js.native
      }
      
      /**
        * The Graphics and Shapes Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.GRAPHICS_PIPELINE")
      @js.native
      val GRAPHICS_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.GraphicsPipeline")
      @js.native
      open class GraphicsPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.GraphicsPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Light 2D Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.LIGHT_PIPELINE")
      @js.native
      val LIGHT_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.LightPipeline")
      @js.native
      open class LightPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.LightPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Multi Texture Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.MULTI_PIPELINE")
      @js.native
      val MULTI_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.MultiPipeline")
      @js.native
      open class MultiPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.MultiPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Point Light Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.POINTLIGHT_PIPELINE")
      @js.native
      val POINTLIGHT_PIPELINE: String = js.native
      
      /**
        * The Post FX Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.POSTFX_PIPELINE")
      @js.native
      val POSTFX_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.PointLightPipeline")
      @js.native
      open class PointLightPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.PointLightPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.PostFXPipeline")
      @js.native
      open class PostFXPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.PostFXPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Rope Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.ROPE_PIPELINE")
      @js.native
      val ROPE_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.RopePipeline")
      @js.native
      open class RopePipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.MultiPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Single Texture Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.SINGLE_PIPELINE")
      @js.native
      val SINGLE_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.SinglePipeline")
      @js.native
      open class SinglePipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.MultiPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
      
      /**
        * The Utility Pipeline.
        */
      @JSImport("phaser", "Renderer.WebGL.Pipelines.UTILITY_PIPELINE")
      @js.native
      val UTILITY_PIPELINE: String = js.native
      
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
      @JSImport("phaser", "Renderer.WebGL.Pipelines.UtilityPipeline")
      @js.native
      open class UtilityPipeline protected ()
        extends StObject
           with typings.phaser.Phaser.Renderer.WebGL.Pipelines.UtilityPipeline {
        /**
          * 
          * @param config The configuration options for this pipeline.
          */
        def this(config: WebGLPipelineConfig) = this()
      }
    }
    
    /**
      * A Render Target encapsulates a WebGL framebuffer and the WebGL Texture that displays it.
      * 
      * Instances of this class are typically created by, and belong to WebGL Pipelines, however
      * other Game Objects and classes can take advantage of Render Targets as well.
      */
    @JSImport("phaser", "Renderer.WebGL.RenderTarget")
    @js.native
    open class RenderTarget protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.RenderTarget {
      /**
        * 
        * @param renderer A reference to the WebGLRenderer.
        * @param width The width of this Render Target.
        * @param height The height of this Render Target.
        * @param scale A value between 0 and 1. Controls the size of this Render Target in relation to the Renderer. Default 1.
        * @param minFilter The minFilter mode of the texture when created. 0 is `LINEAR`, 1 is `NEAREST`. Default 0.
        * @param autoClear Automatically clear this framebuffer when bound? Default true.
        * @param autoResize Automatically resize this Render Target if the WebGL Renderer resizes? Default false.
        */
      def this(renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer, width: Double, height: Double) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Double
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Double
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Double,
        autoClear: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Unit,
        autoClear: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Double,
        autoClear: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Unit,
        autoClear: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Double,
        autoClear: Boolean,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Double,
        autoClear: Unit,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Unit,
        autoClear: Boolean,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Double,
        minFilter: Unit,
        autoClear: Unit,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Double,
        autoClear: Boolean,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Double,
        autoClear: Unit,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Unit,
        autoClear: Boolean,
        autoResize: Boolean
      ) = this()
      def this(
        renderer: typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer,
        width: Double,
        height: Double,
        scale: Unit,
        minFilter: Unit,
        autoClear: Unit,
        autoResize: Boolean
      ) = this()
    }
    
    /**
      * 16-bit twos complement signed integer.
      */
    @JSImport("phaser", "Renderer.WebGL.SHORT")
    @js.native
    def SHORT: WebGLConst = js.native
    inline def SHORT_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
    
    /**
      * 8-bit twos complement unsigned integer.
      */
    @JSImport("phaser", "Renderer.WebGL.UNSIGNED_BYTE")
    @js.native
    def UNSIGNED_BYTE: WebGLConst = js.native
    inline def UNSIGNED_BYTE_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED_BYTE")(x.asInstanceOf[js.Any])
    
    /**
      * 32-bit twos complement unsigned integer.
      */
    @JSImport("phaser", "Renderer.WebGL.UNSIGNED_INT")
    @js.native
    def UNSIGNED_INT: WebGLConst = js.native
    inline def UNSIGNED_INT_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED_INT")(x.asInstanceOf[js.Any])
    
    /**
      * 16-bit twos complement unsigned integer.
      */
    @JSImport("phaser", "Renderer.WebGL.UNSIGNED_SHORT")
    @js.native
    def UNSIGNED_SHORT: WebGLConst = js.native
    inline def UNSIGNED_SHORT_=(x: WebGLConst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED_SHORT")(x.asInstanceOf[js.Any])
    
    object Utils {
      
      @JSImport("phaser", "Renderer.WebGL.Utils")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Check to see how many texture units the GPU supports, based on the given config value.
        * Then tests this against the maximum number of iterations GLSL can support.
        * @param gl The WebGLContext used to create the shaders.
        * @param maxTextures The Game Config maxTextures value.
        */
      inline def checkShaderMax(gl: WebGLRenderingContext, maxTextures: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkShaderMax")(gl.asInstanceOf[js.Any], maxTextures.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Unpacks a Uint24 RGB into an array of floats of ranges of 0.0 and 1.0
        * @param rgb RGB packed as a Uint24
        */
      inline def getFloatsFromUintRGB(rgb: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatsFromUintRGB")(rgb.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
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
      
      /**
        * Checks the given Fragment Shader Source for `%count%` and `%forloop%` declarations and
        * replaces those with GLSL code for setting `texture = texture2D(uMainSampler[i], outTexCoord)`.
        * @param fragmentShaderSource The Fragment Shader source code to operate on.
        * @param maxTextures The number of maxTextures value.
        */
      inline def parseFragmentShaderMaxTextures(fragmentShaderSource: String, maxTextures: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragmentShaderMaxTextures")(fragmentShaderSource.asInstanceOf[js.Any], maxTextures.asInstanceOf[js.Any])).asInstanceOf[String]
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
    @JSImport("phaser", "Renderer.WebGL.WebGLPipeline")
    @js.native
    open class WebGLPipeline protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline {
      /**
        * 
        * @param config The configuration object for this WebGL Pipeline.
        */
      def this(config: WebGLPipelineConfig) = this()
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
    @JSImport("phaser", "Renderer.WebGL.WebGLRenderer")
    @js.native
    open class WebGLRenderer protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer {
      /**
        * 
        * @param game The Game instance which owns this WebGL Renderer.
        */
      def this(game: typings.phaser.Phaser.Game) = this()
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
    @JSImport("phaser", "Renderer.WebGL.WebGLShader")
    @js.native
    open class WebGLShader protected ()
      extends StObject
         with typings.phaser.Phaser.Renderer.WebGL.WebGLShader {
      /**
        * 
        * @param pipeline The WebGLPipeline to which this Shader belongs.
        * @param name The name of this Shader.
        * @param vertexShader The vertex shader source code as a single string.
        * @param fragmentShader The fragment shader source code as a single string.
        * @param attributes An array of attributes.
        */
      def this(
        pipeline: typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline,
        name: String,
        vertexShader: String,
        fragmentShader: String,
        attributes: js.Array[WebGLPipelineAttributeConfig]
      ) = this()
    }
  }
}
