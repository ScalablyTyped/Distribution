package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: Double = js.native
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0` = js.native
  var publicKeyEncoding: FormatType[PubF] = js.native
}

object DSAKeyPairOptions {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ PubF, /* <: typings.node.cryptoMod.KeyFormat */ PrivF](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0`,
    publicKeyEncoding: FormatType[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class DSAKeyPairOptionsOps[Self <: DSAKeyPairOptions[_, _], /* <: typings.node.cryptoMod.KeyFormat */ PubF, /* <: typings.node.cryptoMod.KeyFormat */ PrivF] (val x: Self with (DSAKeyPairOptions[PubF, PrivF])) extends AnyVal {
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
    def setDivisorLength(value: Double): Self = this.set("divisorLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulusLength(value: Double): Self = this.set("modulusLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `0`): Self = this.set("privateKeyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = this.set("publicKeyEncoding", value.asInstanceOf[js.Any])
  }
  
}

