package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateBucket extends StObject {
  
  /** Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT */
  var activity: js.UndefOr[Double] = js.undefined
  
  /** There will be one dataset per AggregateBy in the request. */
  var dataset: js.UndefOr[js.Array[Dataset]] = js.undefined
  
  /** The end time for the aggregated data, in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  
  /** Available for Bucket.Type.SESSION */
  var session: js.UndefOr[Session] = js.undefined
  
  /** The start time for the aggregated data, in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
  
  /** The type of a bucket signifies how the data aggregation is performed in the bucket. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AggregateBucket {
  
  @scala.inline
  def apply(): AggregateBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateBucket]
  }
  
  @scala.inline
  implicit class AggregateBucketMutableBuilder[Self <: AggregateBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: Double): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    @scala.inline
    def setDataset(value: js.Array[Dataset]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setDatasetVarargs(value: Dataset*): Self = StObject.set(x, "dataset", js.Array(value :_*))
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
