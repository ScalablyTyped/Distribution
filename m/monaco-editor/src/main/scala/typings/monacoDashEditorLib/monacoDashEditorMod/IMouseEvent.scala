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
    preventDefault: () => scala.Unit,
    rightButton: scala.Boolean,
    shiftKey: scala.Boolean,
    stopPropagation: () => scala.Unit,
    target: stdLib.HTMLElement,
    timestamp: scala.Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey, browserEvent = browserEvent, ctrlKey = ctrlKey, detail = detail, leftButton = leftButton, metaKey = metaKey, middleButton = middleButton, posx = posx, posy = posy, preventDefault = js.Any.fromFunction0(preventDefault), rightButton = rightButton, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp)
  
    __obj.asInstanceOf[IMouseEvent]
  }
}

