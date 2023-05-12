package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoSarifid extends StObject {
  
  /**
    * Get information about a SARIF upload
    * @description Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)." You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  var get: ParametersPathRepoSarifid
}
object GetParametersPathRepoSarifid {
  
  inline def apply(get: ParametersPathRepoSarifid): GetParametersPathRepoSarifid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathRepoSarifid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathRepoSarifid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
