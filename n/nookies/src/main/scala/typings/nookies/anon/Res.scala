package typings.nookies.anon

import typings.next.utilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var res: NextApiResponse[_]
}

object Res {
  @scala.inline
  def apply(res: NextApiResponse[_]): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
}

