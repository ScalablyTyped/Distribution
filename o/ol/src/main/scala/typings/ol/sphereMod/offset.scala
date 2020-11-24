package typings.ol.sphereMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/sphere", "offset")
@js.native
object offset extends js.Object {
  
  def apply(c1: Coordinate, distance: Double, bearing: Double): Coordinate = js.native
  def apply(c1: Coordinate, distance: Double, bearing: Double, opt_radius: Double): Coordinate = js.native
}
