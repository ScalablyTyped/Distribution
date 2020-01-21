package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[Double] = js.undefined
  var f_artist_mbid: js.UndefOr[Double] = js.undefined
  var q_artist: js.UndefOr[String] = js.undefined
}

object ArtistSearchParams {
  @scala.inline
  def apply(
    f_artist_id: Int | Double = null,
    f_artist_mbid: Int | Double = null,
    page: Int | Double = null,
    page_size: Int | Double = null,
    q_artist: String = null
  ): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    if (f_artist_id != null) __obj.updateDynamic("f_artist_id")(f_artist_id.asInstanceOf[js.Any])
    if (f_artist_mbid != null) __obj.updateDynamic("f_artist_mbid")(f_artist_mbid.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistSearchParams]
  }
}

