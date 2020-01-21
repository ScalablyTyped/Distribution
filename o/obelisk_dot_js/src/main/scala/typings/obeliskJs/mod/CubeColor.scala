package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "CubeColor")
@js.native
class CubeColor () extends AbstractColor {
  def this(border: Double) = this()
  def this(border: Double, borderHighlight: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double, right: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double, right: Double, horizontal: Double) = this()
  var BRIGHTNESS_GAIN: Double = js.native
  def getByHorizontalColor(horizontal: Double): CubeColor = js.native
}

