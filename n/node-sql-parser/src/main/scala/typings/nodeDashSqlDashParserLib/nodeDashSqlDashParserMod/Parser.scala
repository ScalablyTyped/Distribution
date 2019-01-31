package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sql-parser", "Parser")
@js.native
class Parser () extends js.Object {
  def astify(sql: java.lang.String): js.Array[AST] | AST = js.native
  def columnList(sql: java.lang.String): js.Array[java.lang.String] = js.native
  def parse(sql: java.lang.String): TableColumnAst = js.native
  def sqlify(ast: js.Array[AST]): java.lang.String = js.native
  def sqlify(ast: AST): java.lang.String = js.native
  def tableList(sql: java.lang.String): js.Array[java.lang.String] = js.native
  def whiteListCheck(sql: java.lang.String, whiteList: js.Array[java.lang.String]): js.UndefOr[stdLib.Error] = js.native
  def whiteListCheck(sql: java.lang.String, whiteList: js.Array[java.lang.String], `type`: WhilteListCheckMode): js.UndefOr[stdLib.Error] = js.native
}

