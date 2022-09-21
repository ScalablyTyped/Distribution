package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-sql-parser/types", "Parser")
@js.native
open class Parser () extends StObject {
  
  def astify(sql: String): js.Array[AST] | AST = js.native
  def astify(sql: String, opt: Option): js.Array[AST] | AST = js.native
  
  def columnList(sql: String): js.Array[String] = js.native
  def columnList(sql: String, opt: Option): js.Array[String] = js.native
  
  def parse(sql: String): TableColumnAst = js.native
  def parse(sql: String, opt: Option): TableColumnAst = js.native
  
  def sqlify(ast: js.Array[AST]): String = js.native
  def sqlify(ast: js.Array[AST], opt: Option): String = js.native
  def sqlify(ast: AST): String = js.native
  def sqlify(ast: AST, opt: Option): String = js.native
  
  def tableList(sql: String): js.Array[String] = js.native
  def tableList(sql: String, opt: Option): js.Array[String] = js.native
  
  def whiteListCheck(sql: String, whiteList: js.Array[String]): js.UndefOr[js.Error] = js.native
  def whiteListCheck(sql: String, whiteList: js.Array[String], opt: Option): js.UndefOr[js.Error] = js.native
}
