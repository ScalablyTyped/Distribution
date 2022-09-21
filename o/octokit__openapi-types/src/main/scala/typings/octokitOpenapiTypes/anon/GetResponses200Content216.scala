package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content216 extends StObject {
  
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  var get: Responses200Content216
}
object GetResponses200Content216 {
  
  inline def apply(get: Responses200Content216): GetResponses200Content216 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content216]
  }
  
  extension [Self <: GetResponses200Content216](x: Self) {
    
    inline def setGet(value: Responses200Content216): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
