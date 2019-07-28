package typings.mongoose.mongooseMod

import typings.mongoose.Anon_Inline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelMapReduceOption[T, Key, Val] extends js.Object {
  /** finalize function */
  @JSName("finalize")
  var finalize_FModelMapReduceOption: js.UndefOr[js.Function2[/* key */ Key, /* val */ Val, Val]] = js.undefined
  /** it is possible to make the execution stay in JS. Provided in MongoDB > 2.0.X default: false */
  var jsMode: js.UndefOr[Boolean] = js.undefined
  /** keep temporary data default: false */
  var keeptemp: js.UndefOr[Boolean] = js.undefined
  /** max number of documents */
  var limit: js.UndefOr[Double] = js.undefined
  var map: js.Function | String
  /** sets the output target for the map reduce job. default: {inline: 1} */
  var out: js.UndefOr[Anon_Inline] = js.undefined
  /** query filter object. */
  var query: js.UndefOr[js.Any] = js.undefined
  var readPreference: js.UndefOr[String] = js.undefined
  /** scope variables exposed to map/reduce/finalize during execution */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** sort input objects using this key */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** provide statistics on job execution time. default: false */
  var verbose: js.UndefOr[Boolean] = js.undefined
  def reduce(key: Key, vals: js.Array[T]): Val
}

object ModelMapReduceOption {
  @scala.inline
  def apply[T, Key, Val](
    map: js.Function | String,
    reduce: (Key, js.Array[T]) => Val,
    finalize: (/* key */ Key, /* val */ Val) => Val = null,
    jsMode: js.UndefOr[Boolean] = js.undefined,
    keeptemp: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    out: Anon_Inline = null,
    query: js.Any = null,
    readPreference: String = null,
    scope: js.Any = null,
    sort: js.Any = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ModelMapReduceOption[T, Key, Val] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce))
    if (finalize != null) __obj.updateDynamic("finalize")(js.Any.fromFunction2(finalize))
    if (!js.isUndefined(jsMode)) __obj.updateDynamic("jsMode")(jsMode)
    if (!js.isUndefined(keeptemp)) __obj.updateDynamic("keeptemp")(keeptemp)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out)
    if (query != null) __obj.updateDynamic("query")(query)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelMapReduceOption[T, Key, Val]]
  }
}

