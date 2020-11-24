package typings.openlayers.mod

import typings.openlayers.mod.geom.SimpleGeometry
import typings.openlayers.mod.olx.ViewOptions
import typings.openlayers.mod.olx.animation.AnimateCallback
import typings.openlayers.mod.olx.animation.AnimateOptions
import typings.openlayers.mod.olx.view.FitOptions
import typings.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "View")
@js.native
/**
  * @classdesc
  * An ol.View object represents a simple 2D view of the map.
  *
  * This is the object to act upon to change the center, resolution,
  * and rotation of the map.
  *
  * ### The view states
  *
  * An `ol.View` is determined by three states: `center`, `resolution`,
  * and `rotation`. Each state has a corresponding getter and setter, e.g.
  * `getCenter` and `setCenter` for the `center` state.
  *
  * An `ol.View` has a `projection`. The projection determines the
  * coordinate system of the center, and its units determine the units of the
  * resolution (projection units per pixel). The default projection is
  * Spherical Mercator (EPSG:3857).
  *
  * ### The constraints
  *
  * `setCenter`, `setResolution` and `setRotation` can be used to change the
  * states of the view. Any value can be passed to the setters. And the value
  * that is passed to a setter will effectively be the value set in the view,
  * and returned by the corresponding getter.
  *
  * But an `ol.View` object also has a *resolution constraint*, a
  * *rotation constraint* and a *center constraint*.
  *
  * As said above, no constraints are applied when the setters are used to set
  * new states for the view. Applying constraints is done explicitly through
  * the use of the `constrain*` functions (`constrainResolution` and
  * `constrainRotation` and `constrainCenter`).
  *
  * The main users of the constraints are the interactions and the
  * controls. For example, double-clicking on the map changes the view to
  * the "next" resolution. And releasing the fingers after pinch-zooming
  * snaps to the closest resolution (with an animation).
  *
  * The *resolution constraint* snaps to specific resolutions. It is
  * determined by the following options: `resolutions`, `maxResolution`,
  * `maxZoom`, and `zoomFactor`. If `resolutions` is set, the other three
  * options are ignored. See documentation for each option for more
  * information.
  *
  * The *rotation constraint* snaps to specific angles. It is determined
  * by the following options: `enableRotation` and `constrainRotation`.
  * By default the rotation value is snapped to zero when approaching the
  * horizontal.
  *
  * The *center constraint* is determined by the `extent` option. By
  * default the center is not constrained at all.
  *
  * @param opt_options View options.
  * @api stable
  */
class View () extends Object {
  def this(opt_options: ViewOptions) = this()
  
  /**
    * Animate the view. The view's center, zoom (or resolution), and
    * rotation can be animated for smooth transitions between view states.
    * @param var_args Animation options.
    * @param restArgs
    * @api experimental
    */
  def animate(var_args: (AnimateOptions | AnimateCallback)*): Unit = js.native
  
  /**
    * Calculate the extent for the current view state and the passed size.
    * The size is the pixel dimensions of the box into which the calculated extent
    * should fit. In most cases you want to get the extent of the entire map,
    * that is `map.getSize()`.
    * @param size Box pixel size.
    * @return Extent.
    * @api stable
    */
  def calculateExtent(): Extent_ = js.native
  def calculateExtent(size: Size): Extent_ = js.native
  
  /**
    * Cancel any ongoing animations.
    * @api
    */
  def cancelAnimations(): Unit = js.native
  
  /**
    * Center on coordinate and view position.
    * @param coordinate Coordinate.
    * @param size Box pixel size.
    * @param position Position on the view to center on.
    * @api
    */
  def centerOn(coordinate: Coordinate_, size: Size, position: Pixel): Unit = js.native
  
  /**
    * Get the constrained center of this view.
    * @param center Center.
    * @return Constrained center.
    * @api
    */
  def constrainCenter(): Coordinate_ = js.native
  def constrainCenter(center: Coordinate_): Coordinate_ = js.native
  
  /**
    * Get the constrained resolution of this view.
    * @param resolution Resolution.
    * @param opt_delta Delta. Default is `0`.
    * @param opt_direction Direction. Default is `0`.
    * @return Constrained resolution.
    * @api
    */
  def constrainResolution(): Double = js.native
  def constrainResolution(resolution: js.UndefOr[scala.Nothing], opt_delta: js.UndefOr[scala.Nothing], opt_direction: Double): Double = js.native
  def constrainResolution(resolution: js.UndefOr[scala.Nothing], opt_delta: Double): Double = js.native
  def constrainResolution(resolution: js.UndefOr[scala.Nothing], opt_delta: Double, opt_direction: Double): Double = js.native
  def constrainResolution(resolution: Double): Double = js.native
  def constrainResolution(resolution: Double, opt_delta: js.UndefOr[scala.Nothing], opt_direction: Double): Double = js.native
  def constrainResolution(resolution: Double, opt_delta: Double): Double = js.native
  def constrainResolution(resolution: Double, opt_delta: Double, opt_direction: Double): Double = js.native
  
  /**
    * Get the constrained rotation of this view.
    * @param rotation Rotation.
    * @param opt_delta Delta. Default is `0`.
    * @return Constrained rotation.
    * @api
    */
  def constrainRotation(): Double = js.native
  def constrainRotation(rotation: js.UndefOr[scala.Nothing], opt_delta: Double): Double = js.native
  def constrainRotation(rotation: Double): Double = js.native
  def constrainRotation(rotation: Double, opt_delta: Double): Double = js.native
  
  def fit(geometryOrExtent: Extent_): Unit = js.native
  def fit(geometryOrExtent: Extent_, opt_options: FitOptions): Unit = js.native
  /**
    * Fit the given geometry or extent based on the given map size and border.
    * The size is pixel dimensions of the box to fit the extent into.
    * In most cases you will want to use the map size, that is `map.getSize()`.
    * Takes care of the map angle.
    * @param geometry Geometry.
    * @param opt_options Options.
    * @api
    */
  def fit(geometryOrExtent: SimpleGeometry): Unit = js.native
  def fit(geometryOrExtent: SimpleGeometry, opt_options: FitOptions): Unit = js.native
  
  /**
    * Determine if the view is being animated.
    * @return The view is being animated.
    * @api
    */
  def getAnimating(): Boolean = js.native
  
  /**
    * Get the view center.
    * @return The center of the view.
    * @observable
    * @api stable
    */
  def getCenter(): Coordinate_ = js.native
  
  /**
    * Determine if the user is interacting with the view, such as panning or zooming.
    * @return The view is being interacted with.
    * @api
    */
  def getInteracting(): Boolean = js.native
  
  /**
    * Get the maximum resolution of the view.
    * @return The maximum resolution of the view.
    * @api
    */
  def getMaxResolution(): Double = js.native
  
  /**
    * Get the maximum zoom level for the view.
    * @return The maximum zoom level.
    * @api
    */
  def getMaxZoom(): Double = js.native
  
  /**
    * Get the minimum resolution of the view.
    * @return The minimum resolution of the view.
    * @api
    */
  def getMinResolution(): Double = js.native
  
  /**
    * Get the minimum zoom level for the view.
    * @return The minimum zoom level.
    * @api
    */
  def getMinZoom(): Double = js.native
  
  /**
    * Get the view projection.
    * @return The projection of the view.
    * @api stable
    */
  def getProjection(): Projection = js.native
  
  /**
    * Get the view resolution.
    * @return The resolution of the view.
    * @observable
    * @api stable
    */
  def getResolution(): Double = js.native
  
  /**
    * Get the resolution for a provided extent (in map units) and size (in pixels).
    * @param extent Extent.
    * @param opt_size Box pixel size.
    * @return The resolution at which the provided extent will render at
    *     the given size.
    * @api
    */
  def getResolutionForExtent(extent: Extent_): Double = js.native
  def getResolutionForExtent(extent: Extent_, opt_size: Size): Double = js.native
  
  /**
    * Get the resolution for a zoom level.
    * @param zoom Zoom level.
    * @return The view resolution for the provided zoom level.
    * @api
    */
  def getResolutionForZoom(zoom: Double): Double = js.native
  
  /**
    * Get the resolutions for the view. This returns the array of resolutions
    * passed to the constructor of the {ol.View}, or undefined if none were given.
    * @return The resolutions of the view.
    * @api stable
    */
  def getResolutions(): js.Array[Double] = js.native
  
  /**
    * Get the view rotation.
    * @return The rotation of the view in radians.
    * @observable
    * @api stable
    */
  def getRotation(): Double = js.native
  
  /**
    * Get the current zoom level.  If you configured your view with a resolutions
    * array (this is rare), this method may return non-integer zoom levels (so
    * the zoom level is not safe to use as an index into a resolutions array).
    * @return Zoom.
    * @api
    */
  def getZoom(): Double = js.native
  
  /**
    * Get the zoom level for a resolution.
    * @param resolution The resolution.
    * @return The zoom level for the provided resolution.
    * @api
    */
  def getZoomForResolution(resolution: Double): Double = js.native
  
  /**
    * Rotate the view around a given coordinate.
    * @param rotation New rotation value for the view.
    * @param opt_anchor The rotation center.
    * @api stable
    */
  def rotate(rotation: Double): Unit = js.native
  def rotate(rotation: Double, opt_anchor: Coordinate_): Unit = js.native
  
  /**
    * Set the center of the current view.
    * @param center The center of the view.
    * @observable
    * @api stable
    */
  def setCenter(center: Coordinate_): Unit = js.native
  
  /**
    * Set a new maximum zoom level for the view.
    * @param zoom The maximum zoom level.
    * @api stable
    */
  def setMaxZoom(zoom: Double): Unit = js.native
  
  /**
    * Set a new minimum zoom level for the view.
    * @param zoom The minimum zoom level.
    * @api stable
    */
  def setMinZoom(zoom: Double): Unit = js.native
  
  /**
    * Set the resolution for this view.
    * @param resolution The resolution of the view.
    * @observable
    * @api stable
    */
  def setResolution(): Unit = js.native
  def setResolution(resolution: Double): Unit = js.native
  
  /**
    * Set the rotation for this view.
    * @param rotation The rotation of the view in radians.
    * @observable
    * @api stable
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Zoom to a specific zoom level.
    * @param zoom Zoom level.
    * @api stable
    */
  def setZoom(zoom: Double): Unit = js.native
}
