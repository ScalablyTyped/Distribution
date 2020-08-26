package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  var as: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var via: js.UndefOr[String] = js.native
}

object As {
  @scala.inline
  def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVia(value: String): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
  }
  
}

