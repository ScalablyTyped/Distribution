package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationInfo extends StObject {
  
  /**
    * Output only. Annualized base compensation range. Computed as base compensation entry's CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See
    * CompensationEntry for explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[CompensationRange] = js.native
  
  /**
    * Output only. Annualized total compensation range. Computed as all compensation entries' CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See
    * CompensationEntry for explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[CompensationRange] = js.native
  
  /** Optional. Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as ** base compensation entry ** for the job. */
  var entries: js.UndefOr[js.Array[CompensationEntry]] = js.native
}
object CompensationInfo {
  
  @scala.inline
  def apply(): CompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationInfo]
  }
  
  @scala.inline
  implicit class CompensationInfoMutableBuilder[Self <: CompensationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnualizedBaseCompensationRange(value: CompensationRange): Self = StObject.set(x, "annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedBaseCompensationRangeUndefined: Self = StObject.set(x, "annualizedBaseCompensationRange", js.undefined)
    
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: CompensationRange): Self = StObject.set(x, "annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedTotalCompensationRangeUndefined: Self = StObject.set(x, "annualizedTotalCompensationRange", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[CompensationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: CompensationEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
