package typings.plottable

import org.scalablytyped.runtime.NumberDictionary
import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcDispatchersDispatcherMod.Dispatcher
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDispatchersTouchDispatcherMod {
  
  @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
  @js.native
  open class Touch protected () extends Dispatcher {
    /**
      * This constructor should not be invoked directly.
      *
      * @param {SVGElement} svg The root <svg> to attach to.
      */
    def this(component: Component) = this()
    
    /**
      * Computes the Touch position from the given event, and if successful
      * calls all the callbacks in the provided callbackSet.
      */
    /* private */ var _measureAndDispatch: Any = js.native
    
    /* private */ var _translator: Any = js.native
    
    def eventInside(component: Component, event: TouchEvent): Boolean = js.native
    
    /**
      * Removes a callback that would be called when a touch is cancelled.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchCancel(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a touch ends.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchEnd(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the touch position changes.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchMove(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a touch starts.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchStart(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch is cancelled.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchCancel(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch ends.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchEnd(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when the touch position changes.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchMove(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch starts.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchStart(callback: TouchCallback): this.type = js.native
  }
  /* static members */
  object Touch {
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: Any = js.native
    inline def _DISPATCHER_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHCANCEL_EVENT_NAME")
    @js.native
    def _TOUCHCANCEL_EVENT_NAME: Any = js.native
    inline def _TOUCHCANCEL_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHCANCEL_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHEND_EVENT_NAME")
    @js.native
    def _TOUCHEND_EVENT_NAME: Any = js.native
    inline def _TOUCHEND_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHEND_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHMOVE_EVENT_NAME")
    @js.native
    def _TOUCHMOVE_EVENT_NAME: Any = js.native
    inline def _TOUCHMOVE_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHMOVE_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHSTART_EVENT_NAME")
    @js.native
    def _TOUCHSTART_EVENT_NAME: Any = js.native
    inline def _TOUCHSTART_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHSTART_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Touch Dispatcher for the component.
      * If one already exists, it will be returned; otherwise, a new one will be created.
      *
      * @param component
      * @return {Dispatchers.Touch}
      */
    inline def getDispatcher(component: Component): typings.plottable.buildSrcDispatchersMod.Touch = ^.asInstanceOf[js.Dynamic].applyDynamic("getDispatcher")(component.asInstanceOf[js.Any]).asInstanceOf[typings.plottable.buildSrcDispatchersMod.Touch]
  }
  
  type TouchCallback = js.Function3[
    /* ids */ js.Array[Double], 
    /* idToPoint */ NumberDictionary[Point], 
    /* event */ TouchEvent, 
    Unit
  ]
}
