package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyParametersRequest extends js.Object {
  
  /**
    * Whether to apply instance-level parameter group to all nodes. If set to true, will explicitly restrict users from specifying any nodes, and apply parameter group updates to all
    * nodes within the instance.
    */
  var applyAll: js.UndefOr[Boolean] = js.native
  
  /** Nodes to which we should apply the instance-level parameter group. */
  var nodeIds: js.UndefOr[js.Array[String]] = js.native
}
object ApplyParametersRequest {
  
  @scala.inline
  def apply(): ApplyParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyParametersRequest]
  }
  
  @scala.inline
  implicit class ApplyParametersRequestOps[Self <: ApplyParametersRequest] (val x: Self) extends AnyVal {
    
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
    def setApplyAll(value: Boolean): Self = this.set("applyAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyAll: Self = this.set("applyAll", js.undefined)
    
    @scala.inline
    def setNodeIdsVarargs(value: String*): Self = this.set("nodeIds", js.Array(value :_*))
    
    @scala.inline
    def setNodeIds(value: js.Array[String]): Self = this.set("nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIds: Self = this.set("nodeIds", js.undefined)
  }
}
