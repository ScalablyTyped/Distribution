package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.GradientStop")
@js.native
class GradientStop () extends js.Object {
  /**
           * Creates a new GradientStop object.
           * @param array [optional] - an object literal containing the properties to be set on the group.
           */
  def this(array: js.Tuple2[java.lang.String, scala.Double]) = this()
  /**
           * Creates a GradientStop object.
           * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
           * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
           */
  def this(color: java.lang.String) = this()
  /**
           * Creates a GradientStop object.
           * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
           * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
           */
  def this(color: Color) = this()
  /**
           * Creates a new GradientStop object.
           * @param object [optional] - an object literal containing the properties to be set on the group.
           */
  def this(`object`: js.Any) = this()
  /**
           * Creates a GradientStop object.
           * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
           * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
           */
  def this(color: java.lang.String, rampPoint: scala.Double) = this()
  /**
           * Creates a GradientStop object.
           * @param color [optional] - the color of the stop, default: new Color(0, 0, 0)
           * @param rampPoint [optional] - the position of the stop on the gradient ramp as a value between 0 and 1, default: 0
           */
  def this(color: Color, rampPoint: scala.Double) = this()
  /**
           * The color of the gradient stop.
           */
  var color: Color = js.native
  /**
           * The ramp-point of the gradient stop as a value between 0 and 1.
           */
  var offset: scala.Double = js.native
  /**
           * The ramp-point of the gradient stop as a value between 0 and 1.
           * @deprecated use offset instead.
           */
  var rampPoint: scala.Double = js.native
}

