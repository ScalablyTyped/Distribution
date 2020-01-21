package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherLyricsParams extends js.Object {
  var q_artist: js.UndefOr[String] = js.undefined
  var q_track: js.UndefOr[String] = js.undefined
}

object MatcherLyricsParams {
  @scala.inline
  def apply(q_artist: String = null, q_track: String = null): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist.asInstanceOf[js.Any])
    if (q_track != null) __obj.updateDynamic("q_track")(q_track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherLyricsParams]
  }
}

