package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeTrianglesSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenUpTriangle: Icon
  
  var redDownTriangle: Icon
  
  var yellowDash: Icon
}
object ThreeTrianglesSet {
  
  inline def apply(greenUpTriangle: Icon, redDownTriangle: Icon, yellowDash: Icon): ThreeTrianglesSet = {
    val __obj = js.Dynamic.literal(greenUpTriangle = greenUpTriangle.asInstanceOf[js.Any], redDownTriangle = redDownTriangle.asInstanceOf[js.Any], yellowDash = yellowDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrianglesSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreeTrianglesSet] (val x: Self) extends AnyVal {
    
    inline def setGreenUpTriangle(value: Icon): Self = StObject.set(x, "greenUpTriangle", value.asInstanceOf[js.Any])
    
    inline def setRedDownTriangle(value: Icon): Self = StObject.set(x, "redDownTriangle", value.asInstanceOf[js.Any])
    
    inline def setYellowDash(value: Icon): Self = StObject.set(x, "yellowDash", value.asInstanceOf[js.Any])
  }
}
