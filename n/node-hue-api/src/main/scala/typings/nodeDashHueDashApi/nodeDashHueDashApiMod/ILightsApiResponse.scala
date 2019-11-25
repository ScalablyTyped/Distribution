package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightsApiResponse extends js.Object {
  var lights: js.Array[ILight]
}

object ILightsApiResponse {
  @scala.inline
  def apply(lights: js.Array[ILight]): ILightsApiResponse = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILightsApiResponse]
  }
}

