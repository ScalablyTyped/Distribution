package typings
package plottableLib.buildSrcDispatchersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers", "Touch")
@js.native
class Touch protected ()
  extends plottableLib.buildSrcDispatchersTouchDispatcherMod.Touch {
  /**
    * This constructor should not be invoked directly.
    *
    * @param {SVGElement} svg The root <svg> to attach to.
    */
  def this(component: plottableLib.buildSrcComponentsComponentMod.Component) = this()
}

/* static members */
@JSImport("plottable/build/src/dispatchers", "Touch")
@js.native
object Touch extends js.Object {
  var _DISPATCHER_KEY: js.Any = js.native
  var _TOUCHCANCEL_EVENT_NAME: js.Any = js.native
  var _TOUCHEND_EVENT_NAME: js.Any = js.native
  var _TOUCHMOVE_EVENT_NAME: js.Any = js.native
  var _TOUCHSTART_EVENT_NAME: js.Any = js.native
  /**
    * Gets a Touch Dispatcher for the component.
    * If one already exists, it will be returned; otherwise, a new one will be created.
    *
    * @param component
    * @return {Dispatchers.Touch}
    */
  def getDispatcher(component: plottableLib.buildSrcComponentsComponentMod.Component): plottableLib.buildSrcDispatchersMod.Touch = js.native
}

