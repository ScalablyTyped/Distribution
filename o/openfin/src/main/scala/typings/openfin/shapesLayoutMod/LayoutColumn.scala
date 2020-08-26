package typings.openfin.shapesLayoutMod

import typings.openfin.openfinStrings.column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutColumn extends js.Object {
  var content: LayoutContent = js.native
  var `type`: column = js.native
}

object LayoutColumn {
  @scala.inline
  def apply(content: LayoutContent, `type`: column): LayoutColumn = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutColumn]
  }
  @scala.inline
  implicit class LayoutColumnOps[Self <: LayoutColumn] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: LayoutContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: column): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

