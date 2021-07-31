package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMappingStatus extends StObject {
  
  /** Array of observed DomainMappingConditions, indicating the current state of the DomainMapping. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.undefined
  
  /** The name of the route that the mapping currently points to. */
  var mappedRouteName: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until
    * observedGeneration = metadata.generation and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
  
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain
    * mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[ResourceRecord]] = js.undefined
  
  /** Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping. +optional */
  var url: js.UndefOr[String] = js.undefined
}
object DomainMappingStatus {
  
  @scala.inline
  def apply(): DomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMappingStatus]
  }
  
  @scala.inline
  implicit class DomainMappingStatusMutableBuilder[Self <: DomainMappingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setMappedRouteName(value: String): Self = StObject.set(x, "mappedRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappedRouteNameUndefined: Self = StObject.set(x, "mappedRouteName", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setResourceRecords(value: js.Array[ResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    @scala.inline
    def setResourceRecordsVarargs(value: ResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
