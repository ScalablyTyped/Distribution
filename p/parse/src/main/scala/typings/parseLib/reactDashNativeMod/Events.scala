package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @class
     *
     * <p>Parse.Events is a fork of Backbone's Events module, provided for your
     * convenience.</p>
     *
     * <p>A module that can be mixed in to any object in order to provide
     * it with custom events. You may bind callback functions to an event
     * with `on`, or remove these functions with `off`.
     * Triggering an event fires all callbacks in the order that `on` was
     * called.
     *
     * <pre>
     *     var object = {};
     *     _.extend(object, Parse.Events);
     *     object.on('expand', function(){ alert('expanded'); });
     *     object.trigger('expand');</pre></p>
     *
     * <p>For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Events">Backbone
     * documentation</a>.</p>
     */
@JSImport("parse/react-native", "Events")
@js.native
class Events ()
  extends parseLib.nodeMod.Events

/**
     * @class
     *
     * <p>Parse.Events is a fork of Backbone's Events module, provided for your
     * convenience.</p>
     *
     * <p>A module that can be mixed in to any object in order to provide
     * it with custom events. You may bind callback functions to an event
     * with `on`, or remove these functions with `off`.
     * Triggering an event fires all callbacks in the order that `on` was
     * called.
     *
     * <pre>
     *     var object = {};
     *     _.extend(object, Parse.Events);
     *     object.on('expand', function(){ alert('expanded'); });
     *     object.trigger('expand');</pre></p>
     *
     * <p>For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Events">Backbone
     * documentation</a>.</p>
     */
@JSImport("parse/react-native", "Events")
@js.native
object Events extends js.Object {
  def bind(): parseLib.ParseNs.Events = js.native
  def off(events: js.Array[java.lang.String]): parseLib.ParseNs.Events = js.native
  def off(events: js.Array[java.lang.String], callback: js.Function): parseLib.ParseNs.Events = js.native
  def off(events: js.Array[java.lang.String], callback: js.Function, context: js.Any): parseLib.ParseNs.Events = js.native
  def on(events: js.Array[java.lang.String]): parseLib.ParseNs.Events = js.native
  def on(events: js.Array[java.lang.String], callback: js.Function): parseLib.ParseNs.Events = js.native
  def on(events: js.Array[java.lang.String], callback: js.Function, context: js.Any): parseLib.ParseNs.Events = js.native
  def trigger(events: js.Array[java.lang.String]): parseLib.ParseNs.Events = js.native
  def unbind(): parseLib.ParseNs.Events = js.native
}

