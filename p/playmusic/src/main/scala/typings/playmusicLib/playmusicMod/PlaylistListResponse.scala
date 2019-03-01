package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistListResponse extends js.Object {
  var data: js.UndefOr[PlaylistListData] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistListResponse {
  @scala.inline
  def apply(data: PlaylistListData = null, kind: java.lang.String = null): PlaylistListResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PlaylistListResponse]
  }
}

