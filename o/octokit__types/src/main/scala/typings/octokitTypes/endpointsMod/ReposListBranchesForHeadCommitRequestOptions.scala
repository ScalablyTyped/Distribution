package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListBranchesForHeadCommitRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
}
object ReposListBranchesForHeadCommitRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposListBranchesForHeadCommitRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/commits/:commit_sha/branches-where-head")
    __obj.asInstanceOf[ReposListBranchesForHeadCommitRequestOptions]
  }
  
  extension [Self <: ReposListBranchesForHeadCommitRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: `SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
