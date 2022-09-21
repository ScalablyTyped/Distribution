package typings.pgPromise.mod

import typings.pgPromise.anon.From
import typings.pgPromise.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.ColumnSet.html
@JSImport("pg-promise", "ColumnSet")
@js.native
open class ColumnSet[T] protected ()
  extends StObject
     with _QueryColumns[T] {
  def this(columns: js.Array[String | IColumnConfig[T] | Column[T]]) = this()
  def this(columns: js.Object) = this()
  def this(columns: Column[T]) = this()
  def this(columns: js.Array[String | IColumnConfig[T] | Column[T]], options: IColumnSetOptions) = this()
  def this(columns: js.Object, options: IColumnSetOptions) = this()
  def this(columns: Column[T], options: IColumnSetOptions) = this()
  
  def assign(): String = js.native
  def assign(source: Prefix): String = js.native
  
  def assignColumns(): String = js.native
  def assignColumns(options: From[T]): String = js.native
  
  val columns: js.Array[Column[T]] = js.native
  
  def extend[S](columns: js.Array[String | IColumnConfig[T] | Column[T]]): ColumnSet[S] = js.native
  def extend[S](columns: Column[T]): ColumnSet[S] = js.native
  def extend[S](columns: ColumnSet[T]): ColumnSet[S] = js.native
  
  def merge[S](columns: js.Array[String | IColumnConfig[T] | Column[T]]): ColumnSet[S] = js.native
  def merge[S](columns: Column[T]): ColumnSet[S] = js.native
  def merge[S](columns: ColumnSet[T]): ColumnSet[S] = js.native
  
  val names: String = js.native
  
  def prepare(obj: js.Object): js.Object = js.native
  
  val table: TableName = js.native
  
  def toString(level: Double): String = js.native
  
  val variables: String = js.native
}
