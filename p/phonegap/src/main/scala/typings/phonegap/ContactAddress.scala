package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactAddress extends js.Object {
  var country: String
  var formatted: String
  var locality: String
  var postalCode: String
  var pref: Boolean
  var region: String
  var streetAddress: String
  var `type`: String
}

object ContactAddress {
  @scala.inline
  def apply(
    country: String,
    formatted: String,
    locality: String,
    postalCode: String,
    pref: Boolean,
    region: String,
    streetAddress: String,
    `type`: String
  ): ContactAddress = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], pref = pref.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAddress]
  }
}

