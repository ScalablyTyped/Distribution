package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactAddress extends js.Object {
  var country: java.lang.String
  var formatted: java.lang.String
  var locality: java.lang.String
  var postalCode: java.lang.String
  var pref: scala.Boolean
  var region: java.lang.String
  var streetAddress: java.lang.String
  var `type`: java.lang.String
}

object ContactAddress {
  @scala.inline
  def apply(
    country: java.lang.String,
    formatted: java.lang.String,
    locality: java.lang.String,
    postalCode: java.lang.String,
    pref: scala.Boolean,
    region: java.lang.String,
    streetAddress: java.lang.String,
    `type`: java.lang.String
  ): ContactAddress = {
    val __obj = js.Dynamic.literal(country = country, formatted = formatted, locality = locality, postalCode = postalCode, pref = pref, region = region, streetAddress = streetAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContactAddress]
  }
}

