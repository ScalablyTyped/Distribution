package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var src: String
  var tracks: js.UndefOr[js.Array[_]] = js.undefined
}

object PlaylistItem {
  @scala.inline
  def apply(src: String, tracks: js.Array[_] = null): PlaylistItem = {
    val __obj = js.Dynamic.literal(src = src)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    __obj.asInstanceOf[PlaylistItem]
  }
}

