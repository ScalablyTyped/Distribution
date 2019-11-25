package typings.node

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatSpki[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object Anon_FormatSpki {
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: spki): Anon_FormatSpki[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FormatSpki[PubF]]
  }
}

