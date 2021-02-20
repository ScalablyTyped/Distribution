package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketByActivity extends StObject {
  
  /** The default activity stream will be used if a specific activityDataSourceId is not specified. */
  var activityDataSourceId: js.UndefOr[String] = js.native
  
  /** Specifies that only activity segments of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[String] = js.native
}
object BucketByActivity {
  
  @scala.inline
  def apply(): BucketByActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketByActivity]
  }
  
  @scala.inline
  implicit class BucketByActivityMutableBuilder[Self <: BucketByActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityDataSourceId(value: String): Self = StObject.set(x, "activityDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityDataSourceIdUndefined: Self = StObject.set(x, "activityDataSourceId", js.undefined)
    
    @scala.inline
    def setMinDurationMillis(value: String): Self = StObject.set(x, "minDurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDurationMillisUndefined: Self = StObject.set(x, "minDurationMillis", js.undefined)
  }
}
