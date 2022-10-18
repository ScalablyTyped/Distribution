package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath244 extends StObject {
  
  /**
    * Returns aggregate usage metrics for your GitHub Enterprise Server 3.5+ instance for a specified time period up to 365 days.
    *
    * To use this endpoint, your GitHub Enterprise Server instance must be connected to GitHub Enterprise Cloud using GitHub Connect. You must enable Server Statistics, and for the API request provide your enterprise account name or organization name connected to the GitHub Enterprise Server. For more information, see "[Enabling Server Statistics for your enterprise](/admin/configuration/configuring-github-connect/enabling-server-statistics-for-your-enterprise)" in the GitHub Enterprise Server documentation.
    *
    * You'll need to use a personal access token:
    *   - If you connected your GitHub Enterprise Server to an enterprise account and enabled Server Statistics, you'll need a personal access token with the `read:enterprise` permission.
    *   - If you connected your GitHub Enterprise Server to an organization account and enabled Server Statistics, you'll need a personal access token with the `read:org` permission.
    *
    * For more information on creating a personal access token, see "[Creating a personal access token](/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token)."
    */
  var get: ParametersPath244
}
object GetParametersPath244 {
  
  inline def apply(get: ParametersPath244): GetParametersPath244 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath244]
  }
  
  extension [Self <: GetParametersPath244](x: Self) {
    
    inline def setGet(value: ParametersPath244): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
