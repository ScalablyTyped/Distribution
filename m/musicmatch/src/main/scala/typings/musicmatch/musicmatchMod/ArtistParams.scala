package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistParams extends js.Object {
  var artist_id: js.UndefOr[Double] = js.undefined
  var artist_mbid: js.UndefOr[Double] = js.undefined
}

object ArtistParams {
  @scala.inline
  def apply(artist_id: Int | Double = null, artist_mbid: Int | Double = null): ArtistParams = {
    val __obj = js.Dynamic.literal()
    if (artist_id != null) __obj.updateDynamic("artist_id")(artist_id.asInstanceOf[js.Any])
    if (artist_mbid != null) __obj.updateDynamic("artist_mbid")(artist_mbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistParams]
  }
}

