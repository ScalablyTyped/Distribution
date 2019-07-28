package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styleStyleMod {
  type GeometryFunction = js.Function1[
    /* p0 */ FeatureLike, 
    typings.ol.geomGeometryMod.default | typings.ol.renderFeatureMod.default
  ]
  type RenderFunction = js.Function2[
    /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* p1 */ State, 
    Unit
  ]
  type StyleFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ Double, Style | js.Array[Style]]
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
