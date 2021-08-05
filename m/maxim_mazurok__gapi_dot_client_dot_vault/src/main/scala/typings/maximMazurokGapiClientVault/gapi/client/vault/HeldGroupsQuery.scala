package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldGroupsQuery extends StObject {
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The search terms for the hold. */
  var terms: js.UndefOr[String] = js.undefined
}
object HeldGroupsQuery {
  
  inline def apply(): HeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldGroupsQuery]
  }
  
  extension [Self <: HeldGroupsQuery](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
