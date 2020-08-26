package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type = js.native
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.native
  var publicKeyEncoding: Format[PubF] = js.native
}

object RSAKeyPairOptions {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ PubF, /* <: typings.node.cryptoMod.KeyFormat */ PrivF](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type,
    publicKeyEncoding: Format[PubF]
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class RSAKeyPairOptionsOps[Self <: RSAKeyPairOptions[_, _], /* <: typings.node.cryptoMod.KeyFormat */ PubF, /* <: typings.node.cryptoMod.KeyFormat */ PrivF] (val x: Self with (RSAKeyPairOptions[PubF, PrivF])) extends AnyVal {
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
    def setModulusLength(value: Double): Self = this.set("modulusLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with Type): Self = this.set("privateKeyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeyEncoding(value: Format[PubF]): Self = this.set("publicKeyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicExponent(value: Double): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicExponent: Self = this.set("publicExponent", js.undefined)
  }
  
}

