package typings.pgPromise.mod

import typings.pgPromise.AnonC
import typings.pgPromise.AnonPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.ColumnSet.html
@JSImport("pg-promise", "ColumnSet")
@js.native
class ColumnSet protected () extends _QueryColumns {
  def this(columns: js.Array[String | IColumnConfig | Column]) = this()
  def this(columns: js.Object) = this()
  def this(columns: Column) = this()
  def this(columns: js.Array[String | IColumnConfig | Column], options: IColumnSetOptions) = this()
  def this(columns: js.Object, options: IColumnSetOptions) = this()
  def this(columns: Column, options: IColumnSetOptions) = this()
  val columns: js.Array[Column] = js.native
  val names: String = js.native
  val table: TableName = js.native
  val variables: String = js.native
  def assign(): String = js.native
  def assign(source: AnonPrefix): String = js.native
  def assignColumns(): String = js.native
  def assignColumns(options: AnonC): String = js.native
  def extend(columns: js.Array[String | IColumnConfig | Column]): ColumnSet = js.native
  def extend(columns: Column): ColumnSet = js.native
  def extend(columns: ColumnSet): ColumnSet = js.native
  def merge(columns: js.Array[String | IColumnConfig | Column]): ColumnSet = js.native
  def merge(columns: Column): ColumnSet = js.native
  def merge(columns: ColumnSet): ColumnSet = js.native
  def prepare(obj: js.Object): js.Object = js.native
  def toString(level: Double): String = js.native
}

