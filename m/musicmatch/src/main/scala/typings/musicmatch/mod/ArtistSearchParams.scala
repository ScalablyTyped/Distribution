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
    f_artist_id: js.UndefOr[Double] = js.undefined,
    f_artist_mbid: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    page_size: js.UndefOr[Double] = js.undefined,
    q_artist: String = null
  ): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(f_artist_id)) __obj.updateDynamic("f_artist_id")(f_artist_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f_artist_mbid)) __obj.updateDynamic("f_artist_mbid")(f_artist_mbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistSearchParams]
  }
}

