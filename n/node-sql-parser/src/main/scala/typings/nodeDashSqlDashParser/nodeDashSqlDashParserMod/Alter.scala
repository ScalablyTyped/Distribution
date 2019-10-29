package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.alter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alter extends AST {
  var expr: js.Any
  var table: From
  var `type`: alter
}

object Alter {
  @scala.inline
  def apply(expr: js.Any, table: From, `type`: alter): Alter = {
    val __obj = js.Dynamic.literal(expr = expr, table = table)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Alter]
  }
}

