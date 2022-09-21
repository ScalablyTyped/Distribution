package typings.openlayers.mod

import typings.openlayers.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "ObjectEvent")
@js.native
open class ObjectEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.Object} instances are instances of this type.
    *
    * @param type The event type.
    * @param key The property name.
    * @param oldValue The old value for `key`.
    */
  def this(`type`: String, key: String, oldValue: Any) = this()
  
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
  var oldValue: Any = js.native
}
