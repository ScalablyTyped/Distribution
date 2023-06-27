package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationStatus extends StObject {
  
  var code: js.UndefOr[SynchronizationStatusCode] = js.undefined
  
  var countSuccessiveCompleteFailures: js.UndefOr[Double] = js.undefined
  
  var escrowsPruned: js.UndefOr[Boolean] = js.undefined
  
  var lastExecution: js.UndefOr[NullableOption[SynchronizationTaskExecution]] = js.undefined
  
  var lastSuccessfulExecution: js.UndefOr[NullableOption[SynchronizationTaskExecution]] = js.undefined
  
  var lastSuccessfulExecutionWithExports: js.UndefOr[NullableOption[SynchronizationTaskExecution]] = js.undefined
  
  var progress: js.UndefOr[NullableOption[js.Array[SynchronizationProgress]]] = js.undefined
  
  var quarantine: js.UndefOr[NullableOption[SynchronizationQuarantine]] = js.undefined
  
  var steadyStateFirstAchievedTime: js.UndefOr[String] = js.undefined
  
  var steadyStateLastAchievedTime: js.UndefOr[String] = js.undefined
  
  var synchronizedEntryCountByType: js.UndefOr[NullableOption[js.Array[StringKeyLongValuePair]]] = js.undefined
  
  var troubleshootingUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationStatus {
  
  inline def apply(): SynchronizationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationStatus] (val x: Self) extends AnyVal {
    
    inline def setCode(value: SynchronizationStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCountSuccessiveCompleteFailures(value: Double): Self = StObject.set(x, "countSuccessiveCompleteFailures", value.asInstanceOf[js.Any])
    
    inline def setCountSuccessiveCompleteFailuresUndefined: Self = StObject.set(x, "countSuccessiveCompleteFailures", js.undefined)
    
    inline def setEscrowsPruned(value: Boolean): Self = StObject.set(x, "escrowsPruned", value.asInstanceOf[js.Any])
    
    inline def setEscrowsPrunedUndefined: Self = StObject.set(x, "escrowsPruned", js.undefined)
    
    inline def setLastExecution(value: NullableOption[SynchronizationTaskExecution]): Self = StObject.set(x, "lastExecution", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionNull: Self = StObject.set(x, "lastExecution", null)
    
    inline def setLastExecutionUndefined: Self = StObject.set(x, "lastExecution", js.undefined)
    
    inline def setLastSuccessfulExecution(value: NullableOption[SynchronizationTaskExecution]): Self = StObject.set(x, "lastSuccessfulExecution", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulExecutionNull: Self = StObject.set(x, "lastSuccessfulExecution", null)
    
    inline def setLastSuccessfulExecutionUndefined: Self = StObject.set(x, "lastSuccessfulExecution", js.undefined)
    
    inline def setLastSuccessfulExecutionWithExports(value: NullableOption[SynchronizationTaskExecution]): Self = StObject.set(x, "lastSuccessfulExecutionWithExports", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulExecutionWithExportsNull: Self = StObject.set(x, "lastSuccessfulExecutionWithExports", null)
    
    inline def setLastSuccessfulExecutionWithExportsUndefined: Self = StObject.set(x, "lastSuccessfulExecutionWithExports", js.undefined)
    
    inline def setProgress(value: NullableOption[js.Array[SynchronizationProgress]]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: SynchronizationProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setQuarantine(value: NullableOption[SynchronizationQuarantine]): Self = StObject.set(x, "quarantine", value.asInstanceOf[js.Any])
    
    inline def setQuarantineNull: Self = StObject.set(x, "quarantine", null)
    
    inline def setQuarantineUndefined: Self = StObject.set(x, "quarantine", js.undefined)
    
    inline def setSteadyStateFirstAchievedTime(value: String): Self = StObject.set(x, "steadyStateFirstAchievedTime", value.asInstanceOf[js.Any])
    
    inline def setSteadyStateFirstAchievedTimeUndefined: Self = StObject.set(x, "steadyStateFirstAchievedTime", js.undefined)
    
    inline def setSteadyStateLastAchievedTime(value: String): Self = StObject.set(x, "steadyStateLastAchievedTime", value.asInstanceOf[js.Any])
    
    inline def setSteadyStateLastAchievedTimeUndefined: Self = StObject.set(x, "steadyStateLastAchievedTime", js.undefined)
    
    inline def setSynchronizedEntryCountByType(value: NullableOption[js.Array[StringKeyLongValuePair]]): Self = StObject.set(x, "synchronizedEntryCountByType", value.asInstanceOf[js.Any])
    
    inline def setSynchronizedEntryCountByTypeNull: Self = StObject.set(x, "synchronizedEntryCountByType", null)
    
    inline def setSynchronizedEntryCountByTypeUndefined: Self = StObject.set(x, "synchronizedEntryCountByType", js.undefined)
    
    inline def setSynchronizedEntryCountByTypeVarargs(value: StringKeyLongValuePair*): Self = StObject.set(x, "synchronizedEntryCountByType", js.Array(value*))
    
    inline def setTroubleshootingUrl(value: NullableOption[String]): Self = StObject.set(x, "troubleshootingUrl", value.asInstanceOf[js.Any])
    
    inline def setTroubleshootingUrlNull: Self = StObject.set(x, "troubleshootingUrl", null)
    
    inline def setTroubleshootingUrlUndefined: Self = StObject.set(x, "troubleshootingUrl", js.undefined)
  }
}
