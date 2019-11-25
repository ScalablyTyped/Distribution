package typings.naja.najaMod

import typings.naja.najaStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait RequestOptions extends js.Object {
  var abort: js.UndefOr[Boolean] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[Boolean | replace] = js.undefined
  var historyUiCache: js.UndefOr[Boolean] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    abort: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    dataType: String = null,
    history: Boolean | replace = null,
    historyUiCache: js.UndefOr[Boolean] = js.undefined,
    responseType: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abort)) __obj.updateDynamic("abort")(abort.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(historyUiCache)) __obj.updateDynamic("historyUiCache")(historyUiCache.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

