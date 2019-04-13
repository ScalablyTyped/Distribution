package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultElectronicSignatureOperations")
@js.native
class VaultElectronicSignatureOperations ()
  extends mfilesLib.IVaultElectronicSignatureOperations {
  /* CompleteClass */
  override def AddEmptySignature(ObjVer: mfilesLib.IObjVer, SignatureIdentifier: java.lang.String): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def AddEmptySignatures(ObjVer: mfilesLib.IObjVer): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignature(ObjVer: mfilesLib.IObjVer, SignatureIdentifier: java.lang.String): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignatureEx(
    ObjVer: mfilesLib.IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignatures(ObjVer: mfilesLib.IObjVer): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignaturesEx(ObjVer: mfilesLib.IObjVer, InvalidateDisconnectedSignatures: scala.Boolean): mfilesLib.IObjectVersionAndProperties = js.native
}

@JSGlobal("MFiles.VaultElectronicSignatureOperations")
@js.native
object VaultElectronicSignatureOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultElectronicSignatureOperations]

