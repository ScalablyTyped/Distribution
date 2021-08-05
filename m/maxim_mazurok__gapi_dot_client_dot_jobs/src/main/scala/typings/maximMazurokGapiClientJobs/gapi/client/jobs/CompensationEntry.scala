package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompensationEntry extends StObject {
  
  /** Optional. Compensation amount. */
  var amount: js.UndefOr[Money] = js.undefined
  
  /** Optional. Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080
    * - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[Double] = js.undefined
  
  /** Optional. Compensation range. */
  var range: js.UndefOr[CompensationRange] = js.undefined
  
  /** Optional. Compensation type. Default is CompensationUnit.COMPENSATION_TYPE_UNSPECIFIED. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED. */
  var unit: js.UndefOr[String] = js.undefined
}
object CompensationEntry {
  
  inline def apply(): CompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationEntry]
  }
  
  extension [Self <: CompensationEntry](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpectedUnitsPerYear(value: Double): Self = StObject.set(x, "expectedUnitsPerYear", value.asInstanceOf[js.Any])
    
    inline def setExpectedUnitsPerYearUndefined: Self = StObject.set(x, "expectedUnitsPerYear", js.undefined)
    
    inline def setRange(value: CompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
