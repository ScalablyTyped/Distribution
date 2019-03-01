package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNamedValueStorageOperations extends js.Object {
  def GetNamedValues(NamedValueType: mfilesLib.MFilesNs.MFNamedValueType, Namespace: java.lang.String): INamedValues
  def RemoveNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValueNames: IStrings
  ): scala.Unit
  def SetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValues: INamedValues
  ): scala.Unit
}

object IVaultNamedValueStorageOperations {
  @scala.inline
  def apply(
    GetNamedValues: js.Function2[mfilesLib.MFilesNs.MFNamedValueType, java.lang.String, INamedValues],
    RemoveNamedValues: js.Function3[mfilesLib.MFilesNs.MFNamedValueType, java.lang.String, IStrings, scala.Unit],
    SetNamedValues: js.Function3[mfilesLib.MFilesNs.MFNamedValueType, java.lang.String, INamedValues, scala.Unit]
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetNamedValues")(GetNamedValues)
    __obj.updateDynamic("RemoveNamedValues")(RemoveNamedValues)
    __obj.updateDynamic("SetNamedValues")(SetNamedValues)
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
}

