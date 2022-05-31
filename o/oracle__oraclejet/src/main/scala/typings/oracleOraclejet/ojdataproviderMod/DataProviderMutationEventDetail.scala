package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderMutationEventDetail[K, D] extends StObject {
  
  var add: js.UndefOr[DataProviderAddOperationEventDetail[K, D]] = js.undefined
  
  var remove: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
  
  var update: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
}
object DataProviderMutationEventDetail {
  
  inline def apply[K, D](): DataProviderMutationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataProviderMutationEventDetail[K, D]]
  }
  
  extension [Self <: DataProviderMutationEventDetail[?, ?], K, D](x: Self & (DataProviderMutationEventDetail[K, D])) {
    
    inline def setAdd(value: DataProviderAddOperationEventDetail[K, D]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: DataProviderOperationEventDetail[K, D]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setUpdate(value: DataProviderOperationEventDetail[K, D]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
