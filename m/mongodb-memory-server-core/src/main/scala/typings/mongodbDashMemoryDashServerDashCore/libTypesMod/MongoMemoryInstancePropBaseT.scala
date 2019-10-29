package typings.mongodbDashMemoryDashServerDashCore.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryInstancePropBaseT extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var dbPath: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double | Null] = js.undefined
  var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
}

object MongoMemoryInstancePropBaseT {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dbPath: String = null,
    port: Int | Double = null,
    storageEngine: StorageEngineT = null
  ): MongoMemoryInstancePropBaseT = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.asInstanceOf[MongoMemoryInstancePropBaseT]
  }
}

