package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashcolumnsSlashColoncolumn_idSlashmoves
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsMoveColumnRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: POST = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashmoves = js.native
}
object ProjectsMoveColumnRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashmoves
  ): ProjectsMoveColumnRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveColumnRequestOptions]
  }
  
  @scala.inline
  implicit class ProjectsMoveColumnRequestOptionsMutableBuilder[Self <: ProjectsMoveColumnRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashmoves): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
