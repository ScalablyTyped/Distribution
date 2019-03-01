package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingOptions extends js.Object {
  var arrowlineOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.PolylineOptions] = js.undefined
  var controlPointOptions: js.UndefOr[controlPointOptions] = js.undefined
  var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.undefined
  var drawingControlOptions: js.UndefOr[drawingControlOptions] = js.undefined
  var drawingMode: js.UndefOr[DrawingMode] = js.undefined
  var ellipseOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.EllipseOptions] = js.undefined
  var map: js.UndefOr[navermapsLib.naverNs.mapsNs.Map] = js.undefined
  var markerOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.MarkerOptions] = js.undefined
  var polygonOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.PolygonOptions] = js.undefined
  var polylineOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.PolylineOptions] = js.undefined
  var rectangleOptions: js.UndefOr[navermapsLib.naverNs.mapsNs.RectangleOptions] = js.undefined
}

object DrawingOptions {
  @scala.inline
  def apply(
    arrowlineOptions: navermapsLib.naverNs.mapsNs.PolylineOptions = null,
    controlPointOptions: controlPointOptions = null,
    drawingControl: js.Array[DrawingMode] = null,
    drawingControlOptions: drawingControlOptions = null,
    drawingMode: DrawingMode = null,
    ellipseOptions: navermapsLib.naverNs.mapsNs.EllipseOptions = null,
    map: navermapsLib.naverNs.mapsNs.Map = null,
    markerOptions: navermapsLib.naverNs.mapsNs.MarkerOptions = null,
    polygonOptions: navermapsLib.naverNs.mapsNs.PolygonOptions = null,
    polylineOptions: navermapsLib.naverNs.mapsNs.PolylineOptions = null,
    rectangleOptions: navermapsLib.naverNs.mapsNs.RectangleOptions = null
  ): DrawingOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowlineOptions != null) __obj.updateDynamic("arrowlineOptions")(arrowlineOptions)
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions)
    if (drawingControl != null) __obj.updateDynamic("drawingControl")(drawingControl)
    if (drawingControlOptions != null) __obj.updateDynamic("drawingControlOptions")(drawingControlOptions)
    if (drawingMode != null) __obj.updateDynamic("drawingMode")(drawingMode)
    if (ellipseOptions != null) __obj.updateDynamic("ellipseOptions")(ellipseOptions)
    if (map != null) __obj.updateDynamic("map")(map)
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions)
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions)
    if (rectangleOptions != null) __obj.updateDynamic("rectangleOptions")(rectangleOptions)
    __obj.asInstanceOf[DrawingOptions]
  }
}

