package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a request to create a new calendar that subscribes to the
  * given iCal calendar.
  */
trait INewCalendarSubscription extends StObject {
  
  /**
    * Name of the calendar.
    */
  var name: String
  
  /**
    * A public subscription URL with which Live Connect will synchronize
    * properties and events periodically for this calendar.
    */
  var subscription_location: String
}
object INewCalendarSubscription {
  
  inline def apply(name: String, subscription_location: String): INewCalendarSubscription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscription_location = subscription_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewCalendarSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INewCalendarSubscription] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubscription_location(value: String): Self = StObject.set(x, "subscription_location", value.asInstanceOf[js.Any])
  }
}
