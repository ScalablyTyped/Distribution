package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderMutationEventDetail[K, D] extends StObject {
  
  var add: js.UndefOr[DataProviderAddOperationEventDetail[K, D]] = js.native
  
  var remove: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.native
  
  var update: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.native
}
object DataProviderMutationEventDetail {
  
  @scala.inline
  def apply[K, D](): DataProviderMutationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataProviderMutationEventDetail[K, D]]
  }
  
  @scala.inline
  implicit class DataProviderMutationEventDetailMutableBuilder[Self <: DataProviderMutationEventDetail[_, _], K, D] (val x: Self with (DataProviderMutationEventDetail[K, D])) extends AnyVal {
    
    @scala.inline
    def setAdd(value: DataProviderAddOperationEventDetail[K, D]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setRemove(value: DataProviderOperationEventDetail[K, D]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setUpdate(value: DataProviderOperationEventDetail[K, D]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
