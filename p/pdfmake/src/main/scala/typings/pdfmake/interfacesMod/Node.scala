package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.HorizontalRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var canvas: js.UndefOr[CanvasElement] = js.undefined
  
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  var headlineLevel: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var ol: js.UndefOr[js.Array[OrderedListElement]] = js.undefined
  
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  var pageNumbers: js.Array[Double]
  
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  var pages: Double
  
  var qr: js.UndefOr[String] = js.undefined
  
  var stack: Boolean
  
  var startPosition: HorizontalRatio
  
  var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  
  var svg: js.UndefOr[String] = js.undefined
  
  var table: js.UndefOr[Table] = js.undefined
  
  var text: js.UndefOr[Content] = js.undefined
  
  var ul: js.UndefOr[js.Array[UnorderedListElement]] = js.undefined
}
object Node {
  
  @scala.inline
  def apply(pageNumbers: js.Array[Double], pages: Double, stack: Boolean, startPosition: HorizontalRatio): Node = {
    val __obj = js.Dynamic.literal(pageNumbers = pageNumbers.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: CanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOl(value: js.Array[OrderedListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
    
    @scala.inline
    def setOlVarargs(value: OrderedListElement*): Self = StObject.set(x, "ol", js.Array(value :_*))
    
    @scala.inline
    def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    @scala.inline
    def setPageNumbers(value: js.Array[Double]): Self = StObject.set(x, "pageNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumbersVarargs(value: Double*): Self = StObject.set(x, "pageNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr(value: String): Self = StObject.set(x, "qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQrUndefined: Self = StObject.set(x, "qr", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: HorizontalRatio): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUl(value: js.Array[UnorderedListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    
    @scala.inline
    def setUlVarargs(value: UnorderedListElement*): Self = StObject.set(x, "ul", js.Array(value :_*))
  }
}
