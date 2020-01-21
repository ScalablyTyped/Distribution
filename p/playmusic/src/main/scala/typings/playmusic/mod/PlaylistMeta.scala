package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistMeta extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var shareState: js.UndefOr[String] = js.undefined
}

object PlaylistMeta {
  @scala.inline
  def apply(description: String = null, name: String = null, shareState: String = null): PlaylistMeta = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shareState != null) __obj.updateDynamic("shareState")(shareState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMeta]
  }
}

