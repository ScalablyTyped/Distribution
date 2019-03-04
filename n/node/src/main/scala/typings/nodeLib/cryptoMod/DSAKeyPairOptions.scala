package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: scala.Double
  /**
    * Key size in bits
    */
  var modulusLength: scala.Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs8
  var publicKeyEncoding: nodeLib.Anon_FormatSpki[PubF]
}

object DSAKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    divisorLength: scala.Double,
    modulusLength: scala.Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs8,
    publicKeyEncoding: nodeLib.Anon_FormatSpki[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength, modulusLength = modulusLength, privateKeyEncoding = privateKeyEncoding, publicKeyEncoding = publicKeyEncoding)
  
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
}

