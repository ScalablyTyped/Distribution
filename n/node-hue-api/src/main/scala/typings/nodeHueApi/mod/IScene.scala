package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScene extends StObject {
  
  var id: String = js.native
  
  var lights: js.Array[Double] = js.native
  
  var name: String = js.native
}
object IScene {
  
  @scala.inline
  def apply(id: String, lights: js.Array[Double], name: String): IScene = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScene]
  }
  
  @scala.inline
  implicit class ISceneMutableBuilder[Self <: IScene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: js.Array[Double]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: Double*): Self = StObject.set(x, "lights", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
