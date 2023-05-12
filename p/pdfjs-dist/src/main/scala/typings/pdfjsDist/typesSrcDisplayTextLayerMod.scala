package typings.pdfjsDist

import typings.pdfjsDist.anon.Container
import typings.pdfjsDist.anon.Ctx
import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import typings.std.HTMLElement
import typings.std.ReadableStream
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayTextLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/text_layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayerRenderTask")
  @js.native
  open class TextLayerRenderTask protected () extends StObject {
    def this(param0: Container) = this()
    
    var _canceled: Boolean = js.native
    
    var _capability: PromiseCapability = js.native
    
    var _container: Any = js.native
    
    var _fontInspectorEnabled: Boolean = js.native
    
    var _isOffscreenCanvasSupported: Any = js.native
    
    var _isReadableStream: Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var _layoutText: Any = js.native
    
    var _layoutTextParams: Ctx = js.native
    
    var _pageHeight: Any = js.native
    
    var _pageWidth: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _processItems: Any = js.native
    
    var _reader: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _render: Any = js.native
    
    var _rootContainer: Any = js.native
    
    var _textContentItemsStr: Any = js.native
    
    var _textContentSource: Any = js.native
    
    var _textDivProperties: Any = js.native
    
    var _textDivs: Any = js.native
    
    var _transform: js.Array[Any] = js.native
    
    /**
      * Cancel rendering of the textLayer.
      */
    def cancel(): Unit = js.native
    
    /**
      * Promise for textLayer rendering task completion.
      * @type {Promise<void>}
      */
    def promise: js.Promise[Unit] = js.native
  }
  
  inline def renderTextLayer(params: TextLayerRenderParameters): TextLayerRenderTask = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTextLayer")(params.asInstanceOf[js.Any]).asInstanceOf[TextLayerRenderTask]
  
  inline def updateTextLayer(param0: TextLayerUpdateParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTextLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type PageViewport = typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
  
  type TextContent = typings.pdfjsDist.typesSrcDisplayApiMod.TextContent
  
  trait TextLayerRenderParameters extends StObject {
    
    /**
      * - The DOM node that will contain the text
      * runs.
      */
    var container: HTMLElement
    
    /**
      * true if we can use
      * OffscreenCanvas to measure string widths.
      */
    var isOffscreenCanvasSupported: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Strings that correspond to
      * the `str` property of the text items of the textContent input.
      * This is output and shall initially be set to an empty array.
      */
    var textContentItemsStr: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * - Text content to
      * render, i.e. the value returned by the page's `streamTextContent` or
      * `getTextContent` method.
      */
    var textContentSource: ReadableStream[Any] | TextContent
    
    /**
      * - Some properties
      * weakly mapped to the HTML elements used to render the text.
      */
    var textDivProperties: js.UndefOr[WeakMap[HTMLElement, js.Object]] = js.undefined
    
    /**
      * - HTML elements that correspond to
      * the text items of the textContent input.
      * This is output and shall initially be set to an empty array.
      */
    var textDivs: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /**
      * - The target viewport to properly layout
      * the text runs.
      */
    var viewport: PageViewport
  }
  object TextLayerRenderParameters {
    
    inline def apply(
      container: HTMLElement,
      textContentSource: ReadableStream[Any] | TextContent,
      viewport: PageViewport
    ): TextLayerRenderParameters = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], textContentSource = textContentSource.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerRenderParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLayerRenderParameters] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIsOffscreenCanvasSupported(value: Boolean): Self = StObject.set(x, "isOffscreenCanvasSupported", value.asInstanceOf[js.Any])
      
      inline def setIsOffscreenCanvasSupportedUndefined: Self = StObject.set(x, "isOffscreenCanvasSupported", js.undefined)
      
      inline def setTextContentItemsStr(value: js.Array[String]): Self = StObject.set(x, "textContentItemsStr", value.asInstanceOf[js.Any])
      
      inline def setTextContentItemsStrUndefined: Self = StObject.set(x, "textContentItemsStr", js.undefined)
      
      inline def setTextContentItemsStrVarargs(value: String*): Self = StObject.set(x, "textContentItemsStr", js.Array(value*))
      
      inline def setTextContentSource(value: ReadableStream[Any] | TextContent): Self = StObject.set(x, "textContentSource", value.asInstanceOf[js.Any])
      
      inline def setTextDivProperties(value: WeakMap[HTMLElement, js.Object]): Self = StObject.set(x, "textDivProperties", value.asInstanceOf[js.Any])
      
      inline def setTextDivPropertiesUndefined: Self = StObject.set(x, "textDivProperties", js.undefined)
      
      inline def setTextDivs(value: js.Array[HTMLElement]): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
      
      inline def setTextDivsUndefined: Self = StObject.set(x, "textDivs", js.undefined)
      
      inline def setTextDivsVarargs(value: HTMLElement*): Self = StObject.set(x, "textDivs", js.Array(value*))
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextLayerUpdateParameters extends StObject {
    
    /**
      * - The DOM node that will contain the text
      * runs.
      */
    var container: HTMLElement
    
    /**
      * true if we can use
      * OffscreenCanvas to measure string widths.
      */
    var isOffscreenCanvasSupported: js.UndefOr[Boolean] = js.undefined
    
    /**
      * true if the text layer contents must be
      * rescaled.
      */
    var mustRescale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * true if the text layer must be rotated.
      */
    var mustRotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Some properties
      * weakly mapped to the HTML elements used to render the text.
      */
    var textDivProperties: js.UndefOr[WeakMap[HTMLElement, js.Object]] = js.undefined
    
    /**
      * - HTML elements that correspond to
      * the text items of the textContent input.
      * This is output and shall initially be set to an empty array.
      */
    var textDivs: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /**
      * - The target viewport to properly layout
      * the text runs.
      */
    var viewport: PageViewport
  }
  object TextLayerUpdateParameters {
    
    inline def apply(container: HTMLElement, viewport: PageViewport): TextLayerUpdateParameters = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerUpdateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLayerUpdateParameters] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIsOffscreenCanvasSupported(value: Boolean): Self = StObject.set(x, "isOffscreenCanvasSupported", value.asInstanceOf[js.Any])
      
      inline def setIsOffscreenCanvasSupportedUndefined: Self = StObject.set(x, "isOffscreenCanvasSupported", js.undefined)
      
      inline def setMustRescale(value: Boolean): Self = StObject.set(x, "mustRescale", value.asInstanceOf[js.Any])
      
      inline def setMustRescaleUndefined: Self = StObject.set(x, "mustRescale", js.undefined)
      
      inline def setMustRotate(value: Boolean): Self = StObject.set(x, "mustRotate", value.asInstanceOf[js.Any])
      
      inline def setMustRotateUndefined: Self = StObject.set(x, "mustRotate", js.undefined)
      
      inline def setTextDivProperties(value: WeakMap[HTMLElement, js.Object]): Self = StObject.set(x, "textDivProperties", value.asInstanceOf[js.Any])
      
      inline def setTextDivPropertiesUndefined: Self = StObject.set(x, "textDivProperties", js.undefined)
      
      inline def setTextDivs(value: js.Array[HTMLElement]): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
      
      inline def setTextDivsUndefined: Self = StObject.set(x, "textDivs", js.undefined)
      
      inline def setTextDivsVarargs(value: HTMLElement*): Self = StObject.set(x, "textDivs", js.Array(value*))
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
