package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchParametersPathAuthoridOwner extends StObject {
  
  /** Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository. */
  var patch: ParametersPathAuthoridOwner
}
object PatchParametersPathAuthoridOwner {
  
  inline def apply(patch: ParametersPathAuthoridOwner): PatchParametersPathAuthoridOwner = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParametersPathAuthoridOwner]
  }
  
  extension [Self <: PatchParametersPathAuthoridOwner](x: Self) {
    
    inline def setPatch(value: ParametersPathAuthoridOwner): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
