package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[Double] = js.native
  var f_artist_mbid: js.UndefOr[Double] = js.native
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
  var f_lyrics_language: js.UndefOr[String] = js.native
  var f_music_genre_id: js.UndefOr[Double] = js.native
  var q: js.UndefOr[String] = js.native
  var q_lyrics: js.UndefOr[String] = js.native
  var quorum_factor: js.UndefOr[Double] = js.native
  var s_artist_rating: js.UndefOr[TSort] = js.native
  var s_track_rating: js.UndefOr[TSort] = js.native
}

object TrackSearchParams {
  @scala.inline
  def apply(): TrackSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSearchParams]
  }
  @scala.inline
  implicit class TrackSearchParamsOps[Self <: TrackSearchParams] (val x: Self) extends AnyVal {
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
    def setF_artist_id(value: Double): Self = this.set("f_artist_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_artist_id: Self = this.set("f_artist_id", js.undefined)
    @scala.inline
    def setF_artist_mbid(value: Double): Self = this.set("f_artist_mbid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_artist_mbid: Self = this.set("f_artist_mbid", js.undefined)
    @scala.inline
    def setF_has_lyrics(value: TBoolean): Self = this.set("f_has_lyrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_has_lyrics: Self = this.set("f_has_lyrics", js.undefined)
    @scala.inline
    def setF_lyrics_language(value: String): Self = this.set("f_lyrics_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_lyrics_language: Self = this.set("f_lyrics_language", js.undefined)
    @scala.inline
    def setF_music_genre_id(value: Double): Self = this.set("f_music_genre_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_music_genre_id: Self = this.set("f_music_genre_id", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setQ_lyrics(value: String): Self = this.set("q_lyrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ_lyrics: Self = this.set("q_lyrics", js.undefined)
    @scala.inline
    def setQuorum_factor(value: Double): Self = this.set("quorum_factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuorum_factor: Self = this.set("quorum_factor", js.undefined)
    @scala.inline
    def setS_artist_rating(value: TSort): Self = this.set("s_artist_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS_artist_rating: Self = this.set("s_artist_rating", js.undefined)
    @scala.inline
    def setS_track_rating(value: TSort): Self = this.set("s_track_rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS_track_rating: Self = this.set("s_track_rating", js.undefined)
  }
  
}

