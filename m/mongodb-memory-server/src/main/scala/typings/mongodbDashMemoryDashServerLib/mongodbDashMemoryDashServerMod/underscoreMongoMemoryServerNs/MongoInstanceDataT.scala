package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoInstanceDataT extends js.Object {
  var childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess
  var dbName: java.lang.String
  var dbPath: java.lang.String
  var instance: mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs.MongodbInstance
  var port: scala.Double
  var storageEngine: java.lang.String
  var tmpDir: js.UndefOr[mongodbDashMemoryDashServerLib.Anon_ArgsName] = js.undefined
  var uri: java.lang.String
}

object MongoInstanceDataT {
  @scala.inline
  def apply(
    childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess,
    dbName: java.lang.String,
    dbPath: java.lang.String,
    instance: mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs.MongodbInstance,
    port: scala.Double,
    storageEngine: java.lang.String,
    uri: java.lang.String,
    tmpDir: mongodbDashMemoryDashServerLib.Anon_ArgsName = null
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childProcess")(childProcess)
    __obj.updateDynamic("dbName")(dbName)
    __obj.updateDynamic("dbPath")(dbPath)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.updateDynamic("uri")(uri)
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir)
    __obj.asInstanceOf[MongoInstanceDataT]
  }
}

