package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IObjVer
import typings.mfiles.IObjectVersionAndProperties
import typings.mfiles.IVaultElectronicSignatureOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultElectronicSignatureOperations")
@js.native
class VaultElectronicSignatureOperations () extends IVaultElectronicSignatureOperations {
  /* CompleteClass */
  override def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
}

@JSGlobal("MFiles.VaultElectronicSignatureOperations")
@js.native
object VaultElectronicSignatureOperations extends Instantiable0[IVaultElectronicSignatureOperations]

