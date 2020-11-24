package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyle extends js.Object {
  
  /** The properties of each column. Note that in Docs, tables contain rows and rows contain cells, similar to HTML. So the properties for a row can be found on the row's table_row_style. */
  var tableColumnProperties: js.UndefOr[js.Array[TableColumnProperties]] = js.native
}
object TableStyle {
  
  @scala.inline
  def apply(): TableStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyle]
  }
  
  @scala.inline
  implicit class TableStyleOps[Self <: TableStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableColumnPropertiesVarargs(value: TableColumnProperties*): Self = this.set("tableColumnProperties", js.Array(value :_*))
    
    @scala.inline
    def setTableColumnProperties(value: js.Array[TableColumnProperties]): Self = this.set("tableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableColumnProperties: Self = this.set("tableColumnProperties", js.undefined)
  }
}
