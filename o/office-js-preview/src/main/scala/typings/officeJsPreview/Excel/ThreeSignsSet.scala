package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeSignsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenCircle: Icon
  
  var redDiamond: Icon
  
  var yellowTriangle: Icon
}
object ThreeSignsSet {
  
  inline def apply(greenCircle: Icon, redDiamond: Icon, yellowTriangle: Icon): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redDiamond = redDiamond.asInstanceOf[js.Any], yellowTriangle = yellowTriangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSignsSet]
  }
  
  extension [Self <: ThreeSignsSet](x: Self) {
    
    inline def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    inline def setRedDiamond(value: Icon): Self = StObject.set(x, "redDiamond", value.asInstanceOf[js.Any])
    
    inline def setYellowTriangle(value: Icon): Self = StObject.set(x, "yellowTriangle", value.asInstanceOf[js.Any])
  }
}
