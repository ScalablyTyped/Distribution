package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a request to create a new calendar that subscribes to the
     * given iCal calendar.
     */

trait INewCalendarSubscription extends js.Object {
  /**
           * Name of the calendar.
           */
  var name: java.lang.String
  /**
           * A public subscription URL with which Live Connect will synchronize
           * properties and events periodically for this calendar.
           */
  var subscription_location: java.lang.String
}

