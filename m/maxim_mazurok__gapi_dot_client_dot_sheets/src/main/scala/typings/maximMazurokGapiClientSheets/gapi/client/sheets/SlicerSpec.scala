package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerSpec extends StObject {
  
  /** True if the filter should apply to pivot tables. If not set, default to `True`. */
  var applyToPivotTables: js.UndefOr[Boolean] = js.native
  
  /** The background color of the slicer. */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /** The background color of the slicer. If background_color is also set, this field takes precedence. */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The column index in the data table on which the filter is applied to. */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /** The data range of the slicer. */
  var dataRange: js.UndefOr[GridRange] = js.native
  
  /** The filtering criteria of the slicer. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.native
  
  /** The horizontal alignment of title in the slicer. If unspecified, defaults to `LEFT` */
  var horizontalAlignment: js.UndefOr[String] = js.native
  
  /** The text format of title in the slicer. */
  var textFormat: js.UndefOr[TextFormat] = js.native
  
  /** The title of the slicer. */
  var title: js.UndefOr[String] = js.native
}
object SlicerSpec {
  
  @scala.inline
  def apply(): SlicerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerSpec]
  }
  
  @scala.inline
  implicit class SlicerSpecMutableBuilder[Self <: SlicerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyToPivotTables(value: Boolean): Self = StObject.set(x, "applyToPivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyToPivotTablesUndefined: Self = StObject.set(x, "applyToPivotTables", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setDataRange(value: GridRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    @scala.inline
    def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
