package typings.next.apiUtilsMod

import typings.next.serverRouterMod.Params
import typings.next.utilsMod.NextApiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyProps extends js.Object {
  var params: js.UndefOr[Params | Boolean] = js.undefined
  var req: NextApiRequest
}

object LazyProps {
  @scala.inline
  def apply(req: NextApiRequest, params: Params | Boolean = null): LazyProps = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyProps]
  }
}

