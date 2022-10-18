package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content324304 extends StObject {
  
  /** List the users you've blocked on your personal account. */
  var get: Responses200Content324304
}
object GetResponses200Content324304 {
  
  inline def apply(get: Responses200Content324304): GetResponses200Content324304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content324304]
  }
  
  extension [Self <: GetResponses200Content324304](x: Self) {
    
    inline def setGet(value: Responses200Content324304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
