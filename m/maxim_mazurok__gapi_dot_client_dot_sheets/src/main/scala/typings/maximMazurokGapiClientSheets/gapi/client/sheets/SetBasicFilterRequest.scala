package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBasicFilterRequest extends StObject {
  
  /** The filter to set. */
  var filter: js.UndefOr[BasicFilter] = js.undefined
}
object SetBasicFilterRequest {
  
  @scala.inline
  def apply(): SetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBasicFilterRequest]
  }
  
  @scala.inline
  implicit class SetBasicFilterRequestMutableBuilder[Self <: SetBasicFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: BasicFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
