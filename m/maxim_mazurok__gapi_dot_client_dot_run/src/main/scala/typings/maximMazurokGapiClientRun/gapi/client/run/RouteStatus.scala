package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteStatus extends StObject {
  
  /** Similar to url, information on where the service is available on HTTP. */
  var address: js.UndefOr[Addressable] = js.native
  
  /** Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.native
  
  /**
    * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration =
    * metadata.generation and the Ready condition's status is True or False. Note that providing a trafficTarget that only has a configurationName will result in a Route that does not
    * increment either its metadata.generation or its observedGeneration, as new "latest ready" revisions from the Configuration are processed without an update to the Route's spec.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the
    * LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[TrafficTarget]] = js.native
  
  /** URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form: https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app */
  var url: js.UndefOr[String] = js.native
}
object RouteStatus {
  
  @scala.inline
  def apply(): RouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteStatus]
  }
  
  @scala.inline
  implicit class RouteStatusMutableBuilder[Self <: RouteStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Addressable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setTraffic(value: js.Array[TrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: TrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
