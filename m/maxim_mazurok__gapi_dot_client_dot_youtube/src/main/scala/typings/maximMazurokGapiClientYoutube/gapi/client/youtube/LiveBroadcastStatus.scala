package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastStatus extends js.Object {
  
  /** The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method. */
  var lifeCycleStatus: js.UndefOr[String] = js.native
  
  /** Priority of the live broadcast event (internal state). */
  var liveBroadcastPriority: js.UndefOr[String] = js.native
  
  /** Whether the broadcast is made for kids or not, decided by YouTube instead of the creator. This field is read only. */
  var madeForKids: js.UndefOr[Boolean] = js.native
  
  /**
    * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you
    * can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
    */
  var privacyStatus: js.UndefOr[String] = js.native
  
  /** The broadcast's recording status. */
  var recordingStatus: js.UndefOr[String] = js.native
  
  /** This field will be set to True if the creator declares the broadcast to be kids only: go/live-cw-work. */
  var selfDeclaredMadeForKids: js.UndefOr[Boolean] = js.native
}
object LiveBroadcastStatus {
  
  @scala.inline
  def apply(): LiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatus]
  }
  
  @scala.inline
  implicit class LiveBroadcastStatusOps[Self <: LiveBroadcastStatus] (val x: Self) extends AnyVal {
    
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
    def setLifeCycleStatus(value: String): Self = this.set("lifeCycleStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifeCycleStatus: Self = this.set("lifeCycleStatus", js.undefined)
    
    @scala.inline
    def setLiveBroadcastPriority(value: String): Self = this.set("liveBroadcastPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveBroadcastPriority: Self = this.set("liveBroadcastPriority", js.undefined)
    
    @scala.inline
    def setMadeForKids(value: Boolean): Self = this.set("madeForKids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMadeForKids: Self = this.set("madeForKids", js.undefined)
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyStatus: Self = this.set("privacyStatus", js.undefined)
    
    @scala.inline
    def setRecordingStatus(value: String): Self = this.set("recordingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingStatus: Self = this.set("recordingStatus", js.undefined)
    
    @scala.inline
    def setSelfDeclaredMadeForKids(value: Boolean): Self = this.set("selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfDeclaredMadeForKids: Self = this.set("selfDeclaredMadeForKids", js.undefined)
  }
}
