package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FourTrafficLightsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var blackCircleWithBorder: Icon
  
  var greenCircle: Icon
  
  var redCircleWithBorder: Icon
  
  var yellowCircle: Icon
}
object FourTrafficLightsSet {
  
  inline def apply(blackCircleWithBorder: Icon, greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): FourTrafficLightsSet = {
    val __obj = js.Dynamic.literal(blackCircleWithBorder = blackCircleWithBorder.asInstanceOf[js.Any], greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourTrafficLightsSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FourTrafficLightsSet] (val x: Self) extends AnyVal {
    
    inline def setBlackCircleWithBorder(value: Icon): Self = StObject.set(x, "blackCircleWithBorder", value.asInstanceOf[js.Any])
    
    inline def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    inline def setRedCircleWithBorder(value: Icon): Self = StObject.set(x, "redCircleWithBorder", value.asInstanceOf[js.Any])
    
    inline def setYellowCircle(value: Icon): Self = StObject.set(x, "yellowCircle", value.asInstanceOf[js.Any])
  }
}
