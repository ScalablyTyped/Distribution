package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEvent extends js.Object {
  val altKey: scala.Boolean
  val browserEvent: stdLib.MouseEvent
  val ctrlKey: scala.Boolean
  val detail: scala.Double
  val leftButton: scala.Boolean
  val metaKey: scala.Boolean
  val middleButton: scala.Boolean
  val posx: scala.Double
  val posy: scala.Double
  val rightButton: scala.Boolean
  val shiftKey: scala.Boolean
  val target: stdLib.HTMLElement
  val timestamp: scala.Double
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object IMouseEvent {
  @scala.inline
  def apply(
    altKey: scala.Boolean,
    browserEvent: stdLib.MouseEvent,
    ctrlKey: scala.Boolean,
    detail: scala.Double,
    leftButton: scala.Boolean,
    metaKey: scala.Boolean,
    middleButton: scala.Boolean,
    posx: scala.Double,
    posy: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    rightButton: scala.Boolean,
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: stdLib.HTMLElement,
    timestamp: scala.Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("browserEvent")(browserEvent)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("leftButton")(leftButton)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("middleButton")(middleButton)
    __obj.updateDynamic("posx")(posx)
    __obj.updateDynamic("posy")(posy)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("rightButton")(rightButton)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IMouseEvent]
  }
}

