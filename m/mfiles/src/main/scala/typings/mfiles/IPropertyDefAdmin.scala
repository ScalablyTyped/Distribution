package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefAdmin extends js.Object {
  var AllowAutomaticPermissions: Boolean
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
    AllowAutomaticPermissions: Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: () => IPropertyDefAdmin,
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions.asInstanceOf[js.Any], AutomaticValue = AutomaticValue.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
}

