package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrequencyCap extends js.Object {
  
  /** The maximum number of times a user may be shown with the same ad during this period. Must be greater than 0. Applicable when unlimited is `false`. */
  var maxImpressions: js.UndefOr[Double] = js.native
  
  /** The time unit in which the frequency cap will be applied. Applicable when unlimited is `false`. */
  var timeUnit: js.UndefOr[String] = js.native
  
  /**
    * The number of time_unit the frequency cap will last. Applicable when unlimited is `false`. The following restrictions apply based on the value of time_unit: * `TIME_UNIT_LIFETIME` -
    * this field is output only and will default to 1 * `TIME_UNIT_MONTHS` - must be between 1 and 2 * `TIME_UNIT_WEEKS` - must be between 1 and 4 * `TIME_UNIT_DAYS` - must be between 1
    * and 6 * `TIME_UNIT_HOURS` - must be between 1 and 23 * `TIME_UNIT_MINUTES` - must be between 1 and 59
    */
  var timeUnitCount: js.UndefOr[Double] = js.native
  
  /** Whether unlimited frequency capping is applied. When this field is set to `true`, the remaining frequency cap fields are not applicable. */
  var unlimited: js.UndefOr[Boolean] = js.native
}
object FrequencyCap {
  
  @scala.inline
  def apply(): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyCap]
  }
  
  @scala.inline
  implicit class FrequencyCapOps[Self <: FrequencyCap] (val x: Self) extends AnyVal {
    
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
    def setMaxImpressions(value: Double): Self = this.set("maxImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxImpressions: Self = this.set("maxImpressions", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: String): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUnit: Self = this.set("timeUnit", js.undefined)
    
    @scala.inline
    def setTimeUnitCount(value: Double): Self = this.set("timeUnitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUnitCount: Self = this.set("timeUnitCount", js.undefined)
    
    @scala.inline
    def setUnlimited(value: Boolean): Self = this.set("unlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlimited: Self = this.set("unlimited", js.undefined)
  }
}
