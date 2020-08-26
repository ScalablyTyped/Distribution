package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedMobileApp extends Entity {
  // The identifier for an app with it's operating system type.
  var mobileAppIdentifier: js.UndefOr[MobileAppIdentifier] = js.native
  // Version of the entity.
  var version: js.UndefOr[String] = js.native
}

object ManagedMobileApp {
  @scala.inline
  def apply(): ManagedMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedMobileApp]
  }
  @scala.inline
  implicit class ManagedMobileAppOps[Self <: ManagedMobileApp] (val x: Self) extends AnyVal {
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
    def setMobileAppIdentifier(value: MobileAppIdentifier): Self = this.set("mobileAppIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppIdentifier: Self = this.set("mobileAppIdentifier", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

