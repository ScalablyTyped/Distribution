package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDuplicatesResponse extends StObject {
  
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.native
}
object DeleteDuplicatesResponse {
  
  @scala.inline
  def apply(): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
  
  @scala.inline
  implicit class DeleteDuplicatesResponseMutableBuilder[Self <: DeleteDuplicatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuplicatesRemovedCount(value: Double): Self = StObject.set(x, "duplicatesRemovedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicatesRemovedCountUndefined: Self = StObject.set(x, "duplicatesRemovedCount", js.undefined)
  }
}
