package typings.playmusic.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object PlaylistOptions {
  @scala.inline
  def apply(limit: Int | Double = null, nextPageToken: String = null): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistOptions]
  }
}

