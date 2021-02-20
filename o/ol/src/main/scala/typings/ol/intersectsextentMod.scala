package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intersectsextentMod {
  
  @JSImport("ol/geom/flat/intersectsextent", "intersectsLineString")
  @js.native
  def intersectsLineString(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  
  @JSImport("ol/geom/flat/intersectsextent", "intersectsLineStringArray")
  @js.native
  def intersectsLineStringArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/intersectsextent", "intersectsLinearRing")
  @js.native
  def intersectsLinearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  
  @JSImport("ol/geom/flat/intersectsextent", "intersectsLinearRingArray")
  @js.native
  def intersectsLinearRingArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/intersectsextent", "intersectsLinearRingMultiArray")
  @js.native
  def intersectsLinearRingMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
}
