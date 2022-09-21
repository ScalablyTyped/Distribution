package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content217 extends StObject {
  
  /**
    * This endpoint will return all community profile metrics, including an
    * overall health score, repository description, the presence of documentation, detected
    * code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE,
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
  var get: Responses200Content217
}
object GetResponses200Content217 {
  
  inline def apply(get: Responses200Content217): GetResponses200Content217 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content217]
  }
  
  extension [Self <: GetResponses200Content217](x: Self) {
    
    inline def setGet(value: Responses200Content217): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
