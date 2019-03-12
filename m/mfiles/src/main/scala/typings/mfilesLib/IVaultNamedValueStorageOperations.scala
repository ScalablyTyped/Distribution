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
    GetNamedValues: (mfilesLib.MFilesNs.MFNamedValueType, java.lang.String) => INamedValues,
    RemoveNamedValues: (mfilesLib.MFilesNs.MFNamedValueType, java.lang.String, IStrings) => scala.Unit,
    SetNamedValues: (mfilesLib.MFilesNs.MFNamedValueType, java.lang.String, INamedValues) => scala.Unit
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal(GetNamedValues = js.Any.fromFunction2(GetNamedValues), RemoveNamedValues = js.Any.fromFunction3(RemoveNamedValues), SetNamedValues = js.Any.fromFunction3(SetNamedValues))
  
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
}

