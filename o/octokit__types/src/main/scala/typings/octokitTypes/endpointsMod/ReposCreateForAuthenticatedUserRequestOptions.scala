package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashrepos
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateForAuthenticatedUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashrepos
}
object ReposCreateForAuthenticatedUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposCreateForAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/user/repos")
    __obj.asInstanceOf[ReposCreateForAuthenticatedUserRequestOptions]
  }
  
  @scala.inline
  implicit class ReposCreateForAuthenticatedUserRequestOptionsMutableBuilder[Self <: ReposCreateForAuthenticatedUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashuserSlashrepos): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
