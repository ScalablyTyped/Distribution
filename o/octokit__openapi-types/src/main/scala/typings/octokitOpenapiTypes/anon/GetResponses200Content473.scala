package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content473 extends StObject {
  
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  var get: Responses200Content473
}
object GetResponses200Content473 {
  
  inline def apply(get: Responses200Content473): GetResponses200Content473 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content473]
  }
  
  extension [Self <: GetResponses200Content473](x: Self) {
    
    inline def setGet(value: Responses200Content473): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
