package typings.openlayers.mod

import typings.openlayers.mod.events.Event
import typings.openlayers.mod.events.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "Observable")
@js.native
/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * An event target providing convenient methods for listener registration
  * and unregistration. A generic `change` event is always available through
  * {@link ol.Observable#changed}.
  *
  * @fires ol.events.Event
  * @struct
  * @api stable
  */
class Observable () extends EventTarget {
  
  /**
    * Increases the revision counter and dispatches a 'change' event.
    * @api
    */
  def changed(): Unit = js.native
  
  def dispatchEvent(event: String): Unit = js.native
  /**
    * Dispatches an event and calls all listeners listening for events
    * of this type. The event parameter can either be a string or an
    * Object with a `type` property.
    *
    * @param event Event object.
    * @api
    */
  def dispatchEvent(event: GlobalObject): Unit = js.native
  def dispatchEvent(event: Event): Unit = js.native
  
  /**
    * Get the version number for this object.  Each time the object is modified,
    * its version number will be incremented.
    * @return Revision.
    * @api
    */
  def getRevision(): Double = js.native
  
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
  def on(`type`: String, listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  def on(`type`: String, listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  def on(`type`: js.Array[String], listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  def on(`type`: js.Array[String], listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  
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
  def once(`type`: String, listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  def once(`type`: String, listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  def once(`type`: js.Array[String], listener: EventsListenerFunctionType): EventsKey | js.Array[EventsKey] = js.native
  def once(`type`: js.Array[String], listener: EventsListenerFunctionType, opt_this: GlobalObject): EventsKey | js.Array[EventsKey] = js.native
  
  /**
    * Unlisten for a certain type of event.
    * @param type The event type or array of event types.
    * @param listener The listener function.
    * @param opt_this The object which was used as `this` by the
    * `listener`.
    * @api stable
    */
  def un(`type`: String, listener: EventsListenerFunctionType): Unit = js.native
  def un(`type`: String, listener: EventsListenerFunctionType, opt_this: GlobalObject): Unit = js.native
  def un(`type`: js.Array[String], listener: EventsListenerFunctionType): Unit = js.native
  def un(`type`: js.Array[String], listener: EventsListenerFunctionType, opt_this: GlobalObject): Unit = js.native
}
/* static members */
object Observable {
  
  @JSImport("openlayers", "Observable")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unByKey(key: js.Array[EventsKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Removes an event listener using the key returned by `on()` or `once()`.
    * @param key The key returned by `on()`
    *     or `once()` (or an array of keys).
    * @api stable
    */
  @scala.inline
  def unByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
