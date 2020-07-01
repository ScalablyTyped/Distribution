package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatType[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object FormatType {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ PubF](format: PubF, `type`: spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
}

