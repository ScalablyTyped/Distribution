package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.GradientStop")
@js.native
/**
  * Creates a GradientStop object.
  * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
  * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
  */
class GradientStop () extends Base {
  def this(array: js.Tuple2[String, Double]) = this()
  def this(color: String) = this()
  def this(color: Color) = this()
  def this(`object`: js.Any) = this()
  def this(color: String, rampPoint: Double) = this()
  def this(color: Color, rampPoint: Double) = this()
  /**
    * The color of the gradient stop.
    */
  var color: Color | String = js.native
  /**
    * The ramp-point of the gradient stop as a value between 0 and 1.
    */
  var offset: Double = js.native
  /**
    * The ramp-point of the gradient stop as a value between 0 and 1.
    * @deprecated use offset instead.
    */
  var rampPoint: Double = js.native
  def getColor(): Color = js.native
  def setColor(value: String): Unit = js.native
  def setColor(value: Color): Unit = js.native
}

