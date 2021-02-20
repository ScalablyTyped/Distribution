package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pgPromise.anon.EmptyUpdate
import typings.pgPromise.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Query Formatting Helpers
// API: http://vitaly-t.github.io/pg-promise/helpers.html
@js.native
trait IHelpers extends StObject {
  
  var Column: Instantiable1[
    /* col */ String | (IColumnConfig[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any]), 
    typings.pgPromise.mod.Column[js.Object]
  ] = js.native
  
  var ColumnSet: Instantiable2[
    /* columns */ Column[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
    /* options */ js.UndefOr[IColumnSetOptions], 
    typings.pgPromise.mod.ColumnSet[js.Object]
  ] = js.native
  
  var TableName: Instantiable1[/* table */ String | ITable, typings.pgPromise.mod.TableName] = js.native
  
  def concat(queries: js.Array[String | QueryFile | Options]): String = js.native
  
  def insert(data: js.Array[js.Object]): String = js.native
  def insert(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: TableName): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: Null, table: TableName): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns): String = js.native
  def insert(data: js.Object): String = js.native
  def insert(data: js.Object, columns: js.UndefOr[QueryColumns], table: String): String = js.native
  def insert(data: js.Object, columns: js.UndefOr[QueryColumns], table: ITable): String = js.native
  def insert(data: js.Object, columns: js.UndefOr[QueryColumns], table: TableName): String = js.native
  def insert(data: js.Object, columns: Null, table: String): String = js.native
  def insert(data: js.Object, columns: Null, table: ITable): String = js.native
  def insert(data: js.Object, columns: Null, table: TableName): String = js.native
  def insert(data: js.Object, columns: QueryColumns): String = js.native
  
  def sets(data: js.Object): String = js.native
  def sets(data: js.Object, columns: QueryColumns): String = js.native
  
  def update(data: js.Array[js.Object]): js.Any = js.native
  def update(
    data: js.Array[js.Object],
    columns: js.UndefOr[QueryColumns],
    table: js.UndefOr[scala.Nothing],
    options: EmptyUpdate
  ): js.Any = js.native
  def update(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: String): js.Any = js.native
  def update(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: String, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: ITable): js.Any = js.native
  def update(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: ITable, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: js.UndefOr[QueryColumns], table: TableName): js.Any = js.native
  def update(
    data: js.Array[js.Object],
    columns: js.UndefOr[QueryColumns],
    table: TableName,
    options: EmptyUpdate
  ): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: js.UndefOr[scala.Nothing], options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: String): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: String, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: ITable): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: ITable, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: TableName): js.Any = js.native
  def update(data: js.Array[js.Object], columns: Null, table: TableName, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns): js.Any = js.native
  def update(data: js.Object): js.Any = js.native
  def update(
    data: js.Object,
    columns: js.UndefOr[QueryColumns],
    table: js.UndefOr[scala.Nothing],
    options: EmptyUpdate
  ): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: String): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: String, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: ITable): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: ITable, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: TableName): js.Any = js.native
  def update(data: js.Object, columns: js.UndefOr[QueryColumns], table: TableName, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: Null, table: js.UndefOr[scala.Nothing], options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: Null, table: String): js.Any = js.native
  def update(data: js.Object, columns: Null, table: String, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: Null, table: ITable): js.Any = js.native
  def update(data: js.Object, columns: Null, table: ITable, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: Null, table: TableName): js.Any = js.native
  def update(data: js.Object, columns: Null, table: TableName, options: EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns): js.Any = js.native
  
  def values(data: js.Array[js.Object]): String = js.native
  def values(data: js.Array[js.Object], columns: QueryColumns): String = js.native
  def values(data: js.Object): String = js.native
  def values(data: js.Object, columns: QueryColumns): String = js.native
}
