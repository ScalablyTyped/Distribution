package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var html_body: java.lang.String
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var scoped_body: js.UndefOr[js.Any] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String,
    html_body: java.lang.String,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    scoped_body: js.Any = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, html_body = html_body)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (scoped_body != null) __obj.updateDynamic("scoped_body")(scoped_body)
    __obj.asInstanceOf[Anon_Body]
  }
}

