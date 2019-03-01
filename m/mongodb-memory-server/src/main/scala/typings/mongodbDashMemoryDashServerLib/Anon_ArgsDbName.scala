package typings
package mongodbDashMemoryDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDbName extends js.Object {
  var dbName: js.UndefOr[java.lang.String] = js.undefined
  var dbPath: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var storageEngine: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ArgsDbName {
  @scala.inline
  def apply(
    dbName: java.lang.String = null,
    dbPath: java.lang.String = null,
    debug: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    port: scala.Int | scala.Double = null,
    storageEngine: java.lang.String = null
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

