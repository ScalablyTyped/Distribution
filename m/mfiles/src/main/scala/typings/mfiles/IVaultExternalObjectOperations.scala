package typings.mfiles

import typings.mfiles.MFilesNs.MFACLEnforcingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExternalObjectOperations extends js.Object {
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties
}

object IVaultExternalObjectOperations {
  @scala.inline
  def apply(
    PromoteObject: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal(PromoteObject = js.Any.fromFunction4(PromoteObject))
  
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
}

