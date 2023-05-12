package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjson381 extends StObject {
  
  /**
    * Set primary email visibility for the authenticated user
    * @description Sets the visibility for your primary email addresses.
    */
  var patch: RequestBodyContentApplicationjson381
}
object PatchRequestBodyContentApplicationjson381 {
  
  inline def apply(patch: RequestBodyContentApplicationjson381): PatchRequestBodyContentApplicationjson381 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjson381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchRequestBodyContentApplicationjson381] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: RequestBodyContentApplicationjson381): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
