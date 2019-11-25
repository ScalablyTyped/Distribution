package typings.musicmatch.musicmatchMod

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
    artist_id: Int | Double = null,
    artist_mbid: Int | Double = null,
    g_album_name: TBoolean = null,
    page: Int | Double = null,
    page_size: Int | Double = null,
    s_release_date: TSort = null
  ): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    if (artist_id != null) __obj.updateDynamic("artist_id")(artist_id.asInstanceOf[js.Any])
    if (artist_mbid != null) __obj.updateDynamic("artist_mbid")(artist_mbid.asInstanceOf[js.Any])
    if (g_album_name != null) __obj.updateDynamic("g_album_name")(g_album_name.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (s_release_date != null) __obj.updateDynamic("s_release_date")(s_release_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
}

