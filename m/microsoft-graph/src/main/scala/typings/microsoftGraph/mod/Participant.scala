package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends Entity {
  var info: js.UndefOr[ParticipantInfo] = js.undefined
  var isInLobby: js.UndefOr[Boolean] = js.undefined
  var isMuted: js.UndefOr[Boolean] = js.undefined
  var mediaStreams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}

object Participant {
  @scala.inline
  def apply(
    id: String = null,
    info: ParticipantInfo = null,
    isInLobby: js.UndefOr[Boolean] = js.undefined,
    isMuted: js.UndefOr[Boolean] = js.undefined,
    mediaStreams: js.Array[MediaStream] = null
  ): Participant = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(isInLobby)) __obj.updateDynamic("isInLobby")(isInLobby.asInstanceOf[js.Any])
    if (!js.isUndefined(isMuted)) __obj.updateDynamic("isMuted")(isMuted.asInstanceOf[js.Any])
    if (mediaStreams != null) __obj.updateDynamic("mediaStreams")(mediaStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
}

