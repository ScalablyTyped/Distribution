package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionResponse extends StObject {
  
  /** Partitions created by this request. */
  var partitions: js.UndefOr[js.Array[Partition]] = js.native
  
  /** Transaction created by this request. */
  var transaction: js.UndefOr[Transaction] = js.native
}
object PartitionResponse {
  
  @scala.inline
  def apply(): PartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionResponse]
  }
  
  @scala.inline
  implicit class PartitionResponseMutableBuilder[Self <: PartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitions(value: js.Array[Partition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "partitions", js.Array(value :_*))
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
