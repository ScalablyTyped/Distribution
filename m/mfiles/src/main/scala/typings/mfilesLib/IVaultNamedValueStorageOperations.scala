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

