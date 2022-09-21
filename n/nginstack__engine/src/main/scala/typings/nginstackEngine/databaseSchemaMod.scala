package typings.nginstackEngine

import typings.nginstackEngine.anon.DryRun
import typings.nginstackEngine.anon.DryRunBoolean
import typings.nginstackEngine.anon.DryRunIndexTablespace
import typings.nginstackEngine.anon.IndexTablespace
import typings.nginstackEngine.anon.Online
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseSchemaMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(database: Database): Unit = ^.asInstanceOf[js.Dynamic].apply(database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/schema/DatabaseSchema", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DatabaseSchema {
    def this(database: Database) = this()
  }
  @JSImport("@nginstack/engine/lib/schema/DatabaseSchema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deregisterObserver(observer: typings.nginstackEngine.databaseSchemaObserverMod.^): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterObserver")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerObserver(observer: typings.nginstackEngine.databaseSchemaObserverMod.^): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerObserver")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ColumnDef extends StObject {
    
    var charLength: js.UndefOr[Double] = js.undefined
    
    var dataType: String
    
    var identity: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    var numericPrecision: js.UndefOr[Double] = js.undefined
    
    var numericScale: js.UndefOr[Double] = js.undefined
    
    var sparse: js.UndefOr[Boolean] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnDef {
    
    inline def apply(dataType: String, name: String): ColumnDef = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDef]
    }
    
    extension [Self <: ColumnDef](x: Self) {
      
      inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
      
      inline def setCharLengthUndefined: Self = StObject.set(x, "charLength", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setNumericPrecision(value: Double): Self = StObject.set(x, "numericPrecision", value.asInstanceOf[js.Any])
      
      inline def setNumericPrecisionUndefined: Self = StObject.set(x, "numericPrecision", js.undefined)
      
      inline def setNumericScale(value: Double): Self = StObject.set(x, "numericScale", value.asInstanceOf[js.Any])
      
      inline def setNumericScaleUndefined: Self = StObject.set(x, "numericScale", js.undefined)
      
      inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait ColumnInfo extends StObject {
    
    var charLength: Double | Null
    
    var dataType: String | Null
    
    var name: String
    
    var nativeDataType: String
    
    var nullable: Boolean
    
    var numericPrecision: Double | Null
    
    var numericScale: Double | Null
    
    var sparse: Boolean
    
    var unique: Boolean
  }
  object ColumnInfo {
    
    inline def apply(name: String, nativeDataType: String, nullable: Boolean, sparse: Boolean, unique: Boolean): ColumnInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nativeDataType = nativeDataType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], charLength = null, dataType = null, numericPrecision = null, numericScale = null)
      __obj.asInstanceOf[ColumnInfo]
    }
    
    extension [Self <: ColumnInfo](x: Self) {
      
      inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
      
      inline def setCharLengthNull: Self = StObject.set(x, "charLength", null)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNativeDataType(value: String): Self = StObject.set(x, "nativeDataType", value.asInstanceOf[js.Any])
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNumericPrecision(value: Double): Self = StObject.set(x, "numericPrecision", value.asInstanceOf[js.Any])
      
      inline def setNumericPrecisionNull: Self = StObject.set(x, "numericPrecision", null)
      
      inline def setNumericScale(value: Double): Self = StObject.set(x, "numericScale", value.asInstanceOf[js.Any])
      
      inline def setNumericScaleNull: Self = StObject.set(x, "numericScale", null)
      
      inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    }
  }
  
  type Database = typings.nginstackEngine.databaseDatabaseMod.^
  
  @js.native
  trait DatabaseSchema extends StObject {
    
    def addTableColumns(tableName: String, columns: js.Array[ColumnDef]): String = js.native
    def addTableColumns(tableName: String, columns: js.Array[ColumnDef], options: DryRunBoolean): String = js.native
    
    def alterTable(tableName: String, options: IndexTablespace): String = js.native
    
    def alterTableColumns(tableName: String, columns: js.Array[ColumnDef]): String = js.native
    def alterTableColumns(tableName: String, columns: js.Array[ColumnDef], options: DryRunIndexTablespace): String = js.native
    
    /* private */ var checkIdentifierNames_ : Any = js.native
    
    def createTable(tableName: String, columns: js.Array[ColumnDef]): String = js.native
    def createTable(tableName: String, columns: js.Array[ColumnDef], options: DryRun): String = js.native
    
    def createTableIndex(tableName: String, indexDef: IndexDef): String = js.native
    def createTableIndex(tableName: String, indexDef: IndexDef, options: Online): String = js.native
    
    var database: Database = js.native
    
    /* private */ var databaseName_ : Any = js.native
    
    /* private */ var database_ : Any = js.native
    
    /* private */ var dbType_ : Any = js.native
    
    def dropTable(tableName: String): String = js.native
    def dropTable(tableName: String, options: DryRunBoolean): String = js.native
    
    def dropTableColumns(tableName: String, columns: js.Array[String]): String = js.native
    def dropTableColumns(tableName: String, columns: js.Array[String], options: DryRunBoolean): String = js.native
    
    def dropTableIndex(tableName: String, indexName: String): String = js.native
    def dropTableIndex(tableName: String, indexName: String, options: Online): String = js.native
    
    def dropView(viewName: String): String = js.native
    def dropView(viewName: String, options: DryRunBoolean): String = js.native
    
    /* private */ var executeDDL_ : Any = js.native
    
    /* private */ var findPrimaryKeyConstraint_ : Any = js.native
    
    /* private */ var findUniqueConstraint_ : Any = js.native
    
    /* private */ var formatColumnDataTypeDef_ : Any = js.native
    
    /* private */ var formatColumnDef_ : Any = js.native
    
    /* private */ var formatOptionalFilter_ : Any = js.native
    
    /* private */ var formatTableNamesFilter_ : Any = js.native
    
    def getAllTablesAndViewsColumns(): Record[String, js.Array[ColumnInfo]] = js.native
    
    def getAllTablesIndexes(): Record[String, js.Array[IndexInfo]] = js.native
    
    /* private */ var getColumns_ : Any = js.native
    
    /* private */ var getCurrentDatabaseName_ : Any = js.native
    
    def getTableColumns(tableName: String): js.Array[ColumnInfo] = js.native
    
    def getTableIndexes(tableName: String): js.Array[IndexInfo] = js.native
    
    /* private */ var getTableIndexes_ : Any = js.native
    
    def getTableTriggers(tableName: String): js.Array[TriggerInfo] = js.native
    
    def getTables(): js.Array[TableInfo] = js.native
    def getTables(tableNames: js.Array[String]): js.Array[TableInfo] = js.native
    
    def getViewColumns(viewName: Any): js.Array[ColumnInfo] = js.native
    
    def getViews(): js.Array[ViewInfo] = js.native
    def getViews(viewNames: js.Array[String]): js.Array[ViewInfo] = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var nativeTypeToDataType_ : Any = js.native
    
    /* private */ var normalizeColumnDefs_ : Any = js.native
    
    /* private */ var notifyObservers_ : Any = js.native
    
    def renameTableColumn(tableName: String, columnName: String, newColumnName: String): String = js.native
    def renameTableColumn(tableName: String, columnName: String, newColumnName: String, options: DryRunBoolean): String = js.native
    
    def renameTableIndex(tableName: String, indexName: String, newIndexName: String): String = js.native
    def renameTableIndex(tableName: String, indexName: String, newIndexName: String, options: DryRunBoolean): String = js.native
    
    /* private */ var supportsExecuteDDL_ : Any = js.native
    
    def supportsOnlineIndexCreation(): Boolean = js.native
    
    def supportsOnlineIndexDrop(): Boolean = js.native
    
    /* private */ var timestampRegExp_ : Any = js.native
    
    /* private */ var timestampZoneRegExp_ : Any = js.native
    
    /* private */ var updateSchemaVersion_ : Any = js.native
  }
  
  trait IndexDef extends StObject {
    
    var columns: js.Array[String]
    
    var columnsOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var compressed: js.UndefOr[Boolean] = js.undefined
    
    var filterPredicate: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var tablespace: js.UndefOr[String] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object IndexDef {
    
    inline def apply(columns: js.Array[String], name: String): IndexDef = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexDef]
    }
    
    extension [Self <: IndexDef](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrder(value: js.Array[String]): Self = StObject.set(x, "columnsOrder", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrderUndefined: Self = StObject.set(x, "columnsOrder", js.undefined)
      
      inline def setColumnsOrderVarargs(value: String*): Self = StObject.set(x, "columnsOrder", js.Array(value*))
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setFilterPredicate(value: String): Self = StObject.set(x, "filterPredicate", value.asInstanceOf[js.Any])
      
      inline def setFilterPredicateUndefined: Self = StObject.set(x, "filterPredicate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      inline def setTablespaceUndefined: Self = StObject.set(x, "tablespace", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait IndexInfo extends StObject {
    
    var columns: js.Array[String]
    
    var columnsOrder: js.Array[String]
    
    var compressed: Boolean
    
    var constraintType: String
    
    var filterPredicate: String
    
    var name: String
    
    var tablespace: String
    
    var unique: Boolean
    
    var valid: Boolean
  }
  object IndexInfo {
    
    inline def apply(
      columns: js.Array[String],
      columnsOrder: js.Array[String],
      compressed: Boolean,
      constraintType: String,
      filterPredicate: String,
      name: String,
      tablespace: String,
      unique: Boolean,
      valid: Boolean
    ): IndexInfo = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], columnsOrder = columnsOrder.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], constraintType = constraintType.asInstanceOf[js.Any], filterPredicate = filterPredicate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablespace = tablespace.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexInfo]
    }
    
    extension [Self <: IndexInfo](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrder(value: js.Array[String]): Self = StObject.set(x, "columnsOrder", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrderVarargs(value: String*): Self = StObject.set(x, "columnsOrder", js.Array(value*))
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setConstraintType(value: String): Self = StObject.set(x, "constraintType", value.asInstanceOf[js.Any])
      
      inline def setFilterPredicate(value: String): Self = StObject.set(x, "filterPredicate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableInfo extends StObject {
    
    var name: String
    
    var primaryKey: js.Array[String]
    
    var tablespace: String
  }
  object TableInfo {
    
    inline def apply(name: String, primaryKey: js.Array[String], tablespace: String): TableInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tablespace = tablespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableInfo]
    }
    
    extension [Self <: TableInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKey(value: js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait TriggerInfo extends StObject {
    
    var actionCondition: String
    
    var actionOrientation: String
    
    var actionStatement: String
    
    var actionTiming: String
    
    var enabled: Boolean
    
    var eventManipulation: js.Array[String]
    
    var name: String
  }
  object TriggerInfo {
    
    inline def apply(
      actionCondition: String,
      actionOrientation: String,
      actionStatement: String,
      actionTiming: String,
      enabled: Boolean,
      eventManipulation: js.Array[String],
      name: String
    ): TriggerInfo = {
      val __obj = js.Dynamic.literal(actionCondition = actionCondition.asInstanceOf[js.Any], actionOrientation = actionOrientation.asInstanceOf[js.Any], actionStatement = actionStatement.asInstanceOf[js.Any], actionTiming = actionTiming.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManipulation = eventManipulation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerInfo]
    }
    
    extension [Self <: TriggerInfo](x: Self) {
      
      inline def setActionCondition(value: String): Self = StObject.set(x, "actionCondition", value.asInstanceOf[js.Any])
      
      inline def setActionOrientation(value: String): Self = StObject.set(x, "actionOrientation", value.asInstanceOf[js.Any])
      
      inline def setActionStatement(value: String): Self = StObject.set(x, "actionStatement", value.asInstanceOf[js.Any])
      
      inline def setActionTiming(value: String): Self = StObject.set(x, "actionTiming", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEventManipulation(value: js.Array[String]): Self = StObject.set(x, "eventManipulation", value.asInstanceOf[js.Any])
      
      inline def setEventManipulationVarargs(value: String*): Self = StObject.set(x, "eventManipulation", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewInfo extends StObject {
    
    var definition: String
    
    var name: String
  }
  object ViewInfo {
    
    inline def apply(definition: String, name: String): ViewInfo = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewInfo]
    }
    
    extension [Self <: ViewInfo](x: Self) {
      
      inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
