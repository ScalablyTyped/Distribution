package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationQuarantine extends StObject {
  
  var currentBegan: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[NullableOption[SynchronizationError]] = js.undefined
  
  var nextAttempt: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[QuarantineReason] = js.undefined
  
  var seriesBegan: js.UndefOr[String] = js.undefined
  
  var seriesCount: js.UndefOr[Double] = js.undefined
}
object SynchronizationQuarantine {
  
  inline def apply(): SynchronizationQuarantine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationQuarantine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationQuarantine] (val x: Self) extends AnyVal {
    
    inline def setCurrentBegan(value: String): Self = StObject.set(x, "currentBegan", value.asInstanceOf[js.Any])
    
    inline def setCurrentBeganUndefined: Self = StObject.set(x, "currentBegan", js.undefined)
    
    inline def setError(value: NullableOption[SynchronizationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNextAttempt(value: String): Self = StObject.set(x, "nextAttempt", value.asInstanceOf[js.Any])
    
    inline def setNextAttemptUndefined: Self = StObject.set(x, "nextAttempt", js.undefined)
    
    inline def setReason(value: QuarantineReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSeriesBegan(value: String): Self = StObject.set(x, "seriesBegan", value.asInstanceOf[js.Any])
    
    inline def setSeriesBeganUndefined: Self = StObject.set(x, "seriesBegan", js.undefined)
    
    inline def setSeriesCount(value: Double): Self = StObject.set(x, "seriesCount", value.asInstanceOf[js.Any])
    
    inline def setSeriesCountUndefined: Self = StObject.set(x, "seriesCount", js.undefined)
  }
}
