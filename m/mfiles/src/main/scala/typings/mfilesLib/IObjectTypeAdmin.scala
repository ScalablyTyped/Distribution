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

