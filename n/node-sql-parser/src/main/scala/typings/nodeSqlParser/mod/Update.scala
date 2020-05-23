package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends AST {
  var db: String | Null
  var set: js.Array[SetList]
  var table: (js.Array[From | Dual]) | Null
  var `type`: update
  var where: js.Any
}

object Update {
  @scala.inline
  def apply(
    set: js.Array[SetList],
    `type`: update,
    where: js.Any,
    db: String = null,
    table: js.Array[From | Dual] = null
  ): Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

