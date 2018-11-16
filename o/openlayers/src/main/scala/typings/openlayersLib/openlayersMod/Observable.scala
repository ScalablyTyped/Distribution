package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Observable")
@js.native
class Observable ()
  extends openlayersLib.openlayersMod.eventsNs.EventTarget {
  /**
       * Increases the revision counter and dispatches a 'change' event.
       * @api
       */
  def changed(): scala.Unit = js.native
  /**
       * Dispatches an event and calls all listeners listening for events
       * of this type. The event parameter can either be a string or an
       * Object with a `type` property.
       *
       * @param event Event object.
       * @api
       */
  def dispatchEvent(event: java.lang.String): scala.Unit = js.native
  /**
       * Dispatches an event and calls all listeners listening for events
       * of this type. The event parameter can either be a string or an
       * Object with a `type` property.
       *
       * @param event Event object.
       * @api
       */
  def dispatchEvent(event: GlobalObject): scala.Unit = js.native
  /**
       * Dispatches an event and calls all listeners listening for events
       * of this type. The event parameter can either be a string or an
       * Object with a `type` property.
       *
       * @param event Event object.
       * @api
       */
  def dispatchEvent(event: openlayersLib.openlayersMod.eventsNs.Event): scala.Unit = js.native
  /**
       * Get the version number for this object.  Each time the object is modified,
       * its version number will be incremented.
       * @return Revision.
       * @api
       */
  def getRevision(): scala.Double = js.native
  /**
       * Listen for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def on(`type`: java.lang.String, listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def on(`type`: java.lang.String, listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def on(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def on(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen once for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def once(`type`: java.lang.String, listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen once for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def once(`type`: java.lang.String, listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen once for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def once(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Listen once for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object to use as `this` in `listener`.
       * @return Unique key for the listener. If
       *     called with an array of event types as the first argument, the return
       *     will be an array of keys.
       * @api stable
       */
  def once(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  /**
       * Unlisten for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object which was used as `this` by the
       * `listener`.
       * @api stable
       */
  def un(`type`: java.lang.String, listener: EventsListenerFunctionType): scala.Unit = js.native
  /**
       * Unlisten for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object which was used as `this` by the
       * `listener`.
       * @api stable
       */
  def un(`type`: java.lang.String, listener: EventsListenerFunctionType, opt_this: GlobalObject): scala.Unit = js.native
  /**
       * Unlisten for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object which was used as `this` by the
       * `listener`.
       * @api stable
       */
  def un(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType): scala.Unit = js.native
  /**
       * Unlisten for a certain type of event.
       * @param type The event type or array of event types.
       * @param listener The listener function.
       * @param opt_this The object which was used as `this` by the
       * `listener`.
       * @api stable
       */
  def un(`type`: js.Array[java.lang.String], listener: EventsListenerFunctionType, opt_this: GlobalObject): scala.Unit = js.native
}

@JSImport("openlayers", "Observable")
@js.native
object Observable extends js.Object {
  /**
       * Removes an event listener using the key returned by `on()` or `once()`.
       * @param key The key returned by `on()`
       *     or `once()` (or an array of keys).
       * @api stable
       */
  def unByKey(key: js.Array[openlayersLib.openlayersMod.EventsKey]): scala.Unit = js.native
  /**
       * Removes an event listener using the key returned by `on()` or `once()`.
       * @param key The key returned by `on()`
       *     or `once()` (or an array of keys).
       * @api stable
       */
  def unByKey(key: openlayersLib.openlayersMod.EventsKey): scala.Unit = js.native
}

