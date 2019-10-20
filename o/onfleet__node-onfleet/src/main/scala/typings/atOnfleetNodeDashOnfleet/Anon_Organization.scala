package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Organization extends js.Object {
  var organization: String
  var `type`: String
}

object Anon_Organization {
  @scala.inline
  def apply(organization: String, `type`: String): Anon_Organization = {
    val __obj = js.Dynamic.literal(organization = organization)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Organization]
  }
}

