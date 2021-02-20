package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeekRequest extends StObject {
  
  /** The snapshot to seek to. The snapshot's topic must be the same as that of the provided subscription. Format is `projects/{project}/snapshots/{snap}`. */
  var snapshot: js.UndefOr[String] = js.native
  
  /**
    * The time to seek to. Messages retained in the subscription that were published before this time are marked as acknowledged, and messages retained in the subscription that were
    * published after this time are marked as unacknowledged. Note that this operation affects only those messages retained in the subscription (configured by the combination of
    * `message_retention_duration` and `retain_acked_messages`). For example, if `time` corresponds to a point before the message retention window (or to a point before the system's
    * notion of the subscription creation time), only retained messages will be marked as unacknowledged, and already-expunged messages will not be restored.
    */
  var time: js.UndefOr[String] = js.native
}
object SeekRequest {
  
  @scala.inline
  def apply(): SeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeekRequest]
  }
  
  @scala.inline
  implicit class SeekRequestMutableBuilder[Self <: SeekRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
