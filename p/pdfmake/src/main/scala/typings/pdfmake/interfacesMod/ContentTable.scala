package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTable
  extends StObject
     with ContentBase
     with _Content {
  
  var layout: js.UndefOr[TableLayout] = js.undefined
  
  var table: Table
}
object ContentTable {
  
  inline def apply(table: Table): ContentTable = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTable]
  }
  
  extension [Self <: ContentTable](x: Self) {
    
    inline def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
