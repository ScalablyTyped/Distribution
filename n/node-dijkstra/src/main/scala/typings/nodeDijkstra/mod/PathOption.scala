package typings.nodeDijkstra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathOption extends js.Object {
  var avoid: js.UndefOr[js.Array[_]] = js.native
  var cost: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object PathOption {
  @scala.inline
  def apply(): PathOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOption]
  }
  @scala.inline
  implicit class PathOptionOps[Self <: PathOption] (val x: Self) extends AnyVal {
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
    def setAvoidVarargs(value: js.Any*): Self = this.set("avoid", js.Array(value :_*))
    @scala.inline
    def setAvoid(value: js.Array[_]): Self = this.set("avoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoid: Self = this.set("avoid", js.undefined)
    @scala.inline
    def setCost(value: Boolean): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

