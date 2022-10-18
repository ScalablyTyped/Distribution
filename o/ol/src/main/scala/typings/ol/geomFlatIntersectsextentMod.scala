package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatIntersectsextentMod {
  
  @JSImport("ol/geom/flat/intersectsextent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def intersectsLineString(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsLineString")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsLineStringArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsLineStringArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsLinearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsLinearRing")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsLinearRingArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsLinearRingArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsLinearRingMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    extent: Extent
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsLinearRingMultiArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
