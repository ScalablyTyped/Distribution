package typings.novncDashCore.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvFBU extends js.Object {
  var encoding: Double
  var encodingName: String
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object NvFBU {
  @scala.inline
  def apply(encoding: Double, encodingName: String, height: Double, width: Double, x: Double, y: Double): NvFBU = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], encodingName = encodingName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NvFBU]
  }
}

