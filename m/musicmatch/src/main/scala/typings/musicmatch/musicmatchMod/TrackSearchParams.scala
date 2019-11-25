package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[Double] = js.undefined
  var f_artist_mbid: js.UndefOr[Double] = js.undefined
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
  var f_lyrics_language: js.UndefOr[String] = js.undefined
  var f_music_genre_id: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var q_lyrics: js.UndefOr[String] = js.undefined
  var quorum_factor: js.UndefOr[Double] = js.undefined
  var s_artist_rating: js.UndefOr[TSort] = js.undefined
  var s_track_rating: js.UndefOr[TSort] = js.undefined
}

object TrackSearchParams {
  @scala.inline
  def apply(
    f_artist_id: Int | Double = null,
    f_artist_mbid: Int | Double = null,
    f_has_lyrics: TBoolean = null,
    f_lyrics_language: String = null,
    f_music_genre_id: Int | Double = null,
    page: Int | Double = null,
    page_size: Int | Double = null,
    q: String = null,
    q_lyrics: String = null,
    quorum_factor: Int | Double = null,
    s_artist_rating: TSort = null,
    s_track_rating: TSort = null
  ): TrackSearchParams = {
    val __obj = js.Dynamic.literal()
    if (f_artist_id != null) __obj.updateDynamic("f_artist_id")(f_artist_id.asInstanceOf[js.Any])
    if (f_artist_mbid != null) __obj.updateDynamic("f_artist_mbid")(f_artist_mbid.asInstanceOf[js.Any])
    if (f_has_lyrics != null) __obj.updateDynamic("f_has_lyrics")(f_has_lyrics.asInstanceOf[js.Any])
    if (f_lyrics_language != null) __obj.updateDynamic("f_lyrics_language")(f_lyrics_language.asInstanceOf[js.Any])
    if (f_music_genre_id != null) __obj.updateDynamic("f_music_genre_id")(f_music_genre_id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (q_lyrics != null) __obj.updateDynamic("q_lyrics")(q_lyrics.asInstanceOf[js.Any])
    if (quorum_factor != null) __obj.updateDynamic("quorum_factor")(quorum_factor.asInstanceOf[js.Any])
    if (s_artist_rating != null) __obj.updateDynamic("s_artist_rating")(s_artist_rating.asInstanceOf[js.Any])
    if (s_track_rating != null) __obj.updateDynamic("s_track_rating")(s_track_rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSearchParams]
  }
}

