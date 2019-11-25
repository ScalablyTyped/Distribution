package typings.naja.najaMod

import typings.naja.najaStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait NajaOptions extends RequestOptions {
  var selector: js.UndefOr[String] = js.undefined
}

object NajaOptions {
  @scala.inline
  def apply(
    abort: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    dataType: String = null,
    history: Boolean | replace = null,
    historyUiCache: js.UndefOr[Boolean] = js.undefined,
    responseType: String = null,
    selector: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): NajaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abort)) __obj.updateDynamic("abort")(abort.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(historyUiCache)) __obj.updateDynamic("historyUiCache")(historyUiCache.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[NajaOptions]
  }
}

