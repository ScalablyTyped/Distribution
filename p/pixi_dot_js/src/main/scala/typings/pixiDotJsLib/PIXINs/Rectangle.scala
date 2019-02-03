package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Rectangle")
@js.native
class Rectangle () extends HitArea {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  var bottom: scala.Double = js.native
  var height: scala.Double = js.native
  var left: scala.Double = js.native
  var right: scala.Double = js.native
  var top: scala.Double = js.native
  var `type`: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /* CompleteClass */
  override def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def enlarge(rectangle: Rectangle): scala.Unit = js.native
  def fit(rectangle: Rectangle): scala.Unit = js.native
  def pad(paddingX: scala.Double, paddingY: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Rectangle")
@js.native
object Rectangle extends js.Object {
  var EMPTY: pixiDotJsLib.PIXINs.Rectangle = js.native
}

