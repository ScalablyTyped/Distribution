package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions/panZoomConstraints", JSImport.Namespace)
@js.native
object buildSrcInteractionsPanZoomConstraintsMod extends js.Object {
  def constrainZoomExtents(
    scale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double],
    zoomAmount: scala.Double,
    minDomainExtent: scala.Double,
    maxDomainExtent: scala.Double
  ): scala.Double = js.native
  def constrainZoomValues(
    scale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double],
    zoomAmount: scala.Double,
    centerPoint: scala.Double,
    minDomainValue: scala.Double,
    maxDomainValue: scala.Double
  ): plottableLib.Anon_CenterPoint = js.native
  def constrainedTranslation(
    scale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double],
    translation: scala.Double,
    minDomainValue: scala.Double,
    maxDomainValue: scala.Double
  ): scala.Double = js.native
  def constrainedZoom(
    scale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double],
    zoomAmount: scala.Double,
    centerPoint: scala.Double,
    minDomainExtent: scala.Double,
    maxDomainExtent: scala.Double,
    minDomainValue: scala.Double,
    maxDomainValue: scala.Double
  ): plottableLib.Anon_CenterPoint = js.native
  def zoomOut(value: scala.Double, zoom: scala.Double, center: scala.Double): scala.Double = js.native
}

