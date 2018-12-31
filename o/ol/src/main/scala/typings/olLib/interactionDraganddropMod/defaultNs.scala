package typings
package olLib.interactionDraganddropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/draganddrop", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
    * of this type.
    *
    * @param type Type.
    * @param file File.
    * @param opt_features Features.
    * @param opt_projection Projection.
    */
  @js.native
  class Event protected ()
    extends openlayersLib.openlayersMod.interactionNs.DragAndDropNs.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File) = this()
    def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature]) = this()
    def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature], opt_projection: openlayersLib.openlayersMod.projNs.Projection) = this()
  }
  
}

