package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMappingStatus extends js.Object {
  
  /** Array of observed DomainMappingConditions, indicating the current state of the DomainMapping. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.native
  
  /** The name of the route that the mapping currently points to. */
  var mappedRouteName: js.UndefOr[String] = js.native
  
  /**
    * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until
    * observedGeneration = metadata.generation and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain
    * mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[ResourceRecord]] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping. +optional */
  var url: js.UndefOr[String] = js.native
}
object DomainMappingStatus {
  
  @scala.inline
  def apply(): DomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMappingStatus]
  }
  
  @scala.inline
  implicit class DomainMappingStatusOps[Self <: DomainMappingStatus] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setMappedRouteName(value: String): Self = this.set("mappedRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappedRouteName: Self = this.set("mappedRouteName", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    
    @scala.inline
    def setResourceRecordsVarargs(value: ResourceRecord*): Self = this.set("resourceRecords", js.Array(value :_*))
    
    @scala.inline
    def setResourceRecords(value: js.Array[ResourceRecord]): Self = this.set("resourceRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecords: Self = this.set("resourceRecords", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
