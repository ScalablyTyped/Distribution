package typings.musicmatch.musicmatchMod

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
  def apply(album_id: Int | Double = null, album_mbid: Int | Double = null, format: TFormat = null): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    if (album_id != null) __obj.updateDynamic("album_id")(album_id.asInstanceOf[js.Any])
    if (album_mbid != null) __obj.updateDynamic("album_mbid")(album_mbid.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumTracksParams]
  }
}

