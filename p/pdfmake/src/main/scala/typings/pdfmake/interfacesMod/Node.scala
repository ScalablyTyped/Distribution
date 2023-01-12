package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /** Canvas / vector elements. */
  var canvas: js.UndefOr[js.Array[CanvasElement]] = js.undefined
  
  /** Column elements. */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  /** Headline level specified on the node's content element. */
  var headlineLevel: js.UndefOr[Double] = js.undefined
  
  /** The node's ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Image URL or reference. */
  var image: js.UndefOr[String] = js.undefined
  
  /** Ordered list elements. */
  var ol: js.UndefOr[js.Array[OrderedListElement]] = js.undefined
  
  /** The node's specified page break. */
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  /** Array containing all page numbers (starting from 1) the node spans across. */
  var pageNumbers: js.Array[Double]
  
  /** Page orientation at the node's start position. */
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  /** Total number of pages in the document. */
  var pages: Double
  
  /** QR code content. */
  var qr: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the node is a {@link ContentStack}. */
  var stack: Boolean
  
  /** Start position of the node. */
  var startPosition: NodeStartPosition
  
  /** Styles or style references applied to the node. */
  var style: js.UndefOr[StyleReference] = js.undefined
  
  /** SVG image content. */
  var svg: js.UndefOr[String] = js.undefined
  
  /** Table content. */
  var table: js.UndefOr[Table] = js.undefined
  
  /** Text content. */
  var text: js.UndefOr[Content] = js.undefined
  
  /** Unordered list elements. */
  var ul: js.UndefOr[js.Array[UnorderedListElement]] = js.undefined
}
object Node {
  
  inline def apply(pageNumbers: js.Array[Double], pages: Double, stack: Boolean, startPosition: NodeStartPosition): Node = {
    val __obj = js.Dynamic.literal(pageNumbers = pageNumbers.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: js.Array[CanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setCanvasVarargs(value: CanvasElement*): Self = StObject.set(x, "canvas", js.Array(value*))
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOl(value: js.Array[OrderedListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
    
    inline def setOlVarargs(value: OrderedListElement*): Self = StObject.set(x, "ol", js.Array(value*))
    
    inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    inline def setPageNumbers(value: js.Array[Double]): Self = StObject.set(x, "pageNumbers", value.asInstanceOf[js.Any])
    
    inline def setPageNumbersVarargs(value: Double*): Self = StObject.set(x, "pageNumbers", js.Array(value*))
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setQr(value: String): Self = StObject.set(x, "qr", value.asInstanceOf[js.Any])
    
    inline def setQrUndefined: Self = StObject.set(x, "qr", js.undefined)
    
    inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: NodeStartPosition): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: (String | Style)*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: Any*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setUl(value: js.Array[UnorderedListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    
    inline def setUlVarargs(value: UnorderedListElement*): Self = StObject.set(x, "ul", js.Array(value*))
  }
}
