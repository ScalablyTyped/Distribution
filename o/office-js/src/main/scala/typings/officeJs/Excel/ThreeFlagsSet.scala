package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeFlagsSet extends /* index */ NumberDictionary[Icon] {
  
  var greenFlag: Icon = js.native
  
  var redFlag: Icon = js.native
  
  var yellowFlag: Icon = js.native
}
object ThreeFlagsSet {
  
  @scala.inline
  def apply(greenFlag: Icon, redFlag: Icon, yellowFlag: Icon): ThreeFlagsSet = {
    val __obj = js.Dynamic.literal(greenFlag = greenFlag.asInstanceOf[js.Any], redFlag = redFlag.asInstanceOf[js.Any], yellowFlag = yellowFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeFlagsSet]
  }
  
  @scala.inline
  implicit class ThreeFlagsSetMutableBuilder[Self <: ThreeFlagsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenFlag(value: Icon): Self = StObject.set(x, "greenFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedFlag(value: Icon): Self = StObject.set(x, "redFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowFlag(value: Icon): Self = StObject.set(x, "yellowFlag", value.asInstanceOf[js.Any])
  }
}
