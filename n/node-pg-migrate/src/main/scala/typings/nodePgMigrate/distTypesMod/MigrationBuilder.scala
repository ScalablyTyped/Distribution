package typings.nodePgMigrate.distTypesMod

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
import typings.nodePgMigrate.pgLiteralMod.default
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationBuilder extends StObject {
  
  def addColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit = js.native
  
  def addColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit = js.native
  
  def addConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit = js.native
  
  def addExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit = js.native
  
  def addIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit = js.native
  
  def addToOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.AddToOperatorFamily> is not an array type */ args: Parameters[AddToOperatorFamily]
  ): Unit = js.native
  
  def addType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit = js.native
  
  def addTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeAttribute> is not an array type */ args: Parameters[AddTypeAttribute]
  ): Unit = js.native
  
  def addTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeValue> is not an array type */ args: Parameters[AddTypeValue]
  ): Unit = js.native
  
  def alterColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterColumn> is not an array type */ args: Parameters[AlterColumn]
  ): Unit = js.native
  
  def alterDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.AlterDomain> is not an array type */ args: Parameters[AlterDomain]
  ): Unit = js.native
  
  def alterMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.AlterMaterializedView> is not an array type */ args: Parameters[AlterMaterializedView]
  ): Unit = js.native
  
  def alterPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.AlterPolicy> is not an array type */ args: Parameters[AlterPolicy]
  ): Unit = js.native
  
  def alterRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.AlterRole> is not an array type */ args: Parameters[AlterRole]
  ): Unit = js.native
  
  def alterSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.AlterSequence> is not an array type */ args: Parameters[AlterSequence]
  ): Unit = js.native
  
  def alterTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterTable> is not an array type */ args: Parameters[AlterTable]
  ): Unit = js.native
  
  def alterView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterView> is not an array type */ args: Parameters[AlterView]
  ): Unit = js.native
  
  def alterViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterViewColumn> is not an array type */ args: Parameters[AlterViewColumn]
  ): Unit = js.native
  
  def createConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit = js.native
  
  def createDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.CreateDomain> is not an array type */ args: Parameters[CreateDomain]
  ): Unit = js.native
  
  def createExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit = js.native
  
  def createFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.CreateFunction> is not an array type */ args: Parameters[CreateFunction]
  ): Unit = js.native
  
  def createIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit = js.native
  
  def createMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.CreateMaterializedView> is not an array type */ args: Parameters[CreateMaterializedView]
  ): Unit = js.native
  
  def createOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperator> is not an array type */ args: Parameters[CreateOperator]
  ): Unit = js.native
  
  def createOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorClass> is not an array type */ args: Parameters[CreateOperatorClass]
  ): Unit = js.native
  
  def createOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorFamily> is not an array type */ args: Parameters[CreateOperatorFamily]
  ): Unit = js.native
  
  def createPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.CreatePolicy> is not an array type */ args: Parameters[CreatePolicy]
  ): Unit = js.native
  
  def createRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.CreateRole> is not an array type */ args: Parameters[CreateRole]
  ): Unit = js.native
  
  def createSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.CreateSchema> is not an array type */ args: Parameters[CreateSchema]
  ): Unit = js.native
  
  def createSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.CreateSequence> is not an array type */ args: Parameters[CreateSequence]
  ): Unit = js.native
  
  def createTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateTable> is not an array type */ args: Parameters[CreateTable]
  ): Unit = js.native
  
  def createTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.CreateTrigger> is not an array type */ args: Parameters[CreateTrigger]
  ): Unit = js.native
  
  def createType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit = js.native
  
  def createView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.CreateView> is not an array type */ args: Parameters[CreateView]
  ): Unit = js.native
  
  var db: DB = js.native
  
  def dropColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit = js.native
  
  def dropColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit = js.native
  
  def dropConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropConstraint> is not an array type */ args: Parameters[DropConstraint]
  ): Unit = js.native
  
  def dropDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.DropDomain> is not an array type */ args: Parameters[DropDomain]
  ): Unit = js.native
  
  def dropExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.DropExtension> is not an array type */ args: Parameters[DropExtension]
  ): Unit = js.native
  
  def dropFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.DropFunction> is not an array type */ args: Parameters[DropFunction]
  ): Unit = js.native
  
  def dropIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.DropIndex> is not an array type */ args: Parameters[DropIndex]
  ): Unit = js.native
  
  def dropMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.DropMaterializedView> is not an array type */ args: Parameters[DropMaterializedView]
  ): Unit = js.native
  
  def dropOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperator> is not an array type */ args: Parameters[DropOperator]
  ): Unit = js.native
  
  def dropOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorClass> is not an array type */ args: Parameters[DropOperatorClass]
  ): Unit = js.native
  
  def dropOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorFamily> is not an array type */ args: Parameters[DropOperatorFamily]
  ): Unit = js.native
  
  def dropPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.DropPolicy> is not an array type */ args: Parameters[DropPolicy]
  ): Unit = js.native
  
  def dropRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.DropRole> is not an array type */ args: Parameters[DropRole]
  ): Unit = js.native
  
  def dropSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.DropSchema> is not an array type */ args: Parameters[DropSchema]
  ): Unit = js.native
  
  def dropSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.DropSequence> is not an array type */ args: Parameters[DropSequence]
  ): Unit = js.native
  
  def dropTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropTable> is not an array type */ args: Parameters[DropTable]
  ): Unit = js.native
  
  def dropTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.DropTrigger> is not an array type */ args: Parameters[DropTrigger]
  ): Unit = js.native
  
  def dropType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropType> is not an array type */ args: Parameters[DropType]
  ): Unit = js.native
  
  def dropTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropTypeAttribute> is not an array type */ args: Parameters[DropTypeAttribute]
  ): Unit = js.native
  
  def dropView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.DropView> is not an array type */ args: Parameters[DropView]
  ): Unit = js.native
  
  def func(sql: String): default = js.native
  
  def noTransaction(): Unit = js.native
  
  def refreshMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RefreshMaterializedView> is not an array type */ args: Parameters[RefreshMaterializedView]
  ): Unit = js.native
  
  def removeFromOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RemoveFromOperatorFamily> is not an array type */ args: Parameters[RemoveFromOperatorFamily]
  ): Unit = js.native
  
  def renameColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameColumn> is not an array type */ args: Parameters[RenameColumn]
  ): Unit = js.native
  
  def renameConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameConstraint> is not an array type */ args: Parameters[RenameConstraint]
  ): Unit = js.native
  
  def renameDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.RenameDomain> is not an array type */ args: Parameters[RenameDomain]
  ): Unit = js.native
  
  def renameFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.RenameFunction> is not an array type */ args: Parameters[RenameFunction]
  ): Unit = js.native
  
  def renameMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedView> is not an array type */ args: Parameters[RenameMaterializedView]
  ): Unit = js.native
  
  def renameMaterializedViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedViewColumn> is not an array type */ args: Parameters[RenameMaterializedViewColumn]
  ): Unit = js.native
  
  def renameOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorClass> is not an array type */ args: Parameters[RenameOperatorClass]
  ): Unit = js.native
  
  def renameOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorFamily> is not an array type */ args: Parameters[RenameOperatorFamily]
  ): Unit = js.native
  
  def renamePolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.RenamePolicy> is not an array type */ args: Parameters[RenamePolicy]
  ): Unit = js.native
  
  def renameRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.RenameRole> is not an array type */ args: Parameters[RenameRole]
  ): Unit = js.native
  
  def renameSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.RenameSchema> is not an array type */ args: Parameters[RenameSchema]
  ): Unit = js.native
  
  def renameSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.RenameSequence> is not an array type */ args: Parameters[RenameSequence]
  ): Unit = js.native
  
  def renameTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameTable> is not an array type */ args: Parameters[RenameTable]
  ): Unit = js.native
  
  def renameTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.RenameTrigger> is not an array type */ args: Parameters[RenameTrigger]
  ): Unit = js.native
  
  def renameType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameType> is not an array type */ args: Parameters[RenameType]
  ): Unit = js.native
  
  def renameTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeAttribute> is not an array type */ args: Parameters[RenameTypeAttribute]
  ): Unit = js.native
  
  def renameTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeValue> is not an array type */ args: Parameters[RenameTypeValue]
  ): Unit = js.native
  
  def renameView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.RenameView> is not an array type */ args: Parameters[RenameView]
  ): Unit = js.native
  
  def setTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.SetTypeAttribute> is not an array type */ args: Parameters[SetTypeAttribute]
  ): Unit = js.native
  
  def sql(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<other.Sql> is not an array type */ args: Parameters[Sql]
  ): Unit = js.native
}
object MigrationBuilder {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MigrationBuilderMutableBuilder[Self <: MigrationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColumn(value: Parameters[AddColumns] => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddColumns(value: Parameters[AddColumns] => Unit): Self = StObject.set(x, "addColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddConstraint(value: Parameters[CreateConstraint] => Unit): Self = StObject.set(x, "addConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddExtension(value: Parameters[CreateExtension] => Unit): Self = StObject.set(x, "addExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddIndex(value: Parameters[CreateIndex] => Unit): Self = StObject.set(x, "addIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToOperatorFamily(value: Parameters[AddToOperatorFamily] => Unit): Self = StObject.set(x, "addToOperatorFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddType(value: Parameters[CreateType] => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTypeAttribute(value: Parameters[AddTypeAttribute] => Unit): Self = StObject.set(x, "addTypeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTypeValue(value: Parameters[AddTypeValue] => Unit): Self = StObject.set(x, "addTypeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterColumn(value: Parameters[AlterColumn] => Unit): Self = StObject.set(x, "alterColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterDomain(value: Parameters[AlterDomain] => Unit): Self = StObject.set(x, "alterDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterMaterializedView(value: Parameters[AlterMaterializedView] => Unit): Self = StObject.set(x, "alterMaterializedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterPolicy(value: Parameters[AlterPolicy] => Unit): Self = StObject.set(x, "alterPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterRole(value: Parameters[AlterRole] => Unit): Self = StObject.set(x, "alterRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterSequence(value: Parameters[AlterSequence] => Unit): Self = StObject.set(x, "alterSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterTable(value: Parameters[AlterTable] => Unit): Self = StObject.set(x, "alterTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterView(value: Parameters[AlterView] => Unit): Self = StObject.set(x, "alterView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlterViewColumn(value: Parameters[AlterViewColumn] => Unit): Self = StObject.set(x, "alterViewColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateConstraint(value: Parameters[CreateConstraint] => Unit): Self = StObject.set(x, "createConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDomain(value: Parameters[CreateDomain] => Unit): Self = StObject.set(x, "createDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateExtension(value: Parameters[CreateExtension] => Unit): Self = StObject.set(x, "createExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFunction(value: Parameters[CreateFunction] => Unit): Self = StObject.set(x, "createFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateIndex(value: Parameters[CreateIndex] => Unit): Self = StObject.set(x, "createIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMaterializedView(value: Parameters[CreateMaterializedView] => Unit): Self = StObject.set(x, "createMaterializedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateOperator(value: Parameters[CreateOperator] => Unit): Self = StObject.set(x, "createOperator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateOperatorClass(value: Parameters[CreateOperatorClass] => Unit): Self = StObject.set(x, "createOperatorClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateOperatorFamily(value: Parameters[CreateOperatorFamily] => Unit): Self = StObject.set(x, "createOperatorFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePolicy(value: Parameters[CreatePolicy] => Unit): Self = StObject.set(x, "createPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRole(value: Parameters[CreateRole] => Unit): Self = StObject.set(x, "createRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSchema(value: Parameters[CreateSchema] => Unit): Self = StObject.set(x, "createSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSequence(value: Parameters[CreateSequence] => Unit): Self = StObject.set(x, "createSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTable(value: Parameters[CreateTable] => Unit): Self = StObject.set(x, "createTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTrigger(value: Parameters[CreateTrigger] => Unit): Self = StObject.set(x, "createTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateType(value: Parameters[CreateType] => Unit): Self = StObject.set(x, "createType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateView(value: Parameters[CreateView] => Unit): Self = StObject.set(x, "createView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDb(value: DB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropColumn(value: Parameters[DropColumns] => Unit): Self = StObject.set(x, "dropColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropColumns(value: Parameters[DropColumns] => Unit): Self = StObject.set(x, "dropColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropConstraint(value: Parameters[DropConstraint] => Unit): Self = StObject.set(x, "dropConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropDomain(value: Parameters[DropDomain] => Unit): Self = StObject.set(x, "dropDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropExtension(value: Parameters[DropExtension] => Unit): Self = StObject.set(x, "dropExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropFunction(value: Parameters[DropFunction] => Unit): Self = StObject.set(x, "dropFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropIndex(value: Parameters[DropIndex] => Unit): Self = StObject.set(x, "dropIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropMaterializedView(value: Parameters[DropMaterializedView] => Unit): Self = StObject.set(x, "dropMaterializedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropOperator(value: Parameters[DropOperator] => Unit): Self = StObject.set(x, "dropOperator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropOperatorClass(value: Parameters[DropOperatorClass] => Unit): Self = StObject.set(x, "dropOperatorClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropOperatorFamily(value: Parameters[DropOperatorFamily] => Unit): Self = StObject.set(x, "dropOperatorFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropPolicy(value: Parameters[DropPolicy] => Unit): Self = StObject.set(x, "dropPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropRole(value: Parameters[DropRole] => Unit): Self = StObject.set(x, "dropRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropSchema(value: Parameters[DropSchema] => Unit): Self = StObject.set(x, "dropSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropSequence(value: Parameters[DropSequence] => Unit): Self = StObject.set(x, "dropSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropTable(value: Parameters[DropTable] => Unit): Self = StObject.set(x, "dropTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropTrigger(value: Parameters[DropTrigger] => Unit): Self = StObject.set(x, "dropTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropType(value: Parameters[DropType] => Unit): Self = StObject.set(x, "dropType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropTypeAttribute(value: Parameters[DropTypeAttribute] => Unit): Self = StObject.set(x, "dropTypeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropView(value: Parameters[DropView] => Unit): Self = StObject.set(x, "dropView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFunc(value: String => default): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoTransaction(value: () => Unit): Self = StObject.set(x, "noTransaction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshMaterializedView(value: Parameters[RefreshMaterializedView] => Unit): Self = StObject.set(x, "refreshMaterializedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFromOperatorFamily(value: Parameters[RemoveFromOperatorFamily] => Unit): Self = StObject.set(x, "removeFromOperatorFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameColumn(value: Parameters[RenameColumn] => Unit): Self = StObject.set(x, "renameColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameConstraint(value: Parameters[RenameConstraint] => Unit): Self = StObject.set(x, "renameConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameDomain(value: Parameters[RenameDomain] => Unit): Self = StObject.set(x, "renameDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameFunction(value: Parameters[RenameFunction] => Unit): Self = StObject.set(x, "renameFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameMaterializedView(value: Parameters[RenameMaterializedView] => Unit): Self = StObject.set(x, "renameMaterializedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameMaterializedViewColumn(value: Parameters[RenameMaterializedViewColumn] => Unit): Self = StObject.set(x, "renameMaterializedViewColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameOperatorClass(value: Parameters[RenameOperatorClass] => Unit): Self = StObject.set(x, "renameOperatorClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameOperatorFamily(value: Parameters[RenameOperatorFamily] => Unit): Self = StObject.set(x, "renameOperatorFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenamePolicy(value: Parameters[RenamePolicy] => Unit): Self = StObject.set(x, "renamePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameRole(value: Parameters[RenameRole] => Unit): Self = StObject.set(x, "renameRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameSchema(value: Parameters[RenameSchema] => Unit): Self = StObject.set(x, "renameSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameSequence(value: Parameters[RenameSequence] => Unit): Self = StObject.set(x, "renameSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameTable(value: Parameters[RenameTable] => Unit): Self = StObject.set(x, "renameTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameTrigger(value: Parameters[RenameTrigger] => Unit): Self = StObject.set(x, "renameTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameType(value: Parameters[RenameType] => Unit): Self = StObject.set(x, "renameType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameTypeAttribute(value: Parameters[RenameTypeAttribute] => Unit): Self = StObject.set(x, "renameTypeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameTypeValue(value: Parameters[RenameTypeValue] => Unit): Self = StObject.set(x, "renameTypeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameView(value: Parameters[RenameView] => Unit): Self = StObject.set(x, "renameView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTypeAttribute(value: Parameters[SetTypeAttribute] => Unit): Self = StObject.set(x, "setTypeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSql(value: Parameters[Sql] => Unit): Self = StObject.set(x, "sql", js.Any.fromFunction1(value))
  }
}
