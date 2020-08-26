package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneBase extends js.Object {
  /**
    * The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian Standard Time', or 'Customized
    * Time Zone' for a custom time zone.
    */
  var name: js.UndefOr[String] = js.native
}

object TimeZoneBase {
  @scala.inline
  def apply(): TimeZoneBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneBase]
  }
  @scala.inline
  implicit class TimeZoneBaseOps[Self <: TimeZoneBase] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

