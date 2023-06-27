package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content324 extends StObject {
  
  /**
    * List issue events for a repository
    * @description Lists events for a repository.
    */
  var get: Responses200Content324
}
object GetResponses200Content324 {
  
  inline def apply(get: Responses200Content324): GetResponses200Content324 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content324]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content324] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content324): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
