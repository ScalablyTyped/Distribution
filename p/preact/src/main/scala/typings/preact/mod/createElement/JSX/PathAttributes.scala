package typings.preact.mod.createElement.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathAttributes extends js.Object {
  var d: String = js.native
}

object PathAttributes {
  @scala.inline
  def apply(d: String): PathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttributes]
  }
  @scala.inline
  implicit class PathAttributesOps[Self <: PathAttributes] (val x: Self) extends AnyVal {
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
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
  }
  
}

