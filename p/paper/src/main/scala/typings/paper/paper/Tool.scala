package typings.paper.paper

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Tool object refers to a script that the user can interact with by
  *     using the mouse and keyboard and can be accessed through the global
  *     `tool` variable. All its properties are also available in the paper
  *     scope.
  * 
  * The global `tool` variable only exists in scripts that contain mouse handler
  * functions ({@link #onMouseMove}, {@link #onMouseDown}, {@link #onMouseDrag},
  * {@link #onMouseUp}) or a keyboard handler function ({@link #onKeyDown},
  * {@link #onKeyUp}).
  */
@JSGlobal("paper.Tool")
@js.native
class Tool () extends js.Object {
  var fixedDistance: Double | Null = js.native
  /** 
    * The maximum distance the mouse has to drag before firing the onMouseDrag
    * event, since the last onMouseDrag event.
    */
  var maxDistance: Double | Null = js.native
  /** 
    * The minimum distance the mouse has to drag before firing the onMouseDrag
    * event, since the last onMouseDrag event.
    */
  var minDistance: Double | Null = js.native
  /** 
    * The function to be called when the user presses a key on the keyboard.
    * The function receives a {@link KeyEvent} object which contains
    * information about the keyboard event.
    * 
    * If the function returns `false`, the keyboard event will be prevented
    * from bubbling up. This can be used for example to stop the window from
    * scrolling, when you need the user to interact with arrow keys.
    */
  var onKeyDown: js.Function | Null = js.native
  /** 
    * The function to be called when the user releases a key on the keyboard.
    * The function receives a {@link KeyEvent} object which contains
    * information about the keyboard event.
    * 
    * If the function returns `false`, the keyboard event will be prevented
    * from bubbling up. This can be used for example to stop the window from
    * scrolling, when you need the user to interact with arrow keys.
    */
  var onKeyUp: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is pushed down. The
    * function receives a {@link ToolEvent} object which contains information
    * about the tool event.
    */
  var onMouseDown: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse position changes while the mouse
    * is being dragged. The function receives a {@link ToolEvent} object which
    * contains information about the tool event.
    */
  var onMouseDrag: js.Function | Null = js.native
  /** 
    * The function to be called the mouse moves within the project view. The
    * function receives a {@link ToolEvent} object which contains information
    * about the tool event.
    */
  var onMouseMove: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is released. The function
    * receives a {@link ToolEvent} object which contains information about the
    * tool event.
    */
  var onMouseUp: js.Function | Null = js.native
  /** 
    * Activates this tool, meaning {@link PaperScope#tool} will
    * point to it and it will be the one that receives tool events.
    */
  def activate(): Unit = js.native
  /** 
    * Emit an event on the tool.
    * 
    * @param type - the event type: {@values 'mousedown', 'mouseup',
    *     'mousedrag', 'mousemove', 'keydown', 'keyup'}
    * @param event - an object literal containing properties describing
    * the event
    * 
    * @return true if the event had listeners
    */
  def emit(`type`: String, event: js.Object): Boolean = js.native
  /** 
    * Detach one or more event handlers from the tool.
    * 
    * @param param - an object literal containing one or more of the
    *     following properties: {@values mousedown, mouseup, mousedrag,
    *     mousemove, keydown, keyup}
    * 
    * @return this tool itself, so calls can be chained
    */
  def off(param: js.Object): Tool = js.native
  /** 
    * Detach an event handler from the tool.
    * 
    * @param type - the event type: {@values 'mousedown', 'mouseup',
    *     'mousedrag', 'mousemove', 'keydown', 'keyup'}
    * @param function - the function to be detached
    * 
    * @return this tool itself, so calls can be chained
    */
  def off(`type`: String, callback: js.Function): Tool = js.native
  /** 
    * Attach one or more event handlers to the tool.
    * 
    * @param param - an object literal containing one or more of the
    *     following properties: {@values mousedown, mouseup, mousedrag,
    *     mousemove, keydown, keyup}
    * 
    * @return this tool itself, so calls can be chained
    */
  def on(param: js.Object): Tool = js.native
  /** 
    * Attach an event handler to the tool.
    * 
    * @param type - the event type: {@values 'mousedown', 'mouseup',
    *     'mousedrag', 'mousemove', 'keydown', 'keyup'}
    * @param function - the function to be called when the event
    *     occurs, receiving a {@link ToolEvent} object as its sole argument
    * 
    * @return this tool itself, so calls can be chained
    */
  def on(`type`: String, callback: js.Function): Tool = js.native
  /** 
    * Removes this tool from the {@link PaperScope#tools} list.
    */
  def remove(): Unit = js.native
  /** 
    * Check if the tool has one or more event handlers of the specified type.
    * 
    * @param type - the event type: {@values 'mousedown', 'mouseup',
    *     'mousedrag', 'mousemove', 'keydown', 'keyup'}
    * 
    * @return true if the tool has one or more event handlers of
    * the specified type
    */
  def responds(`type`: String): Boolean = js.native
}

/** 
  * The reference to the active tool.
  */
@JSGlobal("paper.tool")
@js.native
object tool extends TopLevel[Tool | Null]

