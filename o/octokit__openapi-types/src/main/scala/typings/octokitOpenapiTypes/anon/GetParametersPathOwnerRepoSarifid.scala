package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerRepoSarifid extends StObject {
  
  /** Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)." You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint. */
  var get: ParametersPathOwnerRepoSarifid
}
object GetParametersPathOwnerRepoSarifid {
  
  inline def apply(get: ParametersPathOwnerRepoSarifid): GetParametersPathOwnerRepoSarifid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerRepoSarifid]
  }
  
  extension [Self <: GetParametersPathOwnerRepoSarifid](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerRepoSarifid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
