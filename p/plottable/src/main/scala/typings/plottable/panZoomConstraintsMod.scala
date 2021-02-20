package typings.plottable

import typings.plottable.anon.CenterPoint
import typings.plottable.scaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panZoomConstraintsMod {
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", "constrainZoomExtents")
  @js.native
  def constrainZoomExtents(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double
  ): Double = js.native
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", "constrainZoomValues")
  @js.native
  def constrainZoomValues(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = js.native
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", "constrainedTranslation")
  @js.native
  def constrainedTranslation(
    scale: TransformableScale[_, Double],
    translation: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): Double = js.native
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", "constrainedZoom")
  @js.native
  def constrainedZoom(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = js.native
  
  @JSImport("plottable/build/src/interactions/panZoomConstraints", "zoomOut")
  @js.native
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
}
