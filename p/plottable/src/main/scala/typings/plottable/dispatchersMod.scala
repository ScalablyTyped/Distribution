package typings.plottable

import typings.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/dispatchers", JSImport.Namespace)
@js.native
object dispatchersMod extends js.Object {
  
  @js.native
  /**
    * This constructor should not be invoked directly.
    *
    * @constructor
    */
  class Key ()
    extends typings.plottable.keyDispatcherMod.Key
  /* static members */
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
    def getDispatcher(): Key = js.native
  }
  
  @js.native
  /**
    * This constructor not be invoked directly.
    *
    * @constructor
    */
  class Mouse protected ()
    extends typings.plottable.mouseDispatcherMod.Mouse
  /* static members */
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
    def getDispatcher(component: Component): Mouse = js.native
  }
  
  @js.native
  class Touch protected ()
    extends typings.plottable.touchDispatcherMod.Touch {
    /**
      * This constructor should not be invoked directly.
      *
      * @param {SVGElement} svg The root <svg> to attach to.
      */
    def this(component: Component) = this()
  }
  /* static members */
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
    def getDispatcher(component: Component): Touch = js.native
  }
}
