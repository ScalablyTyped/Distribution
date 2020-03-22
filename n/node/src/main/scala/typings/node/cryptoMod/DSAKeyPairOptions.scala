package typings.node.cryptoMod

import typings.node.Anon0
import typings.node.AnonFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: Double
  /**
    * Key size in bits
    */
  var modulusLength: Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon0
  var publicKeyEncoding: AnonFormatType[PubF]
}

object DSAKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon0,
    publicKeyEncoding: AnonFormatType[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
}

