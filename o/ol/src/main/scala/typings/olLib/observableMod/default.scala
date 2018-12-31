package typings
package olLib.observableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/observable", JSImport.Default)
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
class default ()
  extends openlayersLib.openlayersMod.Observable

@JSImport("ol/observable", JSImport.Default)
@js.native
object default extends js.Object {
  def unByKey(key: js.Array[openlayersLib.openlayersMod.EventsKey]): scala.Unit = js.native
  /**
    * Removes an event listener using the key returned by `on()` or `once()`.
    * @param key The key returned by `on()`
    *     or `once()` (or an array of keys).
    * @api stable
    */
  def unByKey(key: openlayersLib.openlayersMod.EventsKey): scala.Unit = js.native
}

