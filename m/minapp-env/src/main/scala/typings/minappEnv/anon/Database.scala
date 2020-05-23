package typings.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var functions: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[String] = js.undefined
}

object Database {
  @scala.inline
  def apply(database: String = null, functions: String = null, storage: String = null): Database = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
}

