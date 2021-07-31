package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISensorsApiResponse extends StObject {
  
  var sensors: js.Array[ISensor]
}
object ISensorsApiResponse {
  
  @scala.inline
  def apply(sensors: js.Array[ISensor]): ISensorsApiResponse = {
    val __obj = js.Dynamic.literal(sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensorsApiResponse]
  }
  
  @scala.inline
  implicit class ISensorsApiResponseMutableBuilder[Self <: ISensorsApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensors(value: js.Array[ISensor]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorsVarargs(value: ISensor*): Self = StObject.set(x, "sensors", js.Array(value :_*))
  }
}
