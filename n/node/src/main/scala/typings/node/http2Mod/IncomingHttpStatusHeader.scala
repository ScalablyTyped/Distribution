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
  def apply(Colonstatus: js.UndefOr[Double] = js.undefined): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Colonstatus)) __obj.updateDynamic(":status")(Colonstatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
}

