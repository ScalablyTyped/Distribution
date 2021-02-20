package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketizedCount extends StObject {
  
  /** Number of jobs whose numeric field value fall into `range`. */
  var count: js.UndefOr[Double] = js.native
  
  /** Bucket range on which histogram was performed for the numeric field, that is, the count represents number of jobs in this range. */
  var range: js.UndefOr[BucketRange] = js.native
}
object BucketizedCount {
  
  @scala.inline
  def apply(): BucketizedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketizedCount]
  }
  
  @scala.inline
  implicit class BucketizedCountMutableBuilder[Self <: BucketizedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setRange(value: BucketRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
