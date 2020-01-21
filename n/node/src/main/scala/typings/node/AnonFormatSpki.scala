package typings.node

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatSpki[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object AnonFormatSpki {
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: spki): AnonFormatSpki[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatSpki[PubF]]
  }
}

