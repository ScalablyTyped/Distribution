package typings.memcached.memcachedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusData
  extends /* key */ StringDictionary[js.UndefOr[String | Boolean | Double]] {
  var server: js.UndefOr[String] = js.undefined
}

object StatusData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Boolean | Double]] = null,
    server: String = null
  ): StatusData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusData]
  }
}

