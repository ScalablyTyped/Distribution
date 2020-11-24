package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a request to create a new calendar that subscribes to the
  * given iCal calendar.
  */
@js.native
trait INewCalendarSubscription extends js.Object {
  
  /**
    * Name of the calendar.
    */
  var name: String = js.native
  
  /**
    * A public subscription URL with which Live Connect will synchronize
    * properties and events periodically for this calendar.
    */
  var subscription_location: String = js.native
}
object INewCalendarSubscription {
  
  @scala.inline
  def apply(name: String, subscription_location: String): INewCalendarSubscription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscription_location = subscription_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewCalendarSubscription]
  }
  
  @scala.inline
  implicit class INewCalendarSubscriptionOps[Self <: INewCalendarSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_location(value: String): Self = this.set("subscription_location", value.asInstanceOf[js.Any])
  }
}
