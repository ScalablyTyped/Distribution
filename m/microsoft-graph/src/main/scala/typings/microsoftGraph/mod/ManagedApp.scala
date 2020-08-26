package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedApp extends MobileApp {
  // The Application's availability. Possible values are: global, lineOfBusiness.
  var appAvailability: js.UndefOr[ManagedAppAvailability] = js.native
  // The Application's version.
  var version: js.UndefOr[String] = js.native
}

object ManagedApp {
  @scala.inline
  def apply(): ManagedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedApp]
  }
  @scala.inline
  implicit class ManagedAppOps[Self <: ManagedApp] (val x: Self) extends AnyVal {
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
    def setAppAvailability(value: ManagedAppAvailability): Self = this.set("appAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppAvailability: Self = this.set("appAvailability", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

