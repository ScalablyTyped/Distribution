package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketByTime extends js.Object {
  
  /** Specifies that result buckets aggregate data by exactly durationMillis time frames. Time frames that contain no data will be included in the response with an empty dataset. */
  var durationMillis: js.UndefOr[String] = js.native
  
  var period: js.UndefOr[BucketByTimePeriod] = js.native
}
object BucketByTime {
  
  @scala.inline
  def apply(): BucketByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketByTime]
  }
  
  @scala.inline
  implicit class BucketByTimeOps[Self <: BucketByTime] (val x: Self) extends AnyVal {
    
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
    def setDurationMillis(value: String): Self = this.set("durationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMillis: Self = this.set("durationMillis", js.undefined)
    
    @scala.inline
    def setPeriod(value: BucketByTimePeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
