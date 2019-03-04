package typings
package novncDashCoreLib.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvFBU extends js.Object {
  var encoding: scala.Double
  var encodingName: java.lang.String
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object NvFBU {
  @scala.inline
  def apply(
    encoding: scala.Double,
    encodingName: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): NvFBU = {
    val __obj = js.Dynamic.literal(encoding = encoding, encodingName = encodingName, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[NvFBU]
  }
}

