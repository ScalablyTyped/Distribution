package typings.ol.geomLineStringMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/LineString", JSImport.Default)
@js.native
class default protected () extends LineString {
  def this(coordinates: js.Array[Coordinate | Double]) = this()
  def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
}

