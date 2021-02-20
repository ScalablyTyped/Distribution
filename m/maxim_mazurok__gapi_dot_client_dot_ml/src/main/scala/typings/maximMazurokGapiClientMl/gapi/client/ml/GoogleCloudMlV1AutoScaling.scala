package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AutoScaling extends StObject {
  
  /** The maximum number of nodes to scale this model under load. The actual value will depend on resource quota and availability. */
  var maxNodes: js.UndefOr[Double] = js.native
  
  /** MetricSpec contains the specifications to use to calculate the desired nodes count. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1MetricSpec]] = js.native
  
  /**
    * Optional. The minimum number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed. Therefore, the cost of operating this
    * model will be at least `rate` * `min_nodes` * number of hours since last billing cycle, where `rate` is the cost per node-hour as documented in the [pricing
    * guide](/ml-engine/docs/pricing), even if no predictions are performed. There is additional cost for each prediction performed. Unlike manual scaling, if the load gets too heavy for
    * the nodes that are up, the service will automatically add nodes to handle the increased load as well as scale back as traffic drops, always maintaining at least `min_nodes`. You
    * will be charged for the time in which additional nodes are used. If `min_nodes` is not specified and AutoScaling is used with a [legacy (MLS1) machine
    * type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 0, in which case, when traffic to a model stops (and after a cool-down period), nodes will be shut
    * down and no charges will be incurred until traffic to the model resumes. If `min_nodes` is not specified and AutoScaling is used with a [Compute Engine (N1) machine
    * type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 1. `min_nodes` must be at least 1 for use with a Compute Engine machine type. Note that you cannot
    * use AutoScaling if your version uses [GPUs](#Version.FIELDS.accelerator_config). Instead, you must use ManualScaling. You can set `min_nodes` when creating the model version, and
    * you can also update `min_nodes` for an existing version: update_body.json: { 'autoScaling': { 'minNodes': 5 } } HTTP request: PATCH
    * https://ml.googleapis.com/v1/{name=projects/∗/models/∗/versions/ *}?update_mask=autoScaling.minNodes -d @./update_body.json
    */
  var minNodes: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1AutoScaling {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutoScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutoScaling]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutoScalingMutableBuilder[Self <: GoogleCloudMlV1AutoScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNodes(value: Double): Self = StObject.set(x, "maxNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodesUndefined: Self = StObject.set(x, "maxNodes", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[GoogleCloudMlV1MetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: GoogleCloudMlV1MetricSpec*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setMinNodes(value: Double): Self = StObject.set(x, "minNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodesUndefined: Self = StObject.set(x, "minNodes", js.undefined)
  }
}
