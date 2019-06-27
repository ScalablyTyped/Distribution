package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styleStyleMod {
  type GeometryFunction = js.Function1[
    /* p0 */ olLib.featureMod.FeatureLike, 
    olLib.geomGeometryMod.default | olLib.renderFeatureMod.default
  ]
  type RenderFunction = js.Function2[
    /* p0 */ olLib.coordinateMod.Coordinate | (js.Array[js.Array[olLib.coordinateMod.Coordinate] | olLib.coordinateMod.Coordinate]), 
    /* p1 */ olLib.renderMod.State, 
    scala.Unit
  ]
  type StyleFunction = js.Function2[
    /* p0 */ olLib.featureMod.FeatureLike, 
    /* p1 */ scala.Double, 
    Style | js.Array[Style]
  ]
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
