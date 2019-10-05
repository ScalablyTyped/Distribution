package typings.pouchdbDashCore.PouchDB.Configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonDatabaseConfiguration extends js.Object {
  /**
    * Database adapter to use.
    *
    * If unspecified, PouchDB will infer this automatically, preferring
    * IndexedDB to WebSQL in browsers that support both (i.e. Chrome,
    * Opera and Android 4.4+).
    */
  var adapter: js.UndefOr[String] = js.undefined
  /**
    * Database name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object CommonDatabaseConfiguration {
  @scala.inline
  def apply(adapter: String = null, name: String = null): CommonDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CommonDatabaseConfiguration]
  }
}

