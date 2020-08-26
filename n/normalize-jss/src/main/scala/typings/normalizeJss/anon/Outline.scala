package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outline extends js.Object {
  var outline: String = js.native
}

object Outline {
  @scala.inline
  def apply(outline: String): Outline = {
    val __obj = js.Dynamic.literal(outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  @scala.inline
  implicit class OutlineOps[Self <: Outline] (val x: Self) extends AnyVal {
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
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
  }
  
}

