package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content271304 extends StObject {
  
  /** List the authenticated user's starred gists: */
  var get: Responses200Content271304
}
object GetResponses200Content271304 {
  
  inline def apply(get: Responses200Content271304): GetResponses200Content271304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content271304]
  }
  
  extension [Self <: GetResponses200Content271304](x: Self) {
    
    inline def setGet(value: Responses200Content271304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
