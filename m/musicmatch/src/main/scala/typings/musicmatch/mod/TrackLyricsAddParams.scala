package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackLyricsAddParams extends js.Object {
  var lyrics_body: js.UndefOr[String] = js.undefined
  var lyrics_id: js.UndefOr[Double] = js.undefined
}

object TrackLyricsAddParams {
  @scala.inline
  def apply(lyrics_body: String = null, lyrics_id: js.UndefOr[Double] = js.undefined): TrackLyricsAddParams = {
    val __obj = js.Dynamic.literal()
    if (lyrics_body != null) __obj.updateDynamic("lyrics_body")(lyrics_body.asInstanceOf[js.Any])
    if (!js.isUndefined(lyrics_id)) __obj.updateDynamic("lyrics_id")(lyrics_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLyricsAddParams]
  }
}

