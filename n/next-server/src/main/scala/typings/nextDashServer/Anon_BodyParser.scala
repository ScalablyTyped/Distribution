package typings.nextDashServer

import typings.nextDashServer.nextDashServerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[Anon_SizeLimit | `false`] = js.undefined
}

object Anon_BodyParser {
  @scala.inline
  def apply(bodyParser: Anon_SizeLimit | `false` = null): Anon_BodyParser = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyParser]
  }
}

