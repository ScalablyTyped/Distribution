package typings.nock.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnmocked: js.UndefOr[Boolean] = js.undefined
  var badheaders: js.UndefOr[js.Array[String]] = js.undefined
  var encodedQueryParams: js.UndefOr[Boolean] = js.undefined
  var filteringScope: js.UndefOr[js.Function1[/* scope */ String, Boolean]] = js.undefined
  var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnmocked: js.UndefOr[Boolean] = js.undefined,
    badheaders: js.Array[String] = null,
    encodedQueryParams: js.UndefOr[Boolean] = js.undefined,
    filteringScope: /* scope */ String => Boolean = null,
    reqheaders: Record[String, RequestHeaderMatcher] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnmocked)) __obj.updateDynamic("allowUnmocked")(allowUnmocked.get.asInstanceOf[js.Any])
    if (badheaders != null) __obj.updateDynamic("badheaders")(badheaders.asInstanceOf[js.Any])
    if (!js.isUndefined(encodedQueryParams)) __obj.updateDynamic("encodedQueryParams")(encodedQueryParams.get.asInstanceOf[js.Any])
    if (filteringScope != null) __obj.updateDynamic("filteringScope")(js.Any.fromFunction1(filteringScope))
    if (reqheaders != null) __obj.updateDynamic("reqheaders")(reqheaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

