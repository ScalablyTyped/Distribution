package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pgPromise.anon.EmptyUpdate
import typings.pgPromise.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Query Formatting Helpers
// API: http://vitaly-t.github.io/pg-promise/helpers.html
@js.native
trait IHelpers extends StObject {
  
  var Column: Instantiable1[
    /* col */ String | (IColumnConfig[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]), 
    typings.pgPromise.mod.Column[js.Object]
  ] = js.native
  
  var ColumnSet: Instantiable2[
    /* columns */ Column[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    /* options */ js.UndefOr[IColumnSetOptions], 
    typings.pgPromise.mod.ColumnSet[js.Object]
  ] = js.native
  
  var TableName: Instantiable1[/* table */ String | ITable, typings.pgPromise.mod.TableName] = js.native
  
  def concat(queries: js.Array[String | QueryFile | Options]): String = js.native
  
  def insert(data: js.Array[js.Object]): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: TableName): String = js.native
  def insert(data: js.Array[js.Object], columns: Unit, table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: Unit, table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: Unit, table: TableName): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns[Any]): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns[Any], table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns[Any], table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns[Any], table: TableName): String = js.native
  def insert(data: js.Object): String = js.native
  def insert(data: js.Object, columns: Null, table: String): String = js.native
  def insert(data: js.Object, columns: Null, table: ITable): String = js.native
  def insert(data: js.Object, columns: Null, table: TableName): String = js.native
  def insert(data: js.Object, columns: Unit, table: String): String = js.native
  def insert(data: js.Object, columns: Unit, table: ITable): String = js.native
  def insert(data: js.Object, columns: Unit, table: TableName): String = js.native
  def insert(data: js.Object, columns: QueryColumns[Any]): String = js.native
  def insert(data: js.Object, columns: QueryColumns[Any], table: String): String = js.native
  def insert(data: js.Object, columns: QueryColumns[Any], table: ITable): String = js.native
  def insert(data: js.Object, columns: QueryColumns[Any], table: TableName): String = js.native
  
  def sets(data: js.Object): String = js.native
  def sets(data: js.Object, columns: QueryColumns[Any]): String = js.native
  
  def update(data: js.Array[js.Object]): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: String): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: ITable): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: TableName): Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: TableName, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: String): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: ITable): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: TableName): Any = js.native
  def update(data: js.Array[js.Object], columns: Unit, table: TableName, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any]): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: String): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: ITable): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: TableName): Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns[Any], table: TableName, options: EmptyUpdate): Any = js.native
  def update(data: js.Object): Any = js.native
  def update(data: js.Object, columns: Null, table: String): Any = js.native
  def update(data: js.Object, columns: Null, table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Null, table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Null, table: ITable): Any = js.native
  def update(data: js.Object, columns: Null, table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Null, table: TableName): Any = js.native
  def update(data: js.Object, columns: Null, table: TableName, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Unit, table: String): Any = js.native
  def update(data: js.Object, columns: Unit, table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Unit, table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Unit, table: ITable): Any = js.native
  def update(data: js.Object, columns: Unit, table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: Unit, table: TableName): Any = js.native
  def update(data: js.Object, columns: Unit, table: TableName, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any]): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: String): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: String, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: Unit, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: ITable): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: ITable, options: EmptyUpdate): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: TableName): Any = js.native
  def update(data: js.Object, columns: QueryColumns[Any], table: TableName, options: EmptyUpdate): Any = js.native
  
  def values(data: js.Array[js.Object]): String = js.native
  def values(data: js.Array[js.Object], columns: QueryColumns[Any]): String = js.native
  def values(data: js.Object): String = js.native
  def values(data: js.Object, columns: QueryColumns[Any]): String = js.native
}
