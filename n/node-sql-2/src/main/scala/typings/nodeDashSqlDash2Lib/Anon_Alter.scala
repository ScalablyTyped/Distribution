package typings
package nodeDashSqlDash2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alter[T] extends js.Object {
  var columns: js.Array[nodeDashSqlDash2Lib.sqlMod.Column[scala.Unit, scala.Unit]] = js.native
  var sql: nodeDashSqlDash2Lib.sqlMod.SQL = js.native
  def alter(): nodeDashSqlDash2Lib.sqlMod.AlterQuery[T] = js.native
  def as[OtherName /* <: java.lang.String */](name: OtherName): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias node-sql-2.sql.Table<OtherName, T> */ js.Object = js.native
  def create(): nodeDashSqlDash2Lib.sqlMod.CreateQuery = js.native
  def drop(): nodeDashSqlDash2Lib.sqlMod.DropQuery = js.native
  def from[U](statement: java.lang.String): nodeDashSqlDash2Lib.sqlMod.Query[U] = js.native
  def from[U](table: nodeDashSqlDash2Lib.sqlMod.TableNode): nodeDashSqlDash2Lib.sqlMod.Query[U] = js.native
  def getName(): java.lang.String = js.native
  def getSchema(): java.lang.String = js.native
  def indexes(): nodeDashSqlDash2Lib.sqlMod.IndexQuery = js.native
  def insert(row: T): nodeDashSqlDash2Lib.sqlMod.ModifyingQuery = js.native
  def insert(rows: js.Array[T]): nodeDashSqlDash2Lib.sqlMod.ModifyingQuery = js.native
  def literal(statement: java.lang.String): js.Any = js.native
  def select(): nodeDashSqlDash2Lib.sqlMod.Query[T] = js.native
  def select[U](nodes: js.Any*): nodeDashSqlDash2Lib.sqlMod.Query[U] = js.native
  def star(): nodeDashSqlDash2Lib.sqlMod.Column[scala.Unit, scala.Unit] = js.native
  def subQuery[U](): nodeDashSqlDash2Lib.sqlMod.SubQuery[U] = js.native
  def update(o: stdLib.Partial[T]): nodeDashSqlDash2Lib.sqlMod.ModifyingQuery = js.native
}

