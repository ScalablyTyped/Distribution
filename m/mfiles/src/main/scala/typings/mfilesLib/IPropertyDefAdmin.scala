package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefAdmin extends js.Object {
  var AllowAutomaticPermissions: scala.Boolean
  var AutomaticValue: IAutomaticValue
  var NamedValueNamespaces: INamedValueNamespaces
  var PropertyDef: IPropertyDef
  var SemanticAliases: ISemanticAliases
  var Validation: IValidation
  def Clone(): IPropertyDefAdmin
}

