package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketByTime extends StObject {
  
  /** Specifies that result buckets aggregate data by exactly durationMillis time frames. Time frames that contain no data will be included in the response with an empty dataset. */
  var durationMillis: js.UndefOr[String] = js.undefined
  
  var period: js.UndefOr[BucketByTimePeriod] = js.undefined
}
object BucketByTime {
  
  inline def apply(): BucketByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketByTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketByTime] (val x: Self) extends AnyVal {
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setPeriod(value: BucketByTimePeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
