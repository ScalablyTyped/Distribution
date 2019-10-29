package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod

import typings.mongodbDashMemoryDashServerDashCore.Anon_Name
import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.StorageEngineT
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoInstanceDataT extends js.Object {
  var childProcess: ChildProcess
  var dbName: String
  var dbPath: String
  var instance: typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.default
  var ip: String
  var port: Double
  var replSet: js.UndefOr[String] = js.undefined
  var storageEngine: StorageEngineT
  var tmpDir: js.UndefOr[Anon_Name] = js.undefined
  var uri: String
}

object MongoInstanceDataT {
  @scala.inline
  def apply(
    childProcess: ChildProcess,
    dbName: String,
    dbPath: String,
    instance: typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.default,
    ip: String,
    port: Double,
    storageEngine: StorageEngineT,
    uri: String,
    replSet: String = null,
    tmpDir: Anon_Name = null
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal(childProcess = childProcess, dbName = dbName, dbPath = dbPath, instance = instance, ip = ip, port = port, storageEngine = storageEngine, uri = uri)
    if (replSet != null) __obj.updateDynamic("replSet")(replSet)
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir)
    __obj.asInstanceOf[MongoInstanceDataT]
  }
}

