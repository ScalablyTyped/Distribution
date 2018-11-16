package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModelMapReduceOption[T, Key, Val] extends js.Object {
  /** finalize function */
  @JSName("finalize")
  var finalize_FModelMapReduceOption: js.UndefOr[js.Function2[/* key */ Key, /* val */ Val, Val]] = js.undefined
  /** it is possible to make the execution stay in JS. Provided in MongoDB > 2.0.X default: false */
  var jsMode: js.UndefOr[scala.Boolean] = js.undefined
  /** keep temporary data default: false */
  var keeptemp: js.UndefOr[scala.Boolean] = js.undefined
  /** max number of documents */
  var limit: js.UndefOr[scala.Double] = js.undefined
  var map: js.Function | java.lang.String
  /** sets the output target for the map reduce job. default: {inline: 1} */
  var out: js.UndefOr[mongooseLib.Anon_Reduce] = js.undefined
  /** query filter object. */
  var query: js.UndefOr[js.Any] = js.undefined
  var readPreference: js.UndefOr[java.lang.String] = js.undefined
  /** scope variables exposed to map/reduce/finalize during execution */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** sort input objects using this key */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** provide statistics on job execution time. default: false */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  def reduce(key: Key, vals: js.Array[T]): Val
}

