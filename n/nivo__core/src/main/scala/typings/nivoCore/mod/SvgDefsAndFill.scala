package typings.nivoCore.mod

import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[Dictkey]] = js.native
  var fill: js.UndefOr[js.Array[Id[T]]] = js.native
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
  @scala.inline
  implicit class SvgDefsAndFillOps[Self <: SvgDefsAndFill[_], T] (val x: Self with SvgDefsAndFill[T]) extends AnyVal {
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
    def setDefsVarargs(value: Dictkey*): Self = this.set("defs", js.Array(value :_*))
    @scala.inline
    def setDefs(value: js.Array[Dictkey]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setFillVarargs(value: Id[T]*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: js.Array[Id[T]]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
  }
  
}

