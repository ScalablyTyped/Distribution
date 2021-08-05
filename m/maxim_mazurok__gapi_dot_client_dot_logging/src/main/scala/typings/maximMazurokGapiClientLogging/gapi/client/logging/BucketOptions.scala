package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketOptions extends StObject {
  
  /** The explicit buckets. */
  var explicitBuckets: js.UndefOr[Explicit] = js.undefined
  
  /** The exponential buckets. */
  var exponentialBuckets: js.UndefOr[Exponential] = js.undefined
  
  /** The linear bucket. */
  var linearBuckets: js.UndefOr[Linear] = js.undefined
}
object BucketOptions {
  
  inline def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  
  extension [Self <: BucketOptions](x: Self) {
    
    inline def setExplicitBuckets(value: Explicit): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    inline def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    inline def setExponentialBuckets(value: Exponential): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    inline def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    inline def setLinearBuckets(value: Linear): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    inline def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
  }
}
