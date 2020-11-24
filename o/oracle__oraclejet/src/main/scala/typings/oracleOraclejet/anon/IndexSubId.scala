package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-footer`
import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-header`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSubId extends js.Object {
  
  var index: Double = js.native
  
  var subId: `oj-table-footer` | `oj-table-header` = js.native
}
object IndexSubId {
  
  @scala.inline
  def apply(index: Double, subId: `oj-table-footer` | `oj-table-header`): IndexSubId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSubId]
  }
  
  @scala.inline
  implicit class IndexSubIdOps[Self <: IndexSubId] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: `oj-table-footer` | `oj-table-header`): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
}
