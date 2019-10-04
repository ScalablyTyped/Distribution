package typings.atPollyjsCore.atPollyjsCoreMod

import typings.atPollyjsCore.Anon_Body
import typings.atPollyjsCore.Anon_Fetch
import typings.atPollyjsCore.Anon_Fs
import typings.atPollyjsCore.TypeofClassAdapter
import typings.atPollyjsCore.TypeofClassPersister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[Anon_Fetch] = js.undefined
  var adapters: js.UndefOr[js.Array[String | TypeofClassAdapter]] = js.undefined
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
    adapters: js.Array[String | TypeofClassAdapter] = null,
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
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions)
    if (adapters != null) __obj.updateDynamic("adapters")(adapters)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (expiryStrategy != null) __obj.updateDynamic("expiryStrategy")(expiryStrategy)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (matchRequestsBy != null) __obj.updateDynamic("matchRequestsBy")(matchRequestsBy)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (persister != null) __obj.updateDynamic("persister")(persister.asInstanceOf[js.Any])
    if (persisterOptions != null) __obj.updateDynamic("persisterOptions")(persisterOptions)
    if (!js.isUndefined(recordFailedRequests)) __obj.updateDynamic("recordFailedRequests")(recordFailedRequests)
    if (!js.isUndefined(recordIfExpired)) __obj.updateDynamic("recordIfExpired")(recordIfExpired)
    if (!js.isUndefined(recordIfMissing)) __obj.updateDynamic("recordIfMissing")(recordIfMissing)
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollyConfig]
  }
}

