package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewCategoryColumn
  extends StObject
     with DataViewCategoricalColumn {
  
  var identity: js.UndefOr[js.Array[DataViewScopeIdentity]] = js.undefined
  
  /** The set of expressions that define the identity for instances of the category.  This must match items in the DataViewScopeIdentity in the identity. */
  var identityFields: js.UndefOr[js.Array[ISQExpr]] = js.undefined
  
  var values: js.Array[PrimitiveValue]
}
object DataViewCategoryColumn {
  
  inline def apply(source: DataViewMetadataColumn, values: js.Array[PrimitiveValue]): DataViewCategoryColumn = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewCategoryColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewCategoryColumn] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: js.Array[DataViewScopeIdentity]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityFields(value: js.Array[ISQExpr]): Self = StObject.set(x, "identityFields", value.asInstanceOf[js.Any])
    
    inline def setIdentityFieldsUndefined: Self = StObject.set(x, "identityFields", js.undefined)
    
    inline def setIdentityFieldsVarargs(value: ISQExpr*): Self = StObject.set(x, "identityFields", js.Array(value*))
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setIdentityVarargs(value: DataViewScopeIdentity*): Self = StObject.set(x, "identity", js.Array(value*))
    
    inline def setValues(value: js.Array[PrimitiveValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: PrimitiveValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
