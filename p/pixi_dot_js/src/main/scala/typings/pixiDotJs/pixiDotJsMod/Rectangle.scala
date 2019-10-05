package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle object is an area defined by its position, as indicated by its top-left corner
  * point (x, y) and by its width and its height.
  */
@JSImport("pixi.js", "Rectangle")
@js.native
class Rectangle ()
  extends typings.pixiDotJs.PIXI.Rectangle {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

/* static members */
@JSImport("pixi.js", "Rectangle")
@js.native
object Rectangle extends js.Object {
  var EMPTY: typings.pixiDotJs.PIXI.Rectangle = js.native
}

