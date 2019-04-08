package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[scala.Double] = js.undefined
  var f_artist_mbid: js.UndefOr[scala.Double] = js.undefined
  var q_artist: js.UndefOr[java.lang.String] = js.undefined
}

object ArtistSearchParams {
  @scala.inline
  def apply(
    f_artist_id: scala.Int | scala.Double = null,
    f_artist_mbid: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    page_size: scala.Int | scala.Double = null,
    q_artist: java.lang.String = null
  ): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    if (f_artist_id != null) __obj.updateDynamic("f_artist_id")(f_artist_id.asInstanceOf[js.Any])
    if (f_artist_mbid != null) __obj.updateDynamic("f_artist_mbid")(f_artist_mbid.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist)
    __obj.asInstanceOf[ArtistSearchParams]
  }
}

