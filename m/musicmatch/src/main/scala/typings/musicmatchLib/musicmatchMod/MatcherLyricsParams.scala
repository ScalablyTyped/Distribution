package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherLyricsParams extends js.Object {
  var q_artist: js.UndefOr[java.lang.String] = js.undefined
  var q_track: js.UndefOr[java.lang.String] = js.undefined
}

object MatcherLyricsParams {
  @scala.inline
  def apply(q_artist: java.lang.String = null, q_track: java.lang.String = null): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist)
    if (q_track != null) __obj.updateDynamic("q_track")(q_track)
    __obj.asInstanceOf[MatcherLyricsParams]
  }
}

