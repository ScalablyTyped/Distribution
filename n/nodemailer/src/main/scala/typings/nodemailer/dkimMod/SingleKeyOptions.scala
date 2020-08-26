package typings.nodemailer.dkimMod

import typings.nodemailer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleKeyOptions
  extends OptionalOptions
     with Options {
  /** is the domain name to use in the signature */
  var domainName: String = js.native
  /** is the DKIM key selector */
  var keySelector: String = js.native
  /** is the private key for the selector in PEM format */
  var privateKey: String | Key = js.native
}

object SingleKeyOptions {
  @scala.inline
  def apply(domainName: String, keySelector: String, privateKey: String | Key): SingleKeyOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleKeyOptions]
  }
  @scala.inline
  implicit class SingleKeyOptionsOps[Self <: SingleKeyOptions] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeySelector(value: String): Self = this.set("keySelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: String | Key): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
  
}

