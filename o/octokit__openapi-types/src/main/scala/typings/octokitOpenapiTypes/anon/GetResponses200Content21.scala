package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content21 extends StObject {
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200Content21
}
object GetResponses200Content21 {
  
  inline def apply(get: Responses200Content21): GetResponses200Content21 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content21]
  }
  
  extension [Self <: GetResponses200Content21](x: Self) {
    
    inline def setGet(value: Responses200Content21): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
