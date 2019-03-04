package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
trait DatabaseUpdatesResultItem extends js.Object {
  // Database name.
  var db_name: java.lang.String
  // Update sequence of the event.
  var seq: js.Any
  // A database event is one of created, updated, deleted.
  var `type`: java.lang.String
}

object DatabaseUpdatesResultItem {
  @scala.inline
  def apply(db_name: java.lang.String, seq: js.Any, `type`: java.lang.String): DatabaseUpdatesResultItem = {
    val __obj = js.Dynamic.literal(db_name = db_name, seq = seq)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DatabaseUpdatesResultItem]
  }
}

