package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeTrianglesSet extends /* index */ NumberDictionary[Icon] {
  var greenUpTriangle: Icon = js.native
  var redDownTriangle: Icon = js.native
  var yellowDash: Icon = js.native
}

object ThreeTrianglesSet {
  @scala.inline
  def apply(greenUpTriangle: Icon, redDownTriangle: Icon, yellowDash: Icon): ThreeTrianglesSet = {
    val __obj = js.Dynamic.literal(greenUpTriangle = greenUpTriangle.asInstanceOf[js.Any], redDownTriangle = redDownTriangle.asInstanceOf[js.Any], yellowDash = yellowDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrianglesSet]
  }
  @scala.inline
  implicit class ThreeTrianglesSetOps[Self <: ThreeTrianglesSet] (val x: Self) extends AnyVal {
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
    def setGreenUpTriangle(value: Icon): Self = this.set("greenUpTriangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedDownTriangle(value: Icon): Self = this.set("redDownTriangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowDash(value: Icon): Self = this.set("yellowDash", value.asInstanceOf[js.Any])
  }
  
}

