package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content355 extends StObject {
  
  /** List repository tags */
  var get: Responses200Content355
}
object GetResponses200Content355 {
  
  inline def apply(get: Responses200Content355): GetResponses200Content355 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content355]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content355] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content355): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
