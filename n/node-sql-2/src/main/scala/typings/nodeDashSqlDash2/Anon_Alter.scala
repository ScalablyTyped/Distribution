package typings.nodeDashSqlDash2

import typings.nodeDashSqlDash2.sqlMod.AlterQuery
import typings.nodeDashSqlDash2.sqlMod.Column
import typings.nodeDashSqlDash2.sqlMod.CreateQuery
import typings.nodeDashSqlDash2.sqlMod.DropQuery
import typings.nodeDashSqlDash2.sqlMod.IndexQuery
import typings.nodeDashSqlDash2.sqlMod.ModifyingQuery
import typings.nodeDashSqlDash2.sqlMod.Query
import typings.nodeDashSqlDash2.sqlMod.SQL
import typings.nodeDashSqlDash2.sqlMod.SubQuery
import typings.nodeDashSqlDash2.sqlMod.TableNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alter[T] extends js.Object {
  var columns: js.Array[Column[Unit, Unit]] = js.native
  var sql: SQL = js.native
  def alter(): AlterQuery[T] = js.native
  def as[OtherName /* <: String */](name: OtherName): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias node-sql-2.sql.Table<OtherName, T> */ js.Object = js.native
  def create(): CreateQuery = js.native
  def drop(): DropQuery = js.native
  def from[U](statement: String): Query[U] = js.native
  def from[U](table: TableNode): Query[U] = js.native
  def getName(): String = js.native
  def getSchema(): String = js.native
  def indexes(): IndexQuery = js.native
  def insert(row: T): ModifyingQuery = js.native
  def insert(rows: js.Array[T]): ModifyingQuery = js.native
  def literal(statement: String): js.Any = js.native
  def select(): Query[T] = js.native
  def select[U](nodes: js.Any*): Query[U] = js.native
  def star(): Column[Unit, Unit] = js.native
  def subQuery[U](): SubQuery[U] = js.native
  def update(o: Partial[T]): ModifyingQuery = js.native
}

