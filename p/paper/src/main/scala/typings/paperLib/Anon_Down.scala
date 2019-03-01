package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Down extends js.Object {
  var down: js.UndefOr[scala.Boolean] = js.undefined
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  var move: js.UndefOr[scala.Boolean] = js.undefined
  var up: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Down {
  @scala.inline
  def apply(
    down: js.UndefOr[scala.Boolean] = js.undefined,
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    move: js.UndefOr[scala.Boolean] = js.undefined,
    up: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Down = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down)
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[Anon_Down]
  }
}

