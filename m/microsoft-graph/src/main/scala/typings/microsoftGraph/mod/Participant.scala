package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends Entity {
  // The participant of the participant.
  var info: js.UndefOr[ParticipantInfo] = js.native
  // true if the participant is in lobby.
  var isInLobby: js.UndefOr[Boolean] = js.native
  // true if the participant is muted (client or server muted).
  var isMuted: js.UndefOr[Boolean] = js.native
  // The list of media streams.
  var mediaStreams: js.UndefOr[js.Array[MediaStream]] = js.native
  // Information about whether the participant has recording capability.
  var recordingInfo: js.UndefOr[RecordingInfo] = js.native
}

object Participant {
  @scala.inline
  def apply(): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participant]
  }
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
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
    def setInfo(value: ParticipantInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setIsInLobby(value: Boolean): Self = this.set("isInLobby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInLobby: Self = this.set("isInLobby", js.undefined)
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMuted: Self = this.set("isMuted", js.undefined)
    @scala.inline
    def setMediaStreamsVarargs(value: MediaStream*): Self = this.set("mediaStreams", js.Array(value :_*))
    @scala.inline
    def setMediaStreams(value: js.Array[MediaStream]): Self = this.set("mediaStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaStreams: Self = this.set("mediaStreams", js.undefined)
    @scala.inline
    def setRecordingInfo(value: RecordingInfo): Self = this.set("recordingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingInfo: Self = this.set("recordingInfo", js.undefined)
  }
  
}

