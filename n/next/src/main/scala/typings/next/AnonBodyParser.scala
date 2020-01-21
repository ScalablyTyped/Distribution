package typings.next

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[AnonSizeLimit | `false`] = js.undefined
}

object AnonBodyParser {
  @scala.inline
  def apply(bodyParser: AnonSizeLimit | `false` = null): AnonBodyParser = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyParser]
  }
}

