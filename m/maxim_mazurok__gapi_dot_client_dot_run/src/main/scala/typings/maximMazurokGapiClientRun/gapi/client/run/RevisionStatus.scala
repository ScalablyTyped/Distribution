package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionStatus extends StObject {
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. As a Revision is being
    * prepared, it will incrementally update conditions. Revision-specific conditions include: * "ResourcesAvailable": True when underlying resources have been provisioned. *
    * "ContainerHealthy": True when the Revision readiness check completes. * "Active": True when the Revision may receive traffic.
    */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * ImageDigest holds the resolved digest for the image specified within .Spec.Container.Image. The digest is resolved during the creation of Revision. This field holds the digest value
    * regardless of whether a tag or digest was originally specified in the Container object.
    */
  var imageDigest: js.UndefOr[String] = js.undefined
  
  /** Specifies the generated logging url for this particular revision based on the revision url template specified in the controller's config. +optional */
  var logUrl: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Revision that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration =
    * metadata.generation, and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
  
  /** Not currently used by Cloud Run. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object RevisionStatus {
  
  @scala.inline
  def apply(): RevisionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionStatus]
  }
  
  @scala.inline
  implicit class RevisionStatusMutableBuilder[Self <: RevisionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
