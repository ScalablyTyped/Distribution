package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistParams extends js.Object {
  var artist_id: js.UndefOr[Double] = js.undefined
  var artist_mbid: js.UndefOr[Double] = js.undefined
}

object ArtistParams {
  @scala.inline
  def apply(artist_id: js.UndefOr[Double] = js.undefined, artist_mbid: js.UndefOr[Double] = js.undefined): ArtistParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artist_id)) __obj.updateDynamic("artist_id")(artist_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(artist_mbid)) __obj.updateDynamic("artist_mbid")(artist_mbid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistParams]
  }
}

