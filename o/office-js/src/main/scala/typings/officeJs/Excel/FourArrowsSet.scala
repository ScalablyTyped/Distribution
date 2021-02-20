package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourArrowsSet extends /* index */ NumberDictionary[Icon] {
  
  var greenUpArrow: Icon = js.native
  
  var redDownArrow: Icon = js.native
  
  var yellowDownInclineArrow: Icon = js.native
  
  var yellowUpInclineArrow: Icon = js.native
}
object FourArrowsSet {
  
  @scala.inline
  def apply(greenUpArrow: Icon, redDownArrow: Icon, yellowDownInclineArrow: Icon, yellowUpInclineArrow: Icon): FourArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowDownInclineArrow = yellowDownInclineArrow.asInstanceOf[js.Any], yellowUpInclineArrow = yellowUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourArrowsSet]
  }
  
  @scala.inline
  implicit class FourArrowsSetMutableBuilder[Self <: FourArrowsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenUpArrow(value: Icon): Self = StObject.set(x, "greenUpArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedDownArrow(value: Icon): Self = StObject.set(x, "redDownArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowDownInclineArrow(value: Icon): Self = StObject.set(x, "yellowDownInclineArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowUpInclineArrow(value: Icon): Self = StObject.set(x, "yellowUpInclineArrow", value.asInstanceOf[js.Any])
  }
}
