package typings.openseadragon.anon

import typings.openseadragon.mod.ButtonEvent
import typings.openseadragon.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: js.UndefOr[typings.std.Element] = js.undefined
  var fadeDelay: js.UndefOr[Double] = js.undefined
  var fadeLength: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onClick: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onEnter: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onExit: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onFocus: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onPress: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var onRelease: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  var srcDown: js.UndefOr[String] = js.undefined
  var srcGroup: js.UndefOr[String] = js.undefined
  var srcHover: js.UndefOr[String] = js.undefined
  var srcRest: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    element: typings.std.Element = null,
    fadeDelay: js.UndefOr[Double] = js.undefined,
    fadeLength: js.UndefOr[Double] = js.undefined,
    onBlur: ButtonEvent => Unit = null,
    onClick: ButtonEvent => Unit = null,
    onEnter: ButtonEvent => Unit = null,
    onExit: ButtonEvent => Unit = null,
    onFocus: ButtonEvent => Unit = null,
    onPress: ButtonEvent => Unit = null,
    onRelease: ButtonEvent => Unit = null,
    srcDown: String = null,
    srcGroup: String = null,
    srcHover: String = null,
    srcRest: String = null,
    tooltip: String = null
  ): Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeDelay)) __obj.updateDynamic("fadeDelay")(fadeDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeLength)) __obj.updateDynamic("fadeLength")(fadeLength.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (srcDown != null) __obj.updateDynamic("srcDown")(srcDown.asInstanceOf[js.Any])
    if (srcGroup != null) __obj.updateDynamic("srcGroup")(srcGroup.asInstanceOf[js.Any])
    if (srcHover != null) __obj.updateDynamic("srcHover")(srcHover.asInstanceOf[js.Any])
    if (srcRest != null) __obj.updateDynamic("srcRest")(srcRest.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

