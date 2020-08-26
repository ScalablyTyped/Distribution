package typings.mongodbMemoryServerCore.mongoMemoryServerMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoInstanceDataT extends StartupInstanceData {
  var childProcess: js.UndefOr[ChildProcess] = js.native
  @JSName("dbPath")
  var dbPath_MongoInstanceDataT: String = js.native
  var instance: typings.mongodbMemoryServerCore.mongoInstanceMod.default = js.native
  @JSName("uri")
  var uri_MongoInstanceDataT: String = js.native
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
    uri: String
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], dbPath = dbPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoInstanceDataT]
  }
  @scala.inline
  implicit class MongoInstanceDataTOps[Self <: MongoInstanceDataT] (val x: Self) extends AnyVal {
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
    def setDbPath(value: String): Self = this.set("dbPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: typings.mongodbMemoryServerCore.mongoInstanceMod.default): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildProcess(value: ChildProcess): Self = this.set("childProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildProcess: Self = this.set("childProcess", js.undefined)
  }
  
}

