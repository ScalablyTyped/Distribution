package typings.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CACertificateInfo extends js.Object {
  var countryCode: String
  var locality: String
  var organization: String
  var state: String
  var validityDays: Double
}

object CACertificateInfo {
  @scala.inline
  def apply(countryCode: String, locality: String, organization: String, state: String, validityDays: Double): CACertificateInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CACertificateInfo]
  }
}

