package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L extends _Coordinates {
  var l: js.UndefOr[Position] = js.native
  var t: js.UndefOr[Position] = js.native
}

object L {
  @scala.inline
  def apply(): L = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L]
  }
  @scala.inline
  implicit class LOps[Self <: L] (val x: Self) extends AnyVal {
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
    def setL(value: Position): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    @scala.inline
    def setT(value: Position): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
  }
  
}

