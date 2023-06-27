package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationTaskExecution extends StObject {
  
  var activityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  var countEntitled: js.UndefOr[Double] = js.undefined
  
  var countEntitledForProvisioning: js.UndefOr[Double] = js.undefined
  
  var countEscrowed: js.UndefOr[Double] = js.undefined
  
  var countEscrowedRaw: js.UndefOr[Double] = js.undefined
  
  var countExported: js.UndefOr[Double] = js.undefined
  
  var countExports: js.UndefOr[Double] = js.undefined
  
  var countImported: js.UndefOr[Double] = js.undefined
  
  var countImportedDeltas: js.UndefOr[Double] = js.undefined
  
  var countImportedReferenceDeltas: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[NullableOption[SynchronizationError]] = js.undefined
  
  var state: js.UndefOr[SynchronizationTaskExecutionResult] = js.undefined
  
  var timeBegan: js.UndefOr[String] = js.undefined
  
  var timeEnded: js.UndefOr[String] = js.undefined
}
object SynchronizationTaskExecution {
  
  inline def apply(): SynchronizationTaskExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationTaskExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationTaskExecution] (val x: Self) extends AnyVal {
    
    inline def setActivityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "activityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setActivityIdentifierNull: Self = StObject.set(x, "activityIdentifier", null)
    
    inline def setActivityIdentifierUndefined: Self = StObject.set(x, "activityIdentifier", js.undefined)
    
    inline def setCountEntitled(value: Double): Self = StObject.set(x, "countEntitled", value.asInstanceOf[js.Any])
    
    inline def setCountEntitledForProvisioning(value: Double): Self = StObject.set(x, "countEntitledForProvisioning", value.asInstanceOf[js.Any])
    
    inline def setCountEntitledForProvisioningUndefined: Self = StObject.set(x, "countEntitledForProvisioning", js.undefined)
    
    inline def setCountEntitledUndefined: Self = StObject.set(x, "countEntitled", js.undefined)
    
    inline def setCountEscrowed(value: Double): Self = StObject.set(x, "countEscrowed", value.asInstanceOf[js.Any])
    
    inline def setCountEscrowedRaw(value: Double): Self = StObject.set(x, "countEscrowedRaw", value.asInstanceOf[js.Any])
    
    inline def setCountEscrowedRawUndefined: Self = StObject.set(x, "countEscrowedRaw", js.undefined)
    
    inline def setCountEscrowedUndefined: Self = StObject.set(x, "countEscrowed", js.undefined)
    
    inline def setCountExported(value: Double): Self = StObject.set(x, "countExported", value.asInstanceOf[js.Any])
    
    inline def setCountExportedUndefined: Self = StObject.set(x, "countExported", js.undefined)
    
    inline def setCountExports(value: Double): Self = StObject.set(x, "countExports", value.asInstanceOf[js.Any])
    
    inline def setCountExportsUndefined: Self = StObject.set(x, "countExports", js.undefined)
    
    inline def setCountImported(value: Double): Self = StObject.set(x, "countImported", value.asInstanceOf[js.Any])
    
    inline def setCountImportedDeltas(value: Double): Self = StObject.set(x, "countImportedDeltas", value.asInstanceOf[js.Any])
    
    inline def setCountImportedDeltasUndefined: Self = StObject.set(x, "countImportedDeltas", js.undefined)
    
    inline def setCountImportedReferenceDeltas(value: Double): Self = StObject.set(x, "countImportedReferenceDeltas", value.asInstanceOf[js.Any])
    
    inline def setCountImportedReferenceDeltasUndefined: Self = StObject.set(x, "countImportedReferenceDeltas", js.undefined)
    
    inline def setCountImportedUndefined: Self = StObject.set(x, "countImported", js.undefined)
    
    inline def setError(value: NullableOption[SynchronizationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: SynchronizationTaskExecutionResult): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeBegan(value: String): Self = StObject.set(x, "timeBegan", value.asInstanceOf[js.Any])
    
    inline def setTimeBeganUndefined: Self = StObject.set(x, "timeBegan", js.undefined)
    
    inline def setTimeEnded(value: String): Self = StObject.set(x, "timeEnded", value.asInstanceOf[js.Any])
    
    inline def setTimeEndedUndefined: Self = StObject.set(x, "timeEnded", js.undefined)
  }
}
