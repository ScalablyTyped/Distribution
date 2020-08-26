package typings.oracleOraclejet.ojmenuMod.ojMenu

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait OpenOptions extends js.Object {
  var display: js.UndefOr[String] = js.native
  var initialFocus: js.UndefOr[String] = js.native
  var launcher: js.UndefOr[String | Element] = js.native
  var position: js.UndefOr[Position] = js.native
}

object OpenOptions {
  @scala.inline
  def apply(): OpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOptions]
  }
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setInitialFocus(value: String): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    @scala.inline
    def setLauncher(value: String | Element): Self = this.set("launcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLauncher: Self = this.set("launcher", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

