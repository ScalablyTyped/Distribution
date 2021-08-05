package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeTrafficLights1Set
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenCircle: Icon
  
  var redCircleWithBorder: Icon
  
  var yellowCircle: Icon
}
object ThreeTrafficLights1Set {
  
  inline def apply(greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): ThreeTrafficLights1Set = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights1Set]
  }
  
  extension [Self <: ThreeTrafficLights1Set](x: Self) {
    
    inline def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    inline def setRedCircleWithBorder(value: Icon): Self = StObject.set(x, "redCircleWithBorder", value.asInstanceOf[js.Any])
    
    inline def setYellowCircle(value: Icon): Self = StObject.set(x, "yellowCircle", value.asInstanceOf[js.Any])
  }
}
