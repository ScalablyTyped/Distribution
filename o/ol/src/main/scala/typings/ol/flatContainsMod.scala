package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatContainsMod {
  
  @JSImport("ol/geom/flat/contains", "linearRingContainsExtent")
  @js.native
  def linearRingContainsExtent(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  
  @JSImport("ol/geom/flat/contains", "linearRingContainsXY")
  @js.native
  def linearRingContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/contains", "linearRingsContainsXY")
  @js.native
  def linearRingsContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/contains", "linearRingssContainsXY")
  @js.native
  def linearRingssContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
}
