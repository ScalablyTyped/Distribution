package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeArrowsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenUpArrow: Icon
  
  var redDownArrow: Icon
  
  var yellowSideArrow: Icon
}
object ThreeArrowsSet {
  
  inline def apply(greenUpArrow: Icon, redDownArrow: Icon, yellowSideArrow: Icon): ThreeArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowSideArrow = yellowSideArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeArrowsSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreeArrowsSet] (val x: Self) extends AnyVal {
    
    inline def setGreenUpArrow(value: Icon): Self = StObject.set(x, "greenUpArrow", value.asInstanceOf[js.Any])
    
    inline def setRedDownArrow(value: Icon): Self = StObject.set(x, "redDownArrow", value.asInstanceOf[js.Any])
    
    inline def setYellowSideArrow(value: Icon): Self = StObject.set(x, "yellowSideArrow", value.asInstanceOf[js.Any])
  }
}
