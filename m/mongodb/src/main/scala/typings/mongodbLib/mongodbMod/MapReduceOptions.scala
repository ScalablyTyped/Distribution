package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapReduceOptions extends js.Object {
  var bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("finalize")
  var finalize_FMapReduceOptions: js.UndefOr[js.Function | java.lang.String] = js.undefined
  var jsMode: js.UndefOr[scala.Boolean] = js.undefined
  var keeptemp: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var out: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object MapReduceOptions {
  @scala.inline
  def apply(
    bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined,
    finalize: js.Function | java.lang.String = null,
    jsMode: js.UndefOr[scala.Boolean] = js.undefined,
    keeptemp: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    out: js.Object = null,
    query: js.Object = null,
    readPreference: ReadPreference | java.lang.String = null,
    scope: js.Object = null,
    session: ClientSession = null,
    sort: js.Object = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): MapReduceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    if (finalize != null) __obj.updateDynamic("finalize")(finalize.asInstanceOf[js.Any])
    if (!js.isUndefined(jsMode)) __obj.updateDynamic("jsMode")(jsMode)
    if (!js.isUndefined(keeptemp)) __obj.updateDynamic("keeptemp")(keeptemp)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out)
    if (query != null) __obj.updateDynamic("query")(query)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[MapReduceOptions]
  }
}

