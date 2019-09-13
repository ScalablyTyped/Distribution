package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle object is an area defined by its position, as indicated by its top-left corner
  * point (x, y) and by its width and its height.
  */
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
  /**
    * Enlarges rectangle that way its corners lie on grid
    *
    * @param [resolution=1] resolution
    * @param [eps=0.001] precision
    */
  def ceil(): Unit = js.native
  def ceil(resolution: Double): Unit = js.native
  def ceil(resolution: Double, eps: Double): Unit = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Copies another rectangle to this one.
    *
    * @param rectangle - The rectangle to copy.
    * @return Returns itself.
    */
  def copy(rectangle: Rectangle): Rectangle = js.native
  /**
    * Enlarges this rectangle to include the passed rectangle.
    *
    * @param rectangle - The rectangle to include.
    */
  def enlarge(rectangle: Rectangle): Unit = js.native
  /**
    * Fits this rectangle around the passed one.
    *
    * @param rectangle - The rectangle to fit.
    */
  def fit(rectangle: Rectangle): Unit = js.native
  /**
    * Pads the rectangle making it grow in all directions.
    *
    * @param paddingX - The horizontal padding amount.
    * @param [paddingY] - The vertical padding amount.
    */
  def pad(paddingX: Double, paddingY: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Rectangle")
@js.native
object Rectangle extends js.Object {
  var EMPTY: Rectangle = js.native
}

