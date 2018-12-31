package typings
package olLib.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/collection", JSImport.Default)
@js.native
object defaultNs extends js.Object {
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
    extends openlayersLib.openlayersMod.CollectionNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.Collection} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_element Element.
      */
    def this(`type`: openlayersLib.openlayersMod.CollectionNs.EventType) = this()
    def this(`type`: openlayersLib.openlayersMod.CollectionNs.EventType, opt_element: js.Any) = this()
  }
  
}

