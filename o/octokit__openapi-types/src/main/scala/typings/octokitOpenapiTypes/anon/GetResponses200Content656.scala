package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content656 extends StObject {
  
  /** Lists the _verified_ public SSH keys for a user. This is accessible by anyone. */
  var get: Responses200Content656
}
object GetResponses200Content656 {
  
  inline def apply(get: Responses200Content656): GetResponses200Content656 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content656]
  }
  
  extension [Self <: GetResponses200Content656](x: Self) {
    
    inline def setGet(value: Responses200Content656): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
