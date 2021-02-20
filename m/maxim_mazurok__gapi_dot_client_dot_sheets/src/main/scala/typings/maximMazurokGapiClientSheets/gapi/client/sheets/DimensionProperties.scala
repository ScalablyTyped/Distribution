package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionProperties extends StObject {
  
  /** Output only. If set, this is a column in a data source sheet. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The developer metadata associated with a single row or column. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  
  /** True if this dimension is being filtered. This field is read-only. */
  var hiddenByFilter: js.UndefOr[Boolean] = js.native
  
  /** True if this dimension is explicitly hidden. */
  var hiddenByUser: js.UndefOr[Boolean] = js.native
  
  /** The height (if a row) or width (if a column) of the dimension in pixels. */
  var pixelSize: js.UndefOr[Double] = js.native
}
object DimensionProperties {
  
  @scala.inline
  def apply(): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionProperties]
  }
  
  @scala.inline
  implicit class DimensionPropertiesMutableBuilder[Self <: DimensionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setHiddenByFilter(value: Boolean): Self = StObject.set(x, "hiddenByFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenByFilterUndefined: Self = StObject.set(x, "hiddenByFilter", js.undefined)
    
    @scala.inline
    def setHiddenByUser(value: Boolean): Self = StObject.set(x, "hiddenByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenByUserUndefined: Self = StObject.set(x, "hiddenByUser", js.undefined)
    
    @scala.inline
    def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
  }
}
