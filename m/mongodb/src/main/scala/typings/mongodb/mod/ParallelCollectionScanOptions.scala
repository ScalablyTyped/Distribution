package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelCollectionScanOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var numCursors: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object ParallelCollectionScanOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[scala.Double] = js.undefined,
    numCursors: js.UndefOr[scala.Double] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numCursors)) __obj.updateDynamic("numCursors")(numCursors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
}

