package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.Options
import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.IfNotExistsOption
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import typings.nodePgMigrate.distOperationsSequencesTypesMod.SequenceOptions
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.nodePgMigrateStrings.ALWAYS
import typings.nodePgMigrate.nodePgMigrateStrings.DISABLE
import typings.nodePgMigrate.nodePgMigrateStrings.ENABLE
import typings.nodePgMigrate.nodePgMigrateStrings.FORCE
import typings.nodePgMigrate.nodePgMigrateStrings.FULL
import typings.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import typings.nodePgMigrate.nodePgMigrateStrings.`BY DEFAULT`
import typings.nodePgMigrate.nodePgMigrateStrings.`NO FORCE`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTablesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`
    - typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT
    - typings.nodePgMigrate.nodePgMigrateStrings.CASCADE
    - typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL`
    - typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`
  */
  trait Action extends StObject
  object Action {
    
    inline def CASCADE: typings.nodePgMigrate.nodePgMigrateStrings.CASCADE = "CASCADE".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.CASCADE]
    
    inline def `NO ACTION`: typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION` = ("NO ACTION").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`]
    
    inline def RESTRICT: typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT = "RESTRICT".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT]
    
    inline def `SET DEFAULT`: typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT` = ("SET DEFAULT").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`]
    
    inline def `SET NULL`: typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL` = ("SET NULL").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL`]
  }
  
  @js.native
  trait AddColumns extends AddColumnsFn {
    
    def reverse(tableName: Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
    def reverse(tableName: Name, newColumns: ColumnDefinitions, addOptions: IfNotExistsOption & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: AddColumnsFn = js.native
  }
  
  type AddColumnsFn = js.Function3[
    /* tableName */ Name, 
    /* newColumns */ ColumnDefinitions, 
    /* addOptions */ js.UndefOr[IfNotExistsOption & DropOptions], 
    String | js.Array[String]
  ]
  
  type AlterColumn = js.Function3[
    /* tableName */ Name, 
    /* columnName */ String, 
    /* options */ AlterColumnOptions, 
    String | js.Array[String]
  ]
  
  trait AlterColumnOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.undefined
    
    var allowNull: js.UndefOr[Boolean] = js.undefined
    
    var collation: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String | Null] = js.undefined
    
    /**
      * @deprecated use sequenceGenerated
      */
    var generated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined
    
    var notNull: js.UndefOr[Boolean] = js.undefined
    
    var sequenceGenerated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var `using`: js.UndefOr[String] = js.undefined
  }
  object AlterColumnOptions {
    
    inline def apply(): AlterColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterColumnOptions]
    }
    
    extension [Self <: AlterColumnOptions](x: Self) {
      
      inline def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
      
      inline def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
      
      inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setGenerated(value: `false` | SequenceGeneratedOptions): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setGeneratedNull: Self = StObject.set(x, "generated", null)
      
      inline def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      inline def setSequenceGenerated(value: `false` | SequenceGeneratedOptions): Self = StObject.set(x, "sequenceGenerated", value.asInstanceOf[js.Any])
      
      inline def setSequenceGeneratedNull: Self = StObject.set(x, "sequenceGenerated", null)
      
      inline def setSequenceGeneratedUndefined: Self = StObject.set(x, "sequenceGenerated", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
      
      inline def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    }
  }
  
  type AlterTable = js.Function2[
    /* tableName */ Name, 
    /* alterOptions */ AlterTableOptions, 
    String | js.Array[String]
  ]
  
  trait AlterTableOptions extends StObject {
    
    var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)
  }
  object AlterTableOptions {
    
    inline def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
      val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlterTableOptions]
    }
    
    extension [Self <: AlterTableOptions](x: Self) {
      
      inline def setLevelSecurity(value: DISABLE | ENABLE | FORCE | (`NO FORCE`)): Self = StObject.set(x, "levelSecurity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<node-pg-migrate.node-pg-migrate/dist/operations/tablesTypes.ReferencesOptions> */
  trait ColumnDefinition extends StObject {
    
    var default: js.UndefOr[Value] = js.undefined
    
    var check: js.UndefOr[String] = js.undefined
    
    var collation: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String | Null] = js.undefined
    
    var deferrable: js.UndefOr[Boolean] = js.undefined
    
    var deferred: js.UndefOr[Boolean] = js.undefined
    
    var expressionGenerated: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated use sequenceGenerated
      */
    var generated: js.UndefOr[SequenceGeneratedOptions] = js.undefined
    
    var `match`: js.UndefOr[FULL | SIMPLE] = js.undefined
    
    var notNull: js.UndefOr[Boolean] = js.undefined
    
    var onDelete: js.UndefOr[Action] = js.undefined
    
    var onUpdate: js.UndefOr[Action] = js.undefined
    
    var primaryKey: js.UndefOr[Boolean] = js.undefined
    
    var references: js.UndefOr[Name] = js.undefined
    
    var referencesConstraintComment: js.UndefOr[String] = js.undefined
    
    var referencesConstraintName: js.UndefOr[String] = js.undefined
    
    var sequenceGenerated: js.UndefOr[SequenceGeneratedOptions] = js.undefined
    
    var `type`: String
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnDefinition {
    
    inline def apply(`type`: String): ColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDefinition]
    }
    
    extension [Self <: ColumnDefinition](x: Self) {
      
      inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      inline def setExpressionGenerated(value: String): Self = StObject.set(x, "expressionGenerated", value.asInstanceOf[js.Any])
      
      inline def setExpressionGeneratedUndefined: Self = StObject.set(x, "expressionGenerated", js.undefined)
      
      inline def setGenerated(value: SequenceGeneratedOptions): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      inline def setMatch(value: FULL | SIMPLE): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      inline def setOnDelete(value: Action): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnUpdate(value: Action): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setReferences(value: Name): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintComment(value: String): Self = StObject.set(x, "referencesConstraintComment", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintCommentUndefined: Self = StObject.set(x, "referencesConstraintComment", js.undefined)
      
      inline def setReferencesConstraintName(value: String): Self = StObject.set(x, "referencesConstraintName", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintNameUndefined: Self = StObject.set(x, "referencesConstraintName", js.undefined)
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setSequenceGenerated(value: SequenceGeneratedOptions): Self = StObject.set(x, "sequenceGenerated", value.asInstanceOf[js.Any])
      
      inline def setSequenceGeneratedUndefined: Self = StObject.set(x, "sequenceGenerated", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  type ColumnDefinitions = StringDictionary[ColumnDefinition | String]
  
  trait ConstraintOptions extends StObject {
    
    var check: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var deferrable: js.UndefOr[Boolean] = js.undefined
    
    var deferred: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String] = js.undefined
    
    var foreignKeys: js.UndefOr[ForeignKeyOptions | js.Array[ForeignKeyOptions]] = js.undefined
    
    var primaryKey: js.UndefOr[Name | js.Array[Name]] = js.undefined
    
    var unique: js.UndefOr[Name | (js.Array[Name | js.Array[Name]])] = js.undefined
  }
  object ConstraintOptions {
    
    inline def apply(): ConstraintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstraintOptions]
    }
    
    extension [Self <: ConstraintOptions](x: Self) {
      
      inline def setCheck(value: String | js.Array[String]): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCheckVarargs(value: String*): Self = StObject.set(x, "check", js.Array(value*))
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setForeignKeys(value: ForeignKeyOptions | js.Array[ForeignKeyOptions]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
      
      inline def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
      
      inline def setForeignKeysVarargs(value: ForeignKeyOptions*): Self = StObject.set(x, "foreignKeys", js.Array(value*))
      
      inline def setPrimaryKey(value: Name | js.Array[Name]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyVarargs(value: Name*): Self = StObject.set(x, "primaryKey", js.Array(value*))
      
      inline def setUnique(value: Name | (js.Array[Name | js.Array[Name]])): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def setUniqueVarargs(value: (Name | js.Array[Name])*): Self = StObject.set(x, "unique", js.Array(value*))
    }
  }
  
  @js.native
  trait CreateConstraint extends CreateConstraintFn {
    
    def reverse(tableName: Name, constraintName: String, expression: ConstraintOptions & DropOptions): String | js.Array[String] = js.native
    def reverse(tableName: Name, constraintName: String, expression: String & DropOptions): String | js.Array[String] = js.native
    def reverse(tableName: Name, constraintName: Null, expression: String & DropOptions): String | js.Array[String] = js.native
    def reverse(tableName: Name, constraintName: Null, expression: ConstraintOptions & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateConstraintFn = js.native
  }
  
  type CreateConstraintFn = js.Function3[
    /* tableName */ Name, 
    /* constraintName */ String | Null, 
    /* expression */ (String & DropOptions) | (ConstraintOptions & DropOptions), 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateTable extends CreateTableFn {
    
    def reverse(tableName: Name, columns: ColumnDefinitions): String | js.Array[String] = js.native
    def reverse(tableName: Name, columns: ColumnDefinitions, options: TableOptions & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateTableFn = js.native
  }
  
  type CreateTableFn = js.Function3[
    /* tableName */ Name, 
    /* columns */ ColumnDefinitions, 
    /* options */ js.UndefOr[TableOptions & DropOptions], 
    String | js.Array[String]
  ]
  
  type DropColumns = js.Function3[
    /* tableName */ Name, 
    /* columns */ String | js.Array[String] | StringDictionary[Any], 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type DropConstraint = js.Function3[
    /* tableName */ Name, 
    /* constraintName */ String, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type DropTable = js.Function2[
    /* tableName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  trait ForeignKeyOptions
    extends StObject
       with ReferencesOptions {
    
    var columns: Name | js.Array[Name]
  }
  object ForeignKeyOptions {
    
    inline def apply(columns: Name | js.Array[Name], references: Name): ForeignKeyOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeyOptions]
    }
    
    extension [Self <: ForeignKeyOptions](x: Self) {
      
      inline def setColumns(value: Name | js.Array[Name]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Name*): Self = StObject.set(x, "columns", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePgMigrate.nodePgMigrateStrings.COMMENTS
    - typings.nodePgMigrate.nodePgMigrateStrings.CONSTRAINTS
    - typings.nodePgMigrate.nodePgMigrateStrings.DEFAULTS
    - typings.nodePgMigrate.nodePgMigrateStrings.IDENTITY
    - typings.nodePgMigrate.nodePgMigrateStrings.INDEXES
    - typings.nodePgMigrate.nodePgMigrateStrings.STATISTICS
    - typings.nodePgMigrate.nodePgMigrateStrings.STORAGE
    - typings.nodePgMigrate.nodePgMigrateStrings.ALL
  */
  trait Like extends StObject
  object Like {
    
    inline def ALL: typings.nodePgMigrate.nodePgMigrateStrings.ALL = "ALL".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.ALL]
    
    inline def COMMENTS: typings.nodePgMigrate.nodePgMigrateStrings.COMMENTS = "COMMENTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.COMMENTS]
    
    inline def CONSTRAINTS: typings.nodePgMigrate.nodePgMigrateStrings.CONSTRAINTS = "CONSTRAINTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.CONSTRAINTS]
    
    inline def DEFAULTS: typings.nodePgMigrate.nodePgMigrateStrings.DEFAULTS = "DEFAULTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.DEFAULTS]
    
    inline def IDENTITY: typings.nodePgMigrate.nodePgMigrateStrings.IDENTITY = "IDENTITY".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.IDENTITY]
    
    inline def INDEXES: typings.nodePgMigrate.nodePgMigrateStrings.INDEXES = "INDEXES".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.INDEXES]
    
    inline def STATISTICS: typings.nodePgMigrate.nodePgMigrateStrings.STATISTICS = "STATISTICS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.STATISTICS]
    
    inline def STORAGE: typings.nodePgMigrate.nodePgMigrateStrings.STORAGE = "STORAGE".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.STORAGE]
  }
  
  trait LikeOptions extends StObject {
    
    var excluding: js.UndefOr[Like | js.Array[Like]] = js.undefined
    
    var including: js.UndefOr[Like | js.Array[Like]] = js.undefined
  }
  object LikeOptions {
    
    inline def apply(): LikeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeOptions]
    }
    
    extension [Self <: LikeOptions](x: Self) {
      
      inline def setExcluding(value: Like | js.Array[Like]): Self = StObject.set(x, "excluding", value.asInstanceOf[js.Any])
      
      inline def setExcludingUndefined: Self = StObject.set(x, "excluding", js.undefined)
      
      inline def setExcludingVarargs(value: Like*): Self = StObject.set(x, "excluding", js.Array(value*))
      
      inline def setIncluding(value: Like | js.Array[Like]): Self = StObject.set(x, "including", value.asInstanceOf[js.Any])
      
      inline def setIncludingUndefined: Self = StObject.set(x, "including", js.undefined)
      
      inline def setIncludingVarargs(value: Like*): Self = StObject.set(x, "including", js.Array(value*))
    }
  }
  
  trait ReferencesOptions extends StObject {
    
    var `match`: js.UndefOr[FULL | SIMPLE] = js.undefined
    
    var onDelete: js.UndefOr[Action] = js.undefined
    
    var onUpdate: js.UndefOr[Action] = js.undefined
    
    var references: Name
    
    var referencesConstraintComment: js.UndefOr[String] = js.undefined
    
    var referencesConstraintName: js.UndefOr[String] = js.undefined
  }
  object ReferencesOptions {
    
    inline def apply(references: Name): ReferencesOptions = {
      val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferencesOptions]
    }
    
    extension [Self <: ReferencesOptions](x: Self) {
      
      inline def setMatch(value: FULL | SIMPLE): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOnDelete(value: Action): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnUpdate(value: Action): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setReferences(value: Name): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintComment(value: String): Self = StObject.set(x, "referencesConstraintComment", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintCommentUndefined: Self = StObject.set(x, "referencesConstraintComment", js.undefined)
      
      inline def setReferencesConstraintName(value: String): Self = StObject.set(x, "referencesConstraintName", value.asInstanceOf[js.Any])
      
      inline def setReferencesConstraintNameUndefined: Self = StObject.set(x, "referencesConstraintName", js.undefined)
    }
  }
  
  @js.native
  trait RenameColumn extends RenameColumnFn {
    
    def reverse(tableName: Name, oldColumnName: String, newColumnName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameColumnFn = js.native
  }
  
  type RenameColumnFn = js.Function3[
    /* tableName */ Name, 
    /* oldColumnName */ String, 
    /* newColumnName */ String, 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameConstraint extends RenameConstraintFn {
    
    def reverse(tableName: Name, oldConstraintName: String, newConstraintName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameConstraintFn = js.native
  }
  
  type RenameConstraintFn = js.Function3[
    /* tableName */ Name, 
    /* oldConstraintName */ String, 
    /* newConstraintName */ String, 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameTable extends RenameTableFn {
    
    def reverse(tableName: Name, newtableName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameTableFn = js.native
  }
  
  type RenameTableFn = js.Function2[/* tableName */ Name, /* newtableName */ Name, String | js.Array[String]]
  
  trait SequenceGeneratedOptions
    extends StObject
       with SequenceOptions {
    
    var precedence: ALWAYS | (`BY DEFAULT`)
  }
  object SequenceGeneratedOptions {
    
    inline def apply(precedence: ALWAYS | (`BY DEFAULT`)): SequenceGeneratedOptions = {
      val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequenceGeneratedOptions]
    }
    
    extension [Self <: SequenceGeneratedOptions](x: Self) {
      
      inline def setPrecedence(value: ALWAYS | (`BY DEFAULT`)): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableOptions
    extends StObject
       with IfNotExistsOption {
    
    var comment: js.UndefOr[String | Null] = js.undefined
    
    var constraints: js.UndefOr[ConstraintOptions] = js.undefined
    
    var inherits: js.UndefOr[Name] = js.undefined
    
    var like: js.UndefOr[Name | Options] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
  }
  object TableOptions {
    
    inline def apply(): TableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOptions]
    }
    
    extension [Self <: TableOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setConstraints(value: ConstraintOptions): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setInherits(value: Name): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      inline def setLike(value: Name | Options): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
