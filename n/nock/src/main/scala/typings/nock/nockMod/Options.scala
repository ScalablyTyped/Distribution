package typings.nock.nockMod

import typings.nock.Fn_Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnmocked: js.UndefOr[Boolean] = js.undefined
  var badheaders: js.UndefOr[js.Array[String]] = js.undefined
  var encodedQueryParams: js.UndefOr[Boolean] = js.undefined
  var filteringScope: js.UndefOr[Fn_Scope] = js.undefined
  var reqheaders: js.UndefOr[RequestHeaderMatcher] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnmocked: js.UndefOr[Boolean] = js.undefined,
    badheaders: js.Array[String] = null,
    encodedQueryParams: js.UndefOr[Boolean] = js.undefined,
    filteringScope: Fn_Scope = null,
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

