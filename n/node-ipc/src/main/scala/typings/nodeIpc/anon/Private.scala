package typings.nodeIpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Private extends js.Object {
  var `private`: js.UndefOr[String] = js.native
  var public: js.UndefOr[String] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}

object Private {
  @scala.inline
  def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
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
    def setPrivate(value: String): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
  
}

