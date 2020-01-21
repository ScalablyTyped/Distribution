package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.typesMod.DebugPropT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var auth: js.UndefOr[Boolean] = js.undefined
  var dbPath: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[DebugPropT] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var replSet: js.UndefOr[String] = js.undefined
  var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    auth: js.UndefOr[Boolean] = js.undefined,
    dbPath: String = null,
    debug: DebugPropT = null,
    ip: String = null,
    port: Int | Double = null,
    replSet: String = null,
    storageEngine: StorageEngineT = null
  ): AnonArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

