package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensorsApiResponse extends js.Object {
  var sensors: js.Array[ISensor]
}

object ISensorsApiResponse {
  @scala.inline
  def apply(sensors: js.Array[ISensor]): ISensorsApiResponse = {
    val __obj = js.Dynamic.literal(sensors = sensors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISensorsApiResponse]
  }
}

