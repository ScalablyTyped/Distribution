package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapReduceOptions extends js.Object {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  @JSName("finalize")
  var finalize_FMapReduceOptions: js.UndefOr[js.Function | String] = js.undefined
  var jsMode: js.UndefOr[Boolean] = js.undefined
  var keeptemp: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var out: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object MapReduceOptions {
  @scala.inline
  def apply(
    bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined,
    finalize: js.Function | String = null,
    jsMode: js.UndefOr[Boolean] = js.undefined,
    keeptemp: js.UndefOr[Boolean] = js.undefined,
    limit: Int | scala.Double = null,
    out: js.Object = null,
    query: js.Object = null,
    readPreference: ReadPreferenceOrMode = null,
    scope: js.Object = null,
    session: ClientSession = null,
    sort: js.Object = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): MapReduceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation.asInstanceOf[js.Any])
    if (finalize != null) __obj.updateDynamic("finalize")(finalize.asInstanceOf[js.Any])
    if (!js.isUndefined(jsMode)) __obj.updateDynamic("jsMode")(jsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(keeptemp)) __obj.updateDynamic("keeptemp")(keeptemp.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapReduceOptions]
  }
}

