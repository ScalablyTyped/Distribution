package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBulkResult extends js.Object {
  
  var rowsAffected: Double = js.native
}
object IBulkResult {
  
  @scala.inline
  def apply(rowsAffected: Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBulkResult]
  }
  
  @scala.inline
  implicit class IBulkResultOps[Self <: IBulkResult] (val x: Self) extends AnyVal {
    
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
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
  }
}
