package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyParametersRequest extends StObject {
  
  /**
    * Whether to apply instance-level parameter group to all nodes. If set to true, users are restricted from specifying individual nodes, and `ApplyParameters` updates all nodes within
    * the instance.
    */
  var applyAll: js.UndefOr[Boolean] = js.undefined
  
  /** Nodes to which the instance-level parameter group is applied. */
  var nodeIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ApplyParametersRequest {
  
  inline def apply(): ApplyParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyParametersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyParametersRequest] (val x: Self) extends AnyVal {
    
    inline def setApplyAll(value: Boolean): Self = StObject.set(x, "applyAll", value.asInstanceOf[js.Any])
    
    inline def setApplyAllUndefined: Self = StObject.set(x, "applyAll", js.undefined)
    
    inline def setNodeIds(value: js.Array[String]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsUndefined: Self = StObject.set(x, "nodeIds", js.undefined)
    
    inline def setNodeIdsVarargs(value: String*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
