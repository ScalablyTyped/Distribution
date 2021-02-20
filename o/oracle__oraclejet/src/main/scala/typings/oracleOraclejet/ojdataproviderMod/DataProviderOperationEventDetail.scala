package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderOperationEventDetail[K, D] extends StObject {
  
  var data: js.UndefOr[js.Array[D]] = js.native
  
  var indexes: js.UndefOr[js.Array[Double]] = js.native
  
  var keys: Set[K] = js.native
  
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.native
}
object DataProviderOperationEventDetail {
  
  @scala.inline
  def apply[K, D](keys: Set[K]): DataProviderOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderOperationEventDetail[K, D]]
  }
  
  @scala.inline
  implicit class DataProviderOperationEventDetailMutableBuilder[Self <: DataProviderOperationEventDetail[_, _], K, D] (val x: Self with (DataProviderOperationEventDetail[K, D])) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: Set[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Array[ItemMetadata[K]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: ItemMetadata[K]*): Self = StObject.set(x, "metadata", js.Array(value :_*))
  }
}
