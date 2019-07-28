package typings.popperDotJs.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperOptions extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.Modifiers] = js.undefined
  var onCreate: js.UndefOr[js.Function1[/* data */ typings.popperDotJs.popperDotJsMod.PopperNs.Data, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ typings.popperDotJs.popperDotJsMod.PopperNs.Data, Unit]] = js.undefined
  var placement: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.Placement] = js.undefined
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  var removeOnDestroy: js.UndefOr[Boolean] = js.undefined
}

object PopperOptions {
  @scala.inline
  def apply(
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    modifiers: typings.popperDotJs.popperDotJsMod.PopperNs.Modifiers = null,
    onCreate: /* data */ typings.popperDotJs.popperDotJsMod.PopperNs.Data => Unit = null,
    onUpdate: /* data */ typings.popperDotJs.popperDotJsMod.PopperNs.Data => Unit = null,
    placement: typings.popperDotJs.popperDotJsMod.PopperNs.Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    removeOnDestroy: js.UndefOr[Boolean] = js.undefined
  ): PopperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed)
    if (!js.isUndefined(removeOnDestroy)) __obj.updateDynamic("removeOnDestroy")(removeOnDestroy)
    __obj.asInstanceOf[PopperOptions]
  }
}

