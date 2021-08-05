package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionQueryResponse extends StObject {
  
  /**
    * A page token that may be used to request an additional set of results, up to the number specified by `partition_count` in the PartitionQuery request. If blank, there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Partition results. Each partition is a split point that can be used by RunQuery as a starting or end point for the query results. The RunQuery requests must be made with the same
    * query supplied to this PartitionQuery request. The partition cursors will be ordered according to same ordering as the results of the query supplied to PartitionQuery. For example,
    * if a PartitionQuery request returns partition cursors A and B, running the following three queries will return the entire result set of the original query: * query, end_at A *
    * query, start_at A, end_at B * query, start_at B An empty result may indicate that the query has too few results to be partitioned.
    */
  var partitions: js.UndefOr[js.Array[Cursor]] = js.undefined
}
object PartitionQueryResponse {
  
  inline def apply(): PartitionQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionQueryResponse]
  }
  
  extension [Self <: PartitionQueryResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartitions(value: js.Array[Cursor]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: Cursor*): Self = StObject.set(x, "partitions", js.Array(value :_*))
  }
}
