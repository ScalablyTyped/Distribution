package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPopoverItem extends js.Object {
  var text: String
  var value: String
}

object PhononPopoverItem {
  @scala.inline
  def apply(text: String, value: String): PhononPopoverItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPopoverItem]
  }
}

