package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetConfigSettingsT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.ReplSetOpts> */
trait RequiredReplSetOpts extends js.Object {
  var args: js.Array[String]
  var auth: Boolean
  var configSettings: MongoMemoryReplSetConfigSettingsT
  var count: Double
  var dbName: String
  var ip: String
  var name: String
  var oplogSize: Double
  var spawn: SpawnOptions
  var storageEngine: StorageEngineT
}

object RequiredReplSetOpts {
  @scala.inline
  def apply(
    args: js.Array[String],
    auth: Boolean,
    configSettings: MongoMemoryReplSetConfigSettingsT,
    count: Double,
    dbName: String,
    ip: String,
    name: String,
    oplogSize: Double,
    spawn: SpawnOptions,
    storageEngine: StorageEngineT
  ): RequiredReplSetOpts = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oplogSize = oplogSize.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredReplSetOpts]
  }
}

