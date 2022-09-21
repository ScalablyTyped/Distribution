package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewCategorical extends StObject {
  
  var categories: js.UndefOr[js.Array[DataViewCategoryColumn]] = js.undefined
  
  var values: js.UndefOr[DataViewValueColumns] = js.undefined
}
object DataViewCategorical {
  
  inline def apply(): DataViewCategorical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewCategorical]
  }
  
  extension [Self <: DataViewCategorical](x: Self) {
    
    inline def setCategories(value: js.Array[DataViewCategoryColumn]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: DataViewCategoryColumn*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setValues(value: DataViewValueColumns): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
