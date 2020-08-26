package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joins extends js.Object {
  var structure: js.Any = js.native
}

object Joins {
  @scala.inline
  def apply(structure: js.Any): Joins = {
    val __obj = js.Dynamic.literal(structure = structure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joins]
  }
  @scala.inline
  implicit class JoinsOps[Self <: Joins] (val x: Self) extends AnyVal {
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
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
  }
  
}

