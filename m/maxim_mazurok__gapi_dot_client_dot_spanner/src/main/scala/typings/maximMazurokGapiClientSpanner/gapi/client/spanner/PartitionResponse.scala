package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionResponse extends js.Object {
  
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
  implicit class PartitionResponseOps[Self <: PartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPartitionsVarargs(value: Partition*): Self = this.set("partitions", js.Array(value :_*))
    
    @scala.inline
    def setPartitions(value: js.Array[Partition]): Self = this.set("partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitions: Self = this.set("partitions", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
