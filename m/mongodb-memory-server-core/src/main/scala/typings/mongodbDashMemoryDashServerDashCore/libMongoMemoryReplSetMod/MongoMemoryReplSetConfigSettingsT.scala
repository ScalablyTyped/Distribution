package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod

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
    catchUpTimeoutMillis: Int | Double = null,
    chainingAllowed: js.UndefOr[Boolean] = js.undefined,
    electionTimeoutMillis: Int | Double = null,
    heartbeatIntervalMillis: Int | Double = null,
    heartbeatTimeoutSecs: Int | Double = null
  ): MongoMemoryReplSetConfigSettingsT = {
    val __obj = js.Dynamic.literal()
    if (catchUpTimeoutMillis != null) __obj.updateDynamic("catchUpTimeoutMillis")(catchUpTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(chainingAllowed)) __obj.updateDynamic("chainingAllowed")(chainingAllowed.asInstanceOf[js.Any])
    if (electionTimeoutMillis != null) __obj.updateDynamic("electionTimeoutMillis")(electionTimeoutMillis.asInstanceOf[js.Any])
    if (heartbeatIntervalMillis != null) __obj.updateDynamic("heartbeatIntervalMillis")(heartbeatIntervalMillis.asInstanceOf[js.Any])
    if (heartbeatTimeoutSecs != null) __obj.updateDynamic("heartbeatTimeoutSecs")(heartbeatTimeoutSecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryReplSetConfigSettingsT]
  }
}

