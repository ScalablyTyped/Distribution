package typings.nodePgMigrate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.AnonAfter
import typings.nodePgMigrate.AnonAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationBuilder extends js.Object {
  var db: DB = js.native
  def addColumn(tableName: Name, newColumns: ColumnDefinitions): Unit = js.native
  def addColumn(tableName: Name, newColumns: ColumnDefinitions, addOptions: AddOptions): Unit = js.native
  // Columns
  def addColumns(tableName: Name, newColumns: ColumnDefinitions): Unit = js.native
  def addColumns(tableName: Name, newColumns: ColumnDefinitions, addOptions: AddOptions): Unit = js.native
  // Constraints
  def addConstraint(tableName: Name, constraintName: String, expression: String): Unit = js.native
  def addConstraint(tableName: Name, constraintName: String, expression: ConstraintOptions): Unit = js.native
  def addConstraint(tableName: Name, constraintName: Null, expression: String): Unit = js.native
  def addConstraint(tableName: Name, constraintName: Null, expression: ConstraintOptions): Unit = js.native
  def addExtension(extension: js.Array[LiteralUnion[Extension, String]]): Unit = js.native
  def addExtension(extension: js.Array[LiteralUnion[Extension, String]], options: CreateExtensionOptions): Unit = js.native
  def addExtension(extension: LiteralUnion[Extension, String]): Unit = js.native
  def addExtension(extension: LiteralUnion[Extension, String], options: CreateExtensionOptions): Unit = js.native
  def addIndex(tableName: Name, columns: String): Unit = js.native
  def addIndex(tableName: Name, columns: String, options: CreateIndexOptions): Unit = js.native
  def addIndex(tableName: Name, columns: js.Array[String]): Unit = js.native
  def addIndex(tableName: Name, columns: js.Array[String], options: CreateIndexOptions): Unit = js.native
  def addToOperatorFamily(operatorFamilyName: Name, indexMethod: Name, operatorList: OperatorListDefinition): Unit = js.native
  def addType(typeName: Name, values: js.Array[Value]): Unit = js.native
  def addType(typeName: Name, values: StringDictionary[Type]): Unit = js.native
  def addTypeAttribute(typeName: Name, attributeName: String, attributeType: Type): Unit = js.native
  def addTypeValue(typeName: Name, value: Value): Unit = js.native
  def addTypeValue(typeName: Name, value: Value, options: AnonAfter): Unit = js.native
  def alterColumn(tableName: Name, columnName: String, options: AlterColumnOptions): Unit = js.native
  def alterDomain(domainName: Name, domainOptions: DomainOptionsAlter): Unit = js.native
  def alterMaterializedView(viewName: Name, options: AlterMaterializedViewOptions): Unit = js.native
  def alterPolicy(tableName: Name, policyName: String, options: PolicyOptions): Unit = js.native
  def alterRole(roleName: Name, roleOptions: RoleOptions): Unit = js.native
  def alterSequence(sequenceName: Name, sequenceOptions: SequenceOptionsAlter): Unit = js.native
  def alterTable(tableName: Name, alterOptions: AlterTableOptions): Unit = js.native
  def alterView(viewName: Name, options: AlterViewOptions): Unit = js.native
  def alterViewColumn(viewName: Name, options: AlterViewColumnOptions): Unit = js.native
  def createConstraint(tableName: Name, constraintName: String, expression: String): Unit = js.native
  def createConstraint(tableName: Name, constraintName: String, expression: ConstraintOptions): Unit = js.native
  def createConstraint(tableName: Name, constraintName: Null, expression: String): Unit = js.native
  def createConstraint(tableName: Name, constraintName: Null, expression: ConstraintOptions): Unit = js.native
  // Domains
  def createDomain(domainName: Name, `type`: Type): Unit = js.native
  def createDomain(domainName: Name, `type`: Type, domainOptions: DomainOptionsCreate): Unit = js.native
  def createExtension(extension: js.Array[LiteralUnion[Extension, String]]): Unit = js.native
  def createExtension(extension: js.Array[LiteralUnion[Extension, String]], options: CreateExtensionOptions): Unit = js.native
  // Extensions
  def createExtension(extension: LiteralUnion[Extension, String]): Unit = js.native
  def createExtension(extension: LiteralUnion[Extension, String], options: CreateExtensionOptions): Unit = js.native
  // Functions
  def createFunction(
    functionName: Name,
    functionParams: js.Array[FunctionParam],
    functionOptions: FunctionOptions,
    definition: Value
  ): Unit = js.native
  // Indexes
  def createIndex(tableName: Name, columns: String): Unit = js.native
  def createIndex(tableName: Name, columns: String, options: CreateIndexOptions): Unit = js.native
  def createIndex(tableName: Name, columns: js.Array[String]): Unit = js.native
  def createIndex(tableName: Name, columns: js.Array[String], options: CreateIndexOptions): Unit = js.native
  def createMaterializedView(viewName: Name, options: CreateMaterializedViewOptions, definition: String): Unit = js.native
  // Operators
  def createOperator(operatorName: Name): Unit = js.native
  def createOperator(operatorName: Name, options: CreateOperatorOptions): Unit = js.native
  def createOperatorClass(
    operatorClassName: Name,
    `type`: Type,
    indexMethod: Name,
    operatorList: OperatorListDefinition,
    options: CreateOperatorClassOptions
  ): Unit = js.native
  def createOperatorFamily(operatorFamilyName: Name, indexMethod: Name): Unit = js.native
  // Policies
  def createPolicy(tableName: Name, policyName: String): Unit = js.native
  def createPolicy(tableName: Name, policyName: String, options: CreatePolicyOptions): Unit = js.native
  // Roles
  def createRole(roleName: Name): Unit = js.native
  def createRole(roleName: Name, roleOptions: RoleOptions): Unit = js.native
  // Schemas
  def createSchema(schemaName: String): Unit = js.native
  def createSchema(schemaName: String, schemaOptions: AnonAuthorization): Unit = js.native
  // Sequences
  def createSequence(sequenceName: Name): Unit = js.native
  def createSequence(sequenceName: Name, sequenceOptions: SequenceOptionsCreate): Unit = js.native
  // Tables
  def createTable(tableName: Name, columns: ColumnDefinitions): Unit = js.native
  def createTable(tableName: Name, columns: ColumnDefinitions, options: TableOptions): Unit = js.native
  def createTrigger(
    tableName: Name,
    triggerName: Name,
    triggerOptions: TriggerOptions with FunctionOptions,
    definition: Value
  ): Unit = js.native
  // Triggers
  def createTrigger(tableName: Name, triggerName: Name, triggerOptions: TriggerOptions): Unit = js.native
  // Types
  def createType(typeName: Name, values: js.Array[Value]): Unit = js.native
  def createType(typeName: Name, values: StringDictionary[Type]): Unit = js.native
  def createView(viewName: Name, options: CreateViewOptions, definition: String): Unit = js.native
  def dropColumn(tableName: Name, columns: String): Unit = js.native
  def dropColumn(tableName: Name, columns: String, dropOptions: DropOptions): Unit = js.native
  def dropColumn(tableName: Name, columns: js.Array[String]): Unit = js.native
  def dropColumn(tableName: Name, columns: js.Array[String], dropOptions: DropOptions): Unit = js.native
  def dropColumn(tableName: Name, columns: StringDictionary[js.Any]): Unit = js.native
  def dropColumn(tableName: Name, columns: StringDictionary[js.Any], dropOptions: DropOptions): Unit = js.native
  def dropColumns(tableName: Name, columns: String): Unit = js.native
  def dropColumns(tableName: Name, columns: String, dropOptions: DropOptions): Unit = js.native
  def dropColumns(tableName: Name, columns: js.Array[String]): Unit = js.native
  def dropColumns(tableName: Name, columns: js.Array[String], dropOptions: DropOptions): Unit = js.native
  def dropColumns(tableName: Name, columns: StringDictionary[js.Any]): Unit = js.native
  def dropColumns(tableName: Name, columns: StringDictionary[js.Any], dropOptions: DropOptions): Unit = js.native
  def dropConstraint(tableName: Name, constraintName: String): Unit = js.native
  def dropConstraint(tableName: Name, constraintName: String, options: DropOptions): Unit = js.native
  def dropDomain(domainName: Name): Unit = js.native
  def dropDomain(domainName: Name, dropOptions: DropOptions): Unit = js.native
  def dropExtension(extension: js.Array[LiteralUnion[Extension, String]]): Unit = js.native
  def dropExtension(extension: js.Array[LiteralUnion[Extension, String]], dropOptions: DropOptions): Unit = js.native
  def dropExtension(extension: LiteralUnion[Extension, String]): Unit = js.native
  def dropExtension(extension: LiteralUnion[Extension, String], dropOptions: DropOptions): Unit = js.native
  def dropFunction(functionName: Name, functionParams: js.Array[FunctionParam]): Unit = js.native
  def dropFunction(functionName: Name, functionParams: js.Array[FunctionParam], dropOptions: DropOptions): Unit = js.native
  def dropIndex(tableName: Name, columns: String): Unit = js.native
  def dropIndex(tableName: Name, columns: String, options: DropIndexOptions): Unit = js.native
  def dropIndex(tableName: Name, columns: js.Array[String]): Unit = js.native
  def dropIndex(tableName: Name, columns: js.Array[String], options: DropIndexOptions): Unit = js.native
  def dropMaterializedView(viewName: Name): Unit = js.native
  def dropMaterializedView(viewName: Name, options: DropOptions): Unit = js.native
  def dropOperator(operatorName: Name): Unit = js.native
  def dropOperator(operatorName: Name, dropOptions: DropOperatorOptions): Unit = js.native
  def dropOperatorClass(operatorClassName: Name, indexMethod: Name): Unit = js.native
  def dropOperatorClass(operatorClassName: Name, indexMethod: Name, dropOptions: DropOptions): Unit = js.native
  def dropOperatorFamily(operatorFamilyName: Name, newSchemaName: Name): Unit = js.native
  def dropOperatorFamily(operatorFamilyName: Name, newSchemaName: Name, dropOptions: DropOptions): Unit = js.native
  def dropPolicy(tableName: Name, policyName: String): Unit = js.native
  def dropPolicy(tableName: Name, policyName: String, options: IfExistsOption): Unit = js.native
  def dropRole(roleName: Name): Unit = js.native
  def dropRole(roleName: Name, options: IfExistsOption): Unit = js.native
  def dropSchema(schemaName: String): Unit = js.native
  def dropSchema(schemaName: String, dropOptions: DropOptions): Unit = js.native
  def dropSequence(sequenceName: Name): Unit = js.native
  def dropSequence(sequenceName: Name, dropOptions: DropOptions): Unit = js.native
  def dropTable(tableName: Name): Unit = js.native
  def dropTable(tableName: Name, dropOptions: DropOptions): Unit = js.native
  def dropTrigger(tableName: Name, triggerName: Name): Unit = js.native
  def dropTrigger(tableName: Name, triggerName: Name, dropOptions: DropOptions): Unit = js.native
  def dropType(typeName: Name): Unit = js.native
  def dropType(typeName: Name, dropOptions: DropOptions): Unit = js.native
  def dropTypeAttribute(typeName: Name, attributeName: String, options: IfExistsOption): Unit = js.native
  def dropView(viewName: Name): Unit = js.native
  def dropView(viewName: Name, options: DropOptions): Unit = js.native
  def func(sql: String): PgLiteral = js.native
  def noTransaction(): Unit = js.native
  def refreshMaterializedView(viewName: Name): Unit = js.native
  def refreshMaterializedView(viewName: Name, options: RefreshMaterializedViewOptions): Unit = js.native
  def removeFromOperatorFamily(operatorFamilyName: Name, indexMethod: Name, operatorList: OperatorListDefinition): Unit = js.native
  def renameColumn(tableName: Name, oldColumnName: String, newColumnName: String): Unit = js.native
  def renameConstraint(tableName: Name, oldConstraintName: String, newConstraintName: String): Unit = js.native
  def renameDomain(oldDomainName: Name, newDomainName: Name): Unit = js.native
  def renameFunction(oldFunctionName: Name, functionParams: js.Array[FunctionParam], newFunctionName: Name): Unit = js.native
  def renameMaterializedView(viewName: Name, newViewName: Name): Unit = js.native
  def renameMaterializedViewColumn(viewName: Name, columnName: String, newColumnName: String): Unit = js.native
  def renameOperatorClass(oldOperatorClassName: Name, indexMethod: Name, newOperatorClassName: Name): Unit = js.native
  def renameOperatorFamily(oldOperatorFamilyName: Name, indexMethod: Name, newOperatorFamilyName: Name): Unit = js.native
  def renamePolicy(tableName: Name, policyName: String, newPolicyName: String): Unit = js.native
  def renameRole(oldRoleName: Name, newRoleName: Name): Unit = js.native
  def renameSchema(oldSchemaName: String, newSchemaName: String): Unit = js.native
  def renameSequence(oldSequenceName: Name, newSequenceName: Name): Unit = js.native
  def renameTable(tableName: Name, newtableName: Name): Unit = js.native
  def renameTrigger(tableName: Name, oldTriggerName: Name, newTriggerName: Name): Unit = js.native
  def renameType(typeName: Name, newTypeName: Name): Unit = js.native
  def renameTypeAttribute(typeName: Name, attributeName: String, newAttributeName: String): Unit = js.native
  def renameTypeValue(typeName: Name, value: String, newValue: String): Unit = js.native
  def renameView(viewName: Name, newViewName: Name): Unit = js.native
  def setTypeAttribute(typeName: Name, attributeName: String, attributeType: Type): Unit = js.native
  def sql(sql: String): Unit = js.native
  def sql(sql: String, args: js.Object): Unit = js.native
}

