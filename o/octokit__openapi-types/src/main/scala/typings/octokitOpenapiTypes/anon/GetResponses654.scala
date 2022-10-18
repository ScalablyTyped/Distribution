package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses654 extends StObject {
  
  /** Lists the GPG keys for a user. This information is accessible by anyone. */
  var get: Responses654
}
object GetResponses654 {
  
  inline def apply(get: Responses654): GetResponses654 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses654]
  }
  
  extension [Self <: GetResponses654](x: Self) {
    
    inline def setGet(value: Responses654): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
