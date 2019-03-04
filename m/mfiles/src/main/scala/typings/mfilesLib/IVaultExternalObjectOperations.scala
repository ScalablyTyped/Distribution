package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExternalObjectOperations extends js.Object {
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties
}

object IVaultExternalObjectOperations {
  @scala.inline
  def apply(
    PromoteObject: js.Function4[
      IObjVer, 
      IPropertyValues, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      IObjectVersionAndProperties
    ]
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal(PromoteObject = PromoteObject)
  
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
}

