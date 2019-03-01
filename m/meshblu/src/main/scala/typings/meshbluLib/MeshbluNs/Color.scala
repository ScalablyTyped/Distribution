package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: java.lang.String
}

object Color {
  @scala.inline
  def apply(color: java.lang.String): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Color]
  }
}

