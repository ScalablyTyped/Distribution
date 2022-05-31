package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderOperationEventDetail[K, D] extends StObject {
  
  var data: js.UndefOr[js.Array[D]] = js.undefined
  
  var indexes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var keys: Set[K]
  
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.undefined
}
object DataProviderOperationEventDetail {
  
  inline def apply[K, D](keys: Set[K]): DataProviderOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderOperationEventDetail[K, D]]
  }
  
  extension [Self <: DataProviderOperationEventDetail[?, ?], K, D](x: Self & (DataProviderOperationEventDetail[K, D])) {
    
    inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    inline def setKeys(value: Set[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Array[ItemMetadata[K]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: ItemMetadata[K]*): Self = StObject.set(x, "metadata", js.Array(value :_*))
  }
}
