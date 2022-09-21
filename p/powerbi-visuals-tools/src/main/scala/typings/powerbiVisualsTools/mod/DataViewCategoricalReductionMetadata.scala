package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewCategoricalReductionMetadata extends StObject {
  
  var categories: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
  
  var metadata: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
  
  var values: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
}
object DataViewCategoricalReductionMetadata {
  
  inline def apply(): DataViewCategoricalReductionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewCategoricalReductionMetadata]
  }
  
  extension [Self <: DataViewCategoricalReductionMetadata](x: Self) {
    
    inline def setCategories(value: DataViewReductionAlgorithmMetadata): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setMetadata(value: DataViewReductionAlgorithmMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValues(value: DataViewReductionAlgorithmMetadata): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
