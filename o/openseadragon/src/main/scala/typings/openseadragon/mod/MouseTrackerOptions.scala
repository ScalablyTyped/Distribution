package typings.openseadragon.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseTrackerOptions extends js.Object {
  var blurHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var clickDistThreshold: js.UndefOr[Double] = js.native
  var clickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var clickTimeThreshold: js.UndefOr[Double] = js.native
  var dblClickDistThreshold: js.UndefOr[Double] = js.native
  var dblClickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var dblClickTimeThreshold: js.UndefOr[Double] = js.native
  var dragEndHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var dragHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var element: Element | String = js.native
  var enterHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var exitHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var focusHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyDownHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyUpHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var moveHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var nonPrimaryPressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var nonPrimaryReleaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var pinchHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var pressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var releaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var scrollHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var startDisabled: js.UndefOr[Boolean] = js.native
  var stopDelay: js.UndefOr[Double] = js.native
  var userData: js.UndefOr[js.Object] = js.native
}

object MouseTrackerOptions {
  @scala.inline
  def apply(element: Element | String): MouseTrackerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerOptions]
  }
  @scala.inline
  implicit class MouseTrackerOptionsOps[Self <: MouseTrackerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElement(value: Element | String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurHandler(value: OSDEvent[_] => Unit): Self = this.set("blurHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlurHandler: Self = this.set("blurHandler", js.undefined)
    @scala.inline
    def setClickDistThreshold(value: Double): Self = this.set("clickDistThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickDistThreshold: Self = this.set("clickDistThreshold", js.undefined)
    @scala.inline
    def setClickHandler(value: OSDEvent[_] => Unit): Self = this.set("clickHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    @scala.inline
    def setClickTimeThreshold(value: Double): Self = this.set("clickTimeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTimeThreshold: Self = this.set("clickTimeThreshold", js.undefined)
    @scala.inline
    def setDblClickDistThreshold(value: Double): Self = this.set("dblClickDistThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickDistThreshold: Self = this.set("dblClickDistThreshold", js.undefined)
    @scala.inline
    def setDblClickHandler(value: OSDEvent[_] => Unit): Self = this.set("dblClickHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDblClickHandler: Self = this.set("dblClickHandler", js.undefined)
    @scala.inline
    def setDblClickTimeThreshold(value: Double): Self = this.set("dblClickTimeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickTimeThreshold: Self = this.set("dblClickTimeThreshold", js.undefined)
    @scala.inline
    def setDragEndHandler(value: OSDEvent[_] => Unit): Self = this.set("dragEndHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragEndHandler: Self = this.set("dragEndHandler", js.undefined)
    @scala.inline
    def setDragHandler(value: OSDEvent[_] => Unit): Self = this.set("dragHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragHandler: Self = this.set("dragHandler", js.undefined)
    @scala.inline
    def setEnterHandler(value: OSDEvent[_] => Unit): Self = this.set("enterHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnterHandler: Self = this.set("enterHandler", js.undefined)
    @scala.inline
    def setExitHandler(value: OSDEvent[_] => Unit): Self = this.set("exitHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExitHandler: Self = this.set("exitHandler", js.undefined)
    @scala.inline
    def setFocusHandler(value: OSDEvent[_] => Unit): Self = this.set("focusHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusHandler: Self = this.set("focusHandler", js.undefined)
    @scala.inline
    def setKeyDownHandler(value: OSDEvent[_] => Unit): Self = this.set("keyDownHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyDownHandler: Self = this.set("keyDownHandler", js.undefined)
    @scala.inline
    def setKeyHandler(value: OSDEvent[_] => Unit): Self = this.set("keyHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyHandler: Self = this.set("keyHandler", js.undefined)
    @scala.inline
    def setKeyUpHandler(value: OSDEvent[_] => Unit): Self = this.set("keyUpHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyUpHandler: Self = this.set("keyUpHandler", js.undefined)
    @scala.inline
    def setMoveHandler(value: OSDEvent[_] => Unit): Self = this.set("moveHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveHandler: Self = this.set("moveHandler", js.undefined)
    @scala.inline
    def setNonPrimaryPressHandler(value: OSDEvent[_] => Unit): Self = this.set("nonPrimaryPressHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNonPrimaryPressHandler: Self = this.set("nonPrimaryPressHandler", js.undefined)
    @scala.inline
    def setNonPrimaryReleaseHandler(value: OSDEvent[_] => Unit): Self = this.set("nonPrimaryReleaseHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNonPrimaryReleaseHandler: Self = this.set("nonPrimaryReleaseHandler", js.undefined)
    @scala.inline
    def setPinchHandler(value: OSDEvent[_] => Unit): Self = this.set("pinchHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deletePinchHandler: Self = this.set("pinchHandler", js.undefined)
    @scala.inline
    def setPressHandler(value: OSDEvent[_] => Unit): Self = this.set("pressHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deletePressHandler: Self = this.set("pressHandler", js.undefined)
    @scala.inline
    def setReleaseHandler(value: OSDEvent[_] => Unit): Self = this.set("releaseHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReleaseHandler: Self = this.set("releaseHandler", js.undefined)
    @scala.inline
    def setScrollHandler(value: OSDEvent[_] => Unit): Self = this.set("scrollHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScrollHandler: Self = this.set("scrollHandler", js.undefined)
    @scala.inline
    def setStartDisabled(value: Boolean): Self = this.set("startDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDisabled: Self = this.set("startDisabled", js.undefined)
    @scala.inline
    def setStopDelay(value: Double): Self = this.set("stopDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopDelay: Self = this.set("stopDelay", js.undefined)
    @scala.inline
    def setUserData(value: js.Object): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
  
}

