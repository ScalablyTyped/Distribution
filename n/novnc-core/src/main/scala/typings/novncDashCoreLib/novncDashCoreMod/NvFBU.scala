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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("encodingName")(encodingName)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[NvFBU]
  }
}

