package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "ObjectEvent")
@js.native
class ObjectEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.Object} instances are instances of this type.
    *
    * @param type The event type.
    * @param key The property name.
    * @param oldValue The old value for `key`.
    */
  def this(`type`: String, key: String, oldValue: js.Any) = this()
  /**
    * The name of the property whose value is changing.
    * @api stable
    */
  var key: String = js.native
  /**
    * The old value. To get the new value use `e.target.get(e.key)` where
    * `e` is the event object.
    * @api stable
    */
  var oldValue: js.Any = js.native
}

