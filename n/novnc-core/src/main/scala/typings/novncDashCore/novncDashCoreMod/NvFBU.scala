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
    val __obj = js.Dynamic.literal(encoding = encoding, encodingName = encodingName, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[NvFBU]
  }
}

