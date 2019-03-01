package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingHttpStatusHeader extends js.Object {
  var `:status`: js.UndefOr[scala.Double] = js.undefined
}

object IncomingHttpStatusHeader {
  @scala.inline
  def apply(`:status`: scala.Int | scala.Double = null): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    if (`:status` != null) __obj.updateDynamic(":status")(`:status`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
}

