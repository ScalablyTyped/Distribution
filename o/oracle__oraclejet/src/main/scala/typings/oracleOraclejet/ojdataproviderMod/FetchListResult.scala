package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchListResult[K, D] extends StObject {
  
  var data: js.Array[D]
  
  var fetchParameters: FetchListParameters[D]
  
  var metadata: js.Array[ItemMetadata[K]]
}
object FetchListResult {
  
  inline def apply[K, D](data: js.Array[D], fetchParameters: FetchListParameters[D], metadata: js.Array[ItemMetadata[K]]): FetchListResult[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListResult[K, D]]
  }
  
  extension [Self <: FetchListResult[?, ?], K, D](x: Self & (FetchListResult[K, D])) {
    
    inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setFetchParameters(value: FetchListParameters[D]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Array[ItemMetadata[K]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: ItemMetadata[K]*): Self = StObject.set(x, "metadata", js.Array(value :_*))
  }
}
