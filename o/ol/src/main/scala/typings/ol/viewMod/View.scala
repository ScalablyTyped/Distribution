package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColoncenter
import typings.ol.olStrings.changeColonresolution
import typings.ol.olStrings.changeColonrotation
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.viewHintMod.ViewHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends typings.ol.objectMod.default {
  def adjustCenter(deltaCoordinates: Coordinate): Unit = js.native
  def adjustCenterInternal(deltaCoordinates: Coordinate): Unit = js.native
  def adjustResolution(ratio: Double): Unit = js.native
  def adjustResolution(ratio: Double, opt_anchor: Coordinate): Unit = js.native
  def adjustResolutionInternal(ratio: Double): Unit = js.native
  def adjustResolutionInternal(ratio: Double, opt_anchor: Coordinate): Unit = js.native
  def adjustRotation(delta: Double): Unit = js.native
  def adjustRotation(delta: Double, opt_anchor: Coordinate): Unit = js.native
  def adjustRotationInternal(delta: Double): Unit = js.native
  def adjustRotationInternal(delta: Double, opt_anchor: Coordinate): Unit = js.native
  def adjustZoom(delta: Double): Unit = js.native
  def adjustZoom(delta: Double, opt_anchor: Coordinate): Unit = js.native
  def animate(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
  def animateInternal(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
  def applyOptions_(options: ViewOptions): Unit = js.native
  def beginInteraction(): Unit = js.native
  def calculateCenterRotate(rotation: Double, anchor: Coordinate): Coordinate = js.native
  def calculateCenterZoom(resolution: Double, anchor: Coordinate): Coordinate = js.native
  def calculateExtent(): Extent = js.native
  def calculateExtent(opt_size: Size): Extent = js.native
  def calculateExtentInternal(): Extent = js.native
  def calculateExtentInternal(opt_size: Size): Extent = js.native
  def cancelAnimations(): Unit = js.native
  def centerOn(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
  def centerOnInternal(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
  def endInteraction(): Unit = js.native
  def endInteraction(opt_duration: Double): Unit = js.native
  def endInteraction(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def endInteraction(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def endInteractionInternal(): Unit = js.native
  def endInteractionInternal(opt_duration: Double): Unit = js.native
  def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def fit(geometryOrExtent: Extent): Unit = js.native
  def fit(geometryOrExtent: Extent, opt_options: FitOptions): Unit = js.native
  def fit(geometryOrExtent: typings.ol.simpleGeometryMod.default): Unit = js.native
  def fit(geometryOrExtent: typings.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
  def fitInternal(geometry: typings.ol.simpleGeometryMod.default): Unit = js.native
  def fitInternal(geometry: typings.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
  def getAnimating(): Boolean = js.native
  def getCenter(): Coordinate = js.native
  def getCenterInternal(): Coordinate = js.native
  def getConstrainedCenter(): Coordinate = js.native
  def getConstrainedCenter(targetCenter: js.UndefOr[scala.Nothing], opt_targetResolution: Double): Coordinate = js.native
  def getConstrainedCenter(targetCenter: Coordinate): Coordinate = js.native
  def getConstrainedCenter(targetCenter: Coordinate, opt_targetResolution: Double): Coordinate = js.native
  def getConstrainedResolution(): Double = js.native
  def getConstrainedResolution(targetResolution: js.UndefOr[scala.Nothing], opt_direction: Double): Double = js.native
  def getConstrainedResolution(targetResolution: Double): Double = js.native
  def getConstrainedResolution(targetResolution: Double, opt_direction: Double): Double = js.native
  def getConstrainedZoom(): Double = js.native
  def getConstrainedZoom(targetZoom: js.UndefOr[scala.Nothing], opt_direction: Double): Double = js.native
  def getConstrainedZoom(targetZoom: Double): Double = js.native
  def getConstrainedZoom(targetZoom: Double, opt_direction: Double): Double = js.native
  def getConstraints(): Constraints = js.native
  def getHints(): js.Array[Double] = js.native
  def getHints(opt_hints: js.Array[Double]): js.Array[Double] = js.native
  def getInteracting(): Boolean = js.native
  def getMaxResolution(): Double = js.native
  def getMaxZoom(): Double = js.native
  def getMinResolution(): Double = js.native
  def getMinZoom(): Double = js.native
  def getProjection(): typings.ol.projectionMod.default = js.native
  def getResolution(): Double = js.native
  def getResolutionForExtent(extent: Extent): Double = js.native
  def getResolutionForExtent(extent: Extent, opt_size: Size): Double = js.native
  def getResolutionForExtentInternal(extent: Extent): Double = js.native
  def getResolutionForExtentInternal(extent: Extent, opt_size: Size): Double = js.native
  def getResolutionForValueFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getResolutionForValueFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  def getResolutionForZoom(zoom: Double): Double = js.native
  def getResolutions(): js.Array[Double] = js.native
  def getRotation(): Double = js.native
  def getState(): State = js.native
  def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
  def getValueForResolutionFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getValueForResolutionFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  def getZoom(): Double = js.native
  def getZoomForResolution(resolution: Double): Double = js.native
  def isDef(): Boolean = js.native
  @JSName("on")
  def on_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def resolveConstraints(): Unit = js.native
  def resolveConstraints(opt_duration: Double): Unit = js.native
  def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def setCenter(): Unit = js.native
  def setCenter(center: Coordinate): Unit = js.native
  def setCenterInternal(): Unit = js.native
  def setCenterInternal(center: Coordinate): Unit = js.native
  def setConstrainResolution(enabled: Boolean): Unit = js.native
  def setHint(hint: ViewHint, delta: Double): Double = js.native
  def setMaxZoom(zoom: Double): Unit = js.native
  def setMinZoom(zoom: Double): Unit = js.native
  def setResolution(): Unit = js.native
  def setResolution(resolution: Double): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setViewportSize(): Unit = js.native
  def setViewportSize(opt_size: Size): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
  @JSName("un")
  def un_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  def updateAnimations_(): Unit = js.native
}

