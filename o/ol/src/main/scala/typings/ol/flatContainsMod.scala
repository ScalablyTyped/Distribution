package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/flat/contains", JSImport.Namespace)
@js.native
object flatContainsMod extends js.Object {
  
  def linearRingContainsExtent(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  
  def linearRingContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
  
  def linearRingsContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
  
  def linearRingssContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = js.native
}
