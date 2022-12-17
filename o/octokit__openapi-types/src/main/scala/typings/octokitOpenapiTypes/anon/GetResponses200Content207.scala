package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content207 extends StObject {
  
  /**
    * Returns all community profile metrics for a repository. The repository must be public, and cannot be a fork.
    *
    * The returned metrics include an overall health score, the repository description, the presence of documentation, the
    * detected code of conduct, the detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE,
    * README, and CONTRIBUTING files.
    *
    * The `health_percentage` score is defined as a percentage of how many of
    * these four documents are present: README, CONTRIBUTING, LICENSE, and
    * CODE_OF_CONDUCT. For example, if all four documents are present, then
    * the `health_percentage` is `100`. If only one is present, then the
    * `health_percentage` is `25`.
    *
    * `content_reports_enabled` is only returned for organization-owned repositories.
    */
  var get: Responses200Content207
}
object GetResponses200Content207 {
  
  inline def apply(get: Responses200Content207): GetResponses200Content207 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content207]
  }
  
  extension [Self <: GetResponses200Content207](x: Self) {
    
    inline def setGet(value: Responses200Content207): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
