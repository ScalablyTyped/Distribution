package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
           * Key size in bits
           */
  var modulusLength: scala.Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_TypePkcs1Pkcs8
  /**
           * @default 0x10001
           */
  var publicExponent: js.UndefOr[scala.Double] = js.undefined
  var publicKeyEncoding: nodeLib.Anon_TypePkcs1[PubF]
}

