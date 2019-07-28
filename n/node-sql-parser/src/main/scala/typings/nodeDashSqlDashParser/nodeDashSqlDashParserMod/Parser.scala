package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sql-parser", "Parser")
@js.native
class Parser () extends js.Object {
  def astify(sql: String): js.Array[AST] | AST = js.native
  def columnList(sql: String): js.Array[String] = js.native
  def parse(sql: String): TableColumnAst = js.native
  def sqlify(ast: js.Array[AST]): String = js.native
  def sqlify(ast: AST): String = js.native
  def tableList(sql: String): js.Array[String] = js.native
  def whiteListCheck(sql: String, whiteList: js.Array[String]): js.UndefOr[Error] = js.native
  def whiteListCheck(sql: String, whiteList: js.Array[String], `type`: WhilteListCheckMode): js.UndefOr[Error] = js.native
}

