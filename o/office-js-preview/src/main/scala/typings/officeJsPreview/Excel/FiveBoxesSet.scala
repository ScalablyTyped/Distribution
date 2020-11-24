package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiveBoxesSet extends /* index */ NumberDictionary[Icon] {
  
  var fourFilledBoxes: Icon = js.native
  
  var noFilledBoxes: Icon = js.native
  
  var oneFilledBox: Icon = js.native
  
  var threeFilledBoxes: Icon = js.native
  
  var twoFilledBoxes: Icon = js.native
}
object FiveBoxesSet {
  
  @scala.inline
  def apply(
    fourFilledBoxes: Icon,
    noFilledBoxes: Icon,
    oneFilledBox: Icon,
    threeFilledBoxes: Icon,
    twoFilledBoxes: Icon
  ): FiveBoxesSet = {
    val __obj = js.Dynamic.literal(fourFilledBoxes = fourFilledBoxes.asInstanceOf[js.Any], noFilledBoxes = noFilledBoxes.asInstanceOf[js.Any], oneFilledBox = oneFilledBox.asInstanceOf[js.Any], threeFilledBoxes = threeFilledBoxes.asInstanceOf[js.Any], twoFilledBoxes = twoFilledBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveBoxesSet]
  }
  
  @scala.inline
  implicit class FiveBoxesSetOps[Self <: FiveBoxesSet] (val x: Self) extends AnyVal {
    
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
    def setFourFilledBoxes(value: Icon): Self = this.set("fourFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFilledBoxes(value: Icon): Self = this.set("noFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneFilledBox(value: Icon): Self = this.set("oneFilledBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeFilledBoxes(value: Icon): Self = this.set("threeFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoFilledBoxes(value: Icon): Self = this.set("twoFilledBoxes", value.asInstanceOf[js.Any])
  }
}
