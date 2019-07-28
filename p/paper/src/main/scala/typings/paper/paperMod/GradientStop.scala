package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "GradientStop")
@js.native
/**
  * Creates a GradientStop object.
  * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
  * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
  */
class GradientStop ()
  extends typings.paper.paperNs.GradientStop {
  def this(array: js.Tuple2[String, Double]) = this()
  def this(color: String) = this()
  def this(color: typings.paper.paperNs.Color) = this()
  def this(`object`: js.Any) = this()
  def this(color: String, rampPoint: Double) = this()
  def this(color: typings.paper.paperNs.Color, rampPoint: Double) = this()
}

