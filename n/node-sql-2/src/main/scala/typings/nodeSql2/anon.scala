package typings.nodeSql2

import typings.nodeSql2.mod.AlterQuery
import typings.nodeSql2.mod.CreateQuery
import typings.nodeSql2.mod.DropQuery
import typings.nodeSql2.mod.IndexQuery
import typings.nodeSql2.mod.ModifyingQuery
import typings.nodeSql2.mod.Query
import typings.nodeSql2.mod.SQL
import typings.nodeSql2.mod.SubQuery
import typings.nodeSql2.mod.TableNode
import typings.nodeSql2.nodeSql2Strings.`no action`
import typings.nodeSql2.nodeSql2Strings.`set default`
import typings.nodeSql2.nodeSql2Strings.`set null`
import typings.nodeSql2.nodeSql2Strings.cascade
import typings.nodeSql2.nodeSql2Strings.restrict
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alter[T] extends StObject {
    
    def alter(): AlterQuery[T] = js.native
    
    def as[OtherName /* <: String */](name: OtherName): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-sql-2.sql.Table<OtherName, T> */ js.Object = js.native
    
    var columns: js.Array[typings.nodeSql2.mod.Column[Unit, Unit]] = js.native
    
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
    
    var sql: SQL = js.native
    
    def star(): typings.nodeSql2.mod.Column[Unit, Unit] = js.native
    
    def subQuery[U](): SubQuery[U] = js.native
    
    def update(o: Partial[T]): ModifyingQuery = js.native
  }
  
  @js.native
  trait Column extends StObject {
    
    var column: String = js.native
    
    var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
    
    var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
    
    var table: String = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: String, table: String): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDelete(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Columns[Row] extends StObject {
    
    var columns: js.Array[/* keyof Row */ String] = js.native
    
    var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
    
    var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
    
    var refColumns: js.Array[String] = js.native
    
    var table: String = js.native
  }
  object Columns {
    
    @scala.inline
    def apply[Row](columns: js.Array[/* keyof Row */ String], refColumns: js.Array[String], table: String): Columns[Row] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], refColumns = refColumns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns[Row]]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns[_], Row] (val x: Self with Columns[Row]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[/* keyof Row */ String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (/* keyof Row */ String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setOnDelete(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRefColumns(value: js.Array[String]): Self = StObject.set(x, "refColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefColumnsVarargs(value: String*): Self = StObject.set(x, "refColumns", js.Array(value :_*))
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LOWER extends StObject {
    
    def LOWER[Name](c: typings.nodeSql2.mod.Column[Name, String]): typings.nodeSql2.mod.Column[Name, String] = js.native
  }
  object LOWER {
    
    @scala.inline
    def apply(LOWER: typings.nodeSql2.mod.Column[js.Any, String] => typings.nodeSql2.mod.Column[js.Any, String]): LOWER = {
      val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
      __obj.asInstanceOf[LOWER]
    }
    
    @scala.inline
    implicit class LOWERMutableBuilder[Self <: LOWER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOWER(value: typings.nodeSql2.mod.Column[js.Any, String] => typings.nodeSql2.mod.Column[js.Any, String]): Self = StObject.set(x, "LOWER", js.Any.fromFunction1(value))
    }
  }
}
