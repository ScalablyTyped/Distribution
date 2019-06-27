package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends olLib.objectMod.default {
  def animate(var_args: (AnimationOptions | (js.Function1[/* p0 */ scala.Boolean, scala.Unit]))*): scala.Unit = js.native
  def applyOptions_(options: ViewOptions): scala.Unit = js.native
  def calculateCenterRotate(rotation: scala.Double, anchor: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def calculateCenterZoom(resolution: scala.Double, anchor: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def calculateExtent(): olLib.extentMod.Extent = js.native
  def calculateExtent(opt_size: olLib.sizeMod.Size): olLib.extentMod.Extent = js.native
  def cancelAnimations(): scala.Unit = js.native
  def centerOn(
    coordinate: olLib.coordinateMod.Coordinate,
    size: olLib.sizeMod.Size,
    position: olLib.pixelMod.Pixel
  ): scala.Unit = js.native
  def constrainCenter(center: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def constrainResolution(resolution: scala.Double): scala.Double = js.native
  def constrainResolution(resolution: scala.Double, opt_delta: scala.Double): scala.Double = js.native
  def constrainResolution(resolution: scala.Double, opt_delta: scala.Double, opt_direction: scala.Double): scala.Double = js.native
  def constrainRotation(rotation: scala.Double): scala.Double = js.native
  def constrainRotation(rotation: scala.Double, opt_delta: scala.Double): scala.Double = js.native
  def fit(geometryOrExtent: olLib.extentMod.Extent): scala.Unit = js.native
  def fit(geometryOrExtent: olLib.extentMod.Extent, opt_options: FitOptions): scala.Unit = js.native
  def fit(geometryOrExtent: olLib.geomSimpleGeometryMod.default): scala.Unit = js.native
  def fit(geometryOrExtent: olLib.geomSimpleGeometryMod.default, opt_options: FitOptions): scala.Unit = js.native
  def getAnimating(): scala.Boolean = js.native
  def getCenter(): olLib.coordinateMod.Coordinate = js.native
  def getConstraints(): Constraints = js.native
  def getHints(): js.Array[scala.Double] = js.native
  def getHints(opt_hints: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getInteracting(): scala.Boolean = js.native
  def getMaxResolution(): scala.Double = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinResolution(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getProjection(): olLib.projProjectionMod.default = js.native
  def getResolution(): scala.Double = js.native
  def getResolutionForExtent(extent: olLib.extentMod.Extent): scala.Double = js.native
  def getResolutionForExtent(extent: olLib.extentMod.Extent, opt_size: olLib.sizeMod.Size): scala.Double = js.native
  def getResolutionForValueFunction(): js.Function1[/* p0 */ scala.Double, scala.Double] = js.native
  def getResolutionForValueFunction(opt_power: scala.Double): js.Function1[/* p0 */ scala.Double, scala.Double] = js.native
  def getResolutionForZoom(zoom: scala.Double): scala.Double = js.native
  def getResolutions(): js.Array[scala.Double] = js.native
  def getRotation(): scala.Double = js.native
  def getState(pixelRatio: scala.Double): State = js.native
  def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
  def getValueForResolutionFunction(): js.Function1[/* p0 */ scala.Double, scala.Double] = js.native
  def getValueForResolutionFunction(opt_power: scala.Double): js.Function1[/* p0 */ scala.Double, scala.Double] = js.native
  def getZoom(): scala.Double = js.native
  def getZoomForResolution(resolution: scala.Double): scala.Double = js.native
  def isDef(): scala.Boolean = js.native
  @JSName("on")
  def on_changecenter(
    `type`: olLib.olLibStrings.`change:center`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeresolution(
    `type`: olLib.olLibStrings.`change:resolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changerotation(
    `type`: olLib.olLibStrings.`change:rotation`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changecenter(
    `type`: olLib.olLibStrings.`change:center`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeresolution(
    `type`: olLib.olLibStrings.`change:resolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changerotation(
    `type`: olLib.olLibStrings.`change:rotation`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def rotate(rotation: scala.Double): scala.Unit = js.native
  def rotate(rotation: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def setCenter(center: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def setHint(hint: olLib.viewHintMod.ViewHint, delta: scala.Double): scala.Double = js.native
  def setMaxZoom(zoom: scala.Double): scala.Unit = js.native
  def setMinZoom(zoom: scala.Double): scala.Unit = js.native
  def setResolution(resolution: scala.Double): scala.Unit = js.native
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
  @JSName("un")
  def un_changecenter(
    `type`: olLib.olLibStrings.`change:center`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeresolution(
    `type`: olLib.olLibStrings.`change:resolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changerotation(
    `type`: olLib.olLibStrings.`change:rotation`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  def updateAnimations_(): scala.Unit = js.native
}

