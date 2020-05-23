package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackParams extends js.Object {
  var track_id: js.UndefOr[Double] = js.undefined
  var track_mbid: js.UndefOr[Double] = js.undefined
}

object TrackParams {
  @scala.inline
  def apply(track_id: js.UndefOr[Double] = js.undefined, track_mbid: js.UndefOr[Double] = js.undefined): TrackParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(track_id)) __obj.updateDynamic("track_id")(track_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_mbid)) __obj.updateDynamic("track_mbid")(track_mbid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackParams]
  }
}

