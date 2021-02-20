package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataPointChangesResponse extends StObject {
  
  /** The data stream ID of the data source with data point changes. */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /** Deleted data points for the user. Note, for modifications this should be parsed before handling insertions. */
  var deletedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.native
  
  /** Inserted data points for the user. */
  var insertedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.native
  
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListDataPointChangesResponse {
  
  @scala.inline
  def apply(): ListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataPointChangesResponse]
  }
  
  @scala.inline
  implicit class ListDataPointChangesResponseMutableBuilder[Self <: ListDataPointChangesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDeletedDataPoint(value: js.Array[DataPoint]): Self = StObject.set(x, "deletedDataPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDataPointUndefined: Self = StObject.set(x, "deletedDataPoint", js.undefined)
    
    @scala.inline
    def setDeletedDataPointVarargs(value: DataPoint*): Self = StObject.set(x, "deletedDataPoint", js.Array(value :_*))
    
    @scala.inline
    def setInsertedDataPoint(value: js.Array[DataPoint]): Self = StObject.set(x, "insertedDataPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedDataPointUndefined: Self = StObject.set(x, "insertedDataPoint", js.undefined)
    
    @scala.inline
    def setInsertedDataPointVarargs(value: DataPoint*): Self = StObject.set(x, "insertedDataPoint", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
