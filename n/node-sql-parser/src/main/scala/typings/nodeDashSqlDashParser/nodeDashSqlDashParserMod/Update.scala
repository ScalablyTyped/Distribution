package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.udpate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends AST {
  var db: String | Null
  var set: js.Array[SetList]
  var table: String
  var `type`: udpate
  var where: js.Any
}

object Update {
  @scala.inline
  def apply(set: js.Array[SetList], table: String, `type`: udpate, where: js.Any, db: String = null): Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

