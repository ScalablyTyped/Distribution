package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketOptions extends js.Object {
  
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
  implicit class BucketOptionsOps[Self <: BucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplicitBuckets(value: Explicit): Self = this.set("explicitBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitBuckets: Self = this.set("explicitBuckets", js.undefined)
    
    @scala.inline
    def setExponentialBuckets(value: Exponential): Self = this.set("exponentialBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponentialBuckets: Self = this.set("exponentialBuckets", js.undefined)
    
    @scala.inline
    def setLinearBuckets(value: Linear): Self = this.set("linearBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearBuckets: Self = this.set("linearBuckets", js.undefined)
  }
}
