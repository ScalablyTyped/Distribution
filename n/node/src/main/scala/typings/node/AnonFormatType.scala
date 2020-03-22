package typings.node

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatType[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object AnonFormatType {
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: spki): AnonFormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatType[PubF]]
  }
}

