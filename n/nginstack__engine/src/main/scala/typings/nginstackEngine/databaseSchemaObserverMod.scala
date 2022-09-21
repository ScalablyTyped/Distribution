package typings.nginstackEngine

import typings.nginstackEngine.databaseSchemaMod.ColumnDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseSchemaObserverMod {
  
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
    
    var database: typings.nginstackEngine.databaseDatabaseMod.^
    
    var tableName: String
  }
  object AddTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[ColumnDef],
      database: typings.nginstackEngine.databaseDatabaseMod.^,
      tableName: String
    ): AddTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTableColumnsEvent]
    }
    
    extension [Self <: AddTableColumnsEvent](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.databaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlterTableColumnsEvent extends StObject {
    
    var columns: js.Array[ColumnDef]
    
    var database: typings.nginstackEngine.databaseDatabaseMod.^
    
    var tableName: String
  }
  object AlterTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[ColumnDef],
      database: typings.nginstackEngine.databaseDatabaseMod.^,
      tableName: String
    ): AlterTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlterTableColumnsEvent]
    }
    
    extension [Self <: AlterTableColumnsEvent](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.databaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatabaseSchemaObserver extends StObject
  
  trait DropTableColumnsEvent extends StObject {
    
    var columns: js.Array[String]
    
    var database: typings.nginstackEngine.databaseDatabaseMod.^
    
    var tableName: String
  }
  object DropTableColumnsEvent {
    
    inline def apply(
      columns: js.Array[String],
      database: typings.nginstackEngine.databaseDatabaseMod.^,
      tableName: String
    ): DropTableColumnsEvent = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropTableColumnsEvent]
    }
    
    extension [Self <: DropTableColumnsEvent](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDatabase(value: typings.nginstackEngine.databaseDatabaseMod.^): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
}
