package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content260 extends StObject {
  
  /**
    * Get community profile metrics
    * @description Returns all community profile metrics for a repository. The repository cannot be a fork.
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
  var get: Responses200Content260
}
object GetResponses200Content260 {
  
  inline def apply(get: Responses200Content260): GetResponses200Content260 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content260]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content260] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content260): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
