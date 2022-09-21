package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjsonVisibility extends StObject {
  
  /** Sets the visibility for your primary email addresses. */
  var patch: RequestBodyContentApplicationjsonVisibility
}
object PatchRequestBodyContentApplicationjsonVisibility {
  
  inline def apply(patch: RequestBodyContentApplicationjsonVisibility): PatchRequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjsonVisibility]
  }
  
  extension [Self <: PatchRequestBodyContentApplicationjsonVisibility](x: Self) {
    
    inline def setPatch(value: RequestBodyContentApplicationjsonVisibility): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
