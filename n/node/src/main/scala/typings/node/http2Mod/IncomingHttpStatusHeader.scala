package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingHttpStatusHeader extends js.Object {
  @JSName(":status")
  var Colonstatus: js.UndefOr[Double] = js.undefined
}

object IncomingHttpStatusHeader {
  @scala.inline
  def apply(Colonstatus: Int | Double = null): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    if (Colonstatus != null) __obj.updateDynamic(":status")(Colonstatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
}

