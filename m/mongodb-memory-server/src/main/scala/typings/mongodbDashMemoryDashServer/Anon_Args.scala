package typings.mongodbDashMemoryDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var dbPath: String
  var debug: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var port: Double
  var storageEngine: js.UndefOr[String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    dbPath: String,
    port: Double,
    debug: Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    storageEngine: String = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(dbPath = dbPath, port = port)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    __obj.asInstanceOf[Anon_Args]
  }
}

