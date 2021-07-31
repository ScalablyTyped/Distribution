package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.Slashcontent_referencesSlashColoncontent_reference_idSlashattachments
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateContentAttachmentRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: Slashcontent_referencesSlashColoncontent_reference_idSlashattachments
}
object AppsCreateContentAttachmentRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsCreateContentAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/content_references/:content_reference_id/attachments")
    __obj.asInstanceOf[AppsCreateContentAttachmentRequestOptions]
  }
  
  @scala.inline
  implicit class AppsCreateContentAttachmentRequestOptionsMutableBuilder[Self <: AppsCreateContentAttachmentRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Slashcontent_referencesSlashColoncontent_reference_idSlashattachments): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
