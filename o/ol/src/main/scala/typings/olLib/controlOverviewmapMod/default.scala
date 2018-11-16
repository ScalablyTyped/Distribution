package typings
package olLib.controlOverviewmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Create a new control with a map acting as an overview map for an other
     * defined map.
     * @param opt_options OverviewMap options.
     * @api
     */
@JSImport("ol/control/overviewmap", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.controlNs.OverviewMap {
  /**
           * Create a new control with a map acting as an overview map for an other
           * defined map.
           * @param opt_options OverviewMap options.
           * @api
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.OverviewMapOptions) = this()
}

/**
     * Create a new control with a map acting as an overview map for an other
     * defined map.
     * @param opt_options OverviewMap options.
     * @api
     */
@JSImport("ol/control/overviewmap", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Update the overview map element.
           * @param mapEvent Map event.
           * @api
           */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}

