package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightsApiResponse extends StObject {
  
  var lights: js.Array[ILight]
}
object ILightsApiResponse {
  
  inline def apply(lights: js.Array[ILight]): ILightsApiResponse = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightsApiResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILightsApiResponse] (val x: Self) extends AnyVal {
    
    inline def setLights(value: js.Array[ILight]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setLightsVarargs(value: ILight*): Self = StObject.set(x, "lights", js.Array(value*))
  }
}
