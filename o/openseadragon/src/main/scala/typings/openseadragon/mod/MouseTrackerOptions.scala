package typings.openseadragon.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseTrackerOptions extends js.Object {
  var blurHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var clickDistThreshold: js.UndefOr[Double] = js.undefined
  var clickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var clickTimeThreshold: js.UndefOr[Double] = js.undefined
  var dblClickDistThreshold: js.UndefOr[Double] = js.undefined
  var dblClickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var dblClickTimeThreshold: js.UndefOr[Double] = js.undefined
  var dragEndHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var dragHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var element: Element | String
  var enterHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var exitHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var focusHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var keyDownHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var keyHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var keyUpHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var moveHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var nonPrimaryPressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var nonPrimaryReleaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var pinchHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var pressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var releaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var scrollHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.undefined
  var startDisabled: js.UndefOr[Boolean] = js.undefined
  var stopDelay: js.UndefOr[Double] = js.undefined
  var userData: js.UndefOr[js.Object] = js.undefined
}

object MouseTrackerOptions {
  @scala.inline
  def apply(
    element: Element | String,
    blurHandler: OSDEvent[_] => Unit = null,
    clickDistThreshold: js.UndefOr[Double] = js.undefined,
    clickHandler: OSDEvent[_] => Unit = null,
    clickTimeThreshold: js.UndefOr[Double] = js.undefined,
    dblClickDistThreshold: js.UndefOr[Double] = js.undefined,
    dblClickHandler: OSDEvent[_] => Unit = null,
    dblClickTimeThreshold: js.UndefOr[Double] = js.undefined,
    dragEndHandler: OSDEvent[_] => Unit = null,
    dragHandler: OSDEvent[_] => Unit = null,
    enterHandler: OSDEvent[_] => Unit = null,
    exitHandler: OSDEvent[_] => Unit = null,
    focusHandler: OSDEvent[_] => Unit = null,
    keyDownHandler: OSDEvent[_] => Unit = null,
    keyHandler: OSDEvent[_] => Unit = null,
    keyUpHandler: OSDEvent[_] => Unit = null,
    moveHandler: OSDEvent[_] => Unit = null,
    nonPrimaryPressHandler: OSDEvent[_] => Unit = null,
    nonPrimaryReleaseHandler: OSDEvent[_] => Unit = null,
    pinchHandler: OSDEvent[_] => Unit = null,
    pressHandler: OSDEvent[_] => Unit = null,
    releaseHandler: OSDEvent[_] => Unit = null,
    scrollHandler: OSDEvent[_] => Unit = null,
    startDisabled: js.UndefOr[Boolean] = js.undefined,
    stopDelay: js.UndefOr[Double] = js.undefined,
    userData: js.Object = null
  ): MouseTrackerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (blurHandler != null) __obj.updateDynamic("blurHandler")(js.Any.fromFunction1(blurHandler))
    if (!js.isUndefined(clickDistThreshold)) __obj.updateDynamic("clickDistThreshold")(clickDistThreshold.get.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction1(clickHandler))
    if (!js.isUndefined(clickTimeThreshold)) __obj.updateDynamic("clickTimeThreshold")(clickTimeThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickDistThreshold)) __obj.updateDynamic("dblClickDistThreshold")(dblClickDistThreshold.get.asInstanceOf[js.Any])
    if (dblClickHandler != null) __obj.updateDynamic("dblClickHandler")(js.Any.fromFunction1(dblClickHandler))
    if (!js.isUndefined(dblClickTimeThreshold)) __obj.updateDynamic("dblClickTimeThreshold")(dblClickTimeThreshold.get.asInstanceOf[js.Any])
    if (dragEndHandler != null) __obj.updateDynamic("dragEndHandler")(js.Any.fromFunction1(dragEndHandler))
    if (dragHandler != null) __obj.updateDynamic("dragHandler")(js.Any.fromFunction1(dragHandler))
    if (enterHandler != null) __obj.updateDynamic("enterHandler")(js.Any.fromFunction1(enterHandler))
    if (exitHandler != null) __obj.updateDynamic("exitHandler")(js.Any.fromFunction1(exitHandler))
    if (focusHandler != null) __obj.updateDynamic("focusHandler")(js.Any.fromFunction1(focusHandler))
    if (keyDownHandler != null) __obj.updateDynamic("keyDownHandler")(js.Any.fromFunction1(keyDownHandler))
    if (keyHandler != null) __obj.updateDynamic("keyHandler")(js.Any.fromFunction1(keyHandler))
    if (keyUpHandler != null) __obj.updateDynamic("keyUpHandler")(js.Any.fromFunction1(keyUpHandler))
    if (moveHandler != null) __obj.updateDynamic("moveHandler")(js.Any.fromFunction1(moveHandler))
    if (nonPrimaryPressHandler != null) __obj.updateDynamic("nonPrimaryPressHandler")(js.Any.fromFunction1(nonPrimaryPressHandler))
    if (nonPrimaryReleaseHandler != null) __obj.updateDynamic("nonPrimaryReleaseHandler")(js.Any.fromFunction1(nonPrimaryReleaseHandler))
    if (pinchHandler != null) __obj.updateDynamic("pinchHandler")(js.Any.fromFunction1(pinchHandler))
    if (pressHandler != null) __obj.updateDynamic("pressHandler")(js.Any.fromFunction1(pressHandler))
    if (releaseHandler != null) __obj.updateDynamic("releaseHandler")(js.Any.fromFunction1(releaseHandler))
    if (scrollHandler != null) __obj.updateDynamic("scrollHandler")(js.Any.fromFunction1(scrollHandler))
    if (!js.isUndefined(startDisabled)) __obj.updateDynamic("startDisabled")(startDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopDelay)) __obj.updateDynamic("stopDelay")(stopDelay.get.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerOptions]
  }
}

