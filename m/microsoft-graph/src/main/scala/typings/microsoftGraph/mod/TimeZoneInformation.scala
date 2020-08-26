package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneInformation extends js.Object {
  // An identifier for the time zone.
  var alias: js.UndefOr[String] = js.native
  // A display string that represents the time zone.
  var displayName: js.UndefOr[String] = js.native
}

object TimeZoneInformation {
  @scala.inline
  def apply(): TimeZoneInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneInformation]
  }
  @scala.inline
  implicit class TimeZoneInformationOps[Self <: TimeZoneInformation] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

