package typings
package olLib.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/modify", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
           * @classdesc
           * Events emitted by {@link ol.interaction.Modify} instances are instances of
           * this type.
           *
           * @param type Type.
           * @param features The features modified.
           * @param mapBrowserPointerEvent Associated
           *     {@link ol.MapBrowserPointerEvent}.
           */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.ModifyNs.Event {
    /**
                 * @classdesc
                 * Events emitted by {@link ol.interaction.Modify} instances are instances of
                 * this type.
                 *
                 * @param type Type.
                 * @param features The features modified.
                 * @param mapBrowserPointerEvent Associated
                 *     {@link ol.MapBrowserPointerEvent}.
                 */
    def this(`type`: openlayersLib.openlayersMod.ModifyEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], mapBrowserPointerEvent: openlayersLib.openlayersMod.MapBrowserPointerEvent) = this()
  }
  
}

