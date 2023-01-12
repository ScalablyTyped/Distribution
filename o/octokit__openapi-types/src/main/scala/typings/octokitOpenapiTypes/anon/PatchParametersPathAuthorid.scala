package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchParametersPathAuthorid extends StObject {
  
  /** Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository. */
  var patch: ParametersPathAuthorid
}
object PatchParametersPathAuthorid {
  
  inline def apply(patch: ParametersPathAuthorid): PatchParametersPathAuthorid = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParametersPathAuthorid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchParametersPathAuthorid] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: ParametersPathAuthorid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
