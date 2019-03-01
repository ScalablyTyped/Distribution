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
    Clone: js.Function0[IPropertyDefAdmin],
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowAutomaticPermissions")(AllowAutomaticPermissions)
    __obj.updateDynamic("AutomaticValue")(AutomaticValue)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("NamedValueNamespaces")(NamedValueNamespaces)
    __obj.updateDynamic("PropertyDef")(PropertyDef)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("Validation")(Validation)
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
}

