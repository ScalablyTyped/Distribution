package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedMobileApp extends Entity {
  // The identifier for an app with it's operating system type.
  var mobileAppIdentifier: js.UndefOr[MobileAppIdentifier] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object ManagedMobileApp {
  @scala.inline
  def apply(id: String = null, mobileAppIdentifier: MobileAppIdentifier = null, version: String = null): ManagedMobileApp = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mobileAppIdentifier != null) __obj.updateDynamic("mobileAppIdentifier")(mobileAppIdentifier)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedMobileApp]
  }
}

