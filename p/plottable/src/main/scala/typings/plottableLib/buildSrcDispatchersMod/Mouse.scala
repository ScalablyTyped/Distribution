package typings
package plottableLib.buildSrcDispatchersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers", "Mouse")
@js.native
/**
  * This constructor not be invoked directly.
  *
  * @constructor
  */
class Mouse protected ()
  extends plottableLib.buildSrcDispatchersMouseDispatcherMod.Mouse

@JSImport("plottable/build/src/dispatchers", "Mouse")
@js.native
object Mouse extends js.Object {
  var _DBLCLICK_EVENT_NAME: js.Any = js.native
  var _DISPATCHER_KEY: js.Any = js.native
  var _MOUSEDOWN_EVENT_NAME: js.Any = js.native
  var _MOUSEMOVE_EVENT_NAME: js.Any = js.native
  var _MOUSEOUT_EVENT_NAME: js.Any = js.native
  var _MOUSEOVER_EVENT_NAME: js.Any = js.native
  var _MOUSEUP_EVENT_NAME: js.Any = js.native
  var _WHEEL_EVENT_NAME: js.Any = js.native
  /**
    * Get a Mouse Dispatcher for the component tree.
    * If one already exists on that <svg>, it will be returned; otherwise, a new one will be created.
    *
    * @param {SVGElement} elem
    * @return {Dispatchers.Mouse}
    */
  def getDispatcher(component: plottableLib.buildSrcComponentsComponentMod.Component): plottableLib.buildSrcDispatchersMod.Mouse = js.native
}

