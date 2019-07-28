package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.der
import typings.node.nodeStrings.pem
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
  var asymmetricKeySize: js.UndefOr[Double] = js.native
  var asymmetricKeyType: js.UndefOr[KeyType] = js.native
  var symmetricSize: js.UndefOr[Double] = js.native
  var `type`: KeyObjectType = js.native
  def export(): Buffer = js.native
  @JSName("export")
  def export_der(options: KeyExportOptions[der]): Buffer = js.native
  @JSName("export")
  def export_pem(options: KeyExportOptions[pem]): java.lang.String | Buffer = js.native
}

