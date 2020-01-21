package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryInstancePropT extends MongoMemoryInstancePropBaseT {
  var auth: js.UndefOr[Boolean] = js.undefined
  var dbName: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[DebugPropT] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var replSet: js.UndefOr[String] = js.undefined
}

object MongoMemoryInstancePropT {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    auth: js.UndefOr[Boolean] = js.undefined,
    dbName: String = null,
    dbPath: String = null,
    debug: DebugPropT = null,
    ip: String = null,
    port: Int | Double = null,
    replSet: String = null,
    storageEngine: StorageEngineT = null
  ): MongoMemoryInstancePropT = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryInstancePropT]
  }
}

