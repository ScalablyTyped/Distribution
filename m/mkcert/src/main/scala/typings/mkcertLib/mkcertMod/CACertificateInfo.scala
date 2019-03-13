package typings
package mkcertLib.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CACertificateInfo extends js.Object {
  var countryCode: java.lang.String
  var locality: java.lang.String
  var organization: java.lang.String
  var state: java.lang.String
  var validityDays: scala.Double
}

object CACertificateInfo {
  @scala.inline
  def apply(
    countryCode: java.lang.String,
    locality: java.lang.String,
    organization: java.lang.String,
    state: java.lang.String,
    validityDays: scala.Double
  ): CACertificateInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode, locality = locality, organization = organization, state = state, validityDays = validityDays)
  
    __obj.asInstanceOf[CACertificateInfo]
  }
}

