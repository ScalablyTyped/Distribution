package typings.nodeRsa.mod

import typings.node.Buffer
import typings.nodeRsa.nodeRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedEncryptionSchemePKCS1OAEP extends AdvancedEncryptionScheme {
  var hash: HashingAlgorithm = js.native
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm, Buffer]
  ] = js.native
  var scheme: pkcs1_oaep = js.native
}

object AdvancedEncryptionSchemePKCS1OAEP {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1_oaep): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
  @scala.inline
  implicit class AdvancedEncryptionSchemePKCS1OAEPOps[Self <: AdvancedEncryptionSchemePKCS1OAEP] (val x: Self) extends AnyVal {
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
    def setHash(value: HashingAlgorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: pkcs1_oaep): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setMgf(value: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => Buffer): Self = this.set("mgf", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMgf: Self = this.set("mgf", js.undefined)
  }
  
}

