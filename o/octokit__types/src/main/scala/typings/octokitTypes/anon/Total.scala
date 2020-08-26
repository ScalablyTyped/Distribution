package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Total extends js.Object {
  var author: Avatarurl = js.native
  var total: Double = js.native
  var weeks: js.Array[A] = js.native
}

object Total {
  @scala.inline
  def apply(author: Avatarurl, total: Double, weeks: js.Array[A]): Total = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
  @scala.inline
  implicit class TotalOps[Self <: Total] (val x: Self) extends AnyVal {
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
    def setAuthor(value: Avatarurl): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeeksVarargs(value: A*): Self = this.set("weeks", js.Array(value :_*))
    @scala.inline
    def setWeeks(value: js.Array[A]): Self = this.set("weeks", value.asInstanceOf[js.Any])
  }
  
}

