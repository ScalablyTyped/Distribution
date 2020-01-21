package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistListData extends js.Object {
  var items: js.UndefOr[js.Array[PlaylistListItem]] = js.undefined
}

object PlaylistListData {
  @scala.inline
  def apply(items: js.Array[PlaylistListItem] = null): PlaylistListData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistListData]
  }
}

