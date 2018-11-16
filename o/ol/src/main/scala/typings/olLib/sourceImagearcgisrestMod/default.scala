package typings
package olLib.sourceImagearcgisrestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Source for data from ArcGIS Rest services providing single, untiled images.
     * Useful when underlying map service has labels.
     *
     * If underlying map service is not using labels,
     * take advantage of ol image caching and use
     * {@link ol.source.TileArcGISRest} data source.
     *
     * @fires ol.source.ImageEvent
     * @param opt_options Image ArcGIS Rest Options.
     * @api
     */
@JSImport("ol/source/imagearcgisrest", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.sourceNs.ImageArcGISRest {
  /**
           * @classdesc
           * Source for data from ArcGIS Rest services providing single, untiled images.
           * Useful when underlying map service has labels.
           *
           * If underlying map service is not using labels,
           * take advantage of ol image caching and use
           * {@link ol.source.TileArcGISRest} data source.
           *
           * @fires ol.source.ImageEvent
           * @param opt_options Image ArcGIS Rest Options.
           * @api
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageArcGISRestOptions) = this()
}

