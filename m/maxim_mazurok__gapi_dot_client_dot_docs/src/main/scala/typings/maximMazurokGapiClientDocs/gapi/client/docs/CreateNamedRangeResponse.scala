package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNamedRangeResponse extends StObject {
  
  /** The ID of the created named range. */
  var namedRangeId: js.UndefOr[String] = js.native
}
object CreateNamedRangeResponse {
  
  @scala.inline
  def apply(): CreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedRangeResponse]
  }
  
  @scala.inline
  implicit class CreateNamedRangeResponseMutableBuilder[Self <: CreateNamedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
