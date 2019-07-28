package typings.monacoDashEditor.monacoDashEditorMod

import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEvent extends js.Object {
  val altKey: Boolean
  val browserEvent: MouseEvent
  val ctrlKey: Boolean
  val detail: Double
  val leftButton: Boolean
  val metaKey: Boolean
  val middleButton: Boolean
  val posx: Double
  val posy: Double
  val rightButton: Boolean
  val shiftKey: Boolean
  val target: HTMLElement
  val timestamp: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object IMouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    browserEvent: MouseEvent,
    ctrlKey: Boolean,
    detail: Double,
    leftButton: Boolean,
    metaKey: Boolean,
    middleButton: Boolean,
    posx: Double,
    posy: Double,
    preventDefault: () => Unit,
    rightButton: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timestamp: Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey, browserEvent = browserEvent, ctrlKey = ctrlKey, detail = detail, leftButton = leftButton, metaKey = metaKey, middleButton = middleButton, posx = posx, posy = posy, preventDefault = js.Any.fromFunction0(preventDefault), rightButton = rightButton, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp)
  
    __obj.asInstanceOf[IMouseEvent]
  }
}

