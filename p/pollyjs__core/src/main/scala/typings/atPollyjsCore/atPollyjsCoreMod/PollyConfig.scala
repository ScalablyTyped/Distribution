package typings.atPollyjsCore.atPollyjsCoreMod

import typings.atPollyjsCore.Anon_Body
import typings.atPollyjsCore.Anon_Fetch
import typings.atPollyjsCore.Anon_Fs
import typings.atPollyjsCore.TypeofClassPersister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[Anon_Fetch] = js.undefined
  var adapters: js.UndefOr[
    js.Array[
      String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
    ]
  ] = js.undefined
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var matchRequestsBy: js.UndefOr[Anon_Body] = js.undefined
  var mode: js.UndefOr[MODE] = js.undefined
  var persister: js.UndefOr[String | TypeofClassPersister] = js.undefined
  var persisterOptions: js.UndefOr[Anon_Fs] = js.undefined
  var recordFailedRequests: js.UndefOr[Boolean] = js.undefined
  /** @deprecated use expiryStrategy */
  var recordIfExpired: js.UndefOr[Boolean] = js.undefined
  var recordIfMissing: js.UndefOr[Boolean] = js.undefined
  var timing: js.UndefOr[
    (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
  ] = js.undefined
}

object PollyConfig {
  @scala.inline
  def apply(
    adapterOptions: Anon_Fetch = null,
    adapters: js.Array[
      String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
    ] = null,
    expiresIn: String = null,
    expiryStrategy: EXPIRY_STRATEGY = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    matchRequestsBy: Anon_Body = null,
    mode: MODE = null,
    persister: String | TypeofClassPersister = null,
    persisterOptions: Anon_Fs = null,
    recordFailedRequests: js.UndefOr[Boolean] = js.undefined,
    recordIfExpired: js.UndefOr[Boolean] = js.undefined,
    recordIfMissing: js.UndefOr[Boolean] = js.undefined,
    timing: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]] = null
  ): PollyConfig = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions.asInstanceOf[js.Any])
    if (adapters != null) __obj.updateDynamic("adapters")(adapters.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (expiryStrategy != null) __obj.updateDynamic("expiryStrategy")(expiryStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (matchRequestsBy != null) __obj.updateDynamic("matchRequestsBy")(matchRequestsBy.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (persister != null) __obj.updateDynamic("persister")(persister.asInstanceOf[js.Any])
    if (persisterOptions != null) __obj.updateDynamic("persisterOptions")(persisterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(recordFailedRequests)) __obj.updateDynamic("recordFailedRequests")(recordFailedRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(recordIfExpired)) __obj.updateDynamic("recordIfExpired")(recordIfExpired.asInstanceOf[js.Any])
    if (!js.isUndefined(recordIfMissing)) __obj.updateDynamic("recordIfMissing")(recordIfMissing.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollyConfig]
  }
}

