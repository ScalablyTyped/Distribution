package typings.nodePgMigrate.migrationBuilderMod

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.domainsTypesMod.AlterDomain
import typings.nodePgMigrate.domainsTypesMod.CreateDomain
import typings.nodePgMigrate.domainsTypesMod.DropDomain
import typings.nodePgMigrate.domainsTypesMod.RenameDomain
import typings.nodePgMigrate.extensionsTypesMod.CreateExtension
import typings.nodePgMigrate.extensionsTypesMod.DropExtension
import typings.nodePgMigrate.functionsTypesMod.CreateFunction
import typings.nodePgMigrate.functionsTypesMod.DropFunction
import typings.nodePgMigrate.functionsTypesMod.RenameFunction
import typings.nodePgMigrate.indexesTypesMod.CreateIndex
import typings.nodePgMigrate.indexesTypesMod.DropIndex
import typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.CreateOperator
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.DropOperator
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.RemoveFromOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamily
import typings.nodePgMigrate.othersTypesMod.Sql
import typings.nodePgMigrate.policiesTypesMod.AlterPolicy
import typings.nodePgMigrate.policiesTypesMod.CreatePolicy
import typings.nodePgMigrate.policiesTypesMod.DropPolicy
import typings.nodePgMigrate.policiesTypesMod.RenamePolicy
import typings.nodePgMigrate.rolesTypesMod.AlterRole
import typings.nodePgMigrate.rolesTypesMod.CreateRole
import typings.nodePgMigrate.rolesTypesMod.DropRole
import typings.nodePgMigrate.rolesTypesMod.RenameRole
import typings.nodePgMigrate.schemasTypesMod.CreateSchema
import typings.nodePgMigrate.schemasTypesMod.DropSchema
import typings.nodePgMigrate.schemasTypesMod.RenameSchema
import typings.nodePgMigrate.sequencesTypesMod.AlterSequence
import typings.nodePgMigrate.sequencesTypesMod.CreateSequence
import typings.nodePgMigrate.sequencesTypesMod.DropSequence
import typings.nodePgMigrate.sequencesTypesMod.RenameSequence
import typings.nodePgMigrate.tablesTypesMod.AddColumns
import typings.nodePgMigrate.tablesTypesMod.AlterColumn
import typings.nodePgMigrate.tablesTypesMod.AlterTable
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import typings.nodePgMigrate.tablesTypesMod.CreateConstraint
import typings.nodePgMigrate.tablesTypesMod.CreateTable
import typings.nodePgMigrate.tablesTypesMod.DropColumns
import typings.nodePgMigrate.tablesTypesMod.DropConstraint
import typings.nodePgMigrate.tablesTypesMod.DropTable
import typings.nodePgMigrate.tablesTypesMod.RenameColumn
import typings.nodePgMigrate.tablesTypesMod.RenameConstraint
import typings.nodePgMigrate.tablesTypesMod.RenameTable
import typings.nodePgMigrate.triggersTypesMod.CreateTrigger
import typings.nodePgMigrate.triggersTypesMod.DropTrigger
import typings.nodePgMigrate.triggersTypesMod.RenameTrigger
import typings.nodePgMigrate.typesTypesMod.AddTypeAttribute
import typings.nodePgMigrate.typesTypesMod.AddTypeValue
import typings.nodePgMigrate.typesTypesMod.CreateType
import typings.nodePgMigrate.typesTypesMod.DropType
import typings.nodePgMigrate.typesTypesMod.DropTypeAttribute
import typings.nodePgMigrate.typesTypesMod.RenameType
import typings.nodePgMigrate.typesTypesMod.RenameTypeAttribute
import typings.nodePgMigrate.typesTypesMod.RenameTypeValue
import typings.nodePgMigrate.typesTypesMod.SetTypeAttribute
import typings.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.DropMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumn
import typings.nodePgMigrate.viewsTypesMod.AlterView
import typings.nodePgMigrate.viewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.viewsTypesMod.CreateView
import typings.nodePgMigrate.viewsTypesMod.DropView
import typings.nodePgMigrate.viewsTypesMod.RenameView
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration-builder", JSImport.Default)
@js.native
class default protected () extends MigrationBuilderImpl {
  def this(db: DB, typeShorthands: js.UndefOr[scala.Nothing], shouldDecamelize: Boolean) = this()
  def this(db: DB, typeShorthands: ColumnDefinitions, shouldDecamelize: Boolean) = this()
  /* CompleteClass */
  override var _REVERSE_MODE: js.Any = js.native
  /* CompleteClass */
  override var _steps: js.Any = js.native
  /* CompleteClass */
  override var _useTransaction: js.Any = js.native
  /* CompleteClass */
  override var db: DB = js.native
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
  override def func(sql: String): typings.nodePgMigrate.pgLiteralMod.default = js.native
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

