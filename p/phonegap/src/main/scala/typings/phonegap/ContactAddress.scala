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
    val __obj = js.Dynamic.literal(country = country, formatted = formatted, locality = locality, postalCode = postalCode, pref = pref, region = region, streetAddress = streetAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContactAddress]
  }
}

