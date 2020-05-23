package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authority extends js.Object {
  var authority: js.UndefOr[String | Null] = js.undefined
  var fragment: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var query: js.UndefOr[String | Null] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
}

object Authority {
  @scala.inline
  def apply(
    authority: js.UndefOr[Null | String] = js.undefined,
    fragment: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    query: js.UndefOr[Null | String] = js.undefined,
    scheme: String = null
  ): Authority = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authority)) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (!js.isUndefined(fragment)) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authority]
  }
}

