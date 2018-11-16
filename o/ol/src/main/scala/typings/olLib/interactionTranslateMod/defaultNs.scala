package typings
package olLib.interactionTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/translate", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
           * @classdesc
           * Events emitted by {@link ol.interaction.Translate} instances are instances of
           * this type.
           *
           * @param type Type.
           * @param features The features translated.
           * @param coordinate The event coordinate.
           */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.TranslateNs.Event {
    /**
                 * @classdesc
                 * Events emitted by {@link ol.interaction.Translate} instances are instances of
                 * this type.
                 *
                 * @param type Type.
                 * @param features The features translated.
                 * @param coordinate The event coordinate.
                 */
    def this(`type`: openlayersLib.openlayersMod.interactionNs.TranslateEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], coordinate: openlayersLib.openlayersMod.Coordinate) = this()
  }
  
}

