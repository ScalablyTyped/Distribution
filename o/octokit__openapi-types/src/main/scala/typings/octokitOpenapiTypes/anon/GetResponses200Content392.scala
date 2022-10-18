package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content392 extends StObject {
  
  /** Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level. */
  var get: Responses200Content392
}
object GetResponses200Content392 {
  
  inline def apply(get: Responses200Content392): GetResponses200Content392 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content392]
  }
  
  extension [Self <: GetResponses200Content392](x: Self) {
    
    inline def setGet(value: Responses200Content392): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
