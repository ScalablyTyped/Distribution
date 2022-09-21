package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content395 extends StObject {
  
  /** Lists the _verified_ public SSH keys for a user. This is accessible by anyone. */
  var get: Responses200Content395
}
object GetResponses200Content395 {
  
  inline def apply(get: Responses200Content395): GetResponses200Content395 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content395]
  }
  
  extension [Self <: GetResponses200Content395](x: Self) {
    
    inline def setGet(value: Responses200Content395): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
