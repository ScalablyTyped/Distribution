package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.undefined
  var adapters: js.UndefOr[js.Array[java.lang.String | atPollyjsCoreLib.TypeofClassAdapter]] = js.undefined
  var expiresIn: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var matchRequestsBy: js.UndefOr[atPollyjsCoreLib.Anon_Body] = js.undefined
  var mode: js.UndefOr[atPollyjsUtilsLib.atPollyjsUtilsMod.MODES | java.lang.String] = js.undefined
  var persister: js.UndefOr[java.lang.String | atPollyjsCoreLib.TypeofClassPersister] = js.undefined
  var persisterOptions: js.UndefOr[atPollyjsCoreLib.Anon_KeepUnusedRequests] = js.undefined
  var recordFailedRequests: js.UndefOr[scala.Boolean] = js.undefined
  var recordIfExpired: js.UndefOr[scala.Boolean] = js.undefined
  var recordIfMissing: js.UndefOr[scala.Boolean] = js.undefined
  var timing: js.UndefOr[
    (js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]]) | js.Function0[js.Promise[scala.Unit]]
  ] = js.undefined
}

object PollyConfig {
  @scala.inline
  def apply(
    adapterOptions: js.Any = null,
    adapters: js.Array[java.lang.String | atPollyjsCoreLib.TypeofClassAdapter] = null,
    expiresIn: java.lang.String = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    matchRequestsBy: atPollyjsCoreLib.Anon_Body = null,
    mode: atPollyjsUtilsLib.atPollyjsUtilsMod.MODES | java.lang.String = null,
    persister: java.lang.String | atPollyjsCoreLib.TypeofClassPersister = null,
    persisterOptions: atPollyjsCoreLib.Anon_KeepUnusedRequests = null,
    recordFailedRequests: js.UndefOr[scala.Boolean] = js.undefined,
    recordIfExpired: js.UndefOr[scala.Boolean] = js.undefined,
    recordIfMissing: js.UndefOr[scala.Boolean] = js.undefined,
    timing: (js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]]) | js.Function0[js.Promise[scala.Unit]] = null
  ): PollyConfig = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions)
    if (adapters != null) __obj.updateDynamic("adapters")(adapters)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (matchRequestsBy != null) __obj.updateDynamic("matchRequestsBy")(matchRequestsBy)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (persister != null) __obj.updateDynamic("persister")(persister.asInstanceOf[js.Any])
    if (persisterOptions != null) __obj.updateDynamic("persisterOptions")(persisterOptions)
    if (!js.isUndefined(recordFailedRequests)) __obj.updateDynamic("recordFailedRequests")(recordFailedRequests)
    if (!js.isUndefined(recordIfExpired)) __obj.updateDynamic("recordIfExpired")(recordIfExpired)
    if (!js.isUndefined(recordIfMissing)) __obj.updateDynamic("recordIfMissing")(recordIfMissing)
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollyConfig]
  }
}

