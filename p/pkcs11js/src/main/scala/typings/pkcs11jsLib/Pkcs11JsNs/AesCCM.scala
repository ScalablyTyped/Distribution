package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCCM extends IParams {
  var aad: js.UndefOr[nodeLib.Buffer] = js.undefined
  var dataLen: scala.Double
  var macLen: scala.Double
  var nonce: js.UndefOr[nodeLib.Buffer] = js.undefined
}

