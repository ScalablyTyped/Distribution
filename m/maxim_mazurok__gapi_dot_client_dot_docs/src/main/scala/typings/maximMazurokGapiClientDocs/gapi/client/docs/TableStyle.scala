package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStyle extends StObject {
  
  /** The properties of each column. Note that in Docs, tables contain rows and rows contain cells, similar to HTML. So the properties for a row can be found on the row's table_row_style. */
  var tableColumnProperties: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
}
object TableStyle {
  
  inline def apply(): TableStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyle]
  }
  
  extension [Self <: TableStyle](x: Self) {
    
    inline def setTableColumnProperties(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    inline def setTableColumnPropertiesVarargs(value: TableColumnProperties*): Self = StObject.set(x, "tableColumnProperties", js.Array(value*))
  }
}
