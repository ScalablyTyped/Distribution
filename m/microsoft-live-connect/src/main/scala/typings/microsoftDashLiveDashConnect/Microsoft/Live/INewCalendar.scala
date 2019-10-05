package typings.microsoftDashLiveDashConnect.Microsoft.Live

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name of the calendar.
    */
  var name: String
}

object INewCalendar {
  @scala.inline
  def apply(name: String, description: String = null): INewCalendar = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[INewCalendar]
  }
}

