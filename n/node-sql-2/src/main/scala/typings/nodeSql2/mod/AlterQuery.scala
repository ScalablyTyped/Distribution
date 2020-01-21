package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterQuery[T] extends Executable {
  def addColumn(column: Column[_, _]): AlterQuery[T] = js.native
  def addColumn(name: String, options: String): AlterQuery[T] = js.native
  def dropColumn(column: String): AlterQuery[T] = js.native
  def dropColumn(column: Column[_, _]): AlterQuery[T] = js.native
  def rename(newName: String): AlterQuery[T] = js.native
  def renameColumn(column: Column[_, _], newColumn: Column[_, _]): AlterQuery[T] = js.native
  def renameColumn(column: Column[_, _], newName: String): AlterQuery[T] = js.native
  def renameColumn(name: String, newName: String): AlterQuery[T] = js.native
}

