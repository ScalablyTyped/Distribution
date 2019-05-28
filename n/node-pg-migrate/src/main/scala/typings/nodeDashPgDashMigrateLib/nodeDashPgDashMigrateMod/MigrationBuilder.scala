package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationBuilder extends js.Object {
  var db: DB = js.native
  def addColumn(tableName: Name, newColumns: ColumnDefinitions): scala.Unit = js.native
  def addColumn(tableName: Name, newColumns: ColumnDefinitions, addOptions: AddOptions): scala.Unit = js.native
  // Columns
  def addColumns(tableName: Name, newColumns: ColumnDefinitions): scala.Unit = js.native
  def addColumns(tableName: Name, newColumns: ColumnDefinitions, addOptions: AddOptions): scala.Unit = js.native
  // Constraints
  def addConstraint(tableName: Name, constraintName: java.lang.String, expression: java.lang.String): scala.Unit = js.native
  def addConstraint(tableName: Name, constraintName: java.lang.String, expression: ConstraintOptions): scala.Unit = js.native
  def addConstraint(tableName: Name, constraintName: scala.Null, expression: java.lang.String): scala.Unit = js.native
  def addConstraint(tableName: Name, constraintName: scala.Null, expression: ConstraintOptions): scala.Unit = js.native
  def addExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]]): scala.Unit = js.native
  def addExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]], options: CreateExtensionOptions): scala.Unit = js.native
  def addExtension(extension: LiteralUnion[Extension, java.lang.String]): scala.Unit = js.native
  def addExtension(extension: LiteralUnion[Extension, java.lang.String], options: CreateExtensionOptions): scala.Unit = js.native
  def addIndex(tableName: Name, columns: java.lang.String): scala.Unit = js.native
  def addIndex(tableName: Name, columns: java.lang.String, options: CreateIndexOptions): scala.Unit = js.native
  def addIndex(tableName: Name, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def addIndex(tableName: Name, columns: js.Array[java.lang.String], options: CreateIndexOptions): scala.Unit = js.native
  def addToOperatorFamily(operatorFamilyName: Name, indexMethod: Name, operatorList: OperatorListDefinition): scala.Unit = js.native
  def addType(typeName: Name, values: js.Array[Value]): scala.Unit = js.native
  def addType(typeName: Name, values: org.scalablytyped.runtime.StringDictionary[Type]): scala.Unit = js.native
  def addTypeAttribute(typeName: Name, attributeName: java.lang.String, attributeType: Type): scala.Unit = js.native
  def addTypeValue(typeName: Name, value: Value): scala.Unit = js.native
  def addTypeValue(typeName: Name, value: Value, options: nodeDashPgDashMigrateLib.Anon_After): scala.Unit = js.native
  def alterColumn(tableName: Name, columnName: java.lang.String, options: AlterColumnOptions): scala.Unit = js.native
  def alterDomain(domainName: Name, domainOptions: DomainOptionsAlter): scala.Unit = js.native
  def alterMaterializedView(viewName: Name, options: AlterMaterializedViewOptions): scala.Unit = js.native
  def alterPolicy(tableName: Name, policyName: java.lang.String, options: PolicyOptions): scala.Unit = js.native
  def alterRole(roleName: Name, roleOptions: RoleOptions): scala.Unit = js.native
  def alterSequence(sequenceName: Name, sequenceOptions: SequenceOptionsAlter): scala.Unit = js.native
  def alterTable(tableName: Name, alterOptions: AlterTableOptions): scala.Unit = js.native
  def alterView(viewName: Name, options: AlterViewOptions): scala.Unit = js.native
  def alterViewColumn(viewName: Name, options: AlterViewColumnOptions): scala.Unit = js.native
  def createConstraint(tableName: Name, constraintName: java.lang.String, expression: java.lang.String): scala.Unit = js.native
  def createConstraint(tableName: Name, constraintName: java.lang.String, expression: ConstraintOptions): scala.Unit = js.native
  def createConstraint(tableName: Name, constraintName: scala.Null, expression: java.lang.String): scala.Unit = js.native
  def createConstraint(tableName: Name, constraintName: scala.Null, expression: ConstraintOptions): scala.Unit = js.native
  // Domains
  def createDomain(domainName: Name, `type`: Type): scala.Unit = js.native
  def createDomain(domainName: Name, `type`: Type, domainOptions: DomainOptionsCreate): scala.Unit = js.native
  def createExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]]): scala.Unit = js.native
  def createExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]], options: CreateExtensionOptions): scala.Unit = js.native
  // Extensions
  def createExtension(extension: LiteralUnion[Extension, java.lang.String]): scala.Unit = js.native
  def createExtension(extension: LiteralUnion[Extension, java.lang.String], options: CreateExtensionOptions): scala.Unit = js.native
  // Functions
  def createFunction(
    functionName: Name,
    functionParams: js.Array[FunctionParam],
    functionOptions: FunctionOptions,
    definition: Value
  ): scala.Unit = js.native
  // Indexes
  def createIndex(tableName: Name, columns: java.lang.String): scala.Unit = js.native
  def createIndex(tableName: Name, columns: java.lang.String, options: CreateIndexOptions): scala.Unit = js.native
  def createIndex(tableName: Name, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def createIndex(tableName: Name, columns: js.Array[java.lang.String], options: CreateIndexOptions): scala.Unit = js.native
  def createMaterializedView(viewName: Name, options: CreateMaterializedViewOptions, definition: java.lang.String): scala.Unit = js.native
  // Operators
  def createOperator(operatorName: Name): scala.Unit = js.native
  def createOperator(operatorName: Name, options: CreateOperatorOptions): scala.Unit = js.native
  def createOperatorClass(
    operatorClassName: Name,
    `type`: Type,
    indexMethod: Name,
    operatorList: OperatorListDefinition,
    options: CreateOperatorClassOptions
  ): scala.Unit = js.native
  def createOperatorFamily(operatorFamilyName: Name, indexMethod: Name): scala.Unit = js.native
  // Policies
  def createPolicy(tableName: Name, policyName: java.lang.String): scala.Unit = js.native
  def createPolicy(tableName: Name, policyName: java.lang.String, options: CreatePolicyOptions): scala.Unit = js.native
  // Roles
  def createRole(roleName: Name): scala.Unit = js.native
  def createRole(roleName: Name, roleOptions: RoleOptions): scala.Unit = js.native
  // Schemas
  def createSchema(schemaName: java.lang.String): scala.Unit = js.native
  def createSchema(schemaName: java.lang.String, schemaOptions: nodeDashPgDashMigrateLib.Anon_Authorization): scala.Unit = js.native
  // Sequences
  def createSequence(sequenceName: Name): scala.Unit = js.native
  def createSequence(sequenceName: Name, sequenceOptions: SequenceOptionsCreate): scala.Unit = js.native
  // Tables
  def createTable(tableName: Name, columns: ColumnDefinitions): scala.Unit = js.native
  def createTable(tableName: Name, columns: ColumnDefinitions, options: TableOptions): scala.Unit = js.native
  // Triggers
  def createTrigger(tableName: Name, triggerName: Name, triggerOptions: TriggerOptions): scala.Unit = js.native
  def createTrigger(tableName: Name, triggerName: Name, triggerOptions: TriggerOptions, definition: Value): scala.Unit = js.native
  // Types
  def createType(typeName: Name, values: js.Array[Value]): scala.Unit = js.native
  def createType(typeName: Name, values: org.scalablytyped.runtime.StringDictionary[Type]): scala.Unit = js.native
  def createView(viewName: Name, options: CreateViewOptions, definition: java.lang.String): scala.Unit = js.native
  def dropColumn(tableName: Name, columns: java.lang.String): scala.Unit = js.native
  def dropColumn(tableName: Name, columns: java.lang.String, dropOptions: DropOptions): scala.Unit = js.native
  def dropColumn(tableName: Name, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def dropColumn(tableName: Name, columns: js.Array[java.lang.String], dropOptions: DropOptions): scala.Unit = js.native
  def dropColumn(tableName: Name, columns: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def dropColumn(
    tableName: Name,
    columns: org.scalablytyped.runtime.StringDictionary[js.Any],
    dropOptions: DropOptions
  ): scala.Unit = js.native
  def dropColumns(tableName: Name, columns: java.lang.String): scala.Unit = js.native
  def dropColumns(tableName: Name, columns: java.lang.String, dropOptions: DropOptions): scala.Unit = js.native
  def dropColumns(tableName: Name, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def dropColumns(tableName: Name, columns: js.Array[java.lang.String], dropOptions: DropOptions): scala.Unit = js.native
  def dropColumns(tableName: Name, columns: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def dropColumns(
    tableName: Name,
    columns: org.scalablytyped.runtime.StringDictionary[js.Any],
    dropOptions: DropOptions
  ): scala.Unit = js.native
  def dropConstraint(tableName: Name, constraintName: java.lang.String): scala.Unit = js.native
  def dropConstraint(tableName: Name, constraintName: java.lang.String, options: DropOptions): scala.Unit = js.native
  def dropDomain(domainName: Name): scala.Unit = js.native
  def dropDomain(domainName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]]): scala.Unit = js.native
  def dropExtension(extension: js.Array[LiteralUnion[Extension, java.lang.String]], dropOptions: DropOptions): scala.Unit = js.native
  def dropExtension(extension: LiteralUnion[Extension, java.lang.String]): scala.Unit = js.native
  def dropExtension(extension: LiteralUnion[Extension, java.lang.String], dropOptions: DropOptions): scala.Unit = js.native
  def dropFunction(functionName: Name, functionParams: js.Array[FunctionParam]): scala.Unit = js.native
  def dropFunction(functionName: Name, functionParams: js.Array[FunctionParam], dropOptions: DropOptions): scala.Unit = js.native
  def dropIndex(tableName: Name, columns: java.lang.String): scala.Unit = js.native
  def dropIndex(tableName: Name, columns: java.lang.String, options: DropIndexOptions): scala.Unit = js.native
  def dropIndex(tableName: Name, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def dropIndex(tableName: Name, columns: js.Array[java.lang.String], options: DropIndexOptions): scala.Unit = js.native
  def dropMaterializedView(viewName: Name): scala.Unit = js.native
  def dropMaterializedView(viewName: Name, options: DropOptions): scala.Unit = js.native
  def dropOperator(operatorName: Name): scala.Unit = js.native
  def dropOperator(operatorName: Name, dropOptions: DropOperatorOptions): scala.Unit = js.native
  def dropOperatorClass(operatorClassName: Name, indexMethod: Name): scala.Unit = js.native
  def dropOperatorClass(operatorClassName: Name, indexMethod: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropOperatorFamily(operatorFamilyName: Name, newSchemaName: Name): scala.Unit = js.native
  def dropOperatorFamily(operatorFamilyName: Name, newSchemaName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropPolicy(tableName: Name, policyName: java.lang.String): scala.Unit = js.native
  def dropPolicy(tableName: Name, policyName: java.lang.String, options: IfExistsOption): scala.Unit = js.native
  def dropRole(roleName: Name): scala.Unit = js.native
  def dropRole(roleName: Name, options: IfExistsOption): scala.Unit = js.native
  def dropSchema(schemaName: java.lang.String): scala.Unit = js.native
  def dropSchema(schemaName: java.lang.String, dropOptions: DropOptions): scala.Unit = js.native
  def dropSequence(sequenceName: Name): scala.Unit = js.native
  def dropSequence(sequenceName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropTable(tableName: Name): scala.Unit = js.native
  def dropTable(tableName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropTrigger(tableName: Name, triggerName: Name): scala.Unit = js.native
  def dropTrigger(tableName: Name, triggerName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropType(typeName: Name): scala.Unit = js.native
  def dropType(typeName: Name, dropOptions: DropOptions): scala.Unit = js.native
  def dropTypeAttribute(typeName: Name, attributeName: java.lang.String, options: IfExistsOption): scala.Unit = js.native
  def dropView(viewName: Name): scala.Unit = js.native
  def dropView(viewName: Name, options: DropOptions): scala.Unit = js.native
  def func(sql: java.lang.String): PgLiteral = js.native
  def noTransaction(): scala.Unit = js.native
  def refreshMaterializedView(viewName: Name): scala.Unit = js.native
  def refreshMaterializedView(viewName: Name, options: RefreshMaterializedViewOptions): scala.Unit = js.native
  def removeFromOperatorFamily(operatorFamilyName: Name, indexMethod: Name, operatorList: OperatorListDefinition): scala.Unit = js.native
  def renameColumn(tableName: Name, oldColumnName: java.lang.String, newColumnName: java.lang.String): scala.Unit = js.native
  def renameConstraint(tableName: Name, oldConstraintName: java.lang.String, newConstraintName: java.lang.String): scala.Unit = js.native
  def renameDomain(oldDomainName: Name, newDomainName: Name): scala.Unit = js.native
  def renameFunction(oldFunctionName: Name, functionParams: js.Array[FunctionParam], newFunctionName: Name): scala.Unit = js.native
  def renameMaterializedView(viewName: Name, newViewName: Name): scala.Unit = js.native
  def renameMaterializedViewColumn(viewName: Name, columnName: java.lang.String, newColumnName: java.lang.String): scala.Unit = js.native
  def renameOperatorClass(oldOperatorClassName: Name, indexMethod: Name, newOperatorClassName: Name): scala.Unit = js.native
  def renameOperatorFamily(oldOperatorFamilyName: Name, indexMethod: Name, newOperatorFamilyName: Name): scala.Unit = js.native
  def renamePolicy(tableName: Name, policyName: java.lang.String, newPolicyName: java.lang.String): scala.Unit = js.native
  def renameRole(oldRoleName: Name, newRoleName: Name): scala.Unit = js.native
  def renameSchema(oldSchemaName: java.lang.String, newSchemaName: java.lang.String): scala.Unit = js.native
  def renameSequence(oldSequenceName: Name, newSequenceName: Name): scala.Unit = js.native
  def renameTable(tableName: Name, newtableName: Name): scala.Unit = js.native
  def renameTrigger(tableName: Name, oldTriggerName: Name, newTriggerName: Name): scala.Unit = js.native
  def renameType(typeName: Name, newTypeName: Name): scala.Unit = js.native
  def renameTypeAttribute(typeName: Name, attributeName: java.lang.String, newAttributeName: java.lang.String): scala.Unit = js.native
  def renameTypeValue(typeName: Name, value: java.lang.String, newValue: java.lang.String): scala.Unit = js.native
  def renameView(viewName: Name, newViewName: Name): scala.Unit = js.native
  def setTypeAttribute(typeName: Name, attributeName: java.lang.String, attributeType: Type): scala.Unit = js.native
  def sql(sql: java.lang.String): scala.Unit = js.native
  def sql(sql: java.lang.String, args: js.Object): scala.Unit = js.native
}

