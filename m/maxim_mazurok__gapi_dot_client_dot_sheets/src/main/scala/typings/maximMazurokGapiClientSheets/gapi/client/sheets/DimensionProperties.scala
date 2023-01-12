package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionProperties extends StObject {
  
  /** Output only. If set, this is a column in a data source sheet. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.undefined
  
  /** The developer metadata associated with a single row or column. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  
  /** True if this dimension is being filtered. This field is read-only. */
  var hiddenByFilter: js.UndefOr[Boolean] = js.undefined
  
  /** True if this dimension is explicitly hidden. */
  var hiddenByUser: js.UndefOr[Boolean] = js.undefined
  
  /** The height (if a row) or width (if a column) of the dimension in pixels. */
  var pixelSize: js.UndefOr[Double] = js.undefined
}
object DimensionProperties {
  
  inline def apply(): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionProperties] (val x: Self) extends AnyVal {
    
    inline def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    inline def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    inline def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value*))
    
    inline def setHiddenByFilter(value: Boolean): Self = StObject.set(x, "hiddenByFilter", value.asInstanceOf[js.Any])
    
    inline def setHiddenByFilterUndefined: Self = StObject.set(x, "hiddenByFilter", js.undefined)
    
    inline def setHiddenByUser(value: Boolean): Self = StObject.set(x, "hiddenByUser", value.asInstanceOf[js.Any])
    
    inline def setHiddenByUserUndefined: Self = StObject.set(x, "hiddenByUser", js.undefined)
    
    inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
  }
}
