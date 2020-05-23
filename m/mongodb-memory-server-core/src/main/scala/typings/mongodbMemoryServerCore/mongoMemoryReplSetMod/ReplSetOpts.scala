package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
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
    count: js.UndefOr[Double] = js.undefined,
    dbName: String = null,
    ip: String = null,
    name: String = null,
    oplogSize: js.UndefOr[Double] = js.undefined,
    spawn: SpawnOptions = null,
    storageEngine: StorageEngineT = null
  ): ReplSetOpts = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.get.asInstanceOf[js.Any])
    if (configSettings != null) __obj.updateDynamic("configSettings")(configSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(oplogSize)) __obj.updateDynamic("oplogSize")(oplogSize.get.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplSetOpts]
  }
}

