package typings.muiDatatables.mod

import typings.muiDatatables.muiDatatablesStrings.asc
import typings.muiDatatables.muiDatatablesStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUISortOptions extends js.Object {
  var direction: asc | desc = js.native
  var name: String = js.native
}

object MUISortOptions {
  @scala.inline
  def apply(direction: asc | desc, name: String): MUISortOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUISortOptions]
  }
  @scala.inline
  implicit class MUISortOptionsOps[Self <: MUISortOptions] (val x: Self) extends AnyVal {
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
    def setDirection(value: asc | desc): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

