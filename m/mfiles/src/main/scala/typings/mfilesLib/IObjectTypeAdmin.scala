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
    Clone: js.Function0[IObjectTypeAdmin],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ColumnMappings")(ColumnMappings)
    __obj.updateDynamic("ConnectionString")(ConnectionString)
    __obj.updateDynamic("DefaultForAutomaticPermissions")(DefaultForAutomaticPermissions)
    __obj.updateDynamic("DeleteStatement")(DeleteStatement)
    __obj.updateDynamic("InsertIntoStatement")(InsertIntoStatement)
    __obj.updateDynamic("NamedValueNamespaces")(NamedValueNamespaces)
    __obj.updateDynamic("ObjectType")(ObjectType)
    __obj.updateDynamic("SelectExtIDStatement")(SelectExtIDStatement)
    __obj.updateDynamic("SelectStatement")(SelectStatement)
    __obj.updateDynamic("SelectStatementOneRecord")(SelectStatementOneRecord)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("Translatable")(Translatable)
    __obj.updateDynamic("UpdateStatement")(UpdateStatement)
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
}

