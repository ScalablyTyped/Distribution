package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMapping extends StObject {
  
  /** Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`. */
  var atomKey: js.UndefOr[String] = js.undefined
  
  /** Required. The `Input.key` that identifies the input file. */
  var inputKey: js.UndefOr[String] = js.undefined
  
  /** Required. The zero-based index of the track in the input file. */
  var inputTrack: js.UndefOr[Double] = js.undefined
}
object TextMapping {
  
  inline def apply(): TextMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextMapping] (val x: Self) extends AnyVal {
    
    inline def setAtomKey(value: String): Self = StObject.set(x, "atomKey", value.asInstanceOf[js.Any])
    
    inline def setAtomKeyUndefined: Self = StObject.set(x, "atomKey", js.undefined)
    
    inline def setInputKey(value: String): Self = StObject.set(x, "inputKey", value.asInstanceOf[js.Any])
    
    inline def setInputKeyUndefined: Self = StObject.set(x, "inputKey", js.undefined)
    
    inline def setInputTrack(value: Double): Self = StObject.set(x, "inputTrack", value.asInstanceOf[js.Any])
    
    inline def setInputTrackUndefined: Self = StObject.set(x, "inputTrack", js.undefined)
  }
}
