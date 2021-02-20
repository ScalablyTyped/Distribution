package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderAddOperationEventDetail[K, D] extends DataProviderOperationEventDetail[K, D] {
  
  var addBeforeKeys: js.UndefOr[js.Array[K]] = js.native
  
  var parentKeys: js.UndefOr[js.Array[K]] = js.native
}
object DataProviderAddOperationEventDetail {
  
  @scala.inline
  def apply[K, D](keys: Set[K]): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
  
  @scala.inline
  implicit class DataProviderAddOperationEventDetailMutableBuilder[Self <: DataProviderAddOperationEventDetail[_, _], K, D] (val x: Self with (DataProviderAddOperationEventDetail[K, D])) extends AnyVal {
    
    @scala.inline
    def setAddBeforeKeys(value: js.Array[K]): Self = StObject.set(x, "addBeforeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBeforeKeysUndefined: Self = StObject.set(x, "addBeforeKeys", js.undefined)
    
    @scala.inline
    def setAddBeforeKeysVarargs(value: K*): Self = StObject.set(x, "addBeforeKeys", js.Array(value :_*))
    
    @scala.inline
    def setParentKeys(value: js.Array[K]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
    
    @scala.inline
    def setParentKeysVarargs(value: K*): Self = StObject.set(x, "parentKeys", js.Array(value :_*))
  }
}
