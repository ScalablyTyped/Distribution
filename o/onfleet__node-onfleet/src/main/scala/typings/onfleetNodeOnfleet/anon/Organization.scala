package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var organization: String
  var `type`: String
}

object Organization {
  @scala.inline
  def apply(organization: String, `type`: String): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

