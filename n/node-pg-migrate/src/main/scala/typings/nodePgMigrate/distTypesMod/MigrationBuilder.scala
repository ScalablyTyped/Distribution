package typings.nodePgMigrate.distTypesMod

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
import typings.nodePgMigrate.distOperationsPgLiteralMod.default
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
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationBuilder extends StObject {
  
  def addColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit
  
  def addColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit
  
  def addConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit
  
  def addExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit
  
  def addIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit
  
  def addToOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.AddToOperatorFamily> is not an array type */ args: Parameters[AddToOperatorFamily]
  ): Unit
  
  def addType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit
  
  def addTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeAttribute> is not an array type */ args: Parameters[AddTypeAttribute]
  ): Unit
  
  def addTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeValue> is not an array type */ args: Parameters[AddTypeValue]
  ): Unit
  
  def alterColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterColumn> is not an array type */ args: Parameters[AlterColumn]
  ): Unit
  
  def alterDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.AlterDomain> is not an array type */ args: Parameters[AlterDomain]
  ): Unit
  
  def alterMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.AlterMaterializedView> is not an array type */ args: Parameters[AlterMaterializedView]
  ): Unit
  
  def alterPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.AlterPolicy> is not an array type */ args: Parameters[AlterPolicy]
  ): Unit
  
  def alterRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.AlterRole> is not an array type */ args: Parameters[AlterRole]
  ): Unit
  
  def alterSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.AlterSequence> is not an array type */ args: Parameters[AlterSequence]
  ): Unit
  
  def alterTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterTable> is not an array type */ args: Parameters[AlterTable]
  ): Unit
  
  def alterView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterView> is not an array type */ args: Parameters[AlterView]
  ): Unit
  
  def alterViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterViewColumn> is not an array type */ args: Parameters[AlterViewColumn]
  ): Unit
  
  def createConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit
  
  def createDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.CreateDomain> is not an array type */ args: Parameters[CreateDomain]
  ): Unit
  
  def createExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit
  
  def createFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.CreateFunction> is not an array type */ args: Parameters[CreateFunction]
  ): Unit
  
  def createIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit
  
  def createMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.CreateMaterializedView> is not an array type */ args: Parameters[CreateMaterializedView]
  ): Unit
  
  def createOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperator> is not an array type */ args: Parameters[CreateOperator]
  ): Unit
  
  def createOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorClass> is not an array type */ args: Parameters[CreateOperatorClass]
  ): Unit
  
  def createOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorFamily> is not an array type */ args: Parameters[CreateOperatorFamily]
  ): Unit
  
  def createPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.CreatePolicy> is not an array type */ args: Parameters[CreatePolicy]
  ): Unit
  
  def createRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.CreateRole> is not an array type */ args: Parameters[CreateRole]
  ): Unit
  
  def createSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.CreateSchema> is not an array type */ args: Parameters[CreateSchema]
  ): Unit
  
  def createSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.CreateSequence> is not an array type */ args: Parameters[CreateSequence]
  ): Unit
  
  def createTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateTable> is not an array type */ args: Parameters[CreateTable]
  ): Unit
  
  def createTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.CreateTrigger> is not an array type */ args: Parameters[CreateTrigger]
  ): Unit
  
  def createType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit
  
  def createView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.CreateView> is not an array type */ args: Parameters[CreateView]
  ): Unit
  
  var db: DB
  
  def dropColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit
  
  def dropColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit
  
  def dropConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropConstraint> is not an array type */ args: Parameters[DropConstraint]
  ): Unit
  
  def dropDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.DropDomain> is not an array type */ args: Parameters[DropDomain]
  ): Unit
  
  def dropExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.DropExtension> is not an array type */ args: Parameters[DropExtension]
  ): Unit
  
  def dropFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.DropFunction> is not an array type */ args: Parameters[DropFunction]
  ): Unit
  
  def dropIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.DropIndex> is not an array type */ args: Parameters[DropIndex]
  ): Unit
  
  def dropMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.DropMaterializedView> is not an array type */ args: Parameters[DropMaterializedView]
  ): Unit
  
  def dropOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperator> is not an array type */ args: Parameters[DropOperator]
  ): Unit
  
  def dropOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorClass> is not an array type */ args: Parameters[DropOperatorClass]
  ): Unit
  
  def dropOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorFamily> is not an array type */ args: Parameters[DropOperatorFamily]
  ): Unit
  
  def dropPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.DropPolicy> is not an array type */ args: Parameters[DropPolicy]
  ): Unit
  
  def dropRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.DropRole> is not an array type */ args: Parameters[DropRole]
  ): Unit
  
  def dropSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.DropSchema> is not an array type */ args: Parameters[DropSchema]
  ): Unit
  
  def dropSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.DropSequence> is not an array type */ args: Parameters[DropSequence]
  ): Unit
  
  def dropTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropTable> is not an array type */ args: Parameters[DropTable]
  ): Unit
  
  def dropTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.DropTrigger> is not an array type */ args: Parameters[DropTrigger]
  ): Unit
  
  def dropType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropType> is not an array type */ args: Parameters[DropType]
  ): Unit
  
  def dropTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropTypeAttribute> is not an array type */ args: Parameters[DropTypeAttribute]
  ): Unit
  
  def dropView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.DropView> is not an array type */ args: Parameters[DropView]
  ): Unit
  
  def func(sql: String): default
  
  def noTransaction(): Unit
  
  def refreshMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RefreshMaterializedView> is not an array type */ args: Parameters[RefreshMaterializedView]
  ): Unit
  
  def removeFromOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RemoveFromOperatorFamily> is not an array type */ args: Parameters[RemoveFromOperatorFamily]
  ): Unit
  
  def renameColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameColumn> is not an array type */ args: Parameters[RenameColumn]
  ): Unit
  
  def renameConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameConstraint> is not an array type */ args: Parameters[RenameConstraint]
  ): Unit
  
  def renameDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.RenameDomain> is not an array type */ args: Parameters[RenameDomain]
  ): Unit
  
  def renameFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.RenameFunction> is not an array type */ args: Parameters[RenameFunction]
  ): Unit
  
  def renameMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedView> is not an array type */ args: Parameters[RenameMaterializedView]
  ): Unit
  
  def renameMaterializedViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedViewColumn> is not an array type */ args: Parameters[RenameMaterializedViewColumn]
  ): Unit
  
  def renameOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorClass> is not an array type */ args: Parameters[RenameOperatorClass]
  ): Unit
  
  def renameOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorFamily> is not an array type */ args: Parameters[RenameOperatorFamily]
  ): Unit
  
  def renamePolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.RenamePolicy> is not an array type */ args: Parameters[RenamePolicy]
  ): Unit
  
  def renameRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.RenameRole> is not an array type */ args: Parameters[RenameRole]
  ): Unit
  
  def renameSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.RenameSchema> is not an array type */ args: Parameters[RenameSchema]
  ): Unit
  
  def renameSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.RenameSequence> is not an array type */ args: Parameters[RenameSequence]
  ): Unit
  
  def renameTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameTable> is not an array type */ args: Parameters[RenameTable]
  ): Unit
  
  def renameTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.RenameTrigger> is not an array type */ args: Parameters[RenameTrigger]
  ): Unit
  
  def renameType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameType> is not an array type */ args: Parameters[RenameType]
  ): Unit
  
  def renameTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeAttribute> is not an array type */ args: Parameters[RenameTypeAttribute]
  ): Unit
  
  def renameTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeValue> is not an array type */ args: Parameters[RenameTypeValue]
  ): Unit
  
  def renameView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.RenameView> is not an array type */ args: Parameters[RenameView]
  ): Unit
  
  def setTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.SetTypeAttribute> is not an array type */ args: Parameters[SetTypeAttribute]
  ): Unit
  
  def sql(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<other.Sql> is not an array type */ args: Parameters[Sql]
  ): Unit
}
object MigrationBuilder {
  
  inline def apply(
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
    func: String => default,
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
  ): MigrationBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction1(addColumn), addColumns = js.Any.fromFunction1(addColumns), addConstraint = js.Any.fromFunction1(addConstraint), addExtension = js.Any.fromFunction1(addExtension), addIndex = js.Any.fromFunction1(addIndex), addToOperatorFamily = js.Any.fromFunction1(addToOperatorFamily), addType = js.Any.fromFunction1(addType), addTypeAttribute = js.Any.fromFunction1(addTypeAttribute), addTypeValue = js.Any.fromFunction1(addTypeValue), alterColumn = js.Any.fromFunction1(alterColumn), alterDomain = js.Any.fromFunction1(alterDomain), alterMaterializedView = js.Any.fromFunction1(alterMaterializedView), alterPolicy = js.Any.fromFunction1(alterPolicy), alterRole = js.Any.fromFunction1(alterRole), alterSequence = js.Any.fromFunction1(alterSequence), alterTable = js.Any.fromFunction1(alterTable), alterView = js.Any.fromFunction1(alterView), alterViewColumn = js.Any.fromFunction1(alterViewColumn), createConstraint = js.Any.fromFunction1(createConstraint), createDomain = js.Any.fromFunction1(createDomain), createExtension = js.Any.fromFunction1(createExtension), createFunction = js.Any.fromFunction1(createFunction), createIndex = js.Any.fromFunction1(createIndex), createMaterializedView = js.Any.fromFunction1(createMaterializedView), createOperator = js.Any.fromFunction1(createOperator), createOperatorClass = js.Any.fromFunction1(createOperatorClass), createOperatorFamily = js.Any.fromFunction1(createOperatorFamily), createPolicy = js.Any.fromFunction1(createPolicy), createRole = js.Any.fromFunction1(createRole), createSchema = js.Any.fromFunction1(createSchema), createSequence = js.Any.fromFunction1(createSequence), createTable = js.Any.fromFunction1(createTable), createTrigger = js.Any.fromFunction1(createTrigger), createType = js.Any.fromFunction1(createType), createView = js.Any.fromFunction1(createView), db = db.asInstanceOf[js.Any], dropColumn = js.Any.fromFunction1(dropColumn), dropColumns = js.Any.fromFunction1(dropColumns), dropConstraint = js.Any.fromFunction1(dropConstraint), dropDomain = js.Any.fromFunction1(dropDomain), dropExtension = js.Any.fromFunction1(dropExtension), dropFunction = js.Any.fromFunction1(dropFunction), dropIndex = js.Any.fromFunction1(dropIndex), dropMaterializedView = js.Any.fromFunction1(dropMaterializedView), dropOperator = js.Any.fromFunction1(dropOperator), dropOperatorClass = js.Any.fromFunction1(dropOperatorClass), dropOperatorFamily = js.Any.fromFunction1(dropOperatorFamily), dropPolicy = js.Any.fromFunction1(dropPolicy), dropRole = js.Any.fromFunction1(dropRole), dropSchema = js.Any.fromFunction1(dropSchema), dropSequence = js.Any.fromFunction1(dropSequence), dropTable = js.Any.fromFunction1(dropTable), dropTrigger = js.Any.fromFunction1(dropTrigger), dropType = js.Any.fromFunction1(dropType), dropTypeAttribute = js.Any.fromFunction1(dropTypeAttribute), dropView = js.Any.fromFunction1(dropView), func = js.Any.fromFunction1(func), noTransaction = js.Any.fromFunction0(noTransaction), refreshMaterializedView = js.Any.fromFunction1(refreshMaterializedView), removeFromOperatorFamily = js.Any.fromFunction1(removeFromOperatorFamily), renameColumn = js.Any.fromFunction1(renameColumn), renameConstraint = js.Any.fromFunction1(renameConstraint), renameDomain = js.Any.fromFunction1(renameDomain), renameFunction = js.Any.fromFunction1(renameFunction), renameMaterializedView = js.Any.fromFunction1(renameMaterializedView), renameMaterializedViewColumn = js.Any.fromFunction1(renameMaterializedViewColumn), renameOperatorClass = js.Any.fromFunction1(renameOperatorClass), renameOperatorFamily = js.Any.fromFunction1(renameOperatorFamily), renamePolicy = js.Any.fromFunction1(renamePolicy), renameRole = js.Any.fromFunction1(renameRole), renameSchema = js.Any.fromFunction1(renameSchema), renameSequence = js.Any.fromFunction1(renameSequence), renameTable = js.Any.fromFunction1(renameTable), renameTrigger = js.Any.fromFunction1(renameTrigger), renameType = js.Any.fromFunction1(renameType), renameTypeAttribute = js.Any.fromFunction1(renameTypeAttribute), renameTypeValue = js.Any.fromFunction1(renameTypeValue), renameView = js.Any.fromFunction1(renameView), setTypeAttribute = js.Any.fromFunction1(setTypeAttribute), sql = js.Any.fromFunction1(sql))
    __obj.asInstanceOf[MigrationBuilder]
  }
  
  extension [Self <: MigrationBuilder](x: Self) {
    
    inline def setAddColumn(value: Parameters[AddColumns] => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction1(value))
    
    inline def setAddColumns(value: Parameters[AddColumns] => Unit): Self = StObject.set(x, "addColumns", js.Any.fromFunction1(value))
    
    inline def setAddConstraint(value: Parameters[CreateConstraint] => Unit): Self = StObject.set(x, "addConstraint", js.Any.fromFunction1(value))
    
    inline def setAddExtension(value: Parameters[CreateExtension] => Unit): Self = StObject.set(x, "addExtension", js.Any.fromFunction1(value))
    
    inline def setAddIndex(value: Parameters[CreateIndex] => Unit): Self = StObject.set(x, "addIndex", js.Any.fromFunction1(value))
    
    inline def setAddToOperatorFamily(value: Parameters[AddToOperatorFamily] => Unit): Self = StObject.set(x, "addToOperatorFamily", js.Any.fromFunction1(value))
    
    inline def setAddType(value: Parameters[CreateType] => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction1(value))
    
    inline def setAddTypeAttribute(value: Parameters[AddTypeAttribute] => Unit): Self = StObject.set(x, "addTypeAttribute", js.Any.fromFunction1(value))
    
    inline def setAddTypeValue(value: Parameters[AddTypeValue] => Unit): Self = StObject.set(x, "addTypeValue", js.Any.fromFunction1(value))
    
    inline def setAlterColumn(value: Parameters[AlterColumn] => Unit): Self = StObject.set(x, "alterColumn", js.Any.fromFunction1(value))
    
    inline def setAlterDomain(value: Parameters[AlterDomain] => Unit): Self = StObject.set(x, "alterDomain", js.Any.fromFunction1(value))
    
    inline def setAlterMaterializedView(value: Parameters[AlterMaterializedView] => Unit): Self = StObject.set(x, "alterMaterializedView", js.Any.fromFunction1(value))
    
    inline def setAlterPolicy(value: Parameters[AlterPolicy] => Unit): Self = StObject.set(x, "alterPolicy", js.Any.fromFunction1(value))
    
    inline def setAlterRole(value: Parameters[AlterRole] => Unit): Self = StObject.set(x, "alterRole", js.Any.fromFunction1(value))
    
    inline def setAlterSequence(value: Parameters[AlterSequence] => Unit): Self = StObject.set(x, "alterSequence", js.Any.fromFunction1(value))
    
    inline def setAlterTable(value: Parameters[AlterTable] => Unit): Self = StObject.set(x, "alterTable", js.Any.fromFunction1(value))
    
    inline def setAlterView(value: Parameters[AlterView] => Unit): Self = StObject.set(x, "alterView", js.Any.fromFunction1(value))
    
    inline def setAlterViewColumn(value: Parameters[AlterViewColumn] => Unit): Self = StObject.set(x, "alterViewColumn", js.Any.fromFunction1(value))
    
    inline def setCreateConstraint(value: Parameters[CreateConstraint] => Unit): Self = StObject.set(x, "createConstraint", js.Any.fromFunction1(value))
    
    inline def setCreateDomain(value: Parameters[CreateDomain] => Unit): Self = StObject.set(x, "createDomain", js.Any.fromFunction1(value))
    
    inline def setCreateExtension(value: Parameters[CreateExtension] => Unit): Self = StObject.set(x, "createExtension", js.Any.fromFunction1(value))
    
    inline def setCreateFunction(value: Parameters[CreateFunction] => Unit): Self = StObject.set(x, "createFunction", js.Any.fromFunction1(value))
    
    inline def setCreateIndex(value: Parameters[CreateIndex] => Unit): Self = StObject.set(x, "createIndex", js.Any.fromFunction1(value))
    
    inline def setCreateMaterializedView(value: Parameters[CreateMaterializedView] => Unit): Self = StObject.set(x, "createMaterializedView", js.Any.fromFunction1(value))
    
    inline def setCreateOperator(value: Parameters[CreateOperator] => Unit): Self = StObject.set(x, "createOperator", js.Any.fromFunction1(value))
    
    inline def setCreateOperatorClass(value: Parameters[CreateOperatorClass] => Unit): Self = StObject.set(x, "createOperatorClass", js.Any.fromFunction1(value))
    
    inline def setCreateOperatorFamily(value: Parameters[CreateOperatorFamily] => Unit): Self = StObject.set(x, "createOperatorFamily", js.Any.fromFunction1(value))
    
    inline def setCreatePolicy(value: Parameters[CreatePolicy] => Unit): Self = StObject.set(x, "createPolicy", js.Any.fromFunction1(value))
    
    inline def setCreateRole(value: Parameters[CreateRole] => Unit): Self = StObject.set(x, "createRole", js.Any.fromFunction1(value))
    
    inline def setCreateSchema(value: Parameters[CreateSchema] => Unit): Self = StObject.set(x, "createSchema", js.Any.fromFunction1(value))
    
    inline def setCreateSequence(value: Parameters[CreateSequence] => Unit): Self = StObject.set(x, "createSequence", js.Any.fromFunction1(value))
    
    inline def setCreateTable(value: Parameters[CreateTable] => Unit): Self = StObject.set(x, "createTable", js.Any.fromFunction1(value))
    
    inline def setCreateTrigger(value: Parameters[CreateTrigger] => Unit): Self = StObject.set(x, "createTrigger", js.Any.fromFunction1(value))
    
    inline def setCreateType(value: Parameters[CreateType] => Unit): Self = StObject.set(x, "createType", js.Any.fromFunction1(value))
    
    inline def setCreateView(value: Parameters[CreateView] => Unit): Self = StObject.set(x, "createView", js.Any.fromFunction1(value))
    
    inline def setDb(value: DB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDropColumn(value: Parameters[DropColumns] => Unit): Self = StObject.set(x, "dropColumn", js.Any.fromFunction1(value))
    
    inline def setDropColumns(value: Parameters[DropColumns] => Unit): Self = StObject.set(x, "dropColumns", js.Any.fromFunction1(value))
    
    inline def setDropConstraint(value: Parameters[DropConstraint] => Unit): Self = StObject.set(x, "dropConstraint", js.Any.fromFunction1(value))
    
    inline def setDropDomain(value: Parameters[DropDomain] => Unit): Self = StObject.set(x, "dropDomain", js.Any.fromFunction1(value))
    
    inline def setDropExtension(value: Parameters[DropExtension] => Unit): Self = StObject.set(x, "dropExtension", js.Any.fromFunction1(value))
    
    inline def setDropFunction(value: Parameters[DropFunction] => Unit): Self = StObject.set(x, "dropFunction", js.Any.fromFunction1(value))
    
    inline def setDropIndex(value: Parameters[DropIndex] => Unit): Self = StObject.set(x, "dropIndex", js.Any.fromFunction1(value))
    
    inline def setDropMaterializedView(value: Parameters[DropMaterializedView] => Unit): Self = StObject.set(x, "dropMaterializedView", js.Any.fromFunction1(value))
    
    inline def setDropOperator(value: Parameters[DropOperator] => Unit): Self = StObject.set(x, "dropOperator", js.Any.fromFunction1(value))
    
    inline def setDropOperatorClass(value: Parameters[DropOperatorClass] => Unit): Self = StObject.set(x, "dropOperatorClass", js.Any.fromFunction1(value))
    
    inline def setDropOperatorFamily(value: Parameters[DropOperatorFamily] => Unit): Self = StObject.set(x, "dropOperatorFamily", js.Any.fromFunction1(value))
    
    inline def setDropPolicy(value: Parameters[DropPolicy] => Unit): Self = StObject.set(x, "dropPolicy", js.Any.fromFunction1(value))
    
    inline def setDropRole(value: Parameters[DropRole] => Unit): Self = StObject.set(x, "dropRole", js.Any.fromFunction1(value))
    
    inline def setDropSchema(value: Parameters[DropSchema] => Unit): Self = StObject.set(x, "dropSchema", js.Any.fromFunction1(value))
    
    inline def setDropSequence(value: Parameters[DropSequence] => Unit): Self = StObject.set(x, "dropSequence", js.Any.fromFunction1(value))
    
    inline def setDropTable(value: Parameters[DropTable] => Unit): Self = StObject.set(x, "dropTable", js.Any.fromFunction1(value))
    
    inline def setDropTrigger(value: Parameters[DropTrigger] => Unit): Self = StObject.set(x, "dropTrigger", js.Any.fromFunction1(value))
    
    inline def setDropType(value: Parameters[DropType] => Unit): Self = StObject.set(x, "dropType", js.Any.fromFunction1(value))
    
    inline def setDropTypeAttribute(value: Parameters[DropTypeAttribute] => Unit): Self = StObject.set(x, "dropTypeAttribute", js.Any.fromFunction1(value))
    
    inline def setDropView(value: Parameters[DropView] => Unit): Self = StObject.set(x, "dropView", js.Any.fromFunction1(value))
    
    inline def setFunc(value: String => default): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
    
    inline def setNoTransaction(value: () => Unit): Self = StObject.set(x, "noTransaction", js.Any.fromFunction0(value))
    
    inline def setRefreshMaterializedView(value: Parameters[RefreshMaterializedView] => Unit): Self = StObject.set(x, "refreshMaterializedView", js.Any.fromFunction1(value))
    
    inline def setRemoveFromOperatorFamily(value: Parameters[RemoveFromOperatorFamily] => Unit): Self = StObject.set(x, "removeFromOperatorFamily", js.Any.fromFunction1(value))
    
    inline def setRenameColumn(value: Parameters[RenameColumn] => Unit): Self = StObject.set(x, "renameColumn", js.Any.fromFunction1(value))
    
    inline def setRenameConstraint(value: Parameters[RenameConstraint] => Unit): Self = StObject.set(x, "renameConstraint", js.Any.fromFunction1(value))
    
    inline def setRenameDomain(value: Parameters[RenameDomain] => Unit): Self = StObject.set(x, "renameDomain", js.Any.fromFunction1(value))
    
    inline def setRenameFunction(value: Parameters[RenameFunction] => Unit): Self = StObject.set(x, "renameFunction", js.Any.fromFunction1(value))
    
    inline def setRenameMaterializedView(value: Parameters[RenameMaterializedView] => Unit): Self = StObject.set(x, "renameMaterializedView", js.Any.fromFunction1(value))
    
    inline def setRenameMaterializedViewColumn(value: Parameters[RenameMaterializedViewColumn] => Unit): Self = StObject.set(x, "renameMaterializedViewColumn", js.Any.fromFunction1(value))
    
    inline def setRenameOperatorClass(value: Parameters[RenameOperatorClass] => Unit): Self = StObject.set(x, "renameOperatorClass", js.Any.fromFunction1(value))
    
    inline def setRenameOperatorFamily(value: Parameters[RenameOperatorFamily] => Unit): Self = StObject.set(x, "renameOperatorFamily", js.Any.fromFunction1(value))
    
    inline def setRenamePolicy(value: Parameters[RenamePolicy] => Unit): Self = StObject.set(x, "renamePolicy", js.Any.fromFunction1(value))
    
    inline def setRenameRole(value: Parameters[RenameRole] => Unit): Self = StObject.set(x, "renameRole", js.Any.fromFunction1(value))
    
    inline def setRenameSchema(value: Parameters[RenameSchema] => Unit): Self = StObject.set(x, "renameSchema", js.Any.fromFunction1(value))
    
    inline def setRenameSequence(value: Parameters[RenameSequence] => Unit): Self = StObject.set(x, "renameSequence", js.Any.fromFunction1(value))
    
    inline def setRenameTable(value: Parameters[RenameTable] => Unit): Self = StObject.set(x, "renameTable", js.Any.fromFunction1(value))
    
    inline def setRenameTrigger(value: Parameters[RenameTrigger] => Unit): Self = StObject.set(x, "renameTrigger", js.Any.fromFunction1(value))
    
    inline def setRenameType(value: Parameters[RenameType] => Unit): Self = StObject.set(x, "renameType", js.Any.fromFunction1(value))
    
    inline def setRenameTypeAttribute(value: Parameters[RenameTypeAttribute] => Unit): Self = StObject.set(x, "renameTypeAttribute", js.Any.fromFunction1(value))
    
    inline def setRenameTypeValue(value: Parameters[RenameTypeValue] => Unit): Self = StObject.set(x, "renameTypeValue", js.Any.fromFunction1(value))
    
    inline def setRenameView(value: Parameters[RenameView] => Unit): Self = StObject.set(x, "renameView", js.Any.fromFunction1(value))
    
    inline def setSetTypeAttribute(value: Parameters[SetTypeAttribute] => Unit): Self = StObject.set(x, "setTypeAttribute", js.Any.fromFunction1(value))
    
    inline def setSql(value: Parameters[Sql] => Unit): Self = StObject.set(x, "sql", js.Any.fromFunction1(value))
  }
}
