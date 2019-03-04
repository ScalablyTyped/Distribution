package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var as: java.lang.String | scala.Null
  var db: java.lang.String | scala.Null
  var table: java.lang.String
}

object From {
  @scala.inline
  def apply(table: java.lang.String, as: java.lang.String = null, db: java.lang.String = null): From = {
    val __obj = js.Dynamic.literal(table = table)
    if (as != null) __obj.updateDynamic("as")(as)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[From]
  }
}

