package typings.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrganization extends js.Object {
  var organization: String
  var `type`: String
}

object AnonOrganization {
  @scala.inline
  def apply(organization: String, `type`: String): AnonOrganization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrganization]
  }
}

