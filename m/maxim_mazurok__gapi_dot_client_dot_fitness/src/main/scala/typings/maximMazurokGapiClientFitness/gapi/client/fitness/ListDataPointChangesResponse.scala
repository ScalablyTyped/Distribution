package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataPointChangesResponse extends StObject {
  
  /** The data stream ID of the data source with data point changes. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /** Deleted data points for the user. Note, for modifications this should be parsed before handling insertions. */
  var deletedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  
  /** Inserted data points for the user. */
  var insertedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDataPointChangesResponse {
  
  inline def apply(): ListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataPointChangesResponse]
  }
  
  extension [Self <: ListDataPointChangesResponse](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setDeletedDataPoint(value: js.Array[DataPoint]): Self = StObject.set(x, "deletedDataPoint", value.asInstanceOf[js.Any])
    
    inline def setDeletedDataPointUndefined: Self = StObject.set(x, "deletedDataPoint", js.undefined)
    
    inline def setDeletedDataPointVarargs(value: DataPoint*): Self = StObject.set(x, "deletedDataPoint", js.Array(value*))
    
    inline def setInsertedDataPoint(value: js.Array[DataPoint]): Self = StObject.set(x, "insertedDataPoint", value.asInstanceOf[js.Any])
    
    inline def setInsertedDataPointUndefined: Self = StObject.set(x, "insertedDataPoint", js.undefined)
    
    inline def setInsertedDataPointVarargs(value: DataPoint*): Self = StObject.set(x, "insertedDataPoint", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
