package typings
package obeliskDotJsLib.obeliskDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "CubeColor")
@js.native
class CubeColor () extends AbstractColor {
  def this(border: scala.Double) = this()
  def this(border: scala.Double, borderHighlight: scala.Double) = this()
  def this(border: scala.Double, borderHighlight: scala.Double, left: scala.Double) = this()
  def this(border: scala.Double, borderHighlight: scala.Double, left: scala.Double, right: scala.Double) = this()
  def this(border: scala.Double, borderHighlight: scala.Double, left: scala.Double, right: scala.Double, horizontal: scala.Double) = this()
  var BRIGHTNESS_GAIN: scala.Double = js.native
  def getByHorizontalColor(horizontal: scala.Double): CubeColor = js.native
}

