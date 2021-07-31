package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashupdate-branch`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsUpdateBranchRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashupdate-branch`
}
object PullsUpdateBranchRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): PullsUpdateBranchRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/pulls/:pull_number/update-branch")
    __obj.asInstanceOf[PullsUpdateBranchRequestOptions]
  }
  
  @scala.inline
  implicit class PullsUpdateBranchRequestOptionsMutableBuilder[Self <: PullsUpdateBranchRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: `SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashupdate-branch`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
