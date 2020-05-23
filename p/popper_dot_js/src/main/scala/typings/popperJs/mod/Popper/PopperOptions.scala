package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperOptions extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var onCreate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  var removeOnDestroy: js.UndefOr[Boolean] = js.undefined
}

object PopperOptions {
  @scala.inline
  def apply(
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onCreate: /* data */ Data => Unit = null,
    onUpdate: /* data */ Data => Unit = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    removeOnDestroy: js.UndefOr[Boolean] = js.undefined
  ): PopperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.get.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnDestroy)) __obj.updateDynamic("removeOnDestroy")(removeOnDestroy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOptions]
  }
}

