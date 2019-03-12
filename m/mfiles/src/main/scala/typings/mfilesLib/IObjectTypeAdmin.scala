package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeAdmin extends js.Object {
  var ColumnMappings: IObjectTypeColumnMappings
  var ConnectionString: java.lang.String
  var DefaultForAutomaticPermissions: IAutomaticPermissions
  var DeleteStatement: java.lang.String
  var InsertIntoStatement: java.lang.String
  var NamedValueNamespaces: INamedValueNamespaces
  var ObjectType: IObjectType
  var SelectExtIDStatement: java.lang.String
  var SelectStatement: java.lang.String
  var SelectStatementOneRecord: java.lang.String
  var SemanticAliases: ISemanticAliases
  var Translatable: scala.Boolean
  var UpdateStatement: java.lang.String
  def Clone(): IObjectTypeAdmin
}

object IObjectTypeAdmin {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeAdmin,
    ColumnMappings: IObjectTypeColumnMappings,
    ConnectionString: java.lang.String,
    DefaultForAutomaticPermissions: IAutomaticPermissions,
    DeleteStatement: java.lang.String,
    InsertIntoStatement: java.lang.String,
    NamedValueNamespaces: INamedValueNamespaces,
    ObjectType: IObjectType,
    SelectExtIDStatement: java.lang.String,
    SelectStatement: java.lang.String,
    SelectStatementOneRecord: java.lang.String,
    SemanticAliases: ISemanticAliases,
    Translatable: scala.Boolean,
    UpdateStatement: java.lang.String
  ): IObjectTypeAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ColumnMappings = ColumnMappings, ConnectionString = ConnectionString, DefaultForAutomaticPermissions = DefaultForAutomaticPermissions, DeleteStatement = DeleteStatement, InsertIntoStatement = InsertIntoStatement, NamedValueNamespaces = NamedValueNamespaces, ObjectType = ObjectType, SelectExtIDStatement = SelectExtIDStatement, SelectStatement = SelectStatement, SelectStatementOneRecord = SelectStatementOneRecord, SemanticAliases = SemanticAliases, Translatable = Translatable, UpdateStatement = UpdateStatement)
  
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
}

