package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNamedValueStorageOperations")
@js.native
class VaultNamedValueStorageOperations ()
  extends mfilesLib.IVaultNamedValueStorageOperations {
  /* CompleteClass */
  override def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: java.lang.String): mfilesLib.INamedValues = js.native
  /* CompleteClass */
  override def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: java.lang.String, NamedValueNames: mfilesLib.IStrings): scala.Unit = js.native
  /* CompleteClass */
  override def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: java.lang.String, NamedValues: mfilesLib.INamedValues): scala.Unit = js.native
}

@JSGlobal("MFiles.VaultNamedValueStorageOperations")
@js.native
object VaultNamedValueStorageOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultNamedValueStorageOperations]

