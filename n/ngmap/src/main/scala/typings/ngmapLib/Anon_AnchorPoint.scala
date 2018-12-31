package typings
package ngmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorPoint extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow
    * that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[googlemapsLib.googleNs.mapsNs.Point] = js.undefined
  /** Which animation to play when marker is added to a map. */
  var animation: js.UndefOr[googlemapsLib.googleNs.mapsNs.Animation] = js.undefined
  /**
    * If true, the marker receives mouse and touch events.
    * @default true
    */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /** Mouse cursor to show on hover. */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the marker can be dragged.
    * @default false
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon for the foreground.
    * If a string is provided, it is treated as though it were an Icon with the string as url.
    * @type {(string|Icon|Symbol)}
    */
  var icon: js.UndefOr[
    java.lang.String | googlemapsLib.googleNs.mapsNs.Icon | googlemapsLib.googleNs.mapsNs.Symbol
  ] = js.undefined
  /**
    * Adds a label to the marker. The label can either be a string, or a MarkerLabel object.
    * Only the first character of the string will be displayed.
    * @type {string}
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Map on which to display Marker.
    * @type {(Map|StreetViewPanorama)}
    *
    */
  var map: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.Map | googlemapsLib.googleNs.mapsNs.StreetViewPanorama
  ] = js.undefined
  /** The marker's opacity between 0.0 and 1.0. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optimization renders many markers as a single static element.
    * Optimized rendering is enabled by default.
    * Disable optimized rendering for animated GIFs or PNGs, or when each
    * marker must be rendered as a separate DOM element (advanced usage
    * only).
    */
  var optimized: js.UndefOr[scala.Boolean] = js.undefined
  /** Image map region definition used for drag/click. */
  var shape: js.UndefOr[googlemapsLib.googleNs.mapsNs.MarkerShape] = js.undefined
  /** Rollover text. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the marker is visible. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * All markers are displayed on the map in order of their zIndex,
    * with higher values displaying in front of markers with lower values.
    * By default, markers are displayed according to their vertical position on screen,
    * with lower markers appearing in front of markers further up the screen.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

