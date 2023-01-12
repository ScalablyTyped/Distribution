package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderAddOperationEventDetail[K, D]
  extends StObject
     with DataProviderOperationEventDetail[K, D] {
  
  var addBeforeKeys: js.UndefOr[js.Array[K]] = js.undefined
  
  var parentKeys: js.UndefOr[js.Array[K]] = js.undefined
}
object DataProviderAddOperationEventDetail {
  
  inline def apply[K, D](keys: Set[K]): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataProviderAddOperationEventDetail[?, ?], K, D] (val x: Self & (DataProviderAddOperationEventDetail[K, D])) extends AnyVal {
    
    inline def setAddBeforeKeys(value: js.Array[K]): Self = StObject.set(x, "addBeforeKeys", value.asInstanceOf[js.Any])
    
    inline def setAddBeforeKeysUndefined: Self = StObject.set(x, "addBeforeKeys", js.undefined)
    
    inline def setAddBeforeKeysVarargs(value: K*): Self = StObject.set(x, "addBeforeKeys", js.Array(value*))
    
    inline def setParentKeys(value: js.Array[K]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
    
    inline def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
    
    inline def setParentKeysVarargs(value: K*): Self = StObject.set(x, "parentKeys", js.Array(value*))
  }
}
