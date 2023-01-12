package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/color-information-context/
trait ColorInformationContext extends StObject {
  
  val candidates: js.Array[ColorCandidate]
}
object ColorInformationContext {
  
  inline def apply(candidates: js.Array[ColorCandidate]): ColorInformationContext = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorInformationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorInformationContext] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: js.Array[ColorCandidate]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: ColorCandidate*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
