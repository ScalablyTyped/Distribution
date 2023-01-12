package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditAtom extends StObject {
  
  /** End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom. */
  var endTimeOffset: js.UndefOr[String] = js.undefined
  
  /** List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline. */
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A unique key for this atom. Must be specified when using advanced mapping. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Start time in seconds for the atom, relative to the input file timeline. The default is `0s`. */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object EditAtom {
  
  inline def apply(): EditAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAtom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditAtom] (val x: Self) extends AnyVal {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
