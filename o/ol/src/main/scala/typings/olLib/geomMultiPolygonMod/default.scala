package typings
package olLib.geomMultiPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Multi-polygon geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("ol/geom/MultiPolygon", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.geomNs.MultiPolygon {
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]]) = this()
  def this(coordinates: js.Array[js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
}

