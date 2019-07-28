package typings.navermaps.naverNs.mapsNs.drawingNs

import typings.navermaps.naverNs.mapsNs.EllipseOptions
import typings.navermaps.naverNs.mapsNs.Map
import typings.navermaps.naverNs.mapsNs.MarkerOptions
import typings.navermaps.naverNs.mapsNs.PolygonOptions
import typings.navermaps.naverNs.mapsNs.PolylineOptions
import typings.navermaps.naverNs.mapsNs.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingOptions extends js.Object {
  var arrowlineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var controlPointOptions: js.UndefOr[typings.navermaps.naverNs.mapsNs.drawingNs.controlPointOptions] = js.undefined
  var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.undefined
  var drawingControlOptions: js.UndefOr[typings.navermaps.naverNs.mapsNs.drawingNs.drawingControlOptions] = js.undefined
  var drawingMode: js.UndefOr[DrawingMode] = js.undefined
  var ellipseOptions: js.UndefOr[EllipseOptions] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  var polygonOptions: js.UndefOr[PolygonOptions] = js.undefined
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.undefined
}

object DrawingOptions {
  @scala.inline
  def apply(
    arrowlineOptions: PolylineOptions = null,
    controlPointOptions: controlPointOptions = null,
    drawingControl: js.Array[DrawingMode] = null,
    drawingControlOptions: drawingControlOptions = null,
    drawingMode: DrawingMode = null,
    ellipseOptions: EllipseOptions = null,
    map: Map = null,
    markerOptions: MarkerOptions = null,
    polygonOptions: PolygonOptions = null,
    polylineOptions: PolylineOptions = null,
    rectangleOptions: RectangleOptions = null
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

