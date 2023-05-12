package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters47Responses200Content90 extends StObject {
  
  /** Get an organization membership for the authenticated user */
  var get: Parameters47Responses200Content90
  
  /** Update an organization membership for the authenticated user */
  var patch: RequestBodyContentApplicationjson392
}
object GetParameters47Responses200Content90 {
  
  inline def apply(get: Parameters47Responses200Content90, patch: RequestBodyContentApplicationjson392): GetParameters47Responses200Content90 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters47Responses200Content90]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters47Responses200Content90] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters47Responses200Content90): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson392): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
