package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeSymbols2Set
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenCheck: Icon
  
  var redCross: Icon
  
  var yellowExclamation: Icon
}
object ThreeSymbols2Set {
  
  @scala.inline
  def apply(greenCheck: Icon, redCross: Icon, yellowExclamation: Icon): ThreeSymbols2Set = {
    val __obj = js.Dynamic.literal(greenCheck = greenCheck.asInstanceOf[js.Any], redCross = redCross.asInstanceOf[js.Any], yellowExclamation = yellowExclamation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbols2Set]
  }
  
  @scala.inline
  implicit class ThreeSymbols2SetMutableBuilder[Self <: ThreeSymbols2Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenCheck(value: Icon): Self = StObject.set(x, "greenCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCross(value: Icon): Self = StObject.set(x, "redCross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowExclamation(value: Icon): Self = StObject.set(x, "yellowExclamation", value.asInstanceOf[js.Any])
  }
}
