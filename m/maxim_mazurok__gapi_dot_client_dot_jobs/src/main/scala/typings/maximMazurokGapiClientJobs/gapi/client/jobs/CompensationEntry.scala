package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationEntry extends js.Object {
  
  /** Optional. Compensation amount. */
  var amount: js.UndefOr[Money] = js.native
  
  /** Optional. Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080
    * - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[Double] = js.native
  
  /** Optional. Compensation range. */
  var range: js.UndefOr[CompensationRange] = js.native
  
  /** Optional. Compensation type. Default is CompensationUnit.COMPENSATION_TYPE_UNSPECIFIED. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED. */
  var unit: js.UndefOr[String] = js.native
}
object CompensationEntry {
  
  @scala.inline
  def apply(): CompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationEntry]
  }
  
  @scala.inline
  implicit class CompensationEntryOps[Self <: CompensationEntry] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Money): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpectedUnitsPerYear(value: Double): Self = this.set("expectedUnitsPerYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedUnitsPerYear: Self = this.set("expectedUnitsPerYear", js.undefined)
    
    @scala.inline
    def setRange(value: CompensationRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
