package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFooterRequest extends StObject {
  
  /**
    * The id of the footer to delete. If this footer is defined on DocumentStyle, the reference to this footer is removed, resulting in no footer of that type for the first section of the
    * document. If this footer is defined on a SectionStyle, the reference to this footer is removed and the footer of that type is now continued from the previous section.
    */
  var footerId: js.UndefOr[String] = js.native
}
object DeleteFooterRequest {
  
  @scala.inline
  def apply(): DeleteFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFooterRequest]
  }
  
  @scala.inline
  implicit class DeleteFooterRequestMutableBuilder[Self <: DeleteFooterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
