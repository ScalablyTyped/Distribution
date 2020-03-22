package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatabase extends js.Object {
  var database: js.UndefOr[java.lang.String] = js.undefined
  var functions: js.UndefOr[java.lang.String] = js.undefined
  var storage: js.UndefOr[java.lang.String] = js.undefined
}

object AnonDatabase {
  @scala.inline
  def apply(
    database: java.lang.String = null,
    functions: java.lang.String = null,
    storage: java.lang.String = null
  ): AnonDatabase = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatabase]
  }
}

