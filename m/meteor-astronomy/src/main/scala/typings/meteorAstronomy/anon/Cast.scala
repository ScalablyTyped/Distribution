package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cast extends js.Object {
  var cast: js.UndefOr[Boolean] = js.native
  @JSName("clone")
  var clone_FCast: js.UndefOr[Boolean] = js.native
  var merge: js.UndefOr[Boolean] = js.native
}

object Cast {
  @scala.inline
  def apply(): Cast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cast]
  }
  @scala.inline
  implicit class CastOps[Self <: Cast] (val x: Self) extends AnyVal {
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
    def setCast(value: Boolean): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setMerge(value: Boolean): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
  }
  
}

