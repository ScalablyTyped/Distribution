package typings
package olLib.interactionExtentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Extent", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Extent} instances are instances of
    * this type.
    *
    * @param extent the new extent
    */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.ExtentNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Extent} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    def this(`type`: openlayersLib.openlayersMod.interactionNs.ExtentEventType, extent: openlayersLib.openlayersMod.Extent) = this()
  }
  
}

