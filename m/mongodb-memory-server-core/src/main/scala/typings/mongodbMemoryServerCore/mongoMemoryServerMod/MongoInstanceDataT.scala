package typings.mongodbMemoryServerCore.mongoMemoryServerMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.ChildProcess
import typings.tmp.mod.DirResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoInstanceDataT extends StartupInstanceData {
  var childProcess: js.UndefOr[ChildProcess] = js.undefined
  @JSName("dbPath")
  var dbPath_MongoInstanceDataT: String
  var instance: typings.mongodbMemoryServerCore.mongoInstanceMod.default
  @JSName("uri")
  var uri_MongoInstanceDataT: String
}

object MongoInstanceDataT {
  @scala.inline
  def apply(
    dbName: String,
    dbPath: String,
    instance: typings.mongodbMemoryServerCore.mongoInstanceMod.default,
    ip: String,
    port: Double,
    storageEngine: StorageEngineT,
    uri: String,
    childProcess: ChildProcess = null,
    replSet: String = null,
    tmpDir: DirResult = null
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], dbPath = dbPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (childProcess != null) __obj.updateDynamic("childProcess")(childProcess.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoInstanceDataT]
  }
}

