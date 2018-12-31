package typings
package olLib.geomMultilinestringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Multi-linestring geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("ol/geom/multilinestring", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.geomNs.MultiLineString {
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]) = this()
  def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
}

