package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewReductionMetadata extends StObject {
  
  var categorical: js.UndefOr[DataViewCategoricalReductionMetadata] = js.undefined
}
object DataViewReductionMetadata {
  
  inline def apply(): DataViewReductionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewReductionMetadata]
  }
  
  extension [Self <: DataViewReductionMetadata](x: Self) {
    
    inline def setCategorical(value: DataViewCategoricalReductionMetadata): Self = StObject.set(x, "categorical", value.asInstanceOf[js.Any])
    
    inline def setCategoricalUndefined: Self = StObject.set(x, "categorical", js.undefined)
  }
}
