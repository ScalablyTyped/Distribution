package typings.pdfjsDist

import typings.pdfjsDist.anon.Container
import typings.pdfjsDist.typesSrcDisplayApiMod.TextContent
import typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import typings.std.DocumentFragment
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
    def this(hasTextContentTextContentStreamContainerViewportTextDivsTextContentItemsStrEnhanceTextSelection: Container) = this()
    
    var _bounds: js.Array[Any] = js.native
    
    var _canceled: Boolean = js.native
    
    var _capability: PromiseCapability = js.native
    
    var _container: Any = js.native
    
    var _devicePixelRatio: Double = js.native
    
    var _document: Any = js.native
    
    var _enhanceTextSelection: Boolean = js.native
    
    var _fontInspectorEnabled: Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var _layoutText: Any = js.native
    
    var _layoutTextCtx: Any = js.native
    
    var _layoutTextLastFontFamily: Any = js.native
    
    var _layoutTextLastFontSize: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _processItems: Any = js.native
    
    var _reader: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _render: Any = js.native
    
    var _renderTimer: Any = js.native
    
    var _renderingDone: Boolean = js.native
    
    var _textContent: Any = js.native
    
    var _textContentItemsStr: Any = js.native
    
    var _textContentStream: Any = js.native
    
    var _textDivProperties: WeakMap[js.Object, Any] = js.native
    
    var _textDivs: Any = js.native
    
    var _viewport: Any = js.native
    
    /**
      * Cancel rendering of the textLayer.
      */
    def cancel(): Unit = js.native
    
    /**
      * @param {boolean} [expandDivs]
      */
    def expandTextDivs(): Unit = js.native
    def expandTextDivs(expandDivs: Boolean): Unit = js.native
    
    /**
      * Promise for textLayer rendering task completion.
      * @type {Promise<void>}
      */
    def promise: js.Promise[Unit] = js.native
  }
  
  inline def renderTextLayer(renderParameters: TextLayerRenderParameters): TextLayerRenderTask = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTextLayer")(renderParameters.asInstanceOf[js.Any]).asInstanceOf[TextLayerRenderTask]
  
  trait TextLayerRenderParameters extends StObject {
    
    /**
      * - The DOM node that
      * will contain the text runs.
      */
    var container: DocumentFragment | HTMLElement
    
    /**
      * - Whether to turn on the text
      * selection enhancement.
      */
    var enhanceTextSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Text content to
      * render (the object is returned by the page's `getTextContent` method).
      */
    var textContent: js.UndefOr[TextContent] = js.undefined
    
    /**
      * - Strings that correspond to
      * the `str` property of the text items of the textContent input.
      * This is output and shall initially be set to an empty array.
      */
    var textContentItemsStr: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * - Text content stream to
      * render (the stream is returned by the page's `streamTextContent` method).
      */
    var textContentStream: js.UndefOr[ReadableStream[Any]] = js.undefined
    
    /**
      * - HTML elements that correspond to
      * the text items of the textContent input.
      * This is output and shall initially be set to an empty array.
      */
    var textDivs: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /**
      * - Delay in milliseconds before rendering of the
      * text runs occurs.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * - The target
      * viewport to properly layout the text runs.
      */
    var viewport: PageViewport
  }
  object TextLayerRenderParameters {
    
    inline def apply(container: DocumentFragment | HTMLElement, viewport: PageViewport): TextLayerRenderParameters = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerRenderParameters]
    }
    
    extension [Self <: TextLayerRenderParameters](x: Self) {
      
      inline def setContainer(value: DocumentFragment | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setEnhanceTextSelection(value: Boolean): Self = StObject.set(x, "enhanceTextSelection", value.asInstanceOf[js.Any])
      
      inline def setEnhanceTextSelectionUndefined: Self = StObject.set(x, "enhanceTextSelection", js.undefined)
      
      inline def setTextContent(value: TextContent): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentItemsStr(value: js.Array[String]): Self = StObject.set(x, "textContentItemsStr", value.asInstanceOf[js.Any])
      
      inline def setTextContentItemsStrUndefined: Self = StObject.set(x, "textContentItemsStr", js.undefined)
      
      inline def setTextContentItemsStrVarargs(value: String*): Self = StObject.set(x, "textContentItemsStr", js.Array(value*))
      
      inline def setTextContentStream(value: ReadableStream[Any]): Self = StObject.set(x, "textContentStream", value.asInstanceOf[js.Any])
      
      inline def setTextContentStreamUndefined: Self = StObject.set(x, "textContentStream", js.undefined)
      
      inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      inline def setTextDivs(value: js.Array[HTMLElement]): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
      
      inline def setTextDivsUndefined: Self = StObject.set(x, "textDivs", js.undefined)
      
      inline def setTextDivsVarargs(value: HTMLElement*): Self = StObject.set(x, "textDivs", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
