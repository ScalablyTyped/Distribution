package typings.mongodbMemoryServerCore.mongoMemoryServerMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.tmp.mod.DirResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartupInstanceData extends js.Object {
  var dbName: String
  var dbPath: js.UndefOr[String] = js.undefined
  var ip: String
  var port: Double
  var replSet: js.UndefOr[String] = js.undefined
  var storageEngine: StorageEngineT
  var tmpDir: js.UndefOr[DirResult] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object StartupInstanceData {
  @scala.inline
  def apply(
    dbName: String,
    ip: String,
    port: Double,
    storageEngine: StorageEngineT,
    dbPath: String = null,
    replSet: String = null,
    tmpDir: DirResult = null,
    uri: String = null
  ): StartupInstanceData = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartupInstanceData]
  }
}

