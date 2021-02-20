package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeTrafficLights2Set extends /* index */ NumberDictionary[Icon] {
  
  var greenTrafficLight: Icon = js.native
  
  var redTrafficLight: Icon = js.native
  
  var yellowTrafficLight: Icon = js.native
}
object ThreeTrafficLights2Set {
  
  @scala.inline
  def apply(greenTrafficLight: Icon, redTrafficLight: Icon, yellowTrafficLight: Icon): ThreeTrafficLights2Set = {
    val __obj = js.Dynamic.literal(greenTrafficLight = greenTrafficLight.asInstanceOf[js.Any], redTrafficLight = redTrafficLight.asInstanceOf[js.Any], yellowTrafficLight = yellowTrafficLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights2Set]
  }
  
  @scala.inline
  implicit class ThreeTrafficLights2SetMutableBuilder[Self <: ThreeTrafficLights2Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenTrafficLight(value: Icon): Self = StObject.set(x, "greenTrafficLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedTrafficLight(value: Icon): Self = StObject.set(x, "redTrafficLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowTrafficLight(value: Icon): Self = StObject.set(x, "yellowTrafficLight", value.asInstanceOf[js.Any])
  }
}
