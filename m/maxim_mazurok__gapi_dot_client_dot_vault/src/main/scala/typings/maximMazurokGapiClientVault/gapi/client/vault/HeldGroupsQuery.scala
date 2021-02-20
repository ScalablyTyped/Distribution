package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeldGroupsQuery extends StObject {
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The search terms for the hold. */
  var terms: js.UndefOr[String] = js.native
}
object HeldGroupsQuery {
  
  @scala.inline
  def apply(): HeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldGroupsQuery]
  }
  
  @scala.inline
  implicit class HeldGroupsQueryMutableBuilder[Self <: HeldGroupsQuery] (val x: Self) extends AnyVal {
    
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
