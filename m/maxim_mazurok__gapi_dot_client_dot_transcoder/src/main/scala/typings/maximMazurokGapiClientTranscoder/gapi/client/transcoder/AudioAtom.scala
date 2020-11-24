package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioAtom extends js.Object {
  
  /** List of `Channel`s for this audio stream. for in-depth explanation. */
  var channels: js.UndefOr[js.Array[AudioChannel]] = js.native
  
  /** Required. The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`. */
  var key: js.UndefOr[String] = js.native
}
object AudioAtom {
  
  @scala.inline
  def apply(): AudioAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioAtom]
  }
  
  @scala.inline
  implicit class AudioAtomOps[Self <: AudioAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelsVarargs(value: AudioChannel*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[AudioChannel]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
