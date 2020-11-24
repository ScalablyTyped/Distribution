package typings.nodePgMigrate.migrationBuilderMod

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.distTypesMod.MigrationBuilder
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationBuilderImpl extends MigrationBuilder {
  
  var _REVERSE_MODE: js.Any = js.native
  
  var _steps: js.Any = js.native
  
  var _useTransaction: js.Any = js.native
  
  def enableReverseMode(): this.type = js.native
  
  def getSql(): String = js.native
  
  def getSqlSteps(): js.Array[String] = js.native
  
  def isUsingTransaction(): Boolean = js.native
}
object MigrationBuilderImpl {
  
  @scala.inline
  def apply(
    _REVERSE_MODE: js.Any,
    _steps: js.Any,
    _useTransaction: js.Any,
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
    func: String => typings.nodePgMigrate.pgLiteralMod.default,
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
  
  @scala.inline
  implicit class MigrationBuilderImplOps[Self <: MigrationBuilderImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_REVERSE_MODE(value: js.Any): Self = this.set("_REVERSE_MODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_steps(value: js.Any): Self = this.set("_steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useTransaction(value: js.Any): Self = this.set("_useTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableReverseMode(value: () => MigrationBuilderImpl): Self = this.set("enableReverseMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSql(value: () => String): Self = this.set("getSql", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSqlSteps(value: () => js.Array[String]): Self = this.set("getSqlSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUsingTransaction(value: () => Boolean): Self = this.set("isUsingTransaction", js.Any.fromFunction0(value))
  }
}
