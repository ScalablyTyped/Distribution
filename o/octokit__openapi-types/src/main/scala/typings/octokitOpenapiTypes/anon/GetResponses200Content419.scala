package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content419 extends StObject {
  
  /** Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: Responses200Content419
}
object GetResponses200Content419 {
  
  inline def apply(get: Responses200Content419): GetResponses200Content419 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content419]
  }
  
  extension [Self <: GetResponses200Content419](x: Self) {
    
    inline def setGet(value: Responses200Content419): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
