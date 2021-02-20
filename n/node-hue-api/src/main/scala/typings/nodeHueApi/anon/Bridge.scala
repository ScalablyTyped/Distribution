package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridge extends StObject {
  
  var bridge: Boolean = js.native
  
  var lights: js.Array[String] = js.native
  
  var sensors: js.Array[String] = js.native
}
object Bridge {
  
  @scala.inline
  def apply(bridge: Boolean, lights: js.Array[String], sensors: js.Array[String]): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit class BridgeMutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Boolean): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: js.Array[String]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: String*): Self = StObject.set(x, "lights", js.Array(value :_*))
    
    @scala.inline
    def setSensors(value: js.Array[String]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorsVarargs(value: String*): Self = StObject.set(x, "sensors", js.Array(value :_*))
  }
}
