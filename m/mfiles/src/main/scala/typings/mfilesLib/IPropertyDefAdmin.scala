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

object IPropertyDefAdmin {
  @scala.inline
  def apply(
    AllowAutomaticPermissions: scala.Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: () => IPropertyDefAdmin,
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions, AutomaticValue = AutomaticValue, Clone = js.Any.fromFunction0(Clone), NamedValueNamespaces = NamedValueNamespaces, PropertyDef = PropertyDef, SemanticAliases = SemanticAliases, Validation = Validation)
  
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
}

