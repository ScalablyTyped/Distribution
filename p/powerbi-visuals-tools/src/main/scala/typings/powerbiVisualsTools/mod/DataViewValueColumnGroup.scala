package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewValueColumnGroup extends StObject {
  
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  
  var name: js.UndefOr[PrimitiveValue] = js.undefined
  
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  
  var values: js.Array[DataViewValueColumn]
}
object DataViewValueColumnGroup {
  
  inline def apply(values: js.Array[DataViewValueColumn]): DataViewValueColumnGroup = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewValueColumnGroup]
  }
  
  extension [Self <: DataViewValueColumnGroup](x: Self) {
    
    inline def setIdentity(value: DataViewScopeIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setName(value: PrimitiveValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjects(value: DataViewObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setValues(value: js.Array[DataViewValueColumn]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: DataViewValueColumn*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
