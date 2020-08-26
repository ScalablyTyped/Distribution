package typings.moji.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MojisyuRegExp extends js.Object {
  var list: js.Array[String] = js.native
  var regexp: RegExp = js.native
}

object MojisyuRegExp {
  @scala.inline
  def apply(list: js.Array[String], regexp: RegExp): MojisyuRegExp = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MojisyuRegExp]
  }
  @scala.inline
  implicit class MojisyuRegExpOps[Self <: MojisyuRegExp] (val x: Self) extends AnyVal {
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
    def setListVarargs(value: String*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[String]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
  
}

