package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatSpki[PubF /* <: nodeLib.cryptoMod.KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: nodeLib.nodeLibStrings.spki
}

object Anon_FormatSpki {
  @scala.inline
  def apply[PubF /* <: nodeLib.cryptoMod.KeyFormat */](format: PubF, `type`: nodeLib.nodeLibStrings.spki): Anon_FormatSpki[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FormatSpki[PubF]]
  }
}

