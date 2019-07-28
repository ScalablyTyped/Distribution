package typings.obeliskDotJs.obeliskDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "PyramidColor")
@js.native
class PyramidColor () extends AbstractColor {
  def this(border: Double) = this()
  def this(border: Double, borderHighlight: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double, right: Double) = this()
  var BRIGHTNESS_GAIN: Double = js.native
  def getByRightColor(horizontal: Double): PyramidColor = js.native
}

