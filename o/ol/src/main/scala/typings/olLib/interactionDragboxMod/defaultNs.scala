package typings
package olLib.interactionDragboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/dragbox", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.DragBox} instances are instances of
    * this type.
    *
    * @param type The event type.
    * @param coordinate The event coordinate.
    * @param mapBrowserEvent Originating event.
    */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.DragBoxNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragBox} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param coordinate The event coordinate.
      * @param mapBrowserEvent Originating event.
      */
    def this(`type`: java.lang.String, coordinate: openlayersLib.openlayersMod.Coordinate, mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
  }
  
}

