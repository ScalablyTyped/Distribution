package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterQuery[T] extends Executable {
  def addColumn(column: Column[_, _]): AlterQuery[T] = js.native
  def addColumn(name: java.lang.String, options: java.lang.String): AlterQuery[T] = js.native
  def dropColumn(column: java.lang.String): AlterQuery[T] = js.native
  def dropColumn(column: Column[_, _]): AlterQuery[T] = js.native
  def rename(newName: java.lang.String): AlterQuery[T] = js.native
  def renameColumn(column: Column[_, _], newColumn: Column[_, _]): AlterQuery[T] = js.native
  def renameColumn(column: Column[_, _], newName: java.lang.String): AlterQuery[T] = js.native
  def renameColumn(name: java.lang.String, newName: java.lang.String): AlterQuery[T] = js.native
}

