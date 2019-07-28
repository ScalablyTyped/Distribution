package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomLineStringMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "LineString")
@js.native
class LineString protected () extends default {
  def this(coordinates: js.Array[Coordinate | Double]) = this()
  def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
}

