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
  
  @scala.inline
  def apply(): AudioAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioAtom]
  }
  
  @scala.inline
  implicit class AudioAtomMutableBuilder[Self <: AudioAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[AudioChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: AudioChannel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
