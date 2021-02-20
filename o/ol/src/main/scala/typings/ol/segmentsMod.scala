package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentsMod {
  
  @JSImport("ol/geom/flat/segments", "forEach")
  @js.native
  def forEach[T](
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    callback: js.Function2[/* p0 */ Coordinate, /* p1 */ Coordinate, T]
  ): T | Boolean = js.native
}
