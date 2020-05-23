package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistAlbumsParams
  extends ArtistParams
     with Pageable {
  var g_album_name: js.UndefOr[TBoolean] = js.undefined
  var s_release_date: js.UndefOr[TSort] = js.undefined
}

object ArtistAlbumsParams {
  @scala.inline
  def apply(
    artist_id: js.UndefOr[Double] = js.undefined,
    artist_mbid: js.UndefOr[Double] = js.undefined,
    g_album_name: TBoolean = null,
    page: js.UndefOr[Double] = js.undefined,
    page_size: js.UndefOr[Double] = js.undefined,
    s_release_date: TSort = null
  ): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artist_id)) __obj.updateDynamic("artist_id")(artist_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(artist_mbid)) __obj.updateDynamic("artist_mbid")(artist_mbid.get.asInstanceOf[js.Any])
    if (g_album_name != null) __obj.updateDynamic("g_album_name")(g_album_name.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    if (s_release_date != null) __obj.updateDynamic("s_release_date")(s_release_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
}

