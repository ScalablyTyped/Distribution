package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.EllipseOptions
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.MarkerOptions
import typings.navermaps.naver.maps.PolygonOptions
import typings.navermaps.naver.maps.PolylineOptions
import typings.navermaps.naver.maps.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingOptions extends js.Object {
  
  var arrowlineOptions: js.UndefOr[PolylineOptions] = js.native
  
  var controlPointOptions: js.UndefOr[typings.navermaps.naver.maps.drawing.controlPointOptions] = js.native
  
  var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.native
  
  var drawingControlOptions: js.UndefOr[typings.navermaps.naver.maps.drawing.drawingControlOptions] = js.native
  
  var drawingMode: js.UndefOr[DrawingMode] = js.native
  
  var ellipseOptions: js.UndefOr[EllipseOptions] = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  
  var polygonOptions: js.UndefOr[PolygonOptions] = js.native
  
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.native
}
object DrawingOptions {
  
  @scala.inline
  def apply(): DrawingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingOptions]
  }
  
  @scala.inline
  implicit class DrawingOptionsOps[Self <: DrawingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowlineOptions(value: PolylineOptions): Self = this.set("arrowlineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowlineOptions: Self = this.set("arrowlineOptions", js.undefined)
    
    @scala.inline
    def setControlPointOptions(value: controlPointOptions): Self = this.set("controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlPointOptions: Self = this.set("controlPointOptions", js.undefined)
    
    @scala.inline
    def setDrawingControlVarargs(value: DrawingMode*): Self = this.set("drawingControl", js.Array(value :_*))
    
    @scala.inline
    def setDrawingControl(value: js.Array[DrawingMode]): Self = this.set("drawingControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingControl: Self = this.set("drawingControl", js.undefined)
    
    @scala.inline
    def setDrawingControlOptions(value: drawingControlOptions): Self = this.set("drawingControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingControlOptions: Self = this.set("drawingControlOptions", js.undefined)
    
    @scala.inline
    def setDrawingMode(value: DrawingMode): Self = this.set("drawingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingMode: Self = this.set("drawingMode", js.undefined)
    
    @scala.inline
    def setEllipseOptions(value: EllipseOptions): Self = this.set("ellipseOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipseOptions: Self = this.set("ellipseOptions", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: PolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: PolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    
    @scala.inline
    def setRectangleOptions(value: RectangleOptions): Self = this.set("rectangleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangleOptions: Self = this.set("rectangleOptions", js.undefined)
  }
}
