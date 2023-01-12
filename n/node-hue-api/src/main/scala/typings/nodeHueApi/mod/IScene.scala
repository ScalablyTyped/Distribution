package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScene extends StObject {
  
  var id: String
  
  var lights: js.Array[Double]
  
  var name: String
}
object IScene {
  
  inline def apply(id: String, lights: js.Array[Double], name: String): IScene = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScene]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScene] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLights(value: js.Array[Double]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setLightsVarargs(value: Double*): Self = StObject.set(x, "lights", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
