package typings.nookies.anon

import typings.next.utilsMod.NextApiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  var req: NextApiRequest
}

object Req {
  @scala.inline
  def apply(req: NextApiRequest): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

