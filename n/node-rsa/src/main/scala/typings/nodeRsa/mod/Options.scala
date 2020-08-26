package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.browser
import typings.nodeRsa.nodeRsaStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Padding scheme for encrypt/decrypt. Default is 'pkcs1_oaep'.
    */
  var encryptionScheme: js.UndefOr[EncryptionScheme | AdvancedEncryptionScheme] = js.native
  /**
    * Working environment. (auto detects by default)
    */
  var environment: js.UndefOr[browser | node] = js.native
  /**
    * scheme used for signing and verifying.. Default 'pkcs1-sha256', or, if chosen pss: 'pss-sha1'.
    */
  var signingScheme: js.UndefOr[SigningScheme | SigningSchemeHash | AdvancedSigningScheme] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEncryptionScheme(value: EncryptionScheme | AdvancedEncryptionScheme): Self = this.set("encryptionScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionScheme: Self = this.set("encryptionScheme", js.undefined)
    @scala.inline
    def setEnvironment(value: browser | node): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setSigningScheme(value: SigningScheme | SigningSchemeHash | AdvancedSigningScheme): Self = this.set("signingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningScheme: Self = this.set("signingScheme", js.undefined)
  }
  
}

