package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
class VaultExternalObjectOperations ()
  extends mfilesLib.IVaultExternalObjectOperations {
  /* CompleteClass */
  override def PromoteObject(
    ObjVer: mfilesLib.IObjVer,
    PropertyValues: mfilesLib.IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: mfilesLib.IAccessControlList
  ): mfilesLib.IObjectVersionAndProperties = js.native
}

