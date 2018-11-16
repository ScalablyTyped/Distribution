package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ObservablePoint")
@js.native
class ObservablePoint protected () extends PointLike {
  def this(cb: js.Function0[_]) = this()
  def this(cb: js.Function0[_], scope: js.Any) = this()
  def this(cb: js.Function0[_], scope: js.Any, x: scala.Double) = this()
  def this(cb: js.Function0[_], scope: js.Any, x: scala.Double, y: scala.Double) = this()
  var scope: js.Any = js.native
  def cb(): js.Any = js.native
  def clone(cb: js.Function): ObservablePoint = js.native
  def clone(cb: js.Function, scope: js.Any): ObservablePoint = js.native
  def equals(p: ObservablePoint): scala.Boolean = js.native
  def equals(p: Point): scala.Boolean = js.native
  def equals(p: PointLike): scala.Boolean = js.native
}

