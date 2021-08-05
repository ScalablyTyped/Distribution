package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionResponse extends StObject {
  
  /** Partitions created by this request. */
  var partitions: js.UndefOr[js.Array[Partition]] = js.undefined
  
  /** Transaction created by this request. */
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object PartitionResponse {
  
  inline def apply(): PartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionResponse]
  }
  
  extension [Self <: PartitionResponse](x: Self) {
    
    inline def setPartitions(value: js.Array[Partition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "partitions", js.Array(value :_*))
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
