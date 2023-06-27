package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjson456 extends StObject {
  
  /**
    * Set primary email visibility for the authenticated user
    * @description Sets the visibility for your primary email addresses.
    */
  var patch: RequestBodyContentApplicationjson456
}
object PatchRequestBodyContentApplicationjson456 {
  
  inline def apply(patch: RequestBodyContentApplicationjson456): PatchRequestBodyContentApplicationjson456 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjson456]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchRequestBodyContentApplicationjson456] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: RequestBodyContentApplicationjson456): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
