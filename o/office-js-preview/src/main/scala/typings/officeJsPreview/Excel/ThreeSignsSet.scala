package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeSignsSet extends /* index */ NumberDictionary[Icon] {
  var greenCircle: Icon = js.native
  var redDiamond: Icon = js.native
  var yellowTriangle: Icon = js.native
}

object ThreeSignsSet {
  @scala.inline
  def apply(greenCircle: Icon, redDiamond: Icon, yellowTriangle: Icon): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redDiamond = redDiamond.asInstanceOf[js.Any], yellowTriangle = yellowTriangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSignsSet]
  }
  @scala.inline
  implicit class ThreeSignsSetOps[Self <: ThreeSignsSet] (val x: Self) extends AnyVal {
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
    def setGreenCircle(value: Icon): Self = this.set("greenCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedDiamond(value: Icon): Self = this.set("redDiamond", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowTriangle(value: Icon): Self = this.set("yellowTriangle", value.asInstanceOf[js.Any])
  }
  
}

