package typings.nivoCore.anon

import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.nivoCoreStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id[T] extends js.Object {
  var id: String = js.native
  var `match`: js.Object | SvgFillMatcher[T] | Asterisk = js.native
}

object Id {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | Asterisk): Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[T]]
  }
  @scala.inline
  implicit class IdOps[Self <: Id[_], T] (val x: Self with Id[T]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchFunction1(value: T => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch(value: js.Object | SvgFillMatcher[T] | Asterisk): Self = this.set("match", value.asInstanceOf[js.Any])
  }
  
}

