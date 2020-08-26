package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpFirst extends js.Object {
  var ampFirst: js.UndefOr[Boolean] = js.native
  var hasQuery: js.UndefOr[Boolean] = js.native
  var hybrid: js.UndefOr[Boolean] = js.native
}

object AmpFirst {
  @scala.inline
  def apply(): AmpFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpFirst]
  }
  @scala.inline
  implicit class AmpFirstOps[Self <: AmpFirst] (val x: Self) extends AnyVal {
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
    def setAmpFirst(value: Boolean): Self = this.set("ampFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpFirst: Self = this.set("ampFirst", js.undefined)
    @scala.inline
    def setHasQuery(value: Boolean): Self = this.set("hasQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasQuery: Self = this.set("hasQuery", js.undefined)
    @scala.inline
    def setHybrid(value: Boolean): Self = this.set("hybrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHybrid: Self = this.set("hybrid", js.undefined)
  }
  
}

