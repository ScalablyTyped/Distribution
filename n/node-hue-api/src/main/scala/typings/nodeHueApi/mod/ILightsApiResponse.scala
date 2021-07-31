package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightsApiResponse extends StObject {
  
  var lights: js.Array[ILight]
}
object ILightsApiResponse {
  
  @scala.inline
  def apply(lights: js.Array[ILight]): ILightsApiResponse = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightsApiResponse]
  }
  
  @scala.inline
  implicit class ILightsApiResponseMutableBuilder[Self <: ILightsApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLights(value: js.Array[ILight]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: ILight*): Self = StObject.set(x, "lights", js.Array(value :_*))
  }
}
