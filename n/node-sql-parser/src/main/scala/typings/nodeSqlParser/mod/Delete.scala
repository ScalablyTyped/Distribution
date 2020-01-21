package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends AST {
  var from: js.Array[From | Dual]
  var table: js.Any
  var `type`: delete
  var where: js.Any
}

object Delete {
  @scala.inline
  def apply(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

