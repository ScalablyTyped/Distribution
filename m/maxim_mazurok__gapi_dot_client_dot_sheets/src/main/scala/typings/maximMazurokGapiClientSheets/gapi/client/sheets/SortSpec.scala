package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortSpec extends StObject {
  
  /** The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color. */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color
    * is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** Reference to a data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.native
  
  /** The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color. */
  var foregroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color
    * is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.native
}
object SortSpec {
  
  @scala.inline
  def apply(): SortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSpec]
  }
  
  @scala.inline
  implicit class SortSpecMutableBuilder[Self <: SortSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorStyle(value: ColorStyle): Self = StObject.set(x, "foregroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorStyleUndefined: Self = StObject.set(x, "foregroundColorStyle", js.undefined)
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
