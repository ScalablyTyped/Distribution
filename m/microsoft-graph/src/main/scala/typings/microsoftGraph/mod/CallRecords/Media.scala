package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Media extends js.Object {
  
  // Device information associated with the callee endpoint of this media.
  var calleeDevice: js.UndefOr[NullableOption[DeviceInfo]] = js.native
  
  // Network information associated with the callee endpoint of this media.
  var calleeNetwork: js.UndefOr[NullableOption[NetworkInfo]] = js.native
  
  // Device information associated with the caller endpoint of this media.
  var callerDevice: js.UndefOr[NullableOption[DeviceInfo]] = js.native
  
  // Network information associated with the caller endpoint of this media.
  var callerNetwork: js.UndefOr[NullableOption[NetworkInfo]] = js.native
  
  // How the media was identified during media negotiation stage.
  var label: js.UndefOr[NullableOption[String]] = js.native
  
  // Network streams associated with this media.
  var streams: js.UndefOr[NullableOption[js.Array[MediaStream]]] = js.native
}
object Media {
  
  @scala.inline
  def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
    
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
    def setCalleeDevice(value: NullableOption[DeviceInfo]): Self = this.set("calleeDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalleeDevice: Self = this.set("calleeDevice", js.undefined)
    
    @scala.inline
    def setCalleeDeviceNull: Self = this.set("calleeDevice", null)
    
    @scala.inline
    def setCalleeNetwork(value: NullableOption[NetworkInfo]): Self = this.set("calleeNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalleeNetwork: Self = this.set("calleeNetwork", js.undefined)
    
    @scala.inline
    def setCalleeNetworkNull: Self = this.set("calleeNetwork", null)
    
    @scala.inline
    def setCallerDevice(value: NullableOption[DeviceInfo]): Self = this.set("callerDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerDevice: Self = this.set("callerDevice", js.undefined)
    
    @scala.inline
    def setCallerDeviceNull: Self = this.set("callerDevice", null)
    
    @scala.inline
    def setCallerNetwork(value: NullableOption[NetworkInfo]): Self = this.set("callerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerNetwork: Self = this.set("callerNetwork", js.undefined)
    
    @scala.inline
    def setCallerNetworkNull: Self = this.set("callerNetwork", null)
    
    @scala.inline
    def setLabel(value: NullableOption[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setStreamsVarargs(value: MediaStream*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: NullableOption[js.Array[MediaStream]]): Self = this.set("streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
    
    @scala.inline
    def setStreamsNull: Self = this.set("streams", null)
  }
}
