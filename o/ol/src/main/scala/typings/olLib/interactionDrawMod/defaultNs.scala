package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/draw", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Draw} instances are instances of
    * this type.
    *
    * @param type Type.
    * @param feature The feature drawn.
    */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.DrawNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Draw} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    def this(`type`: openlayersLib.openlayersMod.interactionNs.DrawEventType, feature: openlayersLib.openlayersMod.Feature) = this()
  }
  
}

