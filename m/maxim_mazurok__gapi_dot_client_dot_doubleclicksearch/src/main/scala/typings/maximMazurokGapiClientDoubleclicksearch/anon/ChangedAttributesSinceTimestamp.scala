package typings.maximMazurokGapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedAttributesSinceTimestamp extends js.Object {
  
  /** Inclusive UTC timestamp in RFC format, e.g., `2013-07-16T10:16:23.555Z`. See additional references on how changed attribute reports work. */
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.native
  
  /** Inclusive UTC timestamp in RFC format, e.g., `2013-07-16T10:16:23.555Z`. See additional references on how changed metrics reports work. */
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.native
  
  /** Inclusive date in YYYY-MM-DD format. */
  var endDate: js.UndefOr[String] = js.native
  
  /** Inclusive date in YYYY-MM-DD format. */
  var startDate: js.UndefOr[String] = js.native
}
object ChangedAttributesSinceTimestamp {
  
  @scala.inline
  def apply(): ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedAttributesSinceTimestamp]
  }
  
  @scala.inline
  implicit class ChangedAttributesSinceTimestampOps[Self <: ChangedAttributesSinceTimestamp] (val x: Self) extends AnyVal {
    
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
    def setChangedAttributesSinceTimestamp(value: String): Self = this.set("changedAttributesSinceTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedAttributesSinceTimestamp: Self = this.set("changedAttributesSinceTimestamp", js.undefined)
    
    @scala.inline
    def setChangedMetricsSinceTimestamp(value: String): Self = this.set("changedMetricsSinceTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedMetricsSinceTimestamp: Self = this.set("changedMetricsSinceTimestamp", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
