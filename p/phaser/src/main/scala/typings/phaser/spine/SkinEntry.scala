package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkinEntry extends js.Object {
  var attachment: Attachment
  var name: String
  var slotIndex: Double
}

object SkinEntry {
  @scala.inline
  def apply(attachment: Attachment, name: String, slotIndex: Double): SkinEntry = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinEntry]
  }
}

