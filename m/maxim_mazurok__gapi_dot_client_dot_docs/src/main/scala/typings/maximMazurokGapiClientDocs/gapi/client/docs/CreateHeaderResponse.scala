package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHeaderResponse extends StObject {
  
  /** The ID of the created header. */
  var headerId: js.UndefOr[String] = js.native
}
object CreateHeaderResponse {
  
  @scala.inline
  def apply(): CreateHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHeaderResponse]
  }
  
  @scala.inline
  implicit class CreateHeaderResponseMutableBuilder[Self <: CreateHeaderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
