package typings.mongodbMemoryServerCore.anon

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var auth: js.UndefOr[Boolean] = js.undefined
  var dbPath: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var replSet: js.UndefOr[String] = js.undefined
  var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
}

object Args {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    auth: js.UndefOr[Boolean] = js.undefined,
    dbPath: String = null,
    ip: String = null,
    port: js.UndefOr[Double] = js.undefined,
    replSet: String = null,
    storageEngine: StorageEngineT = null
  ): Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.get.asInstanceOf[js.Any])
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

