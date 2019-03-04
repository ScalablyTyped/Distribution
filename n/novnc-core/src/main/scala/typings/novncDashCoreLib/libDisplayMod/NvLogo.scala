package typings
package novncDashCoreLib.libDisplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvLogo extends js.Object {
  var data: js.Array[scala.Double]
  var height: scala.Double
  var `type`: java.lang.String
  var width: scala.Double
}

object NvLogo {
  @scala.inline
  def apply(data: js.Array[scala.Double], height: scala.Double, `type`: java.lang.String, width: scala.Double): NvLogo = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NvLogo]
  }
}

