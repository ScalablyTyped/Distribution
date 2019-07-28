package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomMultiPointMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "MultiPoint")
@js.native
class MultiPoint protected () extends default {
  def this(coordinates: js.Array[Coordinate | Double]) = this()
  def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
}

