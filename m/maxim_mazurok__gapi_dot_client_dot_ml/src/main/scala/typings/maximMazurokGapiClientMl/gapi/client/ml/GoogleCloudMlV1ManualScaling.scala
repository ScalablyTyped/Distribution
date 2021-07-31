package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ManualScaling extends StObject {
  
  /**
    * The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to
    * `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1ManualScaling {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ManualScaling]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ManualScalingMutableBuilder[Self <: GoogleCloudMlV1ManualScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
