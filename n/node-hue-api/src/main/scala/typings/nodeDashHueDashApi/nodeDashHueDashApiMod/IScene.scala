package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScene extends js.Object {
  var id: String
  var lights: js.Array[Double]
  var name: String
}

object IScene {
  @scala.inline
  def apply(id: String, lights: js.Array[Double], name: String): IScene = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScene]
  }
}

