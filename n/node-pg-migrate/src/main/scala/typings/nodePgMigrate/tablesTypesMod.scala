package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.Options
import typings.nodePgMigrate.anon.ReverseAddColumnsFn
import typings.nodePgMigrate.anon.ReverseCreateConstraintFn
import typings.nodePgMigrate.anon.ReverseCreateTableFn
import typings.nodePgMigrate.anon.ReverseRenameColumnFn
import typings.nodePgMigrate.anon.ReverseRenameConstraintFn
import typings.nodePgMigrate.anon.ReverseRenameTableFn
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`
    - typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT
    - typings.nodePgMigrate.nodePgMigrateStrings.CASCADE
    - typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL`
    - typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def CASCADE: typings.nodePgMigrate.nodePgMigrateStrings.CASCADE = "CASCADE".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.CASCADE]
    
    @scala.inline
    def `NO ACTION`: typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION` = ("NO ACTION").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`]
    
    @scala.inline
    def RESTRICT: typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT = "RESTRICT".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.RESTRICT]
    
    @scala.inline
    def `SET DEFAULT`: typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT` = ("SET DEFAULT").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`]
    
    @scala.inline
    def `SET NULL`: typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL` = ("SET NULL").asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.`SET NULL`]
  }
  
  type AddColumns = AddColumnsFn with ReverseAddColumnsFn
  
  type AddColumnsFn = js.Function3[
    /* tableName */ Name, 
    /* newColumns */ ColumnDefinitions, 
    /* addOptions */ js.UndefOr[IfNotExistsOption with DropOptions], 
    String | js.Array[String]
  ]
  
  type AlterColumn = js.Function3[
    /* tableName */ Name, 
    /* columnName */ String, 
    /* options */ AlterColumnOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait AlterColumnOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.native
    
    var allowNull: js.UndefOr[Boolean] = js.native
    
    var collation: js.UndefOr[String] = js.native
    
    var comment: js.UndefOr[String | Null] = js.native
    
    /**
      * @deprecated use sequenceGenerated
      */
    var generated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.native
    
    var notNull: js.UndefOr[Boolean] = js.native
    
    var sequenceGenerated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var using: js.UndefOr[String] = js.native
  }
  object AlterColumnOptions {
    
    @scala.inline
    def apply(): AlterColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterColumnOptions]
    }
    
    @scala.inline
    implicit class AlterColumnOptionsMutableBuilder[Self <: AlterColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
      
      @scala.inline
      def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentNull: Self = StObject.set(x, "comment", null)
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setGenerated(value: `false` | SequenceGeneratedOptions): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedNull: Self = StObject.set(x, "generated", null)
      
      @scala.inline
      def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      @scala.inline
      def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      @scala.inline
      def setSequenceGenerated(value: `false` | SequenceGeneratedOptions): Self = StObject.set(x, "sequenceGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceGeneratedNull: Self = StObject.set(x, "sequenceGenerated", null)
      
      @scala.inline
      def setSequenceGeneratedUndefined: Self = StObject.set(x, "sequenceGenerated", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    }
  }
  
  type AlterTable = js.Function2[
    /* tableName */ Name, 
    /* alterOptions */ AlterTableOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait AlterTableOptions extends StObject {
    
    var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`) = js.native
  }
  object AlterTableOptions {
    
    @scala.inline
    def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
      val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlterTableOptions]
    }
    
    @scala.inline
    implicit class AlterTableOptionsMutableBuilder[Self <: AlterTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevelSecurity(value: DISABLE | ENABLE | FORCE | (`NO FORCE`)): Self = StObject.set(x, "levelSecurity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<node-pg-migrate.node-pg-migrate/dist/operations/tablesTypes.ReferencesOptions> */
  @js.native
  trait ColumnDefinition extends StObject {
    
    var default: js.UndefOr[Value] = js.native
    
    var check: js.UndefOr[String] = js.native
    
    var collation: js.UndefOr[String] = js.native
    
    var comment: js.UndefOr[String | Null] = js.native
    
    var deferrable: js.UndefOr[Boolean] = js.native
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var expressionGenerated: js.UndefOr[String] = js.native
    
    /**
      * @deprecated use sequenceGenerated
      */
    var generated: js.UndefOr[SequenceGeneratedOptions] = js.native
    
    var `match`: js.UndefOr[FULL | SIMPLE] = js.native
    
    var notNull: js.UndefOr[Boolean] = js.native
    
    var onDelete: js.UndefOr[Action] = js.native
    
    var onUpdate: js.UndefOr[Action] = js.native
    
    var primaryKey: js.UndefOr[Boolean] = js.native
    
    var references: js.UndefOr[Name] = js.native
    
    var referencesConstraintComment: js.UndefOr[String] = js.native
    
    var referencesConstraintName: js.UndefOr[String] = js.native
    
    var sequenceGenerated: js.UndefOr[SequenceGeneratedOptions] = js.native
    
    var `type`: String = js.native
    
    var unique: js.UndefOr[Boolean] = js.native
  }
  object ColumnDefinition {
    
    @scala.inline
    def apply(`type`: String): ColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDefinition]
    }
    
    @scala.inline
    implicit class ColumnDefinitionMutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentNull: Self = StObject.set(x, "comment", null)
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      @scala.inline
      def setExpressionGenerated(value: String): Self = StObject.set(x, "expressionGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionGeneratedUndefined: Self = StObject.set(x, "expressionGenerated", js.undefined)
      
      @scala.inline
      def setGenerated(value: SequenceGeneratedOptions): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      @scala.inline
      def setMatch(value: FULL | SIMPLE): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      @scala.inline
      def setOnDelete(value: Action): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: Action): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setReferences(value: Name): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintComment(value: String): Self = StObject.set(x, "referencesConstraintComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintCommentUndefined: Self = StObject.set(x, "referencesConstraintComment", js.undefined)
      
      @scala.inline
      def setReferencesConstraintName(value: String): Self = StObject.set(x, "referencesConstraintName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintNameUndefined: Self = StObject.set(x, "referencesConstraintName", js.undefined)
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setSequenceGenerated(value: SequenceGeneratedOptions): Self = StObject.set(x, "sequenceGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceGeneratedUndefined: Self = StObject.set(x, "sequenceGenerated", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  type ColumnDefinitions = StringDictionary[ColumnDefinition | String]
  
  @js.native
  trait ConstraintOptions extends StObject {
    
    var check: js.UndefOr[String | js.Array[String]] = js.native
    
    var comment: js.UndefOr[String] = js.native
    
    var deferrable: js.UndefOr[Boolean] = js.native
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[String] = js.native
    
    var foreignKeys: js.UndefOr[ForeignKeyOptions | js.Array[ForeignKeyOptions]] = js.native
    
    var primaryKey: js.UndefOr[Name | js.Array[Name]] = js.native
    
    var unique: js.UndefOr[Name | (js.Array[Name | js.Array[Name]])] = js.native
  }
  object ConstraintOptions {
    
    @scala.inline
    def apply(): ConstraintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstraintOptions]
    }
    
    @scala.inline
    implicit class ConstraintOptionsMutableBuilder[Self <: ConstraintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: String | js.Array[String]): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setCheckVarargs(value: String*): Self = StObject.set(x, "check", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      @scala.inline
      def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setForeignKeys(value: ForeignKeyOptions | js.Array[ForeignKeyOptions]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
      
      @scala.inline
      def setForeignKeysVarargs(value: ForeignKeyOptions*): Self = StObject.set(x, "foreignKeys", js.Array(value :_*))
      
      @scala.inline
      def setPrimaryKey(value: Name | js.Array[Name]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setPrimaryKeyVarargs(value: Name*): Self = StObject.set(x, "primaryKey", js.Array(value :_*))
      
      @scala.inline
      def setUnique(value: Name | (js.Array[Name | js.Array[Name]])): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setUniqueVarargs(value: (Name | js.Array[Name])*): Self = StObject.set(x, "unique", js.Array(value :_*))
    }
  }
  
  type CreateConstraint = CreateConstraintFn with ReverseCreateConstraintFn
  
  type CreateConstraintFn = js.Function3[
    /* tableName */ Name, 
    /* constraintName */ String | Null, 
    /* expression */ (String | ConstraintOptions) with DropOptions, 
    String | js.Array[String]
  ]
  
  type CreateTable = CreateTableFn with ReverseCreateTableFn
  
  type CreateTableFn = js.Function3[
    /* tableName */ Name, 
    /* columns */ ColumnDefinitions, 
    /* options */ js.UndefOr[TableOptions with DropOptions], 
    String | js.Array[String]
  ]
  
  type DropColumns = js.Function3[
    /* tableName */ Name, 
    /* columns */ String | js.Array[String] | StringDictionary[js.Any], 
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
  
  @js.native
  trait ForeignKeyOptions extends ReferencesOptions {
    
    var columns: Name | js.Array[Name] = js.native
  }
  object ForeignKeyOptions {
    
    @scala.inline
    def apply(columns: Name | js.Array[Name], references: Name): ForeignKeyOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeyOptions]
    }
    
    @scala.inline
    implicit class ForeignKeyOptionsMutableBuilder[Self <: ForeignKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Name | js.Array[Name]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Name*): Self = StObject.set(x, "columns", js.Array(value :_*))
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
    
    @scala.inline
    def ALL: typings.nodePgMigrate.nodePgMigrateStrings.ALL = "ALL".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.ALL]
    
    @scala.inline
    def COMMENTS: typings.nodePgMigrate.nodePgMigrateStrings.COMMENTS = "COMMENTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.COMMENTS]
    
    @scala.inline
    def CONSTRAINTS: typings.nodePgMigrate.nodePgMigrateStrings.CONSTRAINTS = "CONSTRAINTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.CONSTRAINTS]
    
    @scala.inline
    def DEFAULTS: typings.nodePgMigrate.nodePgMigrateStrings.DEFAULTS = "DEFAULTS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.DEFAULTS]
    
    @scala.inline
    def IDENTITY: typings.nodePgMigrate.nodePgMigrateStrings.IDENTITY = "IDENTITY".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.IDENTITY]
    
    @scala.inline
    def INDEXES: typings.nodePgMigrate.nodePgMigrateStrings.INDEXES = "INDEXES".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.INDEXES]
    
    @scala.inline
    def STATISTICS: typings.nodePgMigrate.nodePgMigrateStrings.STATISTICS = "STATISTICS".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.STATISTICS]
    
    @scala.inline
    def STORAGE: typings.nodePgMigrate.nodePgMigrateStrings.STORAGE = "STORAGE".asInstanceOf[typings.nodePgMigrate.nodePgMigrateStrings.STORAGE]
  }
  
  @js.native
  trait LikeOptions extends StObject {
    
    var excluding: js.UndefOr[Like | js.Array[Like]] = js.native
    
    var including: js.UndefOr[Like | js.Array[Like]] = js.native
  }
  object LikeOptions {
    
    @scala.inline
    def apply(): LikeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeOptions]
    }
    
    @scala.inline
    implicit class LikeOptionsMutableBuilder[Self <: LikeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcluding(value: Like | js.Array[Like]): Self = StObject.set(x, "excluding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludingUndefined: Self = StObject.set(x, "excluding", js.undefined)
      
      @scala.inline
      def setExcludingVarargs(value: Like*): Self = StObject.set(x, "excluding", js.Array(value :_*))
      
      @scala.inline
      def setIncluding(value: Like | js.Array[Like]): Self = StObject.set(x, "including", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludingUndefined: Self = StObject.set(x, "including", js.undefined)
      
      @scala.inline
      def setIncludingVarargs(value: Like*): Self = StObject.set(x, "including", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReferencesOptions extends StObject {
    
    var `match`: js.UndefOr[FULL | SIMPLE] = js.native
    
    var onDelete: js.UndefOr[Action] = js.native
    
    var onUpdate: js.UndefOr[Action] = js.native
    
    var references: Name = js.native
    
    var referencesConstraintComment: js.UndefOr[String] = js.native
    
    var referencesConstraintName: js.UndefOr[String] = js.native
  }
  object ReferencesOptions {
    
    @scala.inline
    def apply(references: Name): ReferencesOptions = {
      val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferencesOptions]
    }
    
    @scala.inline
    implicit class ReferencesOptionsMutableBuilder[Self <: ReferencesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: FULL | SIMPLE): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setOnDelete(value: Action): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: Action): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setReferences(value: Name): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintComment(value: String): Self = StObject.set(x, "referencesConstraintComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintCommentUndefined: Self = StObject.set(x, "referencesConstraintComment", js.undefined)
      
      @scala.inline
      def setReferencesConstraintName(value: String): Self = StObject.set(x, "referencesConstraintName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesConstraintNameUndefined: Self = StObject.set(x, "referencesConstraintName", js.undefined)
    }
  }
  
  type RenameColumn = RenameColumnFn with ReverseRenameColumnFn
  
  type RenameColumnFn = js.Function3[
    /* tableName */ Name, 
    /* oldColumnName */ String, 
    /* newColumnName */ String, 
    String | js.Array[String]
  ]
  
  type RenameConstraint = RenameConstraintFn with ReverseRenameConstraintFn
  
  type RenameConstraintFn = js.Function3[
    /* tableName */ Name, 
    /* oldConstraintName */ String, 
    /* newConstraintName */ String, 
    String | js.Array[String]
  ]
  
  type RenameTable = RenameTableFn with ReverseRenameTableFn
  
  type RenameTableFn = js.Function2[/* tableName */ Name, /* newtableName */ Name, String | js.Array[String]]
  
  /* Inlined {  precedence :'ALWAYS' | 'BY DEFAULT'} & node-pg-migrate.node-pg-migrate/dist/operations/sequencesTypes.SequenceOptions */
  @js.native
  trait SequenceGeneratedOptions extends StObject {
    
    var cache: js.UndefOr[Double] = js.native
    
    var cycle: js.UndefOr[Boolean] = js.native
    
    var increment: js.UndefOr[Double] = js.native
    
    var maxvalue: js.UndefOr[Double | Null | `false`] = js.native
    
    var minvalue: js.UndefOr[Double | Null | `false`] = js.native
    
    var owner: js.UndefOr[String | Null | `false`] = js.native
    
    var precedence: ALWAYS | (`BY DEFAULT`) = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
  }
  object SequenceGeneratedOptions {
    
    @scala.inline
    def apply(precedence: ALWAYS | (`BY DEFAULT`)): SequenceGeneratedOptions = {
      val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequenceGeneratedOptions]
    }
    
    @scala.inline
    implicit class SequenceGeneratedOptionsMutableBuilder[Self <: SequenceGeneratedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setMaxvalue(value: Double | `false`): Self = StObject.set(x, "maxvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxvalueNull: Self = StObject.set(x, "maxvalue", null)
      
      @scala.inline
      def setMaxvalueUndefined: Self = StObject.set(x, "maxvalue", js.undefined)
      
      @scala.inline
      def setMinvalue(value: Double | `false`): Self = StObject.set(x, "minvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinvalueNull: Self = StObject.set(x, "minvalue", null)
      
      @scala.inline
      def setMinvalueUndefined: Self = StObject.set(x, "minvalue", js.undefined)
      
      @scala.inline
      def setOwner(value: String | `false`): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setPrecedence(value: ALWAYS | (`BY DEFAULT`)): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TableOptions extends IfNotExistsOption {
    
    var comment: js.UndefOr[String | Null] = js.native
    
    var constraints: js.UndefOr[ConstraintOptions] = js.native
    
    var inherits: js.UndefOr[Name] = js.native
    
    var like: js.UndefOr[Name | Options] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
  }
  object TableOptions {
    
    @scala.inline
    def apply(): TableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentNull: Self = StObject.set(x, "comment", null)
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setConstraints(value: ConstraintOptions): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setInherits(value: Name): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      @scala.inline
      def setLike(value: Name | Options): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
