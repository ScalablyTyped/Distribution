package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content20 extends StObject {
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200Content20
}
object GetResponses200Content20 {
  
  inline def apply(get: Responses200Content20): GetResponses200Content20 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content20]
  }
  
  extension [Self <: GetResponses200Content20](x: Self) {
    
    inline def setGet(value: Responses200Content20): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
