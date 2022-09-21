package typings.plottable

import typings.plottable.anon.CenterPoint
import typings.plottable.scaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panZoomConstraintsMod {
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constrainZoomExtents(
    scale: TransformableScale[Any, Double],
    zoomAmount: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainZoomExtents")(scale.asInstanceOf[js.Any], zoomAmount.asInstanceOf[js.Any], minDomainExtent.asInstanceOf[js.Any], maxDomainExtent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def constrainZoomValues(
    scale: TransformableScale[Any, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainZoomValues")(scale.asInstanceOf[js.Any], zoomAmount.asInstanceOf[js.Any], centerPoint.asInstanceOf[js.Any], minDomainValue.asInstanceOf[js.Any], maxDomainValue.asInstanceOf[js.Any])).asInstanceOf[CenterPoint]
  
  inline def constrainedTranslation(
    scale: TransformableScale[Any, Double],
    translation: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainedTranslation")(scale.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], minDomainValue.asInstanceOf[js.Any], maxDomainValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def constrainedZoom(
    scale: TransformableScale[Any, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainedZoom")(scale.asInstanceOf[js.Any], zoomAmount.asInstanceOf[js.Any], centerPoint.asInstanceOf[js.Any], minDomainExtent.asInstanceOf[js.Any], maxDomainExtent.asInstanceOf[js.Any], minDomainValue.asInstanceOf[js.Any], maxDomainValue.asInstanceOf[js.Any])).asInstanceOf[CenterPoint]
  
  inline def zoomOut(value: Double, zoom: Double, center: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(value.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Double]
}
