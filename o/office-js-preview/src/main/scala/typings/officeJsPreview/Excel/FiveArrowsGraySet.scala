package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiveArrowsGraySet extends /* index */ NumberDictionary[Icon] {
  var grayDownArrow: Icon = js.native
  var grayDownInclineArrow: Icon = js.native
  var graySideArrow: Icon = js.native
  var grayUpArrow: Icon = js.native
  var grayUpInclineArrow: Icon = js.native
}

object FiveArrowsGraySet {
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    grayDownInclineArrow: Icon,
    graySideArrow: Icon,
    grayUpArrow: Icon,
    grayUpInclineArrow: Icon
  ): FiveArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], grayDownInclineArrow = grayDownInclineArrow.asInstanceOf[js.Any], graySideArrow = graySideArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any], grayUpInclineArrow = grayUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveArrowsGraySet]
  }
  @scala.inline
  implicit class FiveArrowsGraySetOps[Self <: FiveArrowsGraySet] (val x: Self) extends AnyVal {
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
    def setGrayDownArrow(value: Icon): Self = this.set("grayDownArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayDownInclineArrow(value: Icon): Self = this.set("grayDownInclineArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraySideArrow(value: Icon): Self = this.set("graySideArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayUpArrow(value: Icon): Self = this.set("grayUpArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayUpInclineArrow(value: Icon): Self = this.set("grayUpInclineArrow", value.asInstanceOf[js.Any])
  }
  
}

