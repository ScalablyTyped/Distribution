package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionQueryResponse extends js.Object {
  
  /**
    * A page token that may be used to request an additional set of results, up to the number specified by `partition_count` in the PartitionQuery request. If blank, there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Partition results. Each partition is a split point that can be used by RunQuery as a starting or end point for the query results. The RunQuery requests must be made with the same
    * query supplied to this PartitionQuery request. The partition cursors will be ordered according to same ordering as the results of the query supplied to PartitionQuery. For example,
    * if a PartitionQuery request returns partition cursors A and B, running the following three queries will return the entire result set of the original query: * query, end_at A *
    * query, start_at A, end_at B * query, start_at B An empty result may indicate that the query has too few results to be partitioned.
    */
  var partitions: js.UndefOr[js.Array[Cursor]] = js.native
}
object PartitionQueryResponse {
  
  @scala.inline
  def apply(): PartitionQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionQueryResponse]
  }
  
  @scala.inline
  implicit class PartitionQueryResponseOps[Self <: PartitionQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: Cursor*): Self = this.set("partitions", js.Array(value :_*))
    
    @scala.inline
    def setPartitions(value: js.Array[Cursor]): Self = this.set("partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitions: Self = this.set("partitions", js.undefined)
  }
}
