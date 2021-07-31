package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatContainsMod {
  
  @JSImport("ol/geom/flat/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def linearRingContainsExtent(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingContainsExtent")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def linearRingContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingContainsXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def linearRingsContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingsContainsXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def linearRingssContainsXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    x: Double,
    y: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingssContainsXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
