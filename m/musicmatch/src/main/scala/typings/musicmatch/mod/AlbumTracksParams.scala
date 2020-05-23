package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumTracksParams extends js.Object {
  var album_id: js.UndefOr[Double] = js.undefined
  var album_mbid: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[TFormat] = js.undefined
}

object AlbumTracksParams {
  @scala.inline
  def apply(
    album_id: js.UndefOr[Double] = js.undefined,
    album_mbid: js.UndefOr[Double] = js.undefined,
    format: TFormat = null
  ): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(album_id)) __obj.updateDynamic("album_id")(album_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(album_mbid)) __obj.updateDynamic("album_mbid")(album_mbid.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumTracksParams]
  }
}

