package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSetConfigSettingsT extends js.Object {
  var catchUpTimeoutMillis: js.UndefOr[Double] = js.native
  var chainingAllowed: js.UndefOr[Boolean] = js.native
  var electionTimeoutMillis: js.UndefOr[Double] = js.native
  var heartbeatIntervalMillis: js.UndefOr[Double] = js.native
  var heartbeatTimeoutSecs: js.UndefOr[Double] = js.native
}

object MongoMemoryReplSetConfigSettingsT {
  @scala.inline
  def apply(): MongoMemoryReplSetConfigSettingsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryReplSetConfigSettingsT]
  }
  @scala.inline
  implicit class MongoMemoryReplSetConfigSettingsTOps[Self <: MongoMemoryReplSetConfigSettingsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCatchUpTimeoutMillis(value: Double): Self = this.set("catchUpTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatchUpTimeoutMillis: Self = this.set("catchUpTimeoutMillis", js.undefined)
    @scala.inline
    def setChainingAllowed(value: Boolean): Self = this.set("chainingAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChainingAllowed: Self = this.set("chainingAllowed", js.undefined)
    @scala.inline
    def setElectionTimeoutMillis(value: Double): Self = this.set("electionTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionTimeoutMillis: Self = this.set("electionTimeoutMillis", js.undefined)
    @scala.inline
    def setHeartbeatIntervalMillis(value: Double): Self = this.set("heartbeatIntervalMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatIntervalMillis: Self = this.set("heartbeatIntervalMillis", js.undefined)
    @scala.inline
    def setHeartbeatTimeoutSecs(value: Double): Self = this.set("heartbeatTimeoutSecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatTimeoutSecs: Self = this.set("heartbeatTimeoutSecs", js.undefined)
  }
  
}

