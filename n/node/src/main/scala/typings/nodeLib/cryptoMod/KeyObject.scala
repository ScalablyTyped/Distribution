package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyObject extends _KeyLike {
  var asymmetricKeyType: js.UndefOr[KeyType] = js.native
  var symmetricSize: js.UndefOr[scala.Double] = js.native
  var `type`: KeyObjectType = js.native
  def export(): java.lang.String | nodeLib.Buffer = js.native
  def export(options: nodeLib.Anon_Cipher): java.lang.String | nodeLib.Buffer = js.native
}

