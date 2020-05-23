package typings.mongodbMemoryServerCore.typesMod

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
    port: js.UndefOr[Null | Double] = js.undefined,
    storageEngine: StorageEngineT = null
  ): MongoMemoryInstancePropBaseT = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryInstancePropBaseT]
  }
}

