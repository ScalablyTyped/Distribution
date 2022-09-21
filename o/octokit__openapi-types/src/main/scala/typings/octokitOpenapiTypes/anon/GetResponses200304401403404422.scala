package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200304401403404422 extends StObject {
  
  /** Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level. */
  var get: Responses200304401403404422
}
object GetResponses200304401403404422 {
  
  inline def apply(get: Responses200304401403404422): GetResponses200304401403404422 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200304401403404422]
  }
  
  extension [Self <: GetResponses200304401403404422](x: Self) {
    
    inline def setGet(value: Responses200304401403404422): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
