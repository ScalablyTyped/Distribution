package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import typings.mongodbDashMemoryDashServer.Anon_ArgsName
import typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs.MongodbInstance
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoInstanceDataT extends js.Object {
  var childProcess: ChildProcess
  var dbName: String
  var dbPath: String
  var instance: MongodbInstance
  var port: Double
  var storageEngine: String
  var tmpDir: js.UndefOr[Anon_ArgsName] = js.undefined
  var uri: String
}

object MongoInstanceDataT {
  @scala.inline
  def apply(
    childProcess: ChildProcess,
    dbName: String,
    dbPath: String,
    instance: MongodbInstance,
    port: Double,
    storageEngine: String,
    uri: String,
    tmpDir: Anon_ArgsName = null
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal(childProcess = childProcess, dbName = dbName, dbPath = dbPath, instance = instance, port = port, storageEngine = storageEngine, uri = uri)
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir)
    __obj.asInstanceOf[MongoInstanceDataT]
  }
}

