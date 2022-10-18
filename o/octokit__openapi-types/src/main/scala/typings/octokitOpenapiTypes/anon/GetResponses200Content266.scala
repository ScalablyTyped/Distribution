package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content266 extends StObject {
  
  /**
    * Gets the GitHub Advanced Security active committers for an enterprise per repository.
    *
    * Each distinct user login across all repositories is counted as a single Advanced Security seat, so the `total_advanced_security_committers` is not the sum of active_users for each repository.
    *
    * The total number of repositories with committer information is tracked by the `total_count` field.
    */
  var get: Responses200Content266
}
object GetResponses200Content266 {
  
  inline def apply(get: Responses200Content266): GetResponses200Content266 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content266]
  }
  
  extension [Self <: GetResponses200Content266](x: Self) {
    
    inline def setGet(value: Responses200Content266): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
