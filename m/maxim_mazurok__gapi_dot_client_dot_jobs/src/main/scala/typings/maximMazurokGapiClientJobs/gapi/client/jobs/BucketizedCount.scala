package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketizedCount extends js.Object {
  
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
  implicit class BucketizedCountOps[Self <: BucketizedCount] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setRange(value: BucketRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
