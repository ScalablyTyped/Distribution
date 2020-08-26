package typings.otplibCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyURIOptions extends js.Object {
  var accountName: String = js.native
  var algorithm: js.UndefOr[HashAlgorithms] = js.native
  var counter: js.UndefOr[Double] = js.native
  var digits: js.UndefOr[Double] = js.native
  var issuer: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var secret: SecretKey = js.native
  var step: js.UndefOr[Double] = js.native
  var `type`: Strategy = js.native
}

object KeyURIOptions {
  @scala.inline
  def apply(accountName: String, secret: SecretKey, `type`: Strategy): KeyURIOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyURIOptions]
  }
  @scala.inline
  implicit class KeyURIOptionsOps[Self <: KeyURIOptions] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: SecretKey): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Strategy): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgorithm(value: HashAlgorithms): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

