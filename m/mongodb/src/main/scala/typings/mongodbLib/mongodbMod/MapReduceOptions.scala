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

