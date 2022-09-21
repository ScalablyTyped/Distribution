package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content158 extends StObject {
  
  /** Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: Responses200Content158
}
object GetResponses200Content158 {
  
  inline def apply(get: Responses200Content158): GetResponses200Content158 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content158]
  }
  
  extension [Self <: GetResponses200Content158](x: Self) {
    
    inline def setGet(value: Responses200Content158): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
