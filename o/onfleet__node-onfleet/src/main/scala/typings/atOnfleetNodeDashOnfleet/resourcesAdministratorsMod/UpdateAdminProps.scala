package typings.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod

import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAdminProps extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[OnfleetMetadata] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object UpdateAdminProps {
  @scala.inline
  def apply(email: String = null, metadata: OnfleetMetadata = null, name: String = null): UpdateAdminProps = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateAdminProps]
  }
}

