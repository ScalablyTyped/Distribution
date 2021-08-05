package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiveArrowsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenUpArrow: Icon
  
  var redDownArrow: Icon
  
  var yellowDownInclineArrow: Icon
  
  var yellowSideArrow: Icon
  
  var yellowUpInclineArrow: Icon
}
object FiveArrowsSet {
  
  inline def apply(
    greenUpArrow: Icon,
    redDownArrow: Icon,
    yellowDownInclineArrow: Icon,
    yellowSideArrow: Icon,
    yellowUpInclineArrow: Icon
  ): FiveArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowDownInclineArrow = yellowDownInclineArrow.asInstanceOf[js.Any], yellowSideArrow = yellowSideArrow.asInstanceOf[js.Any], yellowUpInclineArrow = yellowUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveArrowsSet]
  }
  
  extension [Self <: FiveArrowsSet](x: Self) {
    
    inline def setGreenUpArrow(value: Icon): Self = StObject.set(x, "greenUpArrow", value.asInstanceOf[js.Any])
    
    inline def setRedDownArrow(value: Icon): Self = StObject.set(x, "redDownArrow", value.asInstanceOf[js.Any])
    
    inline def setYellowDownInclineArrow(value: Icon): Self = StObject.set(x, "yellowDownInclineArrow", value.asInstanceOf[js.Any])
    
    inline def setYellowSideArrow(value: Icon): Self = StObject.set(x, "yellowSideArrow", value.asInstanceOf[js.Any])
    
    inline def setYellowUpInclineArrow(value: Icon): Self = StObject.set(x, "yellowUpInclineArrow", value.asInstanceOf[js.Any])
  }
}
