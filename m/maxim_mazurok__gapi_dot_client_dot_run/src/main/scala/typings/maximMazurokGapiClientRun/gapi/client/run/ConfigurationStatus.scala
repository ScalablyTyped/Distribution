package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationStatus extends StObject {
  
  /** Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV1Condition]] = js.undefined
  
  /** LatestCreatedRevisionName is the last revision that was created from this Configuration. It might not be ready yet, for that use LatestReadyRevisionName. */
  var latestCreatedRevisionName: js.UndefOr[String] = js.undefined
  
  /** LatestReadyRevisionName holds the name of the latest Revision stamped out from this Configuration that has had its "Ready" condition become "True". */
  var latestReadyRevisionName: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Configuration that was last processed by the controller. The observed generation is updated even if the controller failed to process
    * the spec and create the Revision. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation, and the Ready condition's status is True
    * or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
}
object ConfigurationStatus {
  
  inline def apply(): ConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationStatus]
  }
  
  extension [Self <: ConfigurationStatus](x: Self) {
    
    inline def setConditions(value: js.Array[GoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setLatestCreatedRevisionName(value: String): Self = StObject.set(x, "latestCreatedRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedRevisionNameUndefined: Self = StObject.set(x, "latestCreatedRevisionName", js.undefined)
    
    inline def setLatestReadyRevisionName(value: String): Self = StObject.set(x, "latestReadyRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestReadyRevisionNameUndefined: Self = StObject.set(x, "latestReadyRevisionName", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
