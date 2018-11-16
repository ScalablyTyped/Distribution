package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParallelCollectionScanOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var numCursors: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

