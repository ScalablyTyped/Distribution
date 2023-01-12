package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters57Responses200Content86 extends StObject {
  
  var get: Parameters57Responses200Content86
  
  var patch: RequestBodyContentApplicationjson370
}
object GetParameters57Responses200Content86 {
  
  inline def apply(get: Parameters57Responses200Content86, patch: RequestBodyContentApplicationjson370): GetParameters57Responses200Content86 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters57Responses200Content86]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters57Responses200Content86] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters57Responses200Content86): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson370): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
