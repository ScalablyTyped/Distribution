package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketRange extends StObject {
  
  /** Starting value of the bucket range. */
  var from: js.UndefOr[Double] = js.native
  
  /** Ending value of the bucket range. */
  var to: js.UndefOr[Double] = js.native
}
object BucketRange {
  
  @scala.inline
  def apply(): BucketRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketRange]
  }
  
  @scala.inline
  implicit class BucketRangeMutableBuilder[Self <: BucketRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
