package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioChannelInput extends js.Object {
  
  /** Required. The zero-based index of the channel in the input file. */
  var channel: js.UndefOr[Double] = js.native
  
  /** Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0. */
  var gainDb: js.UndefOr[Double] = js.native
  
  /** Required. The `Input.key` that identifies the input file. */
  var key: js.UndefOr[String] = js.native
  
  /** Required. The zero-based index of the track in the input file. */
  var track: js.UndefOr[Double] = js.native
}
object AudioChannelInput {
  
  @scala.inline
  def apply(): AudioChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioChannelInput]
  }
  
  @scala.inline
  implicit class AudioChannelInputOps[Self <: AudioChannelInput] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setGainDb(value: Double): Self = this.set("gainDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGainDb: Self = this.set("gainDb", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setTrack(value: Double): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
}
