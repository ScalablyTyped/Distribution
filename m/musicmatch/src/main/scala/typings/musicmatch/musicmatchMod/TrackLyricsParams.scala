package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackLyricsParams extends js.Object {
  var track_id: js.UndefOr[Double] = js.undefined
  var track_mbid: js.UndefOr[Double] = js.undefined
}

object TrackLyricsParams {
  @scala.inline
  def apply(track_id: Int | Double = null, track_mbid: Int | Double = null): TrackLyricsParams = {
    val __obj = js.Dynamic.literal()
    if (track_id != null) __obj.updateDynamic("track_id")(track_id.asInstanceOf[js.Any])
    if (track_mbid != null) __obj.updateDynamic("track_mbid")(track_mbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLyricsParams]
  }
}

