package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content273 extends StObject {
  
  /** List issue events for a repository */
  var get: Responses200Content273
}
object GetResponses200Content273 {
  
  inline def apply(get: Responses200Content273): GetResponses200Content273 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content273]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content273] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content273): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
