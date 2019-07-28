package typings.ol.geomMultiPointMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPoint", JSImport.Default)
@js.native
class default protected () extends MultiPoint {
  def this(coordinates: js.Array[Coordinate | Double]) = this()
  def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
}

