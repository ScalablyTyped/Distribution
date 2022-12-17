package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjson359 extends StObject {
  
  /** Sets the visibility for your primary email addresses. */
  var patch: RequestBodyContentApplicationjson359
}
object PatchRequestBodyContentApplicationjson359 {
  
  inline def apply(patch: RequestBodyContentApplicationjson359): PatchRequestBodyContentApplicationjson359 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjson359]
  }
  
  extension [Self <: PatchRequestBodyContentApplicationjson359](x: Self) {
    
    inline def setPatch(value: RequestBodyContentApplicationjson359): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
