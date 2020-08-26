package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Halign extends js.Object {
  var halign: start | end | center = js.native
  var height: Double = js.native
  var rendered: on | off = js.native
  var valign: top | bottom | middle = js.native
  var width: Double = js.native
}

object Halign {
  @scala.inline
  def apply(
    halign: start | end | center,
    height: Double,
    rendered: on | off,
    valign: top | bottom | middle,
    width: Double
  ): Halign = {
    val __obj = js.Dynamic.literal(halign = halign.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Halign]
  }
  @scala.inline
  implicit class HalignOps[Self <: Halign] (val x: Self) extends AnyVal {
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
    def setHalign(value: start | end | center): Self = this.set("halign", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: on | off): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setValign(value: top | bottom | middle): Self = this.set("valign", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

