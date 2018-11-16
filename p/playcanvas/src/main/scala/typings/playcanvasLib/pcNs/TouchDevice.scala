package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name pc.TouchDevice
    * @class Attach a TouchDevice to an element and it will receive and fire events when the element is touched.
    * See also {@link pc.Touch} and {@link pc.TouchEvent}
    * @description Create a new touch device and attach it to an element
    * @param {Element} element The element to attach listen for events on
    */
@JSGlobal("pc.TouchDevice")
@js.native
class TouchDevice protected () extends js.Object {
  def this(element: stdLib.Element) = this()
  /**
          * @function
          * @name pc.TouchDevice#attach
          * @description Attach a device to an element in the DOM.
          * If the device is already attached to an element this method will detach it first
          * @param {Element} element The element to attach to
          */
  def attach(element: stdLib.Element): scala.Unit = js.native
  /**
          * @function
          * @name pc.TouchDevice#detach
          * @description Detach a device from the element it is attached to
          */
  def detach(): scala.Unit = js.native
  /**
           * @function
           * @name pc.Touch#fire
           * @description Fire an event, all additional arguments are passed on to the event listener
           * @param {Object} name Name of event to fire
           * @param {*} [...] Arguments that are passed to the event handler
           * @example
           * obj.fire('test', 'This is the message');
           */
  def fire(
    name: java.lang.String,
    arg1: js.Any,
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
          * @function
          * @name pc.getTouchTargetCoords
          * @description Similiar to {@link pc.getTargetCoords} for the MouseEvents.
          * This function takes a browser Touch object and returns the co-ordinates of the
          * touch relative to the target element.
          * @param {Touch} touch The browser Touch object
          * @returns {Object} The co-ordinates of the touch relative to the touch.target element. In the format {x, y}
          */
  def getTouchTargetCoords(touch: playcanvasLib.BrowserTouch): playcanvasLib.Anon_Y = js.native
  /**
          * @function
          * @name pc.Touch#hasEvent
          * @description Test if there are any handlers bound to an event name
          * @param {String} name The name of the event to test
          * @example
          * obj.on('test', function () { }); // bind an event to 'test'
          * obj.hasEvent('test'); // returns true
          */
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  /**
           * @function
           * @name pc.Touch#off
           * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
           * if scope is not provided then all events with the callback will be unbound.
           * @param {String} [name] Name of the event to unbind
           * @param {Function} [callback] Function to be unbound
           * @param {Object} [scope] Scope that was used as the this when the event is fired
           * @example
           * var handler = function () {
           * };
           * obj.on('test', handler);
           *
           * obj.off(); // Removes all events
           * obj.off('test'); // Removes all events called 'test'
           * obj.off('test', handler); // Removes all handler functions, called 'test'
           * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
           */
  def off(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
           * @function
           * @name pc.Touch#on
           * @description Attach an event handler to an event
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.on('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           */
  def on(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
           * @function
           * @name pc.Touch#once
           * @description Attach an event handler to an event. This handler will be removed after being fired once.
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.once('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           * obj.fire('test', 1, 2); // not going to get handled
           */
  def once(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
}

