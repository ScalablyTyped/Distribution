package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var absolutePosition: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var playlistId: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var track: js.UndefOr[PlaylistTrack] = js.undefined
  var trackId: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistItem {
  @scala.inline
  def apply(
    absolutePosition: java.lang.String = null,
    clientId: java.lang.String = null,
    creationTimestamp: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTimestamp: java.lang.String = null,
    playlistId: java.lang.String = null,
    source: java.lang.String = null,
    track: PlaylistTrack = null,
    trackId: java.lang.String = null
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (absolutePosition != null) __obj.updateDynamic("absolutePosition")(absolutePosition)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (source != null) __obj.updateDynamic("source")(source)
    if (track != null) __obj.updateDynamic("track")(track)
    if (trackId != null) __obj.updateDynamic("trackId")(trackId)
    __obj.asInstanceOf[PlaylistItem]
  }
}

