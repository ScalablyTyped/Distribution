package typings.plottable.buildSrcDispatchersTouchDispatcherMod

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcDispatchersDispatcherMod.Dispatcher
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
@js.native
class Touch protected () extends Dispatcher {
  /**
    * This constructor should not be invoked directly.
    *
    * @param {SVGElement} svg The root <svg> to attach to.
    */
  def this(component: Component) = this()
  var _translator: js.Any = js.native
  /**
    * Computes the Touch position from the given event, and if successful
    * calls all the callbacks in the provided callbackSet.
    */
  /* private */ def _measureAndDispatch(component: js.Any, event: js.Any, eventName: js.Any): js.Any = js.native
  /* private */ def _measureAndDispatch(component: js.Any, event: js.Any, eventName: js.Any, scope: js.Any): js.Any = js.native
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
@JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
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
  def getDispatcher(component: Component): typings.plottable.buildSrcDispatchersMod.Touch = js.native
}

