package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGCM extends IParams {
  var aad: js.UndefOr[nodeLib.Buffer] = js.undefined
  var iv: js.UndefOr[nodeLib.Buffer] = js.undefined
  var ivBits: scala.Double
  var tagBits: scala.Double
}

