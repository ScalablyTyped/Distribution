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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ColumnMappings = ColumnMappings.asInstanceOf[js.Any], ConnectionString = ConnectionString.asInstanceOf[js.Any], DefaultForAutomaticPermissions = DefaultForAutomaticPermissions.asInstanceOf[js.Any], DeleteStatement = DeleteStatement.asInstanceOf[js.Any], InsertIntoStatement = InsertIntoStatement.asInstanceOf[js.Any], NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], SelectExtIDStatement = SelectExtIDStatement.asInstanceOf[js.Any], SelectStatement = SelectStatement.asInstanceOf[js.Any], SelectStatementOneRecord = SelectStatementOneRecord.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Translatable = Translatable.asInstanceOf[js.Any], UpdateStatement = UpdateStatement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
}

