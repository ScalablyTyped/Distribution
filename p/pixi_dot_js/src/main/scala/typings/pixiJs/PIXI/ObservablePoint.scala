package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait ObservablePoint extends IPoint {
  
  def clone(cb: js.UndefOr[scala.Nothing], scope: js.Any): ObservablePoint = js.native
  def clone(cb: js.Function1[/* repeated */ js.Any, _]): ObservablePoint = js.native
  def clone(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any): ObservablePoint = js.native
}
