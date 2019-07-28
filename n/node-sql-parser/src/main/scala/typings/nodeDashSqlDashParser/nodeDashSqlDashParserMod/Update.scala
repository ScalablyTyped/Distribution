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
    val __obj = js.Dynamic.literal(set = set, table = table, where = where)
    __obj.updateDynamic("type")(`type`)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[Update]
  }
}

