package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistRelatedParams
  extends ArtistParams
     with Pageable

object ArtistRelatedParams {
  @scala.inline
  def apply(
    artist_id: js.UndefOr[Double] = js.undefined,
    artist_mbid: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    page_size: js.UndefOr[Double] = js.undefined
  ): ArtistRelatedParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artist_id)) __obj.updateDynamic("artist_id")(artist_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(artist_mbid)) __obj.updateDynamic("artist_mbid")(artist_mbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelatedParams]
  }
}

