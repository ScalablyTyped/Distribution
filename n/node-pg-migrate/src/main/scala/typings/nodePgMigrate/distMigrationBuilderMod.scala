package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsDomainsTypesMod.AlterDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.CreateDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.DropDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.RenameDomain
import typings.nodePgMigrate.distOperationsExtensionsTypesMod.CreateExtension
import typings.nodePgMigrate.distOperationsExtensionsTypesMod.DropExtension
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.CreateFunction
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.DropFunction
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.RenameFunction
import typings.nodePgMigrate.distOperationsIndexesTypesMod.CreateIndex
import typings.nodePgMigrate.distOperationsIndexesTypesMod.DropIndex
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.AddToOperatorFamily
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperator
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperatorClass
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperatorFamily
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperator
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperatorClass
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperatorFamily
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.RemoveFromOperatorFamily
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.RenameOperatorClass
import typings.nodePgMigrate.distOperationsOperatorsTypesMod.RenameOperatorFamily
import typings.nodePgMigrate.distOperationsOthersTypesMod.Sql
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.AlterPolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.CreatePolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.DropPolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.RenamePolicy
import typings.nodePgMigrate.distOperationsRolesTypesMod.AlterRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.CreateRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.DropRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.RenameRole
import typings.nodePgMigrate.distOperationsSchemasTypesMod.CreateSchema
import typings.nodePgMigrate.distOperationsSchemasTypesMod.DropSchema
import typings.nodePgMigrate.distOperationsSchemasTypesMod.RenameSchema
import typings.nodePgMigrate.distOperationsSequencesTypesMod.AlterSequence
import typings.nodePgMigrate.distOperationsSequencesTypesMod.CreateSequence
import typings.nodePgMigrate.distOperationsSequencesTypesMod.DropSequence
import typings.nodePgMigrate.distOperationsSequencesTypesMod.RenameSequence
import typings.nodePgMigrate.distOperationsTablesTypesMod.AddColumns
import typings.nodePgMigrate.distOperationsTablesTypesMod.AlterColumn
import typings.nodePgMigrate.distOperationsTablesTypesMod.AlterTable
import typings.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typings.nodePgMigrate.distOperationsTablesTypesMod.CreateConstraint
import typings.nodePgMigrate.distOperationsTablesTypesMod.CreateTable
import typings.nodePgMigrate.distOperationsTablesTypesMod.DropColumns
import typings.nodePgMigrate.distOperationsTablesTypesMod.DropConstraint
import typings.nodePgMigrate.distOperationsTablesTypesMod.DropTable
import typings.nodePgMigrate.distOperationsTablesTypesMod.RenameColumn
import typings.nodePgMigrate.distOperationsTablesTypesMod.RenameConstraint
import typings.nodePgMigrate.distOperationsTablesTypesMod.RenameTable
import typings.nodePgMigrate.distOperationsTriggersTypesMod.CreateTrigger
import typings.nodePgMigrate.distOperationsTriggersTypesMod.DropTrigger
import typings.nodePgMigrate.distOperationsTriggersTypesMod.RenameTrigger
import typings.nodePgMigrate.distOperationsTypesTypesMod.AddTypeAttribute
import typings.nodePgMigrate.distOperationsTypesTypesMod.AddTypeValue
import typings.nodePgMigrate.distOperationsTypesTypesMod.CreateType
import typings.nodePgMigrate.distOperationsTypesTypesMod.DropType
import typings.nodePgMigrate.distOperationsTypesTypesMod.DropTypeAttribute
import typings.nodePgMigrate.distOperationsTypesTypesMod.RenameType
import typings.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeAttribute
import typings.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeValue
import typings.nodePgMigrate.distOperationsTypesTypesMod.SetTypeAttribute
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.AlterMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.CreateMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.DropMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RefreshMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedViewColumn
import typings.nodePgMigrate.distOperationsViewsTypesMod.AlterView
import typings.nodePgMigrate.distOperationsViewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.distOperationsViewsTypesMod.CreateView
import typings.nodePgMigrate.distOperationsViewsTypesMod.DropView
import typings.nodePgMigrate.distOperationsViewsTypesMod.RenameView
import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.distTypesMod.Logger
import typings.nodePgMigrate.distTypesMod.MigrationBuilder
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMigrationBuilderMod {
  
  @JSImport("node-pg-migrate/dist/migration-builder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MigrationBuilderImpl {
    def this(db: DB, typeShorthands: Unit, shouldDecamelize: Boolean, logger: Logger) = this()
    def this(db: DB, typeShorthands: ColumnDefinitions, shouldDecamelize: Boolean, logger: Logger) = this()
    
    /* private */ /* CompleteClass */
    var _REVERSE_MODE: Any = js.native
    
    /* private */ /* CompleteClass */
    var _steps: Any = js.native
    
    /* private */ /* CompleteClass */
    var _useTransaction: Any = js.native
    
    /* CompleteClass */
    override def addColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addColumns(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addToOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.AddToOperatorFamily> is not an array type */ args: Parameters[AddToOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeAttribute> is not an array type */ args: Parameters[AddTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addTypeValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeValue> is not an array type */ args: Parameters[AddTypeValue]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterColumn> is not an array type */ args: Parameters[AlterColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.AlterDomain> is not an array type */ args: Parameters[AlterDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.AlterMaterializedView> is not an array type */ args: Parameters[AlterMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.AlterPolicy> is not an array type */ args: Parameters[AlterPolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.AlterRole> is not an array type */ args: Parameters[AlterRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.AlterSequence> is not an array type */ args: Parameters[AlterSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterTable> is not an array type */ args: Parameters[AlterTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterView> is not an array type */ args: Parameters[AlterView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterViewColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterViewColumn> is not an array type */ args: Parameters[AlterViewColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.CreateDomain> is not an array type */ args: Parameters[CreateDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.CreateFunction> is not an array type */ args: Parameters[CreateFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.CreateMaterializedView> is not an array type */ args: Parameters[CreateMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperator> is not an array type */ args: Parameters[CreateOperator]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorClass> is not an array type */ args: Parameters[CreateOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorFamily> is not an array type */ args: Parameters[CreateOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.CreatePolicy> is not an array type */ args: Parameters[CreatePolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.CreateRole> is not an array type */ args: Parameters[CreateRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.CreateSchema> is not an array type */ args: Parameters[CreateSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.CreateSequence> is not an array type */ args: Parameters[CreateSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateTable> is not an array type */ args: Parameters[CreateTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.CreateTrigger> is not an array type */ args: Parameters[CreateTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.CreateView> is not an array type */ args: Parameters[CreateView]
    ): Unit = js.native
    
    /* CompleteClass */
    var db: DB = js.native
    
    /* CompleteClass */
    override def dropColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropColumns(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropConstraint> is not an array type */ args: Parameters[DropConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.DropDomain> is not an array type */ args: Parameters[DropDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.DropExtension> is not an array type */ args: Parameters[DropExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.DropFunction> is not an array type */ args: Parameters[DropFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.DropIndex> is not an array type */ args: Parameters[DropIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.DropMaterializedView> is not an array type */ args: Parameters[DropMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperator> is not an array type */ args: Parameters[DropOperator]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorClass> is not an array type */ args: Parameters[DropOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorFamily> is not an array type */ args: Parameters[DropOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.DropPolicy> is not an array type */ args: Parameters[DropPolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.DropRole> is not an array type */ args: Parameters[DropRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.DropSchema> is not an array type */ args: Parameters[DropSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.DropSequence> is not an array type */ args: Parameters[DropSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropTable> is not an array type */ args: Parameters[DropTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.DropTrigger> is not an array type */ args: Parameters[DropTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropType> is not an array type */ args: Parameters[DropType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropTypeAttribute> is not an array type */ args: Parameters[DropTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.DropView> is not an array type */ args: Parameters[DropView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def enableReverseMode(): this.type = js.native
    
    /* CompleteClass */
    override def func(sql: String): typings.nodePgMigrate.distOperationsPgLiteralMod.default = js.native
    
    /* CompleteClass */
    override def getSql(): String = js.native
    
    /* CompleteClass */
    override def getSqlSteps(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def isUsingTransaction(): Boolean = js.native
    
    /* CompleteClass */
    override def noTransaction(): Unit = js.native
    
    /* CompleteClass */
    override def refreshMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RefreshMaterializedView> is not an array type */ args: Parameters[RefreshMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def removeFromOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RemoveFromOperatorFamily> is not an array type */ args: Parameters[RemoveFromOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameColumn> is not an array type */ args: Parameters[RenameColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameConstraint> is not an array type */ args: Parameters[RenameConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.RenameDomain> is not an array type */ args: Parameters[RenameDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.RenameFunction> is not an array type */ args: Parameters[RenameFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedView> is not an array type */ args: Parameters[RenameMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameMaterializedViewColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedViewColumn> is not an array type */ args: Parameters[RenameMaterializedViewColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorClass> is not an array type */ args: Parameters[RenameOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorFamily> is not an array type */ args: Parameters[RenameOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renamePolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.RenamePolicy> is not an array type */ args: Parameters[RenamePolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.RenameRole> is not an array type */ args: Parameters[RenameRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.RenameSchema> is not an array type */ args: Parameters[RenameSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.RenameSequence> is not an array type */ args: Parameters[RenameSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameTable> is not an array type */ args: Parameters[RenameTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.RenameTrigger> is not an array type */ args: Parameters[RenameTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameType> is not an array type */ args: Parameters[RenameType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeAttribute> is not an array type */ args: Parameters[RenameTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTypeValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeValue> is not an array type */ args: Parameters[RenameTypeValue]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.RenameView> is not an array type */ args: Parameters[RenameView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def setTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.SetTypeAttribute> is not an array type */ args: Parameters[SetTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def sql(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<other.Sql> is not an array type */ args: Parameters[Sql]
    ): Unit = js.native
  }
  
  trait MigrationBuilderImpl
    extends StObject
       with MigrationBuilder {
    
    /* private */ var _REVERSE_MODE: Any
    
    /* private */ var _steps: Any
    
    /* private */ var _useTransaction: Any
    
    def enableReverseMode(): this.type
    
    def getSql(): String
    
    def getSqlSteps(): js.Array[String]
    
    def isUsingTransaction(): Boolean
  }
  object MigrationBuilderImpl {
    
    inline def apply(
      _REVERSE_MODE: Any,
      _steps: Any,
      _useTransaction: Any,
      addColumn: Parameters[AddColumns] => Unit,
      addColumns: Parameters[AddColumns] => Unit,
      addConstraint: Parameters[CreateConstraint] => Unit,
      addExtension: Parameters[CreateExtension] => Unit,
      addIndex: Parameters[CreateIndex] => Unit,
      addToOperatorFamily: Parameters[AddToOperatorFamily] => Unit,
      addType: Parameters[CreateType] => Unit,
      addTypeAttribute: Parameters[AddTypeAttribute] => Unit,
      addTypeValue: Parameters[AddTypeValue] => Unit,
      alterColumn: Parameters[AlterColumn] => Unit,
      alterDomain: Parameters[AlterDomain] => Unit,
      alterMaterializedView: Parameters[AlterMaterializedView] => Unit,
      alterPolicy: Parameters[AlterPolicy] => Unit,
      alterRole: Parameters[AlterRole] => Unit,
      alterSequence: Parameters[AlterSequence] => Unit,
      alterTable: Parameters[AlterTable] => Unit,
      alterView: Parameters[AlterView] => Unit,
      alterViewColumn: Parameters[AlterViewColumn] => Unit,
      createConstraint: Parameters[CreateConstraint] => Unit,
      createDomain: Parameters[CreateDomain] => Unit,
      createExtension: Parameters[CreateExtension] => Unit,
      createFunction: Parameters[CreateFunction] => Unit,
      createIndex: Parameters[CreateIndex] => Unit,
      createMaterializedView: Parameters[CreateMaterializedView] => Unit,
      createOperator: Parameters[CreateOperator] => Unit,
      createOperatorClass: Parameters[CreateOperatorClass] => Unit,
      createOperatorFamily: Parameters[CreateOperatorFamily] => Unit,
      createPolicy: Parameters[CreatePolicy] => Unit,
      createRole: Parameters[CreateRole] => Unit,
      createSchema: Parameters[CreateSchema] => Unit,
      createSequence: Parameters[CreateSequence] => Unit,
      createTable: Parameters[CreateTable] => Unit,
      createTrigger: Parameters[CreateTrigger] => Unit,
      createType: Parameters[CreateType] => Unit,
      createView: Parameters[CreateView] => Unit,
      db: DB,
      dropColumn: Parameters[DropColumns] => Unit,
      dropColumns: Parameters[DropColumns] => Unit,
      dropConstraint: Parameters[DropConstraint] => Unit,
      dropDomain: Parameters[DropDomain] => Unit,
      dropExtension: Parameters[DropExtension] => Unit,
      dropFunction: Parameters[DropFunction] => Unit,
      dropIndex: Parameters[DropIndex] => Unit,
      dropMaterializedView: Parameters[DropMaterializedView] => Unit,
      dropOperator: Parameters[DropOperator] => Unit,
      dropOperatorClass: Parameters[DropOperatorClass] => Unit,
      dropOperatorFamily: Parameters[DropOperatorFamily] => Unit,
      dropPolicy: Parameters[DropPolicy] => Unit,
      dropRole: Parameters[DropRole] => Unit,
      dropSchema: Parameters[DropSchema] => Unit,
      dropSequence: Parameters[DropSequence] => Unit,
      dropTable: Parameters[DropTable] => Unit,
      dropTrigger: Parameters[DropTrigger] => Unit,
      dropType: Parameters[DropType] => Unit,
      dropTypeAttribute: Parameters[DropTypeAttribute] => Unit,
      dropView: Parameters[DropView] => Unit,
      enableReverseMode: () => MigrationBuilderImpl,
      func: String => typings.nodePgMigrate.distOperationsPgLiteralMod.default,
      getSql: () => String,
      getSqlSteps: () => js.Array[String],
      isUsingTransaction: () => Boolean,
      noTransaction: () => Unit,
      refreshMaterializedView: Parameters[RefreshMaterializedView] => Unit,
      removeFromOperatorFamily: Parameters[RemoveFromOperatorFamily] => Unit,
      renameColumn: Parameters[RenameColumn] => Unit,
      renameConstraint: Parameters[RenameConstraint] => Unit,
      renameDomain: Parameters[RenameDomain] => Unit,
      renameFunction: Parameters[RenameFunction] => Unit,
      renameMaterializedView: Parameters[RenameMaterializedView] => Unit,
      renameMaterializedViewColumn: Parameters[RenameMaterializedViewColumn] => Unit,
      renameOperatorClass: Parameters[RenameOperatorClass] => Unit,
      renameOperatorFamily: Parameters[RenameOperatorFamily] => Unit,
      renamePolicy: Parameters[RenamePolicy] => Unit,
      renameRole: Parameters[RenameRole] => Unit,
      renameSchema: Parameters[RenameSchema] => Unit,
      renameSequence: Parameters[RenameSequence] => Unit,
      renameTable: Parameters[RenameTable] => Unit,
      renameTrigger: Parameters[RenameTrigger] => Unit,
      renameType: Parameters[RenameType] => Unit,
      renameTypeAttribute: Parameters[RenameTypeAttribute] => Unit,
      renameTypeValue: Parameters[RenameTypeValue] => Unit,
      renameView: Parameters[RenameView] => Unit,
      setTypeAttribute: Parameters[SetTypeAttribute] => Unit,
      sql: Parameters[Sql] => Unit
    ): MigrationBuilderImpl = {
      val __obj = js.Dynamic.literal(_REVERSE_MODE = _REVERSE_MODE.asInstanceOf[js.Any], _steps = _steps.asInstanceOf[js.Any], _useTransaction = _useTransaction.asInstanceOf[js.Any], addColumn = js.Any.fromFunction1(addColumn), addColumns = js.Any.fromFunction1(addColumns), addConstraint = js.Any.fromFunction1(addConstraint), addExtension = js.Any.fromFunction1(addExtension), addIndex = js.Any.fromFunction1(addIndex), addToOperatorFamily = js.Any.fromFunction1(addToOperatorFamily), addType = js.Any.fromFunction1(addType), addTypeAttribute = js.Any.fromFunction1(addTypeAttribute), addTypeValue = js.Any.fromFunction1(addTypeValue), alterColumn = js.Any.fromFunction1(alterColumn), alterDomain = js.Any.fromFunction1(alterDomain), alterMaterializedView = js.Any.fromFunction1(alterMaterializedView), alterPolicy = js.Any.fromFunction1(alterPolicy), alterRole = js.Any.fromFunction1(alterRole), alterSequence = js.Any.fromFunction1(alterSequence), alterTable = js.Any.fromFunction1(alterTable), alterView = js.Any.fromFunction1(alterView), alterViewColumn = js.Any.fromFunction1(alterViewColumn), createConstraint = js.Any.fromFunction1(createConstraint), createDomain = js.Any.fromFunction1(createDomain), createExtension = js.Any.fromFunction1(createExtension), createFunction = js.Any.fromFunction1(createFunction), createIndex = js.Any.fromFunction1(createIndex), createMaterializedView = js.Any.fromFunction1(createMaterializedView), createOperator = js.Any.fromFunction1(createOperator), createOperatorClass = js.Any.fromFunction1(createOperatorClass), createOperatorFamily = js.Any.fromFunction1(createOperatorFamily), createPolicy = js.Any.fromFunction1(createPolicy), createRole = js.Any.fromFunction1(createRole), createSchema = js.Any.fromFunction1(createSchema), createSequence = js.Any.fromFunction1(createSequence), createTable = js.Any.fromFunction1(createTable), createTrigger = js.Any.fromFunction1(createTrigger), createType = js.Any.fromFunction1(createType), createView = js.Any.fromFunction1(createView), db = db.asInstanceOf[js.Any], dropColumn = js.Any.fromFunction1(dropColumn), dropColumns = js.Any.fromFunction1(dropColumns), dropConstraint = js.Any.fromFunction1(dropConstraint), dropDomain = js.Any.fromFunction1(dropDomain), dropExtension = js.Any.fromFunction1(dropExtension), dropFunction = js.Any.fromFunction1(dropFunction), dropIndex = js.Any.fromFunction1(dropIndex), dropMaterializedView = js.Any.fromFunction1(dropMaterializedView), dropOperator = js.Any.fromFunction1(dropOperator), dropOperatorClass = js.Any.fromFunction1(dropOperatorClass), dropOperatorFamily = js.Any.fromFunction1(dropOperatorFamily), dropPolicy = js.Any.fromFunction1(dropPolicy), dropRole = js.Any.fromFunction1(dropRole), dropSchema = js.Any.fromFunction1(dropSchema), dropSequence = js.Any.fromFunction1(dropSequence), dropTable = js.Any.fromFunction1(dropTable), dropTrigger = js.Any.fromFunction1(dropTrigger), dropType = js.Any.fromFunction1(dropType), dropTypeAttribute = js.Any.fromFunction1(dropTypeAttribute), dropView = js.Any.fromFunction1(dropView), enableReverseMode = js.Any.fromFunction0(enableReverseMode), func = js.Any.fromFunction1(func), getSql = js.Any.fromFunction0(getSql), getSqlSteps = js.Any.fromFunction0(getSqlSteps), isUsingTransaction = js.Any.fromFunction0(isUsingTransaction), noTransaction = js.Any.fromFunction0(noTransaction), refreshMaterializedView = js.Any.fromFunction1(refreshMaterializedView), removeFromOperatorFamily = js.Any.fromFunction1(removeFromOperatorFamily), renameColumn = js.Any.fromFunction1(renameColumn), renameConstraint = js.Any.fromFunction1(renameConstraint), renameDomain = js.Any.fromFunction1(renameDomain), renameFunction = js.Any.fromFunction1(renameFunction), renameMaterializedView = js.Any.fromFunction1(renameMaterializedView), renameMaterializedViewColumn = js.Any.fromFunction1(renameMaterializedViewColumn), renameOperatorClass = js.Any.fromFunction1(renameOperatorClass), renameOperatorFamily = js.Any.fromFunction1(renameOperatorFamily), renamePolicy = js.Any.fromFunction1(renamePolicy), renameRole = js.Any.fromFunction1(renameRole), renameSchema = js.Any.fromFunction1(renameSchema), renameSequence = js.Any.fromFunction1(renameSequence), renameTable = js.Any.fromFunction1(renameTable), renameTrigger = js.Any.fromFunction1(renameTrigger), renameType = js.Any.fromFunction1(renameType), renameTypeAttribute = js.Any.fromFunction1(renameTypeAttribute), renameTypeValue = js.Any.fromFunction1(renameTypeValue), renameView = js.Any.fromFunction1(renameView), setTypeAttribute = js.Any.fromFunction1(setTypeAttribute), sql = js.Any.fromFunction1(sql))
      __obj.asInstanceOf[MigrationBuilderImpl]
    }
    
    extension [Self <: MigrationBuilderImpl](x: Self) {
      
      inline def setEnableReverseMode(value: () => MigrationBuilderImpl): Self = StObject.set(x, "enableReverseMode", js.Any.fromFunction0(value))
      
      inline def setGetSql(value: () => String): Self = StObject.set(x, "getSql", js.Any.fromFunction0(value))
      
      inline def setGetSqlSteps(value: () => js.Array[String]): Self = StObject.set(x, "getSqlSteps", js.Any.fromFunction0(value))
      
      inline def setIsUsingTransaction(value: () => Boolean): Self = StObject.set(x, "isUsingTransaction", js.Any.fromFunction0(value))
      
      inline def set_REVERSE_MODE(value: Any): Self = StObject.set(x, "_REVERSE_MODE", value.asInstanceOf[js.Any])
      
      inline def set_steps(value: Any): Self = StObject.set(x, "_steps", value.asInstanceOf[js.Any])
      
      inline def set_useTransaction(value: Any): Self = StObject.set(x, "_useTransaction", value.asInstanceOf[js.Any])
    }
  }
}
