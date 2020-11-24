package typings.oracleOraclejet.ojsunburstMod.ojSunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait NodeContext extends js.Object {
  
  var indexPath: js.Array[Double] = js.native
  
  var subId: String = js.native
}
object NodeContext {
  
  @scala.inline
  def apply(indexPath: js.Array[Double], subId: String): NodeContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContext]
  }
  
  @scala.inline
  implicit class NodeContextOps[Self <: NodeContext] (val x: Self) extends AnyVal {
    
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
    def setIndexPathVarargs(value: Double*): Self = this.set("indexPath", js.Array(value :_*))
    
    @scala.inline
    def setIndexPath(value: js.Array[Double]): Self = this.set("indexPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: String): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
}
