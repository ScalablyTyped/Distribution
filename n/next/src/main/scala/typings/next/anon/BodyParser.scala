package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[SizeLimit | `false`] = js.undefined
  /**
    * Flag to disable warning "API page resolved
    * without sending a response", due to explicitly
    * using an external API resolver, like express
    */
  var externalResolver: js.UndefOr[`true`] = js.undefined
}

object BodyParser {
  @scala.inline
  def apply(bodyParser: SizeLimit | `false` = null, externalResolver: `true` = null): BodyParser = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (externalResolver != null) __obj.updateDynamic("externalResolver")(externalResolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParser]
  }
}

