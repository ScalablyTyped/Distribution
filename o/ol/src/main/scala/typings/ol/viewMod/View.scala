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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends typings.ol.objectMod.default {
  
  /**
    * Adds relative coordinates to the center of the view. Any extent constraint will apply.
    */
  def adjustCenter(deltaCoordinates: Coordinate): Unit = js.native
  
  /**
    * Adds relative coordinates to the center of the view. Any extent constraint will apply.
    */
  def adjustCenterInternal(deltaCoordinates: Coordinate): Unit = js.native
  
  /**
    * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
    * constraint will apply.
    */
  def adjustResolution(ratio: Double): Unit = js.native
  def adjustResolution(ratio: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
    * constraint will apply.
    */
  def adjustResolutionInternal(ratio: Double): Unit = js.native
  def adjustResolutionInternal(ratio: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Adds a value to the view rotation, optionally using an anchor. Any rotation
    * constraint will apply.
    */
  def adjustRotation(delta: Double): Unit = js.native
  def adjustRotation(delta: Double, opt_anchor: Coordinate): Unit = js.native
  
  def adjustRotationInternal(delta: Double): Unit = js.native
  def adjustRotationInternal(delta: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Adds a value to the view zoom level, optionally using an anchor. Any resolution
    * constraint will apply.
    */
  def adjustZoom(delta: Double): Unit = js.native
  def adjustZoom(delta: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Animate the view.  The view's center, zoom (or resolution), and rotation
    * can be animated for smooth transitions between view states.  For example,
    * to animate the view to a new zoom level:
    * By default, the animation lasts one second and uses in-and-out easing.  You
    * can customize this behavior by including duration (in milliseconds) and
    * easing options (see {@link module:ol/easing}).
    * To chain together multiple animations, call the method with multiple
    * animation objects.  For example, to first zoom and then pan:
    * If you provide a function as the last argument to the animate method, it
    * will get called at the end of an animation series.  The callback will be
    * called with true if the animation series completed on its own or false
    * if it was cancelled.
    * Animations are cancelled by user interactions (e.g. dragging the map) or by
    * calling view.setCenter(), view.setResolution(), or view.setRotation()
    * (or another method that calls one of these).
    */
  def animate(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
  
  def animateInternal(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
  
  /**
    * Set up the view with the given options.
    */
  def applyOptions_(options: ViewOptions): Unit = js.native
  
  /**
    * Notify the View that an interaction has started.
    * The view state will be resolved to a stable one if needed
    * (depending on its constraints).
    */
  def beginInteraction(): Unit = js.native
  
  def calculateCenterRotate(rotation: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
  
  def calculateCenterZoom(resolution: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
  
  /**
    * Calculate the extent for the current view state and the passed size.
    * The size is the pixel dimensions of the box into which the calculated extent
    * should fit. In most cases you want to get the extent of the entire map,
    * that is map.getSize().
    */
  def calculateExtent(): Extent = js.native
  def calculateExtent(opt_size: Size): Extent = js.native
  
  def calculateExtentInternal(): Extent = js.native
  def calculateExtentInternal(opt_size: Size): Extent = js.native
  
  /**
    * Cancel any ongoing animations.
    */
  def cancelAnimations(): Unit = js.native
  
  /**
    * Center on coordinate and view position.
    */
  def centerOn(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
  
  def centerOnInternal(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
  
  /**
    * Notify the View that an interaction has ended. The view state will be resolved
    * to a stable one if needed (depending on its constraints).
    */
  def endInteraction(): Unit = js.native
  def endInteraction(
    opt_duration: js.UndefOr[scala.Nothing],
    opt_resolutionDirection: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate
  ): Unit = js.native
  def endInteraction(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
  def endInteraction(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def endInteraction(opt_duration: Double): Unit = js.native
  def endInteraction(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def endInteraction(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def endInteraction(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Notify the View that an interaction has ended. The view state will be resolved
    * to a stable one if needed (depending on its constraints).
    */
  def endInteractionInternal(): Unit = js.native
  def endInteractionInternal(
    opt_duration: js.UndefOr[scala.Nothing],
    opt_resolutionDirection: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate
  ): Unit = js.native
  def endInteractionInternal(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
  def endInteractionInternal(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def endInteractionInternal(opt_duration: Double): Unit = js.native
  def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  
  def fit(geometryOrExtent: Extent): Unit = js.native
  def fit(geometryOrExtent: Extent, opt_options: FitOptions): Unit = js.native
  /**
    * Fit the given geometry or extent based on the given map size and border.
    * The size is pixel dimensions of the box to fit the extent into.
    * In most cases you will want to use the map size, that is map.getSize().
    * Takes care of the map angle.
    */
  def fit(geometryOrExtent: typings.ol.simpleGeometryMod.default): Unit = js.native
  def fit(geometryOrExtent: typings.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
  
  def fitInternal(geometry: typings.ol.simpleGeometryMod.default): Unit = js.native
  def fitInternal(geometry: typings.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
  
  /**
    * Determine if the view is being animated.
    */
  def getAnimating(): Boolean = js.native
  
  /**
    * Get the view center.
    */
  def getCenter(): js.UndefOr[Coordinate] = js.native
  
  /**
    * Get the view center without transforming to user projection.
    */
  def getCenterInternal(): js.UndefOr[Coordinate] = js.native
  
  def getConstrainResolution(): Boolean = js.native
  
  /**
    * Get a valid position for the view center according to the current constraints.
    */
  def getConstrainedCenter(): js.UndefOr[Coordinate] = js.native
  def getConstrainedCenter(targetCenter: js.UndefOr[scala.Nothing], opt_targetResolution: Double): js.UndefOr[Coordinate] = js.native
  def getConstrainedCenter(targetCenter: Coordinate): js.UndefOr[Coordinate] = js.native
  def getConstrainedCenter(targetCenter: Coordinate, opt_targetResolution: Double): js.UndefOr[Coordinate] = js.native
  
  /**
    * Get a valid resolution according to the current view constraints.
    */
  def getConstrainedResolution(): js.UndefOr[Double] = js.native
  def getConstrainedResolution(targetResolution: js.UndefOr[scala.Nothing], opt_direction: Double): js.UndefOr[Double] = js.native
  def getConstrainedResolution(targetResolution: Double): js.UndefOr[Double] = js.native
  def getConstrainedResolution(targetResolution: Double, opt_direction: Double): js.UndefOr[Double] = js.native
  
  /**
    * Get a valid zoom level according to the current view constraints.
    */
  def getConstrainedZoom(): js.UndefOr[Double] = js.native
  def getConstrainedZoom(targetZoom: js.UndefOr[scala.Nothing], opt_direction: Double): js.UndefOr[Double] = js.native
  def getConstrainedZoom(targetZoom: Double): js.UndefOr[Double] = js.native
  def getConstrainedZoom(targetZoom: Double, opt_direction: Double): js.UndefOr[Double] = js.native
  
  def getConstraints(): Constraints = js.native
  
  def getHints(): js.Array[Double] = js.native
  def getHints(opt_hints: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * Determine if the user is interacting with the view, such as panning or zooming.
    */
  def getInteracting(): Boolean = js.native
  
  /**
    * Get the maximum resolution of the view.
    */
  def getMaxResolution(): Double = js.native
  
  /**
    * Get the maximum zoom level for the view.
    */
  def getMaxZoom(): Double = js.native
  
  /**
    * Get the minimum resolution of the view.
    */
  def getMinResolution(): Double = js.native
  
  /**
    * Get the minimum zoom level for the view.
    */
  def getMinZoom(): Double = js.native
  
  /**
    * Get the view projection.
    */
  def getProjection(): typings.ol.projectionMod.default = js.native
  
  /**
    * Get the view resolution.
    */
  def getResolution(): js.UndefOr[Double] = js.native
  
  /**
    * Get the resolution for a provided extent (in map units) and size (in pixels).
    */
  def getResolutionForExtent(extent: Extent): Double = js.native
  def getResolutionForExtent(extent: Extent, opt_size: Size): Double = js.native
  
  /**
    * Get the resolution for a provided extent (in map units) and size (in pixels).
    */
  def getResolutionForExtentInternal(extent: Extent): Double = js.native
  def getResolutionForExtentInternal(extent: Extent, opt_size: Size): Double = js.native
  
  /**
    * Return a function that returns a value between 0 and 1 for a
    * resolution. Exponential scaling is assumed.
    */
  def getResolutionForValueFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getResolutionForValueFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  
  /**
    * Get the resolution for a zoom level.
    */
  def getResolutionForZoom(zoom: Double): Double = js.native
  
  /**
    * Get the resolutions for the view. This returns the array of resolutions
    * passed to the constructor of the View, or undefined if none were given.
    */
  def getResolutions(): js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Get the view rotation.
    */
  def getRotation(): Double = js.native
  
  def getState(): State = js.native
  
  /**
    * Get an updated version of the view options used to construct the view.  The
    * current resolution (or zoom), center, and rotation are applied to any stored
    * options.  The provided options can be used to apply new min/max zoom or
    * resolution limits.
    */
  def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
  
  /**
    * Return a function that returns a resolution for a value between
    * 0 and 1. Exponential scaling is assumed.
    */
  def getValueForResolutionFunction(): js.Function1[/* p0 */ Double, Double] = js.native
  def getValueForResolutionFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
  
  /**
    * Get the current zoom level. This method may return non-integer zoom levels
    * if the view does not constrain the resolution, or if an interaction or
    * animation is underway.
    */
  def getZoom(): js.UndefOr[Double] = js.native
  
  /**
    * Get the zoom level for a resolution.
    */
  def getZoomForResolution(resolution: Double): js.UndefOr[Double] = js.native
  
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
  
  /**
    * If any constraints need to be applied, an animation will be triggered.
    * This is typically done on interaction end.
    * Note: calling this with a duration of 0 will apply the constrained values straight away,
    * without animation.
    */
  def resolveConstraints(): Unit = js.native
  def resolveConstraints(
    opt_duration: js.UndefOr[scala.Nothing],
    opt_resolutionDirection: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate
  ): Unit = js.native
  def resolveConstraints(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
  def resolveConstraints(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  def resolveConstraints(opt_duration: Double): Unit = js.native
  def resolveConstraints(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
  def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
  
  /**
    * Set the center of the current view. Any extent constraint will apply.
    */
  def setCenter(): Unit = js.native
  def setCenter(center: Coordinate): Unit = js.native
  
  /**
    * Set the center using the view projection (not the user projection).
    */
  def setCenterInternal(): Unit = js.native
  def setCenterInternal(center: Coordinate): Unit = js.native
  
  /**
    * Set whether the view shoud allow intermediary zoom levels.
    */
  def setConstrainResolution(enabled: Boolean): Unit = js.native
  
  def setHint(hint: ViewHint, delta: Double): Double = js.native
  
  /**
    * Set a new maximum zoom level for the view.
    */
  def setMaxZoom(zoom: Double): Unit = js.native
  
  /**
    * Set a new minimum zoom level for the view.
    */
  def setMinZoom(zoom: Double): Unit = js.native
  
  /**
    * Set the resolution for this view. Any resolution constraint will apply.
    */
  def setResolution(): Unit = js.native
  def setResolution(resolution: Double): Unit = js.native
  
  /**
    * Set the rotation for this view. Any rotation constraint will apply.
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Stores the viewport size on the view. The viewport size is not read every time from the DOM
    * to avoid performance hit and layout reflow.
    * This should be done on map size change.
    * Note: the constraints are not resolved during an animation to avoid stopping it
    */
  def setViewportSize(): Unit = js.native
  def setViewportSize(opt_size: Size): Unit = js.native
  
  /**
    * Zoom to a specific zoom level. Any resolution constrain will apply.
    */
  def setZoom(zoom: Double): Unit = js.native
  
  @JSName("un")
  def un_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  
  /**
    * Update all animations.
    */
  def updateAnimations_(): Unit = js.native
}
