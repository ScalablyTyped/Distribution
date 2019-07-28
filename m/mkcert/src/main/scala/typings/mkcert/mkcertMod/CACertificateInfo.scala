package typings.mkcert.mkcertMod

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
    val __obj = js.Dynamic.literal(countryCode = countryCode, locality = locality, organization = organization, state = state, validityDays = validityDays)
  
    __obj.asInstanceOf[CACertificateInfo]
  }
}

