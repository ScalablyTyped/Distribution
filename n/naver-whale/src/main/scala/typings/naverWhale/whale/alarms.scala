package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Alarms
////////////////////
/**
  * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
  * Availability: Since Chrome 22.
  * Permissions:  "alarms"
  */
object alarms {
  
  trait Alarm extends StObject {
    
    /** Name of this alarm. */
    var name: String
    
    /** Optional. If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
    var periodInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
    var scheduledTime: Double
  }
  object Alarm {
    
    inline def apply(name: String, scheduledTime: Double): Alarm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alarm]
    }
    
    extension [Self <: Alarm](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setScheduledTime(value: Double): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlarmCreateInfo extends StObject {
    
    /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
    var delayInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
    var periodInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
    var when: js.UndefOr[Double] = js.undefined
  }
  object AlarmCreateInfo {
    
    inline def apply(): AlarmCreateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlarmCreateInfo]
    }
    
    extension [Self <: AlarmCreateInfo](x: Self) {
      
      inline def setDelayInMinutes(value: Double): Self = StObject.set(x, "delayInMinutes", value.asInstanceOf[js.Any])
      
      inline def setDelayInMinutesUndefined: Self = StObject.set(x, "delayInMinutes", js.undefined)
      
      inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setWhen(value: Double): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  type AlarmEvent = Event[js.Function1[/* alarm */ typings.chrome.chrome.alarms.Alarm, Unit]]
}
