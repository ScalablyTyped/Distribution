package typings.node.cryptoMod

import typings.node.Anon_FormatSpki
import typings.node.Anon_Pkcs8
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
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs8
  var publicKeyEncoding: Anon_FormatSpki[PubF]
}

object DSAKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs8,
    publicKeyEncoding: Anon_FormatSpki[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
}

