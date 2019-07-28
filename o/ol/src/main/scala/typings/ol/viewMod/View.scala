package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:center`
import typings.ol.olStrings.`change:resolution`
import typings.ol.olStrings.`change:rotation`
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.viewHintMod.ViewHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends typings.ol.objectMod.default {
  def animate(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
  def applyOptions_(options: ViewOptions): Unit = js.native
  def calculateCenterRotate(rotation: Double, anchor: Coordinate): Coordinate = js.native
  def calculateCenterZoom(resolution: Double, anchor: Coordinate): Coordinate = js.native
  def calculateExtent(): Extent = js.native
  def calculateExtent(opt_size: Size): Extent = js.native
  def cancelAnimations(): Unit = js.native
  def centerOn(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
  def constrainCenter(center: Coordinate): Coordinate = js.native
  def constrainResolution(resolution: Double): Double = js.native
  def constrainResolution(resolution: Double, opt_delta: Double): Double = js.native
  def constrainResolution(resolution: Double, opt_delta: Double, opt_direction: Double): Double = js.native
  def constrainRotation(rotation: Double): Double = js.native
  def constrainRotation(rotation: Double, opt_delta: Double): Double = js.native
  def fit(geometryOrExtent: Extent): Unit = js.native
  def fit(geometryOrExtent: Extent, opt_options: FitOptions): Unit = js.native
  def fit(geometryOrExtent: typings.ol.geomSimpleGeometryMod.default): Unit = js.native
  def fit(geometryOrExtent: typings.ol.geomSimpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
  def getAnimating(): Boolean = js.native
  def getCenter(): Coordinate = js.native
  def getConstraints(): Constraints = js.native
  def getHints(): js.Array[Double] = js.native
  def getHints(opt_hints: js.Array[Double]): js.Array[Double] = js.native
  def getInteracting(): Boolean = js.native
  def getMaxResolution(): Double = js.native
  def getMaxZoom(): Double = js.native
  def getMinResolution(): Double = js.native
  def getMinZoom(): Double = js.native
  def getProjection(): typings.ol.projProjectionMod.default = js.native
  def getResolution(): Double = js.native
  def getResolutionForExtent(extent: Extent): Double = js.native
  def getResolutionForExtent(extent: Extent, opt_size: Size): Double = js.native
  def getResolutionForValueFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getResolutionForValueFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  def getResolutionForZoom(zoom: Double): Double = js.native
  def getResolutions(): js.Array[Double] = js.native
  def getRotation(): Double = js.native
  def getState(pixelRatio: Double): State = js.native
  def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
  def getValueForResolutionFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getValueForResolutionFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  def getZoom(): Double = js.native
  def getZoomForResolution(resolution: Double): Double = js.native
  def isDef(): Boolean = js.native
  @JSName("on")
  def on_changecenter(`type`: `change:center`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeresolution(`type`: `change:resolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changerotation(`type`: `change:rotation`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changecenter(`type`: `change:center`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeresolution(`type`: `change:resolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changerotation(`type`: `change:rotation`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def rotate(rotation: Double): Unit = js.native
  def rotate(rotation: Double, opt_anchor: Coordinate): Unit = js.native
  def setCenter(center: Coordinate): Unit = js.native
  def setHint(hint: ViewHint, delta: Double): Double = js.native
  def setMaxZoom(zoom: Double): Unit = js.native
  def setMinZoom(zoom: Double): Unit = js.native
  def setResolution(resolution: Double): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
  @JSName("un")
  def un_changecenter(`type`: `change:center`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeresolution(`type`: `change:resolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changerotation(`type`: `change:rotation`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  def updateAnimations_(): Unit = js.native
}

