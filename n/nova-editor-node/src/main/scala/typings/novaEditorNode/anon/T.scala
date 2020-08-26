package typings.novaEditorNode.anon

import typings.novaEditorNode.novaEditorNodeStrings.FileSystemBitField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait T extends js.Object {
  var __t: FileSystemBitField = js.native
}

object T {
  @scala.inline
  def apply(__t: FileSystemBitField): T = {
    val __obj = js.Dynamic.literal(__t = __t.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  @scala.inline
  implicit class TOps[Self <: T] (val x: Self) extends AnyVal {
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
    def set__t(value: FileSystemBitField): Self = this.set("__t", value.asInstanceOf[js.Any])
  }
  
}

