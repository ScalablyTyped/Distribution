package typings.officeJs.Excel

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
  
  @scala.inline
  def apply(greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): ThreeTrafficLights1Set = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights1Set]
  }
  
  @scala.inline
  implicit class ThreeTrafficLights1SetMutableBuilder[Self <: ThreeTrafficLights1Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCircleWithBorder(value: Icon): Self = StObject.set(x, "redCircleWithBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowCircle(value: Icon): Self = StObject.set(x, "yellowCircle", value.asInstanceOf[js.Any])
  }
}
