package typings.pixiSettings

import typings.pixiSettings.anon.Quality
import typings.pixiSettings.libIcanvasrenderingcontext2dMod.ICanvasRenderingContext2D
import typings.pixiSettings.pixiSettingsStrings.`2d`
import typings.pixiSettings.pixiSettingsStrings.`experimental-webgl2`
import typings.pixiSettings.pixiSettingsStrings.`experimental-webgl`
import typings.pixiSettings.pixiSettingsStrings.bitmaprenderer
import typings.pixiSettings.pixiSettingsStrings.webgl
import typings.pixiSettings.pixiSettingsStrings.webgl2
import typings.std.AddEventListenerOptions
import typings.std.Blob
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.ImageBitmapRenderingContext
import typings.std.ImageBitmapRenderingContextSettings
import typings.std.WebGL2RenderingContext
import typings.std.WebGLContextAttributes
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcanvasMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiSettings.pixiSettingsStrings.`2d`
    - typings.pixiSettings.pixiSettingsStrings.bitmaprenderer
    - typings.pixiSettings.pixiSettingsStrings.webgl
    - typings.pixiSettings.pixiSettingsStrings.`experimental-webgl`
    - typings.pixiSettings.pixiSettingsStrings.webgl2
    - typings.pixiSettings.pixiSettingsStrings.`experimental-webgl2`
  */
  trait ContextIds extends StObject
  object ContextIds {
    
    inline def `2d`: typings.pixiSettings.pixiSettingsStrings.`2d` = "2d".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.`2d`]
    
    inline def bitmaprenderer: typings.pixiSettings.pixiSettingsStrings.bitmaprenderer = "bitmaprenderer".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.bitmaprenderer]
    
    inline def `experimental-webgl`: typings.pixiSettings.pixiSettingsStrings.`experimental-webgl` = "experimental-webgl".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.`experimental-webgl`]
    
    inline def `experimental-webgl2`: typings.pixiSettings.pixiSettingsStrings.`experimental-webgl2` = "experimental-webgl2".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.`experimental-webgl2`]
    
    inline def webgl: typings.pixiSettings.pixiSettingsStrings.webgl = "webgl".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.webgl]
    
    inline def webgl2: typings.pixiSettings.pixiSettingsStrings.webgl2 = "webgl2".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.webgl2]
  }
  
  type ContextSettings = ICanvasRenderingContext2DSettings | ImageBitmapRenderingContextSettings | WebGLContextAttributes
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.ICanvas * / any
  - Dropped {[ P in keyof std.EventTarget ]:? std.EventTarget[P]} */ @js.native
  trait ICanvas extends StObject {
    
    /**
      * Adds the listener for the specified event.
      * @param {string} type - The type of event to listen for.
      * @param {EventListenerOrEventListenerObject} listener - The callback to invoke when the event is fired.
      * @param {boolean | AddEventListenerOptions} options - The options for adding event listener.
      */
    var addEventListener: js.UndefOr[
        js.Function3[
          /* type */ String, 
          /* listener */ EventListenerOrEventListenerObject, 
          /* options */ js.UndefOr[Boolean | AddEventListenerOptions], 
          Unit
        ]
      ] = js.native
    
    /**
      * Get the content of the canvas as Blob.
      * @param {object} options - The options for creating Blob.
      * @param {string} options.type
      *     - The MIME type for the image format to return. If not specify, the default value is image/png.
      * @param {string} options.quality
      *     - The image quality to be used when creating images using file formats that support lossy compression.
      * @returns {Promise<Blob>} The content of the canvas as Blob.
      */
    var convertToBlob: js.UndefOr[js.Function1[/* options */ js.UndefOr[Quality], js.Promise[Blob]]] = js.native
    
    /**
      * Dispatches a event.
      * @param {Event} event - The Event object to dispatch. Its Event.target property will be set to the current EventTarget.
      * @returns {boolean} Returns false if event is cancelable, and at least one of the event handlers which received event
      *                    called Event.preventDefault(). Otherwise true.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    
    /**
      * Get the position and the size of the canvas.
      * @returns The smallest rectangle which contains the entire canvas.
      */
    var getBoundingClientRect: js.UndefOr[js.Function0[ICanvasRect]] = js.native
    
    def getContext(contextId: ContextIds | `experimental-webgl` | `experimental-webgl2` | webgl | webgl2): WebGLRenderingContext | Null = js.native
    def getContext(
      contextId: `experimental-webgl` | `experimental-webgl2` | webgl | webgl2,
      options: WebGLContextAttributes
    ): WebGLRenderingContext | Null = js.native
    def getContext(contextId: ContextIds, options: ContextSettings): RenderingContext | Null = js.native
    /**
      * Get rendering context of the canvas.
      * @param {ContextIds} contextId - The identifier of the type of context to create.
      * @param {ContextSettings} options - The options for creating context.
      * @returns {RenderingContext | null} The created context, or null if contextId is not supported.
      */
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): ICanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, options: ICanvasRenderingContext2DSettings): ICanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer, options: ImageBitmapRenderingContextSettings): ImageBitmapRenderingContext | Null = js.native
    
    /** Height of the canvas. */
    var height: Double = js.native
    
    /** Parent node of the canvas. */
    val parentNode: js.UndefOr[ICanvasParentNode | Null] = js.native
    
    /**
      * Removes the listener for the specified event.
      * @param {string} type - The type of event to listen for.
      * @param {EventListenerOrEventListenerObject} listener - The callback to invoke when the event is fired.
      * @param {boolean | EventListenerOptions} options - The options for removing event listener.
      */
    var removeEventListener: js.UndefOr[
        js.Function3[
          /* type */ String, 
          /* listener */ EventListenerOrEventListenerObject, 
          /* options */ js.UndefOr[Boolean | EventListenerOptions], 
          Unit
        ]
      ] = js.native
    
    /** Style of the canvas. */
    val style: js.UndefOr[ICanvasStyle] = js.native
    
    /**
      * Get the content of the canvas as data URL.
      * @param {string} type - The MIME type for the image format to return. If not specify, the default value is image/png.
      * @param {any} options - The options for creating data URL.
      * @returns {string} The content of the canvas as data URL.
      */
    var toDataURL: js.UndefOr[
        js.Function2[/* type */ js.UndefOr[String], /* options */ js.UndefOr[Any], String]
      ] = js.native
    
    /** Width of the canvas. */
    var width: Double = js.native
  }
  
  @js.native
  trait ICanvasParentNode extends StObject {
    
    /** Adds a node to the end of the list of children of the parent node. */
    def appendChild(element: HTMLElement): Unit = js.native
    
    def removeChild(element: ICanvas): Unit = js.native
    /** Removes a child node from the parent node. */
    def removeChild(element: HTMLElement): Unit = js.native
  }
  
  trait ICanvasRect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ICanvasRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): ICanvasRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICanvasRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICanvasRenderingContext2DSettings extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
    
    var desynchronized: js.UndefOr[Boolean] = js.undefined
    
    var willReadFrequently: js.UndefOr[Boolean] = js.undefined
  }
  object ICanvasRenderingContext2DSettings {
    
    inline def apply(): ICanvasRenderingContext2DSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasRenderingContext2DSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
      
      inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
      
      inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
      
      inline def setWillReadFrequently(value: Boolean): Self = StObject.set(x, "willReadFrequently", value.asInstanceOf[js.Any])
      
      inline def setWillReadFrequentlyUndefined: Self = StObject.set(x, "willReadFrequently", js.undefined)
    }
  }
  
  trait ICanvasStyle extends StObject {
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var msContentZooming: js.UndefOr[String] = js.undefined
    
    var msTouchAction: js.UndefOr[String] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object ICanvasStyle {
    
    inline def apply(): ICanvasStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasStyle] (val x: Self) extends AnyVal {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMsContentZooming(value: String): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      inline def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      inline def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiSettings.pixiSettingsStrings.srgb
    - typings.pixiSettings.pixiSettingsStrings.`display-p3`
  */
  trait PredefinedColorSpace extends StObject
  object PredefinedColorSpace {
    
    inline def `display-p3`: typings.pixiSettings.pixiSettingsStrings.`display-p3` = "display-p3".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.`display-p3`]
    
    inline def srgb: typings.pixiSettings.pixiSettingsStrings.srgb = "srgb".asInstanceOf[typings.pixiSettings.pixiSettingsStrings.srgb]
  }
  
  type RenderingContext = ICanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext | WebGL2RenderingContext
  
  trait WebGLContextEventMap extends StObject {
    
    var webglcontextlost: WebGLContextEvent
    
    var webglcontextrestore: WebGLContextEvent
  }
  object WebGLContextEventMap {
    
    inline def apply(webglcontextlost: WebGLContextEvent, webglcontextrestore: WebGLContextEvent): WebGLContextEventMap = {
      val __obj = js.Dynamic.literal(webglcontextlost = webglcontextlost.asInstanceOf[js.Any], webglcontextrestore = webglcontextrestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLContextEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLContextEventMap] (val x: Self) extends AnyVal {
      
      inline def setWebglcontextlost(value: WebGLContextEvent): Self = StObject.set(x, "webglcontextlost", value.asInstanceOf[js.Any])
      
      inline def setWebglcontextrestore(value: WebGLContextEvent): Self = StObject.set(x, "webglcontextrestore", value.asInstanceOf[js.Any])
    }
  }
}
