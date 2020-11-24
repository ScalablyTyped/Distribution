package typings.maximMazurokGapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectQuery extends js.Object {
  
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.native
}
object SelectQuery {
  
  @scala.inline
  def apply(): SelectQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectQuery]
  }
  
  @scala.inline
  implicit class SelectQueryOps[Self <: SelectQuery] (val x: Self) extends AnyVal {
    
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
    def setSelectQuery(value: String): Self = this.set("selectQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectQuery: Self = this.set("selectQuery", js.undefined)
  }
}
