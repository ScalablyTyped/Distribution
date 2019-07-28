package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeAdmin extends js.Object {
  var ColumnMappings: IObjectTypeColumnMappings
  var ConnectionString: String
  var DefaultForAutomaticPermissions: IAutomaticPermissions
  var DeleteStatement: String
  var InsertIntoStatement: String
  var NamedValueNamespaces: INamedValueNamespaces
  var ObjectType: IObjectType
  var SelectExtIDStatement: String
  var SelectStatement: String
  var SelectStatementOneRecord: String
  var SemanticAliases: ISemanticAliases
  var Translatable: Boolean
  var UpdateStatement: String
  def Clone(): IObjectTypeAdmin
}

object IObjectTypeAdmin {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeAdmin,
    ColumnMappings: IObjectTypeColumnMappings,
    ConnectionString: String,
    DefaultForAutomaticPermissions: IAutomaticPermissions,
    DeleteStatement: String,
    InsertIntoStatement: String,
    NamedValueNamespaces: INamedValueNamespaces,
    ObjectType: IObjectType,
    SelectExtIDStatement: String,
    SelectStatement: String,
    SelectStatementOneRecord: String,
    SemanticAliases: ISemanticAliases,
    Translatable: Boolean,
    UpdateStatement: String
  ): IObjectTypeAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ColumnMappings = ColumnMappings, ConnectionString = ConnectionString, DefaultForAutomaticPermissions = DefaultForAutomaticPermissions, DeleteStatement = DeleteStatement, InsertIntoStatement = InsertIntoStatement, NamedValueNamespaces = NamedValueNamespaces, ObjectType = ObjectType, SelectExtIDStatement = SelectExtIDStatement, SelectStatement = SelectStatement, SelectStatementOneRecord = SelectStatementOneRecord, SemanticAliases = SemanticAliases, Translatable = Translatable, UpdateStatement = UpdateStatement)
  
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
}

