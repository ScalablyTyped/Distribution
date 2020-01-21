package typings.officeUiFabricReact

import typings.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent
import typings.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var style: js.Any
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): Unit
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): Unit
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String,
    onMouseDown: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    onMouseUp: MouseTouchEvent[HTMLElement] => Unit,
    onTouchEnd: MouseTouchEvent[HTMLElement] => Unit,
    onTouchStart: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    style: js.Any
  ): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassName]
  }
}

