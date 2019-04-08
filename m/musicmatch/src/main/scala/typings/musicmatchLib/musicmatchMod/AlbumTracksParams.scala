package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumTracksParams extends js.Object {
  var album_id: js.UndefOr[scala.Double] = js.undefined
  var album_mbid: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[TFormat] = js.undefined
}

object AlbumTracksParams {
  @scala.inline
  def apply(
    album_id: scala.Int | scala.Double = null,
    album_mbid: scala.Int | scala.Double = null,
    format: TFormat = null
  ): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    if (album_id != null) __obj.updateDynamic("album_id")(album_id.asInstanceOf[js.Any])
    if (album_mbid != null) __obj.updateDynamic("album_mbid")(album_mbid.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[AlbumTracksParams]
  }
}

