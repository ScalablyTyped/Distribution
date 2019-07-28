package typings.mongodbDashMemoryDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDbName extends js.Object {
  var dbName: js.UndefOr[String] = js.undefined
  var dbPath: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var storageEngine: js.UndefOr[String] = js.undefined
}

object Anon_ArgsDbName {
  @scala.inline
  def apply(
    dbName: String = null,
    dbPath: String = null,
    debug: Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    port: Int | Double = null,
    storageEngine: String = null
  ): Anon_ArgsDbName = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (dbPath != null) __obj.updateDynamic("dbPath")(dbPath)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.asInstanceOf[Anon_ArgsDbName]
  }
}

