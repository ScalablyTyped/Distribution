package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Collection")
@js.native
object CollectionNs extends js.Object {
  /**
       * @classdesc
       * Events emitted by {@link ol.Collection} instances are instances of this
       * type.
       *
       * @param type Type.
       * @param opt_element Element.
       */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.eventsNs.Event {
    /**
             * @classdesc
             * Events emitted by {@link ol.Collection} instances are instances of this
             * type.
             *
             * @param type Type.
             * @param opt_element Element.
             */
    def this(`type`: EventType) = this()
    /**
             * @classdesc
             * Events emitted by {@link ol.Collection} instances are instances of this
             * type.
             *
             * @param type Type.
             * @param opt_element Element.
             */
    def this(`type`: EventType, opt_element: js.Any) = this()
    /**
             * The element that is added to or removed from the collection.
             * @api stable
             */
    var element: js.Any = js.native
  }
  
  type EventType = java.lang.String
}

