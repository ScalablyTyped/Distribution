package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnmocked: js.UndefOr[scala.Boolean] = js.undefined
  var badheaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encodedQueryParams: js.UndefOr[scala.Boolean] = js.undefined
  var filteringScope: js.UndefOr[nockLib.Fn_Scope] = js.undefined
  var reqheaders: js.UndefOr[RequestHeaderMatcher] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnmocked: js.UndefOr[scala.Boolean] = js.undefined,
    badheaders: js.Array[java.lang.String] = null,
    encodedQueryParams: js.UndefOr[scala.Boolean] = js.undefined,
    filteringScope: nockLib.Fn_Scope = null,
    reqheaders: RequestHeaderMatcher = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnmocked)) __obj.updateDynamic("allowUnmocked")(allowUnmocked)
    if (badheaders != null) __obj.updateDynamic("badheaders")(badheaders)
    if (!js.isUndefined(encodedQueryParams)) __obj.updateDynamic("encodedQueryParams")(encodedQueryParams)
    if (filteringScope != null) __obj.updateDynamic("filteringScope")(filteringScope)
    if (reqheaders != null) __obj.updateDynamic("reqheaders")(reqheaders)
    __obj.asInstanceOf[Options]
  }
}

