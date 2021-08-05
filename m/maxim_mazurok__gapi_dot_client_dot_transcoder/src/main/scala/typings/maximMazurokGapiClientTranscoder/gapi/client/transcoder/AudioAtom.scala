package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAtom extends StObject {
  
  /** List of `Channel`s for this audio stream. for in-depth explanation. */
  var channels: js.UndefOr[js.Array[AudioChannel]] = js.undefined
  
  /** Required. The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`. */
  var key: js.UndefOr[String] = js.undefined
}
object AudioAtom {
  
  inline def apply(): AudioAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioAtom]
  }
  
  extension [Self <: AudioAtom](x: Self) {
    
    inline def setChannels(value: js.Array[AudioChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: AudioChannel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
