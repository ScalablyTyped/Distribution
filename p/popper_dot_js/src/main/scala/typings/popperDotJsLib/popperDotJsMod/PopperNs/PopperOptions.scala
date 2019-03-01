package typings
package popperDotJsLib.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperOptions extends js.Object {
  var eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var onCreate: js.UndefOr[js.Function1[/* data */ Data, scala.Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ Data, scala.Unit]] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var positionFixed: js.UndefOr[scala.Boolean] = js.undefined
  var removeOnDestroy: js.UndefOr[scala.Boolean] = js.undefined
}

object PopperOptions {
  @scala.inline
  def apply(
    eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onCreate: js.Function1[/* data */ Data, scala.Unit] = null,
    onUpdate: js.Function1[/* data */ Data, scala.Unit] = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[scala.Boolean] = js.undefined,
    removeOnDestroy: js.UndefOr[scala.Boolean] = js.undefined
  ): PopperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed)
    if (!js.isUndefined(removeOnDestroy)) __obj.updateDynamic("removeOnDestroy")(removeOnDestroy)
    __obj.asInstanceOf[PopperOptions]
  }
}

