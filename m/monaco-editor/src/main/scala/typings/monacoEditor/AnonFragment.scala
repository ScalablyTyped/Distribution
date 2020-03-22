package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFragment extends js.Object {
  var authority: js.UndefOr[String] = js.undefined
  var fragment: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var scheme: String
}

object AnonFragment {
  @scala.inline
  def apply(
    scheme: String,
    authority: String = null,
    fragment: String = null,
    path: String = null,
    query: String = null
  ): AnonFragment = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFragment]
  }
}

