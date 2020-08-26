package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Point object represents a location in a two-dimensional coordinate system, where x represents
  * the horizontal axis and y represents the vertical axis.
  *
  * An ObservablePoint is a point that triggers a callback when the point's position is changed.
  *
  * @class
  * @memberof PIXI
  * @implements IPoint
  */
@JSImport("pixi.js", "ObservablePoint")
@js.native
class ObservablePoint protected ()
  extends typings.pixiJs.PIXI.ObservablePoint {
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any) = this()
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any, x: Double) = this()
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any, x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any, x: Double, y: Double) = this()
}

