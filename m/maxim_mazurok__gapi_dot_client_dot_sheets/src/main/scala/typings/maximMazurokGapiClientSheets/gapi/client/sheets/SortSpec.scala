package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortSpec extends StObject {
  
  /** The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color. */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color
    * is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** Reference to a data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.undefined
  
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  
  /** The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color. */
  var foregroundColor: js.UndefOr[Color] = js.undefined
  
  /**
    * The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color
    * is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SortSpec {
  
  inline def apply(): SortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSpec]
  }
  
  extension [Self <: SortSpec](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    inline def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    inline def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
    
    inline def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
    
    inline def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyle(value: ColorStyle): Self = StObject.set(x, "foregroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyleUndefined: Self = StObject.set(x, "foregroundColorStyle", js.undefined)
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
