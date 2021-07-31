package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyParametersRequest extends StObject {
  
  /**
    * Whether to apply instance-level parameter group to all nodes. If set to true, will explicitly restrict users from specifying any nodes, and apply parameter group updates to all
    * nodes within the instance.
    */
  var applyAll: js.UndefOr[Boolean] = js.undefined
  
  /** Nodes to which we should apply the instance-level parameter group. */
  var nodeIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ApplyParametersRequest {
  
  @scala.inline
  def apply(): ApplyParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyParametersRequest]
  }
  
  @scala.inline
  implicit class ApplyParametersRequestMutableBuilder[Self <: ApplyParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyAll(value: Boolean): Self = StObject.set(x, "applyAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyAllUndefined: Self = StObject.set(x, "applyAll", js.undefined)
    
    @scala.inline
    def setNodeIds(value: js.Array[String]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsUndefined: Self = StObject.set(x, "nodeIds", js.undefined)
    
    @scala.inline
    def setNodeIdsVarargs(value: String*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
