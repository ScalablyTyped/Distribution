package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pkcs12CreationOptions extends js.Object {
  var certFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cipher: js.UndefOr[PrivateKeyCipher] = js.undefined
  var clientKeyPassword: js.UndefOr[java.lang.String] = js.undefined
}

