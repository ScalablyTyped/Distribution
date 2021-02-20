package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Alarm extends StObject {
    
    /** Name of this alarm. */
    var name: String = js.native
    
    /** Optional. If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
    var periodInMinutes: js.UndefOr[Double] = js.native
    
    /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
    var scheduledTime: Double = js.native
  }
  object Alarm {
    
    @scala.inline
    def apply(name: String, scheduledTime: Double): Alarm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alarm]
    }
    
    @scala.inline
    implicit class AlarmMutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      @scala.inline
      def setScheduledTime(value: Double): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlarmCreateInfo extends StObject {
    
    /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
    var delayInMinutes: js.UndefOr[Double] = js.native
    
    /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
    var periodInMinutes: js.UndefOr[Double] = js.native
    
    /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
    var when: js.UndefOr[Double] = js.native
  }
  object AlarmCreateInfo {
    
    @scala.inline
    def apply(): AlarmCreateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlarmCreateInfo]
    }
    
    @scala.inline
    implicit class AlarmCreateInfoMutableBuilder[Self <: AlarmCreateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayInMinutes(value: Double): Self = StObject.set(x, "delayInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayInMinutesUndefined: Self = StObject.set(x, "delayInMinutes", js.undefined)
      
      @scala.inline
      def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      @scala.inline
      def setWhen(value: Double): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  type AlarmEvent = Event[js.Function1[/* alarm */ typings.chrome.chrome.alarms.Alarm, Unit]]
}
