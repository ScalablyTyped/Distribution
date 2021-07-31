package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4CompensationInfoCompensationEntry extends StObject {
  
  /** Compensation amount. */
  var amount: js.UndefOr[Money] = js.undefined
  
  /** Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
    * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[Double] = js.undefined
  
  /** Compensation range. */
  var range: js.UndefOr[GoogleCloudTalentV4CompensationInfoCompensationRange] = js.undefined
  
  /** Compensation type. Default is CompensationType.COMPENSATION_TYPE_UNSPECIFIED. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED. */
  var unit: js.UndefOr[String] = js.undefined
}
object GoogleCloudTalentV4CompensationInfoCompensationEntry {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4CompensationInfoCompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4CompensationInfoCompensationEntry]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4CompensationInfoCompensationEntryMutableBuilder[Self <: GoogleCloudTalentV4CompensationInfoCompensationEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpectedUnitsPerYear(value: Double): Self = StObject.set(x, "expectedUnitsPerYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUnitsPerYearUndefined: Self = StObject.set(x, "expectedUnitsPerYear", js.undefined)
    
    @scala.inline
    def setRange(value: GoogleCloudTalentV4CompensationInfoCompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
