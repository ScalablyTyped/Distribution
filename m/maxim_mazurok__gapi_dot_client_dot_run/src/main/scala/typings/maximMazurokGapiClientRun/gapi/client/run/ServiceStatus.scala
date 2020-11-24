package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceStatus extends js.Object {
  
  /** From RouteStatus. Similar to url, information on where the service is available on HTTP. */
  var address: js.UndefOr[Addressable] = js.native
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. Service-specific conditions
    * include: * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true when the underlying Route is ready. * "Ready": true when both the underlying
    * Route and Configuration are ready.
    */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.native
  
  /**
    * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service's Configuration. It might not be ready yet, for that use
    * LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.native
  
  /**
    * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service's Configuration that has had its "Ready" condition become
    * "True".
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.native
  
  /**
    * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration =
    * metadata.generation and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will
    * hold the LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[TrafficTarget]] = js.native
  
  /**
    * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var url: js.UndefOr[String] = js.native
}
object ServiceStatus {
  
  @scala.inline
  def apply(): ServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Addressable): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setLatestCreatedRevisionName(value: String): Self = this.set("latestCreatedRevisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestCreatedRevisionName: Self = this.set("latestCreatedRevisionName", js.undefined)
    
    @scala.inline
    def setLatestReadyRevisionName(value: String): Self = this.set("latestReadyRevisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestReadyRevisionName: Self = this.set("latestReadyRevisionName", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: TrafficTarget*): Self = this.set("traffic", js.Array(value :_*))
    
    @scala.inline
    def setTraffic(value: js.Array[TrafficTarget]): Self = this.set("traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffic: Self = this.set("traffic", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
