package typings
package olLib.geomMultiPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Multi-point geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("ol/geom/MultiPoint", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.geomNs.MultiPoint {
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]) = this()
  def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
}

