package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.EllipseOptions
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.MarkerOptions
import typings.navermaps.naver.maps.PolygonOptions
import typings.navermaps.naver.maps.PolylineOptions
import typings.navermaps.naver.maps.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingOptions extends js.Object {
  var arrowlineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var controlPointOptions: js.UndefOr[typings.navermaps.naver.maps.drawing.controlPointOptions] = js.undefined
  var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.undefined
  var drawingControlOptions: js.UndefOr[typings.navermaps.naver.maps.drawing.drawingControlOptions] = js.undefined
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
    if (arrowlineOptions != null) __obj.updateDynamic("arrowlineOptions")(arrowlineOptions.asInstanceOf[js.Any])
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions.asInstanceOf[js.Any])
    if (drawingControl != null) __obj.updateDynamic("drawingControl")(drawingControl.asInstanceOf[js.Any])
    if (drawingControlOptions != null) __obj.updateDynamic("drawingControlOptions")(drawingControlOptions.asInstanceOf[js.Any])
    if (drawingMode != null) __obj.updateDynamic("drawingMode")(drawingMode.asInstanceOf[js.Any])
    if (ellipseOptions != null) __obj.updateDynamic("ellipseOptions")(ellipseOptions.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (rectangleOptions != null) __obj.updateDynamic("rectangleOptions")(rectangleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingOptions]
  }
}

