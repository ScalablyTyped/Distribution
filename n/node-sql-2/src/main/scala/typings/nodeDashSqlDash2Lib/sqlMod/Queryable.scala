package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queryable[T] extends Executable {
  def delete(): ModifyingQuery = js.native
  def select(star: Column[scala.Unit, scala.Unit]): Query[T] = js.native
  def select[U](nodesOrTables: js.Any*): Query[U] = js.native
  def select[N1 /* <: java.lang.String */, T1, N2 /* <: java.lang.String */, T2](n1: Column[N1, T1], n2: Column[N2, T2]): Query[nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.Queryable with js.Any] = js.native
  def select[N1 /* <: java.lang.String */, T1, N2 /* <: java.lang.String */, T2, N3 /* <: java.lang.String */, T3](n1: Column[N1, T1], n2: Column[N2, T2], n3: Column[N3, T3]): Query[nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.Queryable with js.Any] = js.native
  @JSName("select")
  def select_N1StringT1[N1 /* <: java.lang.String */, T1](n1: Column[N1, T1]): Query[nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.Queryable with js.Any] = js.native
  def where(nodes: js.Any*): Query[T] = js.native
}

