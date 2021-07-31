package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStyle extends StObject {
  
  /** The properties of each column. Note that in Docs, tables contain rows and rows contain cells, similar to HTML. So the properties for a row can be found on the row's table_row_style. */
  var tableColumnProperties: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
}
object TableStyle {
  
  @scala.inline
  def apply(): TableStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyle]
  }
  
  @scala.inline
  implicit class TableStyleMutableBuilder[Self <: TableStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableColumnProperties(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    @scala.inline
    def setTableColumnPropertiesVarargs(value: TableColumnProperties*): Self = StObject.set(x, "tableColumnProperties", js.Array(value :_*))
  }
}
