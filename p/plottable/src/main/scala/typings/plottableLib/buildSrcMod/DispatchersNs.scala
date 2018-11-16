package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Dispatchers")
@js.native
object DispatchersNs extends js.Object {
  @js.native
  class Key ()
    extends plottableLib.buildSrcDispatchersMod.Key
  
  @js.native
  class Mouse protected ()
    extends plottableLib.buildSrcDispatchersMod.Mouse
  
  @js.native
  class Touch protected ()
    extends plottableLib.buildSrcDispatchersMod.Touch {
    /**
         * This constructor should not be invoked directly.
         *
         * @param {SVGElement} svg The root <svg> to attach to.
         */
    def this(component: plottableLib.buildSrcComponentsComponentMod.Component) = this()
  }
  
  @js.native
  object Key extends js.Object {
    var _DISPATCHER_KEY: js.Any = js.native
    var _KEYDOWN_EVENT_NAME: js.Any = js.native
    var _KEYUP_EVENT_NAME: js.Any = js.native
    /**
         * Gets a Key Dispatcher. If one already exists it will be returned;
         * otherwise, a new one will be created.
         *
         * @return {Dispatchers.Key}
         */
    def getDispatcher(): plottableLib.buildSrcDispatchersMod.Key = js.native
  }
  
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
  
}

