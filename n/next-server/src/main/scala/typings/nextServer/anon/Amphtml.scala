package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amphtml extends js.Object {
  var amphtml: js.UndefOr[Boolean] = js.native
  var dataOnly: js.UndefOr[Boolean] = js.native
  var hasAmp: js.UndefOr[Boolean] = js.native
}

object Amphtml {
  @scala.inline
  def apply(): Amphtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amphtml]
  }
  @scala.inline
  implicit class AmphtmlOps[Self <: Amphtml] (val x: Self) extends AnyVal {
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
    def setAmphtml(value: Boolean): Self = this.set("amphtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmphtml: Self = this.set("amphtml", js.undefined)
    @scala.inline
    def setDataOnly(value: Boolean): Self = this.set("dataOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataOnly: Self = this.set("dataOnly", js.undefined)
    @scala.inline
    def setHasAmp(value: Boolean): Self = this.set("hasAmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAmp: Self = this.set("hasAmp", js.undefined)
  }
  
}

