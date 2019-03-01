package typings
package mongodbDashMemoryDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var dbPath: java.lang.String
  var debug: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var port: scala.Double
  var storageEngine: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    dbPath: java.lang.String,
    port: scala.Double,
    debug: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    storageEngine: java.lang.String = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dbPath")(dbPath)
    __obj.updateDynamic("port")(port)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.asInstanceOf[Anon_Args]
  }
}

