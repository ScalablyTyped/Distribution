package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Point object represents a location in a two-dimensional coordinate system, where x represents
  * the horizontal axis and y represents the vertical axis.
  */
@JSGlobal("PIXI.Point")
@js.native
class Point () extends PointLike {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def equals(p: PointLike): Boolean = js.native
}

