package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Component
  * @description Base constructor for a Component
  * @class Components are used to attach functionality on a {@link pc.Entity}. Components
  * can receive update events each frame, and expose properties to the PlayCanvas Editor.
  * @param {pc.ComponentSystem} system The ComponentSystem used to create this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to
  * @property {Boolean} enabled Enables or disables the component.
  */
@JSGlobal("pc.Component")
@js.native
class Component protected () extends js.Object {
  def this(system: ComponentSystem, entity: Entity) = this()
  /**
    * @private
    * @readonly
    * @name pc.Component#data
    * @type pc.ComponentData
    * @description Access the {@link pc.ComponentData} directly. Usually you should
    * access the data properties via the individual properties as modifying this data
    * directly will not fire 'set' events.
    */
  val data: ComponentData = js.native
  var enabled: Boolean = js.native
  /**
    * @function
    * @name pc.Component#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: String,
    arg1: js.UndefOr[js.Any],
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): Unit = js.native
  /**
    * @function
    * @name pc.Component#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.Component#off
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
  def off(name: String): Unit = js.native
  def off(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): Unit = js.native
  // Events
  /**
    * @function
    * @name pc.Component#on
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
  def on(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): Unit = js.native
  /**
    * @function
    * @name pc.Component#once
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
  def once(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def once(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): Unit = js.native
}

