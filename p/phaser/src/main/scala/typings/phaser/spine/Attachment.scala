package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var name: String
  def copy(): Attachment
}

object Attachment {
  @scala.inline
  def apply(copy: () => Attachment, name: String): Attachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

