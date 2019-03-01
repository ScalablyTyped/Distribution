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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NvLogo]
  }
}

