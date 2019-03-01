package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScene extends js.Object {
  var id: java.lang.String
  var lights: js.Array[scala.Double]
  var name: java.lang.String
}

object IScene {
  @scala.inline
  def apply(id: java.lang.String, lights: js.Array[scala.Double], name: java.lang.String): IScene = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lights")(lights)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IScene]
  }
}

