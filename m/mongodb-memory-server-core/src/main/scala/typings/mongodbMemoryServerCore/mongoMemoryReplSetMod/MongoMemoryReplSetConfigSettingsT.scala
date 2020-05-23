package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryReplSetConfigSettingsT extends js.Object {
  var catchUpTimeoutMillis: js.UndefOr[Double] = js.undefined
  var chainingAllowed: js.UndefOr[Boolean] = js.undefined
  var electionTimeoutMillis: js.UndefOr[Double] = js.undefined
  var heartbeatIntervalMillis: js.UndefOr[Double] = js.undefined
  var heartbeatTimeoutSecs: js.UndefOr[Double] = js.undefined
}

object MongoMemoryReplSetConfigSettingsT {
  @scala.inline
  def apply(
    catchUpTimeoutMillis: js.UndefOr[Double] = js.undefined,
    chainingAllowed: js.UndefOr[Boolean] = js.undefined,
    electionTimeoutMillis: js.UndefOr[Double] = js.undefined,
    heartbeatIntervalMillis: js.UndefOr[Double] = js.undefined,
    heartbeatTimeoutSecs: js.UndefOr[Double] = js.undefined
  ): MongoMemoryReplSetConfigSettingsT = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(catchUpTimeoutMillis)) __obj.updateDynamic("catchUpTimeoutMillis")(catchUpTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chainingAllowed)) __obj.updateDynamic("chainingAllowed")(chainingAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(electionTimeoutMillis)) __obj.updateDynamic("electionTimeoutMillis")(electionTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatIntervalMillis)) __obj.updateDynamic("heartbeatIntervalMillis")(heartbeatIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatTimeoutSecs)) __obj.updateDynamic("heartbeatTimeoutSecs")(heartbeatTimeoutSecs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryReplSetConfigSettingsT]
  }
}

