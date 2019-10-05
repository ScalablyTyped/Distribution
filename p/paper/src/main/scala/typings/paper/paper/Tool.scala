package typings.paper.paper

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Tool")
@js.native
class Tool () extends Base {
  /**
    *
    */
  var fixedDistance: Double = js.native
  /**
    * The maximum distance the mouse has to drag before firing the onMouseDrag event, since the last onMouseDrag event.
    */
  var maxDistance: Double = js.native
  /**
    * The minimum distance the mouse has to drag before firing the onMouseDrag event, since the last onMouseDrag event.
    */
  var minDistance: Double = js.native
  /**
    * Activates this tool, meaning paperScope.tool will point to it and it will be the one that recieves mouse events.
    */
  def activate(): Unit = js.native
  /**
    * Emit an event on the tool.
    * @param type - String('mousedown'|'mouseup'|'mousedrag'|'mousemove'|'keydown'|'keyup') the event type
    * @param event - an object literal containing properties describing the event.
    */
  def emit(`type`: String, event: js.Any): Boolean = js.native
  /**
    * Detach one or more event handlers from the tool.
    * @param param -  an object literal containing one or more of the following properties: mousedown, mouseup, mousedrag, mousemove, keydown, keyup
    */
  def off(param: js.Any): Tool = js.native
  /**
    * Detach an event handler from the tool.
    * @param type - String('mousedown'|'mouseup'|'mousedrag'|'mousemove'|'keydown'|'keyup') the event type
    * @param function - The function to be detached
    */
  def off(`type`: String, callback: js.Function1[/* event */ ToolEvent | KeyEvent, Unit | Boolean]): Tool = js.native
  /**
    * Attach one or more event handlers to the tool.
    * @param param - an object literal containing one or more of the following properties: mousedown, mouseup, mousedrag, mousemove, keydown, keyup
    */
  def on(param: js.Any): Tool = js.native
  /**
    * Attach an event handler to the tool.
    * @param type - String('mousedown'|'mouseup'|'mousedrag'|'mousemove'|'keydown'|'keyup') the event type
    * @param function - The function to be called when the event occurs
    */
  def on(`type`: String, callback: js.Function1[/* event */ ToolEvent | KeyEvent, Unit | Boolean]): Tool = js.native
  /**
    * The function to be called when the user presses a key on the keyboard.
    * The function receives a KeyEvent object which contains information about the keyboard event.
    * If the function returns false, the keyboard event will be prevented from bubbling up. This can be used for example to stop the window from scrolling, when you need the user to interact with arrow keys.
    */
  def onKeyDown(event: KeyEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the user releases a key on the keyboard.
    * The function receives a KeyEvent object which contains information about the keyboard event.
    * If the function returns false, the keyboard event will be prevented from bubbling up. This can be used for example to stop the window from scrolling, when you need the user to interact with arrow keys.
    */
  def onKeyUp(event: KeyEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse button is pushed down. The function receives a ToolEvent object which contains information about the mouse event.
    */
  def onMouseDown(event: ToolEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse position changes while the mouse is being dragged. The function receives a ToolEvent object which contains information about the mouse event.
    */
  def onMouseDrag(event: ToolEvent): Unit | Boolean = js.native
  /**
    * The function to be called the mouse moves within the project view. The function receives a ToolEvent object which contains information about the mouse event.
    */
  def onMouseMove(event: ToolEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse button is released. The function receives a ToolEvent object which contains information about the mouse event.
    */
  def onMouseUp(event: ToolEvent): Unit | Boolean = js.native
  /**
    * Removes this tool from the paperScope.tools list.
    */
  def remove(): Unit = js.native
  /**
    * Check if the tool has one or more event handlers of the specified type.
    * @param type - String('mousedown'|'mouseup'|'mousedrag'|'mousemove'|'keydown'|'keyup') the event type
    */
  def responds(`type`: String): Boolean = js.native
}

@JSGlobal("paper.tool")
@js.native
object tool extends TopLevel[Tool]

