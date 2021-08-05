package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAtom extends StObject {
  
  /** List of `Job.inputs` that should be embedded in this atom. Only one input is supported. */
  var inputs: js.UndefOr[js.Array[TextInput]] = js.undefined
  
  /** Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`. */
  var key: js.UndefOr[String] = js.undefined
}
object TextAtom {
  
  inline def apply(): TextAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAtom]
  }
  
  extension [Self <: TextAtom](x: Self) {
    
    inline def setInputs(value: js.Array[TextInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: TextInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
