package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Point object represents a location in a two-dimensional coordinate system, where x represents
  * the horizontal axis and y represents the vertical axis.
  * An observable point is a point that triggers a callback when the point"s position is changed.
  */
@JSGlobal("PIXI.ObservablePoint")
@js.native
class ObservablePoint protected () extends PointLike {
  def this(cb: js.Function0[_]) = this()
  def this(cb: js.Function0[_], scope: js.Any) = this()
  def this(cb: js.Function0[_], scope: js.Any, x: Double) = this()
  def this(cb: js.Function0[_], scope: js.Any, x: Double, y: Double) = this()
  var scope: js.Any = js.native
  def cb(): js.Any = js.native
  def clone(cb: js.Function): ObservablePoint = js.native
  def clone(cb: js.Function, scope: js.Any): ObservablePoint = js.native
  def equals(p: ObservablePoint): Boolean = js.native
  def equals(p: Point): Boolean = js.native
  def equals(p: PointLike): Boolean = js.native
}

