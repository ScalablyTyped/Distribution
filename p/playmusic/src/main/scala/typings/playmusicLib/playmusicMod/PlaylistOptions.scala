package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, nextPageToken: java.lang.String = null): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PlaylistOptions]
  }
}

