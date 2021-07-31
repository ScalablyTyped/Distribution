package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHeaderRequest extends StObject {
  
  /**
    * The id of the header to delete. If this header is defined on DocumentStyle, the reference to this header is removed, resulting in no header of that type for the first section of the
    * document. If this header is defined on a SectionStyle, the reference to this header is removed and the header of that type is now continued from the previous section.
    */
  var headerId: js.UndefOr[String] = js.undefined
}
object DeleteHeaderRequest {
  
  @scala.inline
  def apply(): DeleteHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteHeaderRequest]
  }
  
  @scala.inline
  implicit class DeleteHeaderRequestMutableBuilder[Self <: DeleteHeaderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
