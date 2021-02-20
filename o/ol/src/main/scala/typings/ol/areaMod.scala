package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMod {
  
  @JSImport("ol/geom/flat/area", "linearRing")
  @js.native
  def linearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
  
  @JSImport("ol/geom/flat/area", "linearRings")
  @js.native
  def linearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = js.native
  
  @JSImport("ol/geom/flat/area", "linearRingss")
  @js.native
  def linearRingss(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = js.native
}
