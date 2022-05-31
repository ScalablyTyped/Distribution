package typings.openlayers.global.ol

import typings.openlayers.mod.EventsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Observable")
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
class Observable ()
  extends typings.openlayers.mod.Observable
/* static members */
object Observable {
  
  @JSGlobal("ol.Observable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def unByKey(key: js.Array[EventsKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Removes an event listener using the key returned by `on()` or `once()`.
    * @param key The key returned by `on()`
    *     or `once()` (or an array of keys).
    * @api stable
    */
  inline def unByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
