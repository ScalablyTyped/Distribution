package typings.ngmap

import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorPoint extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow
    * that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[Point] = js.undefined
  /** Which animation to play when marker is added to a map. */
  var animation: js.UndefOr[Animation] = js.undefined
  /**
    * If true, the marker receives mouse and touch events.
    * @default true
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /** Mouse cursor to show on hover. */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * If true, the marker can be dragged.
    * @default false
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon for the foreground.
    * If a string is provided, it is treated as though it were an Icon with the string as url.
    * @type {(string|Icon|Symbol)}
    */
  var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
  /**
    * Adds a label to the marker. The label can either be a string, or a MarkerLabel object.
    * Only the first character of the string will be displayed.
    * @type {string}
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Map on which to display Marker.
    * @type {(Map|StreetViewPanorama)}
    *
    */
  var map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
  /** The marker's opacity between 0.0 and 1.0. */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Optimization renders many markers as a single static element.
    * Optimized rendering is enabled by default.
    * Disable optimized rendering for animated GIFs or PNGs, or when each
    * marker must be rendered as a separate DOM element (advanced usage
    * only).
    */
  var optimized: js.UndefOr[Boolean] = js.undefined
  /** Image map region definition used for drag/click. */
  var shape: js.UndefOr[MarkerShape] = js.undefined
  /** Rollover text. */
  var title: js.UndefOr[String] = js.undefined
  /** If true, the marker is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * All markers are displayed on the map in order of their zIndex,
    * with higher values displaying in front of markers with lower values.
    * By default, markers are displayed according to their vertical position on screen,
    * with lower markers appearing in front of markers further up the screen.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Anon_AnchorPoint {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: String | Icon | Symbol = null,
    label: String = null,
    map: Map | StreetViewPanorama = null,
    opacity: Int | Double = null,
    optimized: js.UndefOr[Boolean] = js.undefined,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Anon_AnchorPoint = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnchorPoint]
  }
}

