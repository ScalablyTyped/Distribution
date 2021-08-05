package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashnotificationsSlashthreadsSlashColonthread_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityMarkThreadAsReadRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: SlashnotificationsSlashthreadsSlashColonthread_id
}
object ActivityMarkThreadAsReadRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActivityMarkThreadAsReadRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/notifications/threads/:thread_id")
    __obj.asInstanceOf[ActivityMarkThreadAsReadRequestOptions]
  }
  
  extension [Self <: ActivityMarkThreadAsReadRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashnotificationsSlashthreadsSlashColonthread_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
