package typings
package olLib.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Handles snapping of vector features while modifying or drawing them.  The
     * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
     * Any interaction object that allows the user to interact
     * with the features using the mouse can benefit from the snapping, as long
     * as it is added before.
     *
     * The snap interaction modifies map browser event `coordinate` and `pixel`
     * properties to force the snap to occur to any interaction that them.
     *
     * Example:
     *
     *     var snap = new ol.interaction.Snap({
     *       source: source
     *     });
     *
     * @param opt_options Options.
     * @api
     */
@JSImport("ol/interaction/snap", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.interactionNs.Snap {
  /**
           * @classdesc
           * Handles snapping of vector features while modifying or drawing them.  The
           * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
           * Any interaction object that allows the user to interact
           * with the features using the mouse can benefit from the snapping, as long
           * as it is added before.
           *
           * The snap interaction modifies map browser event `coordinate` and `pixel`
           * properties to force the snap to occur to any interaction that them.
           *
           * Example:
           *
           *     var snap = new ol.interaction.Snap({
           *       source: source
           *     });
           *
           * @param opt_options Options.
           * @api
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SnapOptions) = this()
}

