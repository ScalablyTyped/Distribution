package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketRange extends StObject {
  
  /** Starting value of the bucket range. */
  var from: js.UndefOr[Double] = js.undefined
  
  /** Ending value of the bucket range. */
  var to: js.UndefOr[Double] = js.undefined
}
object BucketRange {
  
  inline def apply(): BucketRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketRange]
  }
  
  extension [Self <: BucketRange](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
