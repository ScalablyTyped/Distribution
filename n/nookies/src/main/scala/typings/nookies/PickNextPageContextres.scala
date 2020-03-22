package typings.nookies

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<next.next.NextPageContext, 'res'> */
trait PickNextPageContextres extends js.Object {
  var res: js.UndefOr[ServerResponse] = js.undefined
}

object PickNextPageContextres {
  @scala.inline
  def apply(res: ServerResponse = null): PickNextPageContextres = {
    val __obj = js.Dynamic.literal()
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNextPageContextres]
  }
}

