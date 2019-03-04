package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new calendar item.
  */
trait INewCalendar extends js.Object {
  /**
    * Description of the calendar.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the calendar.
    */
  var name: java.lang.String
}

object INewCalendar {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null): INewCalendar = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[INewCalendar]
  }
}

