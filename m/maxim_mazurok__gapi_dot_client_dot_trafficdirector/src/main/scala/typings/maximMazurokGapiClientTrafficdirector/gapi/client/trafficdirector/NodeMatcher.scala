package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMatcher extends js.Object {
  
  /** Specifies match criteria on the node id. */
  var nodeId: js.UndefOr[StringMatcher] = js.native
  
  /** Specifies match criteria on the node metadata. */
  var nodeMetadatas: js.UndefOr[js.Array[StructMatcher]] = js.native
}
object NodeMatcher {
  
  @scala.inline
  def apply(): NodeMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeMatcher]
  }
  
  @scala.inline
  implicit class NodeMatcherOps[Self <: NodeMatcher] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: StringMatcher): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setNodeMetadatasVarargs(value: StructMatcher*): Self = this.set("nodeMetadatas", js.Array(value :_*))
    
    @scala.inline
    def setNodeMetadatas(value: js.Array[StructMatcher]): Self = this.set("nodeMetadatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeMetadatas: Self = this.set("nodeMetadatas", js.undefined)
  }
}
