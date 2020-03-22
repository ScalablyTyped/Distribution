package typings.nookies

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<next.next.NextPageContext, 'req'> */
trait PickNextPageContextreq extends js.Object {
  var req: js.UndefOr[IncomingMessage] = js.undefined
}

object PickNextPageContextreq {
  @scala.inline
  def apply(req: IncomingMessage = null): PickNextPageContextreq = {
    val __obj = js.Dynamic.literal()
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNextPageContextreq]
  }
}

