package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: java.lang.String
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs8Sec1
  var publicKeyEncoding: nodeLib.Anon_Format[PubF]
}

object ECKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    namedCurve: java.lang.String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs8Sec1,
    publicKeyEncoding: nodeLib.Anon_Format[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve, privateKeyEncoding = privateKeyEncoding, publicKeyEncoding = publicKeyEncoding)
  
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
}

