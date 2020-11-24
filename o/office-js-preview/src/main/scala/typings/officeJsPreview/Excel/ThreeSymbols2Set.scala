package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeSymbols2Set extends /* index */ NumberDictionary[Icon] {
  
  var greenCheck: Icon = js.native
  
  var redCross: Icon = js.native
  
  var yellowExclamation: Icon = js.native
}
object ThreeSymbols2Set {
  
  @scala.inline
  def apply(greenCheck: Icon, redCross: Icon, yellowExclamation: Icon): ThreeSymbols2Set = {
    val __obj = js.Dynamic.literal(greenCheck = greenCheck.asInstanceOf[js.Any], redCross = redCross.asInstanceOf[js.Any], yellowExclamation = yellowExclamation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbols2Set]
  }
  
  @scala.inline
  implicit class ThreeSymbols2SetOps[Self <: ThreeSymbols2Set] (val x: Self) extends AnyVal {
    
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
    def setGreenCheck(value: Icon): Self = this.set("greenCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCross(value: Icon): Self = this.set("redCross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowExclamation(value: Icon): Self = this.set("yellowExclamation", value.asInstanceOf[js.Any])
  }
}
