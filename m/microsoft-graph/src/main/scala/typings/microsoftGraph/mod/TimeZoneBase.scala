package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneBase extends js.Object {
  /**
    * The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian Standard Time', or 'Customized
    * Time Zone' for a custom time zone.
    */
  var name: js.UndefOr[String] = js.undefined
}

object TimeZoneBase {
  @scala.inline
  def apply(name: String = null): TimeZoneBase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneBase]
  }
}

