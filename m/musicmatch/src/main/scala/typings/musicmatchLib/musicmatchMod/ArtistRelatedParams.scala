package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistRelatedParams
  extends ArtistParams
     with Pageable

object ArtistRelatedParams {
  @scala.inline
  def apply(
    artist_id: scala.Int | scala.Double = null,
    artist_mbid: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    page_size: scala.Int | scala.Double = null
  ): ArtistRelatedParams = {
    val __obj = js.Dynamic.literal()
    if (artist_id != null) __obj.updateDynamic("artist_id")(artist_id.asInstanceOf[js.Any])
    if (artist_mbid != null) __obj.updateDynamic("artist_mbid")(artist_mbid.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelatedParams]
  }
}

