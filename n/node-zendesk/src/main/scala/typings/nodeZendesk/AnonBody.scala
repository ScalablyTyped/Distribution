package typings.nodeZendesk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var html_body: String
  var public: js.UndefOr[Boolean] = js.undefined
  var scoped_body: js.UndefOr[js.Any] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: String,
    html_body: String,
    public: js.UndefOr[Boolean] = js.undefined,
    scoped_body: js.Any = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (scoped_body != null) __obj.updateDynamic("scoped_body")(scoped_body.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

