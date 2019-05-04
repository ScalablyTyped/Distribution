package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "KeyObject")
@js.native
class KeyObject protected () extends _KeyLike {
  /**
    * For asymmetric keys, this property represents the size of the embedded key in
    * bytes. This property is `undefined` for symmetric keys.
    */
  var asymmetricKeySize: js.UndefOr[scala.Double] = js.native
  var asymmetricKeyType: js.UndefOr[KeyType] = js.native
  var symmetricSize: js.UndefOr[scala.Double] = js.native
  var `type`: KeyObjectType = js.native
  def export(): nodeLib.Buffer = js.native
  @JSName("export")
  def export_der(options: KeyExportOptions[nodeLib.nodeLibStrings.der]): nodeLib.Buffer = js.native
  @JSName("export")
  def export_pem(options: KeyExportOptions[nodeLib.nodeLibStrings.pem]): java.lang.String | nodeLib.Buffer = js.native
}

