package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchResponses200Content624 extends StObject {
  
  /** Sets the visibility for your primary email addresses. */
  var patch: Responses200Content624
}
object PatchResponses200Content624 {
  
  inline def apply(patch: Responses200Content624): PatchResponses200Content624 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchResponses200Content624]
  }
  
  extension [Self <: PatchResponses200Content624](x: Self) {
    
    inline def setPatch(value: Responses200Content624): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
