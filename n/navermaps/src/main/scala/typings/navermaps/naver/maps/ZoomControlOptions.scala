package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomControlOptions extends js.Object {
  var legendDisabled: Boolean = js.native
  var position: Position = js.native
  var style: ZoomControlStyle = js.native
}

object ZoomControlOptions {
  @scala.inline
  def apply(legendDisabled: Boolean, position: Position, style: ZoomControlStyle): ZoomControlOptions = {
    val __obj = js.Dynamic.literal(legendDisabled = legendDisabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControlOptions]
  }
  @scala.inline
  implicit class ZoomControlOptionsOps[Self <: ZoomControlOptions] (val x: Self) extends AnyVal {
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
    def setLegendDisabled(value: Boolean): Self = this.set("legendDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: ZoomControlStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

