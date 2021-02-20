package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeSignsSet extends /* index */ NumberDictionary[Icon] {
  
  var greenCircle: Icon = js.native
  
  var redDiamond: Icon = js.native
  
  var yellowTriangle: Icon = js.native
}
object ThreeSignsSet {
  
  @scala.inline
  def apply(greenCircle: Icon, redDiamond: Icon, yellowTriangle: Icon): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redDiamond = redDiamond.asInstanceOf[js.Any], yellowTriangle = yellowTriangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSignsSet]
  }
  
  @scala.inline
  implicit class ThreeSignsSetMutableBuilder[Self <: ThreeSignsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenCircle(value: Icon): Self = StObject.set(x, "greenCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedDiamond(value: Icon): Self = StObject.set(x, "redDiamond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowTriangle(value: Icon): Self = StObject.set(x, "yellowTriangle", value.asInstanceOf[js.Any])
  }
}
