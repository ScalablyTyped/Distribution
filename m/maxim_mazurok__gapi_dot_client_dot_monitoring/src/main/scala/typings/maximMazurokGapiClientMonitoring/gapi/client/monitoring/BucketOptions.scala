package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketOptions extends StObject {
  
  /** The explicit buckets. */
  var explicitBuckets: js.UndefOr[Explicit] = js.native
  
  /** The exponential buckets. */
  var exponentialBuckets: js.UndefOr[Exponential] = js.native
  
  /** The linear bucket. */
  var linearBuckets: js.UndefOr[Linear] = js.native
}
object BucketOptions {
  
  @scala.inline
  def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  
  @scala.inline
  implicit class BucketOptionsMutableBuilder[Self <: BucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitBuckets(value: Explicit): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    @scala.inline
    def setExponentialBuckets(value: Exponential): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    @scala.inline
    def setLinearBuckets(value: Linear): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
  }
}
