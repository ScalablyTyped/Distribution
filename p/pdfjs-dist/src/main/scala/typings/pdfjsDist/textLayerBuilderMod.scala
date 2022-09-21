package typings.pdfjsDist

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textLayerBuilderMod {
  
  @JSImport("pdfjs-dist/types/web/text_layer_builder", "TextLayerBuilder")
  @js.native
  open class TextLayerBuilder protected () extends StObject {
    def this(hasTextLayerDivEventBusPageIndexViewportHighlighterEnhanceTextSelectionAccessibilityManager: typings.pdfjsDist.anon.EventBus) = this()
    
    /**
      * Improves text selection by adding an additional div where the mouse was
      * clicked. This reduces flickering of the content if the mouse is slowly
      * dragged up or down.
      *
      * @private
      */
    /* private */ var _bindMouse: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _finishRendering: Any = js.native
    
    var accessibilityManager: Any = js.native
    
    /**
      * Cancel rendering of the text layer.
      */
    def cancel(): Unit = js.native
    
    var enhanceTextSelection: Boolean = js.native
    
    var eventBus: Any = js.native
    
    var highlighter: Any = js.native
    
    var pageNumber: Any = js.native
    
    /**
      * Renders the text layer.
      *
      * @param {number} [timeout] - Wait for a specified amount of milliseconds
      *                             before rendering.
      */
    def render(): Unit = js.native
    def render(timeout: Double): Unit = js.native
    
    var renderingDone: Boolean = js.native
    
    def setTextContent(textContent: Any): Unit = js.native
    
    def setTextContentStream(readableStream: Any): Unit = js.native
    
    var textContent: Any = js.native
    
    var textContentItemsStr: js.Array[Any] = js.native
    
    var textContentStream: Any = js.native
    
    var textDivs: js.Array[Any] = js.native
    
    var textLayerDiv: Any = js.native
    
    var textLayerRenderTask: Any = js.native
    
    var viewport: Any = js.native
  }
  
  type EventBus = typings.pdfjsDist.eventUtilsMod.EventBus
  
  type PageViewport = typings.pdfjsDist.displayUtilsMod.PageViewport
  
  type TextAccessibilityManager = typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
  
  type TextHighlighter = typings.pdfjsDist.textHighlighterMod.TextHighlighter
  
  trait TextLayerBuilderOptions extends StObject {
    
    var accessibilityManager: js.UndefOr[typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager] = js.undefined
    
    /**
      * - Option to turn on improved
      * text selection.
      */
    var enhanceTextSelection: Boolean
    
    /**
      * - The application event bus.
      */
    var eventBus: EventBus
    
    /**
      * - Optional object that will handle
      * highlighting text from the find controller.
      */
    var highlighter: TextHighlighter
    
    /**
      * - The page index.
      */
    var pageIndex: Double
    
    /**
      * - The text layer container.
      */
    var textLayerDiv: HTMLDivElement
    
    /**
      * - The viewport of the text layer.
      */
    var viewport: PageViewport
  }
  object TextLayerBuilderOptions {
    
    inline def apply(
      enhanceTextSelection: Boolean,
      eventBus: EventBus,
      highlighter: TextHighlighter,
      pageIndex: Double,
      textLayerDiv: HTMLDivElement,
      viewport: PageViewport
    ): TextLayerBuilderOptions = {
      val __obj = js.Dynamic.literal(enhanceTextSelection = enhanceTextSelection.asInstanceOf[js.Any], eventBus = eventBus.asInstanceOf[js.Any], highlighter = highlighter.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], textLayerDiv = textLayerDiv.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerBuilderOptions]
    }
    
    extension [Self <: TextLayerBuilderOptions](x: Self) {
      
      inline def setAccessibilityManager(value: typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
      
      inline def setEnhanceTextSelection(value: Boolean): Self = StObject.set(x, "enhanceTextSelection", value.asInstanceOf[js.Any])
      
      inline def setEventBus(value: EventBus): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
      
      inline def setHighlighter(value: TextHighlighter): Self = StObject.set(x, "highlighter", value.asInstanceOf[js.Any])
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setTextLayerDiv(value: HTMLDivElement): Self = StObject.set(x, "textLayerDiv", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
