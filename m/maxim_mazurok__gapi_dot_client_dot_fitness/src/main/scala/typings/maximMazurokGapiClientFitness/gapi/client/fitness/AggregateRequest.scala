package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateRequest extends StObject {
  
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the same bucketing criteria. There
    * will be one dataset in the response for every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[AggregateBy]] = js.undefined
  
  /**
    * Specifies that data be aggregated each activity segment recorded for a user. Similar to bucketByActivitySegment, but bucketing is done for each activity segment rather than all
    * segments of the same type. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[BucketByActivity] = js.undefined
  
  /**
    * Specifies that data be aggregated by the type of activity being performed when the data was recorded. All data that was recorded during a certain activity type (.for the given time
    * range) will be aggregated into the same bucket. Data that was recorded while the user was not active will not be included in the response. Mutually exclusive of other bucketing
    * specifications.
    */
  var bucketByActivityType: js.UndefOr[BucketByActivity] = js.undefined
  
  /**
    * Specifies that data be aggregated by user sessions. Data that does not fall within the time range of a session will not be included in the response. Mutually exclusive of other
    * bucketing specifications.
    */
  var bucketBySession: js.UndefOr[BucketBySession] = js.undefined
  
  /** Specifies that data be aggregated by a single time interval. Mutually exclusive of other bucketing specifications. */
  var bucketByTime: js.UndefOr[BucketByTime] = js.undefined
  
  /**
    * The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. The maximum allowed difference
    * between start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
    */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  
  /** DO NOT POPULATE THIS FIELD. It is ignored. */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
}
object AggregateRequest {
  
  inline def apply(): AggregateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateRequest]
  }
  
  extension [Self <: AggregateRequest](x: Self) {
    
    inline def setAggregateBy(value: js.Array[AggregateBy]): Self = StObject.set(x, "aggregateBy", value.asInstanceOf[js.Any])
    
    inline def setAggregateByUndefined: Self = StObject.set(x, "aggregateBy", js.undefined)
    
    inline def setAggregateByVarargs(value: AggregateBy*): Self = StObject.set(x, "aggregateBy", js.Array(value*))
    
    inline def setBucketByActivitySegment(value: BucketByActivity): Self = StObject.set(x, "bucketByActivitySegment", value.asInstanceOf[js.Any])
    
    inline def setBucketByActivitySegmentUndefined: Self = StObject.set(x, "bucketByActivitySegment", js.undefined)
    
    inline def setBucketByActivityType(value: BucketByActivity): Self = StObject.set(x, "bucketByActivityType", value.asInstanceOf[js.Any])
    
    inline def setBucketByActivityTypeUndefined: Self = StObject.set(x, "bucketByActivityType", js.undefined)
    
    inline def setBucketBySession(value: BucketBySession): Self = StObject.set(x, "bucketBySession", value.asInstanceOf[js.Any])
    
    inline def setBucketBySessionUndefined: Self = StObject.set(x, "bucketBySession", js.undefined)
    
    inline def setBucketByTime(value: BucketByTime): Self = StObject.set(x, "bucketByTime", value.asInstanceOf[js.Any])
    
    inline def setBucketByTimeUndefined: Self = StObject.set(x, "bucketByTime", js.undefined)
    
    inline def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    inline def setFilteredDataQualityStandard(value: js.Array[String]): Self = StObject.set(x, "filteredDataQualityStandard", value.asInstanceOf[js.Any])
    
    inline def setFilteredDataQualityStandardUndefined: Self = StObject.set(x, "filteredDataQualityStandard", js.undefined)
    
    inline def setFilteredDataQualityStandardVarargs(value: String*): Self = StObject.set(x, "filteredDataQualityStandard", js.Array(value*))
    
    inline def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
  }
}
