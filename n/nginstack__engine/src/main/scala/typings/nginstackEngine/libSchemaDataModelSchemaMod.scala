package typings.nginstackEngine

import typings.nginstackEngine.anon.ALWAYS
import typings.nginstackEngine.anon.PartialDataModelSchemaOpt
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchemaDataModelSchemaMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: PartialDataModelSchemaOpt): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(options: DataModelSchemaOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/schema/DataModelSchema", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataModelSchema {
    def this(options: PartialDataModelSchemaOpt) = this()
    def this(options: DataModelSchemaOptions) = this()
    
    /* private */ /* CompleteClass */
    var baseClass_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var classDefManager_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var classHasModelDefFiles_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var classesTable_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var columnsPerTable_ : Any = js.native
    
    /* CompleteClass */
    override def getTableColumns(tableName: String): js.Array[ColumnInfo] = js.native
    
    /* CompleteClass */
    override def getTableIndexes(tableName: String): js.Array[IndexInfo] = js.native
    
    /* CompleteClass */
    override def getTables(): js.Array[TableInfo] = js.native
    
    /* CompleteClass */
    override def getUnmanagedTableColumns(tableName: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getUnmanagedTableIndexes(tableName: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getUnmanagedTableNames(): js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var iVfs_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var ignoreClassDefErrors_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var iterateClassesWithDef_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    override def scanForClassDefErrors(): js.Array[ClassDefError] = js.native
    
    /* private */ /* CompleteClass */
    var tables_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/schema/DataModelSchema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatUniqueIndexName(tableName: String, columns: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUniqueIndexName")(tableName.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRemoteSchema(database: Database): DataModelSchemaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteSchema")(database.asInstanceOf[js.Any]).asInstanceOf[DataModelSchemaInfo]
  inline def getRemoteSchema(database: Database, options: PartialDataModelSchemaOpt): DataModelSchemaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteSchema")(database.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DataModelSchemaInfo]
  inline def getRemoteSchema(database: Database, options: DataModelSchemaOptions): DataModelSchemaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteSchema")(database.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DataModelSchemaInfo]
  
  trait ClassDefError extends StObject {
    
    var classKey: Double
    
    var className: String
    
    var classPath: String
    
    var error: String
    
    var stackTrace: String
    
    var tableName: String
  }
  object ClassDefError {
    
    inline def apply(
      classKey: Double,
      className: String,
      classPath: String,
      error: String,
      stackTrace: String,
      tableName: String
    ): ClassDefError = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classPath = classPath.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassDefError]
    }
    
    extension [Self <: ClassDefError](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassPath(value: String): Self = StObject.set(x, "classPath", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnDataTypeDef extends StObject {
    
    var charLength: Double | Null
    
    var dataType: String
    
    var sourceClass: Double
  }
  object ColumnDataTypeDef {
    
    inline def apply(dataType: String, sourceClass: Double): ColumnDataTypeDef = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], sourceClass = sourceClass.asInstanceOf[js.Any], charLength = null)
      __obj.asInstanceOf[ColumnDataTypeDef]
    }
    
    extension [Self <: ColumnDataTypeDef](x: Self) {
      
      inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
      
      inline def setCharLengthNull: Self = StObject.set(x, "charLength", null)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setSourceClass(value: Double): Self = StObject.set(x, "sourceClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnInfo extends StObject {
    
    var charLength: Double | Null
    
    var dataType: String
    
    var dataTypeDefs: js.Array[ColumnDataTypeDef]
    
    var errors: js.Array[String]
    
    var name: String
    
    var nullable: Boolean
    
    var referencedTables: js.Array[ReferencedTable]
    
    var sourceClass: Double
    
    var sparse: Boolean
    
    var userCanChangeNegativeKeyClasses: js.Array[Double]
    
    var warnings: js.Array[String]
  }
  object ColumnInfo {
    
    inline def apply(
      dataType: String,
      dataTypeDefs: js.Array[ColumnDataTypeDef],
      errors: js.Array[String],
      name: String,
      nullable: Boolean,
      referencedTables: js.Array[ReferencedTable],
      sourceClass: Double,
      sparse: Boolean,
      userCanChangeNegativeKeyClasses: js.Array[Double],
      warnings: js.Array[String]
    ): ColumnInfo = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], dataTypeDefs = dataTypeDefs.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], referencedTables = referencedTables.asInstanceOf[js.Any], sourceClass = sourceClass.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], userCanChangeNegativeKeyClasses = userCanChangeNegativeKeyClasses.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], charLength = null)
      __obj.asInstanceOf[ColumnInfo]
    }
    
    extension [Self <: ColumnInfo](x: Self) {
      
      inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
      
      inline def setCharLengthNull: Self = StObject.set(x, "charLength", null)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeDefs(value: js.Array[ColumnDataTypeDef]): Self = StObject.set(x, "dataTypeDefs", value.asInstanceOf[js.Any])
      
      inline def setDataTypeDefsVarargs(value: ColumnDataTypeDef*): Self = StObject.set(x, "dataTypeDefs", js.Array(value*))
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setReferencedTables(value: js.Array[ReferencedTable]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
      
      inline def setReferencedTablesVarargs(value: ReferencedTable*): Self = StObject.set(x, "referencedTables", js.Array(value*))
      
      inline def setSourceClass(value: Double): Self = StObject.set(x, "sourceClass", value.asInstanceOf[js.Any])
      
      inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      inline def setUserCanChangeNegativeKeyClasses(value: js.Array[Double]): Self = StObject.set(x, "userCanChangeNegativeKeyClasses", value.asInstanceOf[js.Any])
      
      inline def setUserCanChangeNegativeKeyClassesVarargs(value: Double*): Self = StObject.set(x, "userCanChangeNegativeKeyClasses", js.Array(value*))
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait DataModelSchema extends StObject {
    
    /* private */ var baseClass_ : Any
    
    /* private */ var classDefManager_ : Any
    
    /* private */ var classHasModelDefFiles_ : Any
    
    /* private */ var classesTable_ : Any
    
    /* private */ var columnsPerTable_ : Any
    
    def getTableColumns(tableName: String): js.Array[ColumnInfo]
    
    def getTableIndexes(tableName: String): js.Array[IndexInfo]
    
    def getTables(): js.Array[TableInfo]
    
    def getUnmanagedTableColumns(tableName: String): js.Array[String]
    
    def getUnmanagedTableIndexes(tableName: String): js.Array[String]
    
    def getUnmanagedTableNames(): js.Array[String]
    
    /* private */ var iVfs_ : Any
    
    /* private */ var ignoreClassDefErrors_ : Any
    
    /* private */ var iterateClassesWithDef_ : Any
    
    /* private */ var logger_ : Any
    
    def scanForClassDefErrors(): js.Array[ClassDefError]
    
    /* private */ var tables_ : Any
  }
  object DataModelSchema {
    
    inline def apply(
      baseClass_ : Any,
      classDefManager_ : Any,
      classHasModelDefFiles_ : Any,
      classesTable_ : Any,
      columnsPerTable_ : Any,
      getTableColumns: String => js.Array[ColumnInfo],
      getTableIndexes: String => js.Array[IndexInfo],
      getTables: () => js.Array[TableInfo],
      getUnmanagedTableColumns: String => js.Array[String],
      getUnmanagedTableIndexes: String => js.Array[String],
      getUnmanagedTableNames: () => js.Array[String],
      iVfs_ : Any,
      ignoreClassDefErrors_ : Any,
      iterateClassesWithDef_ : Any,
      logger_ : Any,
      scanForClassDefErrors: () => js.Array[ClassDefError],
      tables_ : Any
    ): DataModelSchema = {
      val __obj = js.Dynamic.literal(baseClass_ = baseClass_.asInstanceOf[js.Any], classDefManager_ = classDefManager_.asInstanceOf[js.Any], classHasModelDefFiles_ = classHasModelDefFiles_.asInstanceOf[js.Any], classesTable_ = classesTable_.asInstanceOf[js.Any], columnsPerTable_ = columnsPerTable_.asInstanceOf[js.Any], getTableColumns = js.Any.fromFunction1(getTableColumns), getTableIndexes = js.Any.fromFunction1(getTableIndexes), getTables = js.Any.fromFunction0(getTables), getUnmanagedTableColumns = js.Any.fromFunction1(getUnmanagedTableColumns), getUnmanagedTableIndexes = js.Any.fromFunction1(getUnmanagedTableIndexes), getUnmanagedTableNames = js.Any.fromFunction0(getUnmanagedTableNames), iVfs_ = iVfs_.asInstanceOf[js.Any], ignoreClassDefErrors_ = ignoreClassDefErrors_.asInstanceOf[js.Any], iterateClassesWithDef_ = iterateClassesWithDef_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], scanForClassDefErrors = js.Any.fromFunction0(scanForClassDefErrors), tables_ = tables_.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataModelSchema]
    }
    
    extension [Self <: DataModelSchema](x: Self) {
      
      inline def setBaseClass_(value: Any): Self = StObject.set(x, "baseClass_", value.asInstanceOf[js.Any])
      
      inline def setClassDefManager_(value: Any): Self = StObject.set(x, "classDefManager_", value.asInstanceOf[js.Any])
      
      inline def setClassHasModelDefFiles_(value: Any): Self = StObject.set(x, "classHasModelDefFiles_", value.asInstanceOf[js.Any])
      
      inline def setClassesTable_(value: Any): Self = StObject.set(x, "classesTable_", value.asInstanceOf[js.Any])
      
      inline def setColumnsPerTable_(value: Any): Self = StObject.set(x, "columnsPerTable_", value.asInstanceOf[js.Any])
      
      inline def setGetTableColumns(value: String => js.Array[ColumnInfo]): Self = StObject.set(x, "getTableColumns", js.Any.fromFunction1(value))
      
      inline def setGetTableIndexes(value: String => js.Array[IndexInfo]): Self = StObject.set(x, "getTableIndexes", js.Any.fromFunction1(value))
      
      inline def setGetTables(value: () => js.Array[TableInfo]): Self = StObject.set(x, "getTables", js.Any.fromFunction0(value))
      
      inline def setGetUnmanagedTableColumns(value: String => js.Array[String]): Self = StObject.set(x, "getUnmanagedTableColumns", js.Any.fromFunction1(value))
      
      inline def setGetUnmanagedTableIndexes(value: String => js.Array[String]): Self = StObject.set(x, "getUnmanagedTableIndexes", js.Any.fromFunction1(value))
      
      inline def setGetUnmanagedTableNames(value: () => js.Array[String]): Self = StObject.set(x, "getUnmanagedTableNames", js.Any.fromFunction0(value))
      
      inline def setIVfs_(value: Any): Self = StObject.set(x, "iVfs_", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClassDefErrors_(value: Any): Self = StObject.set(x, "ignoreClassDefErrors_", value.asInstanceOf[js.Any])
      
      inline def setIterateClassesWithDef_(value: Any): Self = StObject.set(x, "iterateClassesWithDef_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setScanForClassDefErrors(value: () => js.Array[ClassDefError]): Self = StObject.set(x, "scanForClassDefErrors", js.Any.fromFunction0(value))
      
      inline def setTables_(value: Any): Self = StObject.set(x, "tables_", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataModelSchemaInfo extends StObject {
    
    var classDefErrors: js.Array[ClassDefError]
    
    var tableColumns: Record[String, js.Array[ColumnInfo]]
    
    var tableIndexes: Record[String, js.Array[IndexInfo]]
    
    var tables: js.Array[TableInfo]
    
    var unmanagedTableColumns: Record[String, js.Array[String]]
    
    var unmanagedTableIndexes: Record[String, js.Array[String]]
    
    var unmanagedTableNames: js.Array[String]
  }
  object DataModelSchemaInfo {
    
    inline def apply(
      classDefErrors: js.Array[ClassDefError],
      tableColumns: Record[String, js.Array[ColumnInfo]],
      tableIndexes: Record[String, js.Array[IndexInfo]],
      tables: js.Array[TableInfo],
      unmanagedTableColumns: Record[String, js.Array[String]],
      unmanagedTableIndexes: Record[String, js.Array[String]],
      unmanagedTableNames: js.Array[String]
    ): DataModelSchemaInfo = {
      val __obj = js.Dynamic.literal(classDefErrors = classDefErrors.asInstanceOf[js.Any], tableColumns = tableColumns.asInstanceOf[js.Any], tableIndexes = tableIndexes.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], unmanagedTableColumns = unmanagedTableColumns.asInstanceOf[js.Any], unmanagedTableIndexes = unmanagedTableIndexes.asInstanceOf[js.Any], unmanagedTableNames = unmanagedTableNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataModelSchemaInfo]
    }
    
    extension [Self <: DataModelSchemaInfo](x: Self) {
      
      inline def setClassDefErrors(value: js.Array[ClassDefError]): Self = StObject.set(x, "classDefErrors", value.asInstanceOf[js.Any])
      
      inline def setClassDefErrorsVarargs(value: ClassDefError*): Self = StObject.set(x, "classDefErrors", js.Array(value*))
      
      inline def setTableColumns(value: Record[String, js.Array[ColumnInfo]]): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
      
      inline def setTableIndexes(value: Record[String, js.Array[IndexInfo]]): Self = StObject.set(x, "tableIndexes", value.asInstanceOf[js.Any])
      
      inline def setTables(value: js.Array[TableInfo]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesVarargs(value: TableInfo*): Self = StObject.set(x, "tables", js.Array(value*))
      
      inline def setUnmanagedTableColumns(value: Record[String, js.Array[String]]): Self = StObject.set(x, "unmanagedTableColumns", value.asInstanceOf[js.Any])
      
      inline def setUnmanagedTableIndexes(value: Record[String, js.Array[String]]): Self = StObject.set(x, "unmanagedTableIndexes", value.asInstanceOf[js.Any])
      
      inline def setUnmanagedTableNames(value: js.Array[String]): Self = StObject.set(x, "unmanagedTableNames", value.asInstanceOf[js.Any])
      
      inline def setUnmanagedTableNamesVarargs(value: String*): Self = StObject.set(x, "unmanagedTableNames", js.Array(value*))
    }
  }
  
  trait DataModelSchemaOptions extends StObject {
    
    var baseClass: Double
    
    var ignoreClassDefErrors: Boolean
  }
  object DataModelSchemaOptions {
    
    inline def apply(baseClass: Double, ignoreClassDefErrors: Boolean): DataModelSchemaOptions = {
      val __obj = js.Dynamic.literal(baseClass = baseClass.asInstanceOf[js.Any], ignoreClassDefErrors = ignoreClassDefErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataModelSchemaOptions]
    }
    
    extension [Self <: DataModelSchemaOptions](x: Self) {
      
      inline def setBaseClass(value: Double): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClassDefErrors(value: Boolean): Self = StObject.set(x, "ignoreClassDefErrors", value.asInstanceOf[js.Any])
    }
  }
  
  type Database = typings.nginstackEngine.libDatabaseDatabaseMod.^
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  trait IndexInfo extends StObject {
    
    var columns: js.Array[String]
    
    var columnsOrder: js.Array[String]
    
    var compressed: Boolean
    
    var constraintType: String
    
    var definitionKey: Double | Null
    
    var disableReason: String
    
    var disabled: Boolean
    
    var errors: js.Array[String]
    
    var filterPredicate: String
    
    var integrityCheck: Boolean
    
    var name: String
    
    var sourceClass: Double | Null
    
    var tablespace: String
    
    var unique: Boolean
    
    var warnings: js.Array[String]
  }
  object IndexInfo {
    
    inline def apply(
      columns: js.Array[String],
      columnsOrder: js.Array[String],
      compressed: Boolean,
      constraintType: String,
      disableReason: String,
      disabled: Boolean,
      errors: js.Array[String],
      filterPredicate: String,
      integrityCheck: Boolean,
      name: String,
      tablespace: String,
      unique: Boolean,
      warnings: js.Array[String]
    ): IndexInfo = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], columnsOrder = columnsOrder.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], constraintType = constraintType.asInstanceOf[js.Any], disableReason = disableReason.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], filterPredicate = filterPredicate.asInstanceOf[js.Any], integrityCheck = integrityCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablespace = tablespace.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], definitionKey = null, sourceClass = null)
      __obj.asInstanceOf[IndexInfo]
    }
    
    extension [Self <: IndexInfo](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrder(value: js.Array[String]): Self = StObject.set(x, "columnsOrder", value.asInstanceOf[js.Any])
      
      inline def setColumnsOrderVarargs(value: String*): Self = StObject.set(x, "columnsOrder", js.Array(value*))
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setConstraintType(value: String): Self = StObject.set(x, "constraintType", value.asInstanceOf[js.Any])
      
      inline def setDefinitionKey(value: Double): Self = StObject.set(x, "definitionKey", value.asInstanceOf[js.Any])
      
      inline def setDefinitionKeyNull: Self = StObject.set(x, "definitionKey", null)
      
      inline def setDisableReason(value: String): Self = StObject.set(x, "disableReason", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFilterPredicate(value: String): Self = StObject.set(x, "filterPredicate", value.asInstanceOf[js.Any])
      
      inline def setIntegrityCheck(value: Boolean): Self = StObject.set(x, "integrityCheck", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSourceClass(value: Double): Self = StObject.set(x, "sourceClass", value.asInstanceOf[js.Any])
      
      inline def setSourceClassNull: Self = StObject.set(x, "sourceClass", null)
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait ReferencedTable extends StObject {
    
    var baseClass: Double
    
    var integrityCheck: Boolean
    
    var name: String
  }
  object ReferencedTable {
    
    inline def apply(baseClass: Double, integrityCheck: Boolean, name: String): ReferencedTable = {
      val __obj = js.Dynamic.literal(baseClass = baseClass.asInstanceOf[js.Any], integrityCheck = integrityCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferencedTable]
    }
    
    extension [Self <: ReferencedTable](x: Self) {
      
      inline def setBaseClass(value: Double): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setIntegrityCheck(value: Boolean): Self = StObject.set(x, "integrityCheck", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableInfo extends StObject {
    
    var cacheStrategy: ALWAYS
    
    var classFieldName: String
    
    var displayName: String
    
    var errors: js.Array[String]
    
    var indexTablespace: String
    
    var integerDatabaseType: String
    
    var keyFieldName: String
    
    var managedDatabaseSchema: Boolean
    
    var name: String
    
    var primaryKey: js.Array[String]
    
    var tableClass: Double
    
    var tableClassName: String
    
    var tablespace: String
    
    var upgradeMustSyncRecords: Boolean
    
    var versionFieldName: String
    
    var warnings: js.Array[String]
  }
  object TableInfo {
    
    inline def apply(
      cacheStrategy: ALWAYS,
      classFieldName: String,
      displayName: String,
      errors: js.Array[String],
      indexTablespace: String,
      integerDatabaseType: String,
      keyFieldName: String,
      managedDatabaseSchema: Boolean,
      name: String,
      primaryKey: js.Array[String],
      tableClass: Double,
      tableClassName: String,
      tablespace: String,
      upgradeMustSyncRecords: Boolean,
      versionFieldName: String,
      warnings: js.Array[String]
    ): TableInfo = {
      val __obj = js.Dynamic.literal(cacheStrategy = cacheStrategy.asInstanceOf[js.Any], classFieldName = classFieldName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], indexTablespace = indexTablespace.asInstanceOf[js.Any], integerDatabaseType = integerDatabaseType.asInstanceOf[js.Any], keyFieldName = keyFieldName.asInstanceOf[js.Any], managedDatabaseSchema = managedDatabaseSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tableClass = tableClass.asInstanceOf[js.Any], tableClassName = tableClassName.asInstanceOf[js.Any], tablespace = tablespace.asInstanceOf[js.Any], upgradeMustSyncRecords = upgradeMustSyncRecords.asInstanceOf[js.Any], versionFieldName = versionFieldName.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableInfo]
    }
    
    extension [Self <: TableInfo](x: Self) {
      
      inline def setCacheStrategy(value: ALWAYS): Self = StObject.set(x, "cacheStrategy", value.asInstanceOf[js.Any])
      
      inline def setClassFieldName(value: String): Self = StObject.set(x, "classFieldName", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setIndexTablespace(value: String): Self = StObject.set(x, "indexTablespace", value.asInstanceOf[js.Any])
      
      inline def setIntegerDatabaseType(value: String): Self = StObject.set(x, "integerDatabaseType", value.asInstanceOf[js.Any])
      
      inline def setKeyFieldName(value: String): Self = StObject.set(x, "keyFieldName", value.asInstanceOf[js.Any])
      
      inline def setManagedDatabaseSchema(value: Boolean): Self = StObject.set(x, "managedDatabaseSchema", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKey(value: js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
      
      inline def setTableClass(value: Double): Self = StObject.set(x, "tableClass", value.asInstanceOf[js.Any])
      
      inline def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      inline def setUpgradeMustSyncRecords(value: Boolean): Self = StObject.set(x, "upgradeMustSyncRecords", value.asInstanceOf[js.Any])
      
      inline def setVersionFieldName(value: String): Self = StObject.set(x, "versionFieldName", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
