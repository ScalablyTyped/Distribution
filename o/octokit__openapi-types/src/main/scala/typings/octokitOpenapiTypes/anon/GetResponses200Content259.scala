package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content259 extends StObject {
  
  /**
    * List commit statuses for a reference
    * @description Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  var get: Responses200Content259
}
object GetResponses200Content259 {
  
  inline def apply(get: Responses200Content259): GetResponses200Content259 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content259]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content259] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content259): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
