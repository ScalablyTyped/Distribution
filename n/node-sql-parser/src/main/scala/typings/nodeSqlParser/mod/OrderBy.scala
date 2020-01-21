package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.ASC
import typings.nodeSqlParser.nodeSqlParserStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBy extends js.Object {
  var expr: js.Any
  var `type`: ASC | DESC
}

object OrderBy {
  @scala.inline
  def apply(expr: js.Any, `type`: ASC | DESC): OrderBy = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy]
  }
}

