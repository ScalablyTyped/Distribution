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
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_TypeSec1
  var publicKeyEncoding: nodeLib.Anon_TypePkcs1[PubF]
}

