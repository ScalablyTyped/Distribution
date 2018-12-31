package typings
package olLib.sourceClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source to cluster vector data. Works out of the box with point
  * geometries. For other geometry types, or if not all geometries should be
  * considered for clustering, a custom `geometryFunction` can be defined.
  *
  * @param options Constructor options.
  * @api
  */
@JSImport("ol/source/cluster", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.Cluster {
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * @param options Constructor options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ClusterOptions) = this()
}

