package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/select", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Select} instances are instances of
    * this type.
    *
    * @param type The event type.
    * @param selected Selected features.
    * @param deselected Deselected features.
    * @param mapBrowserEvent Associated
    *     {@link ol.MapBrowserEvent}.
    */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.SelectNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Select} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param selected Selected features.
      * @param deselected Deselected features.
      * @param mapBrowserEvent Associated
      *     {@link ol.MapBrowserEvent}.
      */
    def this(`type`: java.lang.String, selected: js.Array[openlayersLib.openlayersMod.Feature], deselected: js.Array[openlayersLib.openlayersMod.Feature], mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
  }
  
}

