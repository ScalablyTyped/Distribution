package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.Asterisk
import typings.pdfmake.pdfmakeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  var body: js.Array[js.Array[TableCell]]
  
  var dontBreakRows: js.UndefOr[Boolean] = js.undefined
  
  var headerRows: js.UndefOr[Double] = js.undefined
  
  var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.undefined
  
  var keepWithHeaderRows: js.UndefOr[Double] = js.undefined
  
  var layout: js.UndefOr[TableLayout] = js.undefined
  
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.undefined
}
object Table {
  
  inline def apply(body: js.Array[js.Array[TableCell]]): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setBody(value: js.Array[js.Array[TableCell]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: js.Array[TableCell]*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
    
    inline def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
    
    inline def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
    
    inline def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
    
    inline def setHeightsFunction1(value: /* row */ Double => Double | auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
    
    inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
    
    inline def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
    
    inline def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
    
    inline def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
    
    inline def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    inline def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value :_*))
  }
}
