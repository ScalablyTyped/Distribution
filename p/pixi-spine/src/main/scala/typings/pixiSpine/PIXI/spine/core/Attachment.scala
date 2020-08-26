package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  var name: String = js.native
  def copy(): Attachment = js.native
}

object Attachment {
  @scala.inline
  def apply(copy: () => Attachment, name: String): Attachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: () => Attachment): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

