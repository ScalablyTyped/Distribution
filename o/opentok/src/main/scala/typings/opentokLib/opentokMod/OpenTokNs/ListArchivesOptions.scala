package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArchivesOptions extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
}

object ListArchivesOptions {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    sessionId: java.lang.String = null
  ): ListArchivesOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[ListArchivesOptions]
  }
}

