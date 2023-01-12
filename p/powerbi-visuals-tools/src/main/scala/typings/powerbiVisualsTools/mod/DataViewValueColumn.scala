package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewValueColumn
  extends StObject
     with DataViewCategoricalColumn {
  
  var highlights: js.UndefOr[js.Array[PrimitiveValue]] = js.undefined
  
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  
  var values: js.Array[PrimitiveValue]
}
object DataViewValueColumn {
  
  inline def apply(source: DataViewMetadataColumn, values: js.Array[PrimitiveValue]): DataViewValueColumn = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewValueColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewValueColumn] (val x: Self) extends AnyVal {
    
    inline def setHighlights(value: js.Array[PrimitiveValue]): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    inline def setHighlightsVarargs(value: PrimitiveValue*): Self = StObject.set(x, "highlights", js.Array(value*))
    
    inline def setIdentity(value: DataViewScopeIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setValues(value: js.Array[PrimitiveValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: PrimitiveValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
