package typings.novncDashCore.libDisplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvLogo extends js.Object {
  var data: js.Array[Double]
  var height: Double
  var `type`: String
  var width: Double
}

object NvLogo {
  @scala.inline
  def apply(data: js.Array[Double], height: Double, `type`: String, width: Double): NvLogo = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NvLogo]
  }
}

