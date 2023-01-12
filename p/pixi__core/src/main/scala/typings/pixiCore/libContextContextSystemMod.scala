package typings.pixiCore

import typings.pixiCore.libContextWebGLExtensionsMod.WebGLExtensions
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.pixiCoreStrings.notMultiplied
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.WebGLContextAttributes
import typings.std.WebGLContextEvent
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextContextSystemMod {
  
  @JSImport("@pixi/core/lib/context/ContextSystem", "ContextSystem")
  @js.native
  open class ContextSystem protected ()
    extends StObject
       with ISystem[ContextOptions, Null] {
    /** @param renderer - The renderer this System works for. */
    def this(renderer: Renderer) = this()
    
    /* protected */ var CONTEXT_UID: Double = js.native
    
    /**
      * Handles the context change event.
      * @param {WebGLRenderingContext} gl - New WebGL context.
      */
    /* protected */ def contextChange(gl: IRenderingContext): Unit = js.native
    
    /**
      * Helper class to create a WebGL Context
      * @param canvas - the canvas element that we will get the context from
      * @param options - An options object that gets passed in to the canvas element containing the
      *    context attributes
      * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
      * @returns {WebGLRenderingContext} the WebGL context
      */
    def createContext(canvas: ICanvas, options: WebGLContextAttributes): IRenderingContext = js.native
    
    @JSName("destroy")
    def destroy_MContextSystem(): Unit = js.native
    
    /**
      * Extensions available.
      * @type {object}
      * @readonly
      * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
      * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
      * @property {OES_texture_float} floatTexture - WebGL v1 extension
      * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
      * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
      * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
      */
    var extensions: WebGLExtensions = js.native
    
    /** Auto-populate the {@link PIXI.ContextSystem.extensions extensions}. */
    /* protected */ def getExtensions(): Unit = js.native
    
    /* protected */ var gl: IRenderingContext = js.native
    
    /**
      * Handles a lost webgl context
      * @param {WebGLContextEvent} event - The context lost event.
      */
    /* protected */ def handleContextLost(event: WebGLContextEvent): Unit = js.native
    
    /** Handles a restored webgl context. */
    /* protected */ def handleContextRestored(): Unit = js.native
    
    /**
      * Initializes the context.
      * @protected
      * @param {WebGLRenderingContext} gl - WebGL context
      */
    def initFromContext(gl: IRenderingContext): Unit = js.native
    
    /**
      * Initialize from context options
      * @protected
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
      * @param {object} options - context attributes
      */
    def initFromOptions(options: WebGLContextAttributes): Unit = js.native
    
    @JSName("init")
    def init_MContextSystem(options: ContextOptions): Unit = js.native
    
    /**
      * `true` if the context is lost
      * @readonly
      */
    def isLost: Boolean = js.native
    
    /** Handle the post-render runner event. */
    /* protected */ def postrender(): Unit = js.native
    
    var powerPreference: WebGLPowerPreference = js.native
    
    var preserveDrawingBuffer: Boolean = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Features supported by current context.
      * @type {object}
      * @readonly
      * @property {boolean} uint32Indices - Support for 32-bit indices buffer.
      */
    val supports: ISupportDict = js.native
    
    /**
      * Pass-thru setting for the canvas' context `alpha` property. This is typically
      * not something you need to fiddle with. If you want transparency, use `backgroundAlpha`.
      * @member {boolean}
      * @deprecated since 7.0.0
      */
    var useContextAlpha: Boolean | notMultiplied = js.native
    
    /**
      * Validate context.
      * @param {WebGLRenderingContext} gl - Render context.
      */
    /* protected */ def validateContext(gl: IRenderingContext): Unit = js.native
    
    /**
      * Either 1 or 2 to reflect the WebGL version being used.
      * @readonly
      */
    var webGLVersion: Double = js.native
  }
  /* static members */
  object ContextSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/context/ContextSystem", "ContextSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait ContextOptions extends StObject {
    
    var antialias: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[IRenderingContext] = js.undefined
    
    var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
    
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use premultipliedAlpha instead
      * @deprecated since 7.0.0
      */
    var useContextAlpha: js.UndefOr[Boolean | notMultiplied] = js.undefined
  }
  object ContextOptions {
    
    inline def apply(): ContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      inline def setContext(value: IRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setPowerPreference(value: WebGLPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      inline def setUseContextAlpha(value: Boolean | notMultiplied): Self = StObject.set(x, "useContextAlpha", value.asInstanceOf[js.Any])
      
      inline def setUseContextAlphaUndefined: Self = StObject.set(x, "useContextAlpha", js.undefined)
    }
  }
  
  trait ISupportDict extends StObject {
    
    var uint32Indices: Boolean
  }
  object ISupportDict {
    
    inline def apply(uint32Indices: Boolean): ISupportDict = {
      val __obj = js.Dynamic.literal(uint32Indices = uint32Indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISupportDict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISupportDict] (val x: Self) extends AnyVal {
      
      inline def setUint32Indices(value: Boolean): Self = StObject.set(x, "uint32Indices", value.asInstanceOf[js.Any])
    }
  }
}
