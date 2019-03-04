package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends AST {
  var db: java.lang.String | scala.Null
  var set: js.Array[SetList]
  var table: java.lang.String
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.udpate
  var where: js.Any
}

object Update {
  @scala.inline
  def apply(
    set: js.Array[SetList],
    table: java.lang.String,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.udpate,
    where: js.Any,
    db: java.lang.String = null
  ): Update = {
    val __obj = js.Dynamic.literal(set = set, table = table, where = where)
    __obj.updateDynamic("type")(`type`)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[Update]
  }
}

