package typings.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CACertificateInfo extends js.Object {
  var countryCode: String = js.native
  var locality: String = js.native
  var organization: String = js.native
  var state: String = js.native
  var validityDays: Double = js.native
}

object CACertificateInfo {
  @scala.inline
  def apply(countryCode: String, locality: String, organization: String, state: String, validityDays: Double): CACertificateInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CACertificateInfo]
  }
  @scala.inline
  implicit class CACertificateInfoOps[Self <: CACertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidityDays(value: Double): Self = this.set("validityDays", value.asInstanceOf[js.Any])
  }
  
}

