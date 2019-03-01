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

object ParallelCollectionScanOptions {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    numCursors: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readPreference: ReadPreference | java.lang.String = null,
    session: ClientSession = null
  ): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (numCursors != null) __obj.updateDynamic("numCursors")(numCursors.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
}

