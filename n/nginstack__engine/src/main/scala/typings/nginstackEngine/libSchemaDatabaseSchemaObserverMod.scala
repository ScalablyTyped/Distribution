package typings.nginstackEngine

import typings.nginstackEngine.libSchemaDatabaseSchemaMod.ColumnDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchemaDatabaseSchemaObserverMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/schema/DatabaseSchemaObserver", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DatabaseSchemaObserver
  @JSImport("@nginstack/engine/lib/schema/DatabaseSchemaObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AddTableColumnsEvent extends StObject {
    
    var columns: js.Array[ColumnDef]
    
    var database: typings.nginstackEngine.libDatabaseDatabaseMod.^
    
    var tableName: String
  }
  object AddTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[ColumnDef],
      database: typings.nginstackEngine.libDatabaseDatabaseMod.^,
      tableName: String
    ): AddTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTableColumnsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddTableColumnsEvent] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[ColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.libDatabaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlterTableColumnsEvent extends StObject {
    
    var columns: js.Array[ColumnDef]
    
    var database: typings.nginstackEngine.libDatabaseDatabaseMod.^
    
    var tableName: String
  }
  object AlterTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[ColumnDef],
      database: typings.nginstackEngine.libDatabaseDatabaseMod.^,
      tableName: String
    ): AlterTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlterTableColumnsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlterTableColumnsEvent] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[ColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.libDatabaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatabaseSchemaObserver extends StObject
  
  trait DropTableColumnsEvent extends StObject {
    
    var columns: js.Array[String]
    
    var database: typings.nginstackEngine.libDatabaseDatabaseMod.^
    
    var tableName: String
  }
  object DropTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[String],
      database: typings.nginstackEngine.libDatabaseDatabaseMod.^,
      tableName: String
    ): DropTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropTableColumnsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropTableColumnsEvent] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.libDatabaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
}
