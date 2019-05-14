package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format[PubF /* <: nodeLib.cryptoMod.KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki
}

object Anon_Format {
  @scala.inline
  def apply[PubF /* <: nodeLib.cryptoMod.KeyFormat */](format: PubF, `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki): Anon_Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format[PubF]]
  }
}

