package typings.atPollyjsCore.atPollyjsCoreMod

import typings.atPollyjsCore.Anon_Body
import typings.atPollyjsCore.Anon_KeepUnusedRequests
import typings.atPollyjsCore.TypeofClassAdapter
import typings.atPollyjsCore.TypeofClassPersister
import typings.atPollyjsUtils.atPollyjsUtilsMod.MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.undefined
  var adapters: js.UndefOr[js.Array[String | TypeofClassAdapter]] = js.undefined
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var matchRequestsBy: js.UndefOr[Anon_Body] = js.undefined
  var mode: js.UndefOr[MODES | String] = js.undefined
  var persister: js.UndefOr[String | TypeofClassPersister] = js.undefined
  var persisterOptions: js.UndefOr[Anon_KeepUnusedRequests] = js.undefined
  var recordFailedRequests: js.UndefOr[Boolean] = js.undefined
  var recordIfExpired: js.UndefOr[Boolean] = js.undefined
  var recordIfMissing: js.UndefOr[Boolean] = js.undefined
  var timing: js.UndefOr[
    (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
  ] = js.undefined
}

object PollyConfig {
  @scala.inline
  def apply(
    adapterOptions: js.Any = null,
    adapters: js.Array[String | TypeofClassAdapter] = null,
    expiresIn: String = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    matchRequestsBy: Anon_Body = null,
    mode: MODES | String = null,
    persister: String | TypeofClassPersister = null,
    persisterOptions: Anon_KeepUnusedRequests = null,
    recordFailedRequests: js.UndefOr[Boolean] = js.undefined,
    recordIfExpired: js.UndefOr[Boolean] = js.undefined,
    recordIfMissing: js.UndefOr[Boolean] = js.undefined,
    timing: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]] = null
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

