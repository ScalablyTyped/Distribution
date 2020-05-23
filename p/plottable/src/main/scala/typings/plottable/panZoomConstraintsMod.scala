package typings.plottable

import typings.plottable.anon.CenterPoint
import typings.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions/panZoomConstraints", JSImport.Namespace)
@js.native
object panZoomConstraintsMod extends js.Object {
  def constrainZoomExtents(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double
  ): Double = js.native
  def constrainZoomValues(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = js.native
  def constrainedTranslation(
    scale: TransformableScale[_, Double],
    translation: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): Double = js.native
  def constrainedZoom(
    scale: TransformableScale[_, Double],
    zoomAmount: Double,
    centerPoint: Double,
    minDomainExtent: Double,
    maxDomainExtent: Double,
    minDomainValue: Double,
    maxDomainValue: Double
  ): CenterPoint = js.native
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
}

