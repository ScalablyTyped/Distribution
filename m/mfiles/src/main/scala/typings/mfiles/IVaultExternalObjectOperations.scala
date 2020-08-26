package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultExternalObjectOperations extends js.Object {
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties = js.native
}

object IVaultExternalObjectOperations {
  @scala.inline
  def apply(
    PromoteObject: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal(PromoteObject = js.Any.fromFunction4(PromoteObject))
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
  @scala.inline
  implicit class IVaultExternalObjectOperationsOps[Self <: IVaultExternalObjectOperations] (val x: Self) extends AnyVal {
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
    def setPromoteObject(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = this.set("PromoteObject", js.Any.fromFunction4(value))
  }
  
}

