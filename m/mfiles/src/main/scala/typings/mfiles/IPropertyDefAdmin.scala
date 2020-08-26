package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDefAdmin extends js.Object {
  var AllowAutomaticPermissions: Boolean = js.native
  var AutomaticValue: IAutomaticValue = js.native
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  var PropertyDef: IPropertyDef = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var Validation: IValidation = js.native
  def Clone(): IPropertyDefAdmin = js.native
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
  @scala.inline
  implicit class IPropertyDefAdminOps[Self <: IPropertyDefAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowAutomaticPermissions(value: Boolean): Self = this.set("AllowAutomaticPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticValue(value: IAutomaticValue): Self = this.set("AutomaticValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IPropertyDefAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setNamedValueNamespaces(value: INamedValueNamespaces): Self = this.set("NamedValueNamespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyDef(value: IPropertyDef): Self = this.set("PropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidation(value: IValidation): Self = this.set("Validation", value.asInstanceOf[js.Any])
  }
  
}

