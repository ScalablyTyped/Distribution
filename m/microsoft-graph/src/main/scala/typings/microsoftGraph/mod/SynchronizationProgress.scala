package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationProgress extends StObject {
  
  var completedUnits: js.UndefOr[Double] = js.undefined
  
  var progressObservationDateTime: js.UndefOr[String] = js.undefined
  
  var totalUnits: js.UndefOr[Double] = js.undefined
  
  var units: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationProgress {
  
  inline def apply(): SynchronizationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationProgress] (val x: Self) extends AnyVal {
    
    inline def setCompletedUnits(value: Double): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    inline def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    inline def setProgressObservationDateTime(value: String): Self = StObject.set(x, "progressObservationDateTime", value.asInstanceOf[js.Any])
    
    inline def setProgressObservationDateTimeUndefined: Self = StObject.set(x, "progressObservationDateTime", js.undefined)
    
    inline def setTotalUnits(value: Double): Self = StObject.set(x, "totalUnits", value.asInstanceOf[js.Any])
    
    inline def setTotalUnitsUndefined: Self = StObject.set(x, "totalUnits", js.undefined)
    
    inline def setUnits(value: NullableOption[String]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
