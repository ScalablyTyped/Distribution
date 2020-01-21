package typings.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var as: String | Null
  var db: String | Null
  var table: String
}

object From {
  @scala.inline
  def apply(table: String, as: String = null, db: String = null): From = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

