package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Boolean | scala.Double]] {
  var server: js.UndefOr[java.lang.String] = js.undefined
}

object StatusData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Boolean | scala.Double]] = null,
    server: java.lang.String = null
  ): StatusData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[StatusData]
  }
}

