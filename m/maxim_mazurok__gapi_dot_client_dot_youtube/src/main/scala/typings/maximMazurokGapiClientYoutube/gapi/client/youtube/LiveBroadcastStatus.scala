package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveBroadcastStatus extends StObject {
  
  /** The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method. */
  var lifeCycleStatus: js.UndefOr[String] = js.undefined
  
  /** Priority of the live broadcast event (internal state). */
  var liveBroadcastPriority: js.UndefOr[String] = js.undefined
  
  /** Whether the broadcast is made for kids or not, decided by YouTube instead of the creator. This field is read only. */
  var madeForKids: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you
    * can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
    */
  var privacyStatus: js.UndefOr[String] = js.undefined
  
  /** The broadcast's recording status. */
  var recordingStatus: js.UndefOr[String] = js.undefined
  
  /** This field will be set to True if the creator declares the broadcast to be kids only: go/live-cw-work. */
  var selfDeclaredMadeForKids: js.UndefOr[Boolean] = js.undefined
}
object LiveBroadcastStatus {
  
  inline def apply(): LiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatus]
  }
  
  extension [Self <: LiveBroadcastStatus](x: Self) {
    
    inline def setLifeCycleStatus(value: String): Self = StObject.set(x, "lifeCycleStatus", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusUndefined: Self = StObject.set(x, "lifeCycleStatus", js.undefined)
    
    inline def setLiveBroadcastPriority(value: String): Self = StObject.set(x, "liveBroadcastPriority", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastPriorityUndefined: Self = StObject.set(x, "liveBroadcastPriority", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
  }
}
