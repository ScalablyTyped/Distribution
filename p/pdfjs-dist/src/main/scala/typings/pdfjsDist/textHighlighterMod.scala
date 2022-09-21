package typings.pdfjsDist

import typings.pdfjsDist.anon.Begin
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textHighlighterMod {
  
  @JSImport("pdfjs-dist/types/web/text_highlighter", "TextHighlighter")
  @js.native
  open class TextHighlighter protected () extends StObject {
    /**
      * @param {TextHighlighterOptions} options
      */
    def this(hasFindControllerEventBusPageIndex: TextHighlighterOptions) = this()
    
    def _convertMatches(matches: Any, matchesLength: Any): js.Array[Begin] = js.native
    
    var _onUpdateTextLayerMatches: (js.Function1[/* evt */ Any, Unit]) | Null = js.native
    
    def _renderMatches(matches: Any): Unit = js.native
    
    def _updateMatches(): Unit = js.native
    
    def disable(): Unit = js.native
    
    /**
      * Start listening for events to update the highlighter and check if there are
      * any current matches that need be highlighted.
      */
    def enable(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    var eventBus: typings.pdfjsDist.eventUtilsMod.EventBus = js.native
    
    var findController: typings.pdfjsDist.pdfFindControllerMod.PDFFindController = js.native
    
    var matches: js.Array[Any] = js.native
    
    var pageIdx: Double = js.native
    
    /**
      * Store two arrays that will map DOM nodes to text they should contain.
      * The arrays should be of equal length and the array element at each index
      * should correspond to the other. e.g.
      * `items[0] = "<span>Item 0</span>" and texts[0] = "Item 0";
      *
      * @param {Array<Node>} divs
      * @param {Array<string>} texts
      */
    def setTextMapping(divs: js.Array[Node], texts: js.Array[String]): Unit = js.native
    
    var textContentItemsStr: js.Array[String] | Null = js.native
    
    var textDivs: js.Array[Node] | Null = js.native
  }
  
  type EventBus = typings.pdfjsDist.eventUtilsMod.EventBus
  
  type PDFFindController = typings.pdfjsDist.pdfFindControllerMod.PDFFindController
  
  trait TextHighlighterOptions extends StObject {
    
    /**
      * - The application event bus.
      */
    var eventBus: EventBus
    
    var findController: PDFFindController
    
    /**
      * - The page index.
      */
    var pageIndex: Double
  }
  object TextHighlighterOptions {
    
    inline def apply(eventBus: EventBus, findController: PDFFindController, pageIndex: Double): TextHighlighterOptions = {
      val __obj = js.Dynamic.literal(eventBus = eventBus.asInstanceOf[js.Any], findController = findController.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextHighlighterOptions]
    }
    
    extension [Self <: TextHighlighterOptions](x: Self) {
      
      inline def setEventBus(value: EventBus): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
      
      inline def setFindController(value: PDFFindController): Self = StObject.set(x, "findController", value.asInstanceOf[js.Any])
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    }
  }
}
