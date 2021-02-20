package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.Asterisk
import typings.pdfmake.pdfmakeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  var body: js.Array[js.Array[TableCell]] = js.native
  
  var dontBreakRows: js.UndefOr[Boolean] = js.native
  
  var headerRows: js.UndefOr[Double] = js.native
  
  var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.native
  
  var keepWithHeaderRows: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[TableLayout] = js.native
  
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.native
}
object Table {
  
  @scala.inline
  def apply(body: js.Array[js.Array[TableCell]]): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[js.Array[TableCell]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: js.Array[TableCell]*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
    
    @scala.inline
    def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
    
    @scala.inline
    def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightsFunction1(value: /* row */ Double => Double | auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
    
    @scala.inline
    def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
    
    @scala.inline
    def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
    
    @scala.inline
    def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    @scala.inline
    def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value :_*))
  }
}
