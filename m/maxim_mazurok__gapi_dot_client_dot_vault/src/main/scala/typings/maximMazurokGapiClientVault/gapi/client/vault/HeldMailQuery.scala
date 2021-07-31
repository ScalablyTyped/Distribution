package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldMailQuery extends StObject {
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The search terms for the hold. */
  var terms: js.UndefOr[String] = js.undefined
}
object HeldMailQuery {
  
  @scala.inline
  def apply(): HeldMailQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldMailQuery]
  }
  
  @scala.inline
  implicit class HeldMailQueryMutableBuilder[Self <: HeldMailQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
