package typings
package olLib.geomLinearRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Linear ring geometry. Only used as part of polygon; cannot be rendered
  * on its own.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("ol/geom/LinearRing", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.geomNs.LinearRing {
  /**
    * @classdesc
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]) = this()
  def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
}

