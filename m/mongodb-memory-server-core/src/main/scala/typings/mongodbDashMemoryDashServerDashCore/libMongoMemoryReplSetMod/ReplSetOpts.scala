package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.StorageEngineT
import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplSetOpts extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var auth: js.UndefOr[Boolean] = js.undefined
  var configSettings: js.UndefOr[MongoMemoryReplSetConfigSettingsT] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var dbName: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var oplogSize: js.UndefOr[Double] = js.undefined
  var spawn: js.UndefOr[SpawnOptions] = js.undefined
  var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
}

object ReplSetOpts {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    auth: js.UndefOr[Boolean] = js.undefined,
    configSettings: MongoMemoryReplSetConfigSettingsT = null,
    count: Int | Double = null,
    dbName: String = null,
    ip: String = null,
    name: String = null,
    oplogSize: Int | Double = null,
    spawn: SpawnOptions = null,
    storageEngine: StorageEngineT = null
  ): ReplSetOpts = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth)
    if (configSettings != null) __obj.updateDynamic("configSettings")(configSettings)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oplogSize != null) __obj.updateDynamic("oplogSize")(oplogSize.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn)
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.asInstanceOf[ReplSetOpts]
  }
}

