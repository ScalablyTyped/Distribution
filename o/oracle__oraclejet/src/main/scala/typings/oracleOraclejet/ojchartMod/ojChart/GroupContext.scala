package typings.oracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait GroupContext extends js.Object {
  
  var indexPath: js.Array[_] = js.native
  
  var subId: String = js.native
}
object GroupContext {
  
  @scala.inline
  def apply(indexPath: js.Array[_], subId: String): GroupContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContext]
  }
  
  @scala.inline
  implicit class GroupContextOps[Self <: GroupContext] (val x: Self) extends AnyVal {
    
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
    def setIndexPathVarargs(value: js.Any*): Self = this.set("indexPath", js.Array(value :_*))
    
    @scala.inline
    def setIndexPath(value: js.Array[_]): Self = this.set("indexPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: String): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
}
