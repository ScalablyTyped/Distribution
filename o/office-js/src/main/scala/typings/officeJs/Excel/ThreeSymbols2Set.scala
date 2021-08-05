package typings.officeJs.Excel

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
  
  inline def apply(greenCheck: Icon, redCross: Icon, yellowExclamation: Icon): ThreeSymbols2Set = {
    val __obj = js.Dynamic.literal(greenCheck = greenCheck.asInstanceOf[js.Any], redCross = redCross.asInstanceOf[js.Any], yellowExclamation = yellowExclamation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbols2Set]
  }
  
  extension [Self <: ThreeSymbols2Set](x: Self) {
    
    inline def setGreenCheck(value: Icon): Self = StObject.set(x, "greenCheck", value.asInstanceOf[js.Any])
    
    inline def setRedCross(value: Icon): Self = StObject.set(x, "redCross", value.asInstanceOf[js.Any])
    
    inline def setYellowExclamation(value: Icon): Self = StObject.set(x, "yellowExclamation", value.asInstanceOf[js.Any])
  }
}
