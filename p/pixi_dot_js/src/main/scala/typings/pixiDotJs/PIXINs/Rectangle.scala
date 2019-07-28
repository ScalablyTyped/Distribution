package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Rectangle")
@js.native
class Rectangle () extends HitArea {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var bottom: Double = js.native
  var height: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def ceil(): Unit = js.native
  def ceil(resolution: Double): Unit = js.native
  def ceil(resolution: Double, eps: Double): Unit = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def enlarge(rectangle: Rectangle): Unit = js.native
  def fit(rectangle: Rectangle): Unit = js.native
  def pad(paddingX: Double, paddingY: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Rectangle")
@js.native
object Rectangle extends js.Object {
  var EMPTY: Rectangle = js.native
}

