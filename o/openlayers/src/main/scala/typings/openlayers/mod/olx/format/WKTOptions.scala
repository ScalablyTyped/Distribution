package typings.openlayers.mod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WKTOptions extends js.Object {
  var splitCollection: js.UndefOr[Boolean] = js.native
}

object WKTOptions {
  @scala.inline
  def apply(): WKTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WKTOptions]
  }
  @scala.inline
  implicit class WKTOptionsOps[Self <: WKTOptions] (val x: Self) extends AnyVal {
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
    def setSplitCollection(value: Boolean): Self = this.set("splitCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitCollection: Self = this.set("splitCollection", js.undefined)
  }
  
}

