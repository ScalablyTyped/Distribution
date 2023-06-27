package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationSchedule extends StObject {
  
  var expiration: js.UndefOr[NullableOption[String]] = js.undefined
  
  var interval: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[SynchronizationScheduleState] = js.undefined
}
object SynchronizationSchedule {
  
  inline def apply(): SynchronizationSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationSchedule] (val x: Self) extends AnyVal {
    
    inline def setExpiration(value: NullableOption[String]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationNull: Self = StObject.set(x, "expiration", null)
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setState(value: SynchronizationScheduleState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
