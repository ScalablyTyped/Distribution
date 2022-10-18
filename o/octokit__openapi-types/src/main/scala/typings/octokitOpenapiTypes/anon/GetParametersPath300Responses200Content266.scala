package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath300Responses200Content266 extends StObject {
  
  /**
    * Gets the GitHub Advanced Security active committers for an organization per repository.
    *
    * Each distinct user login across all repositories is counted as a single Advanced Security seat, so the `total_advanced_security_committers` is not the sum of advanced_security_committers for each repository.
    *
    * If this organization defers to an enterprise for billing, the `total_advanced_security_committers` returned from the organization API may include some users that are in more than one organization, so they will only consume a single Advanced Security seat at the enterprise level.
    *
    * The total number of repositories with committer information is tracked by the `total_count` field.
    */
  var get: ParametersPath300Responses200Content266
}
object GetParametersPath300Responses200Content266 {
  
  inline def apply(get: ParametersPath300Responses200Content266): GetParametersPath300Responses200Content266 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath300Responses200Content266]
  }
  
  extension [Self <: GetParametersPath300Responses200Content266](x: Self) {
    
    inline def setGet(value: ParametersPath300Responses200Content266): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
