package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content26 extends StObject {
  
  /** List gist commits */
  var get: Responses200Content26
}
object GetResponses200Content26 {
  
  inline def apply(get: Responses200Content26): GetResponses200Content26 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content26]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content26] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content26): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
