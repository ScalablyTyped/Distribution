package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content69 extends StObject {
  
  /** List the users blocked by an organization. */
  var get: Responses200Content69
}
object GetResponses200Content69 {
  
  inline def apply(get: Responses200Content69): GetResponses200Content69 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content69]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content69] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content69): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
