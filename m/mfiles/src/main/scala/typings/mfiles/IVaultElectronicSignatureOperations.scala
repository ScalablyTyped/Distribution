package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultElectronicSignatureOperations extends js.Object {
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
  def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
}

object IVaultElectronicSignatureOperations {
  @scala.inline
  def apply(
    AddEmptySignature: (IObjVer, String) => IObjectVersionAndProperties,
    AddEmptySignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignature: (IObjVer, String) => IObjectVersionAndProperties,
    DisconnectSignatureEx: (IObjVer, String, Boolean) => IObjectVersionAndProperties,
    DisconnectSignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignaturesEx: (IObjVer, Boolean) => IObjectVersionAndProperties
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal(AddEmptySignature = js.Any.fromFunction2(AddEmptySignature), AddEmptySignatures = js.Any.fromFunction1(AddEmptySignatures), DisconnectSignature = js.Any.fromFunction2(DisconnectSignature), DisconnectSignatureEx = js.Any.fromFunction3(DisconnectSignatureEx), DisconnectSignatures = js.Any.fromFunction1(DisconnectSignatures), DisconnectSignaturesEx = js.Any.fromFunction2(DisconnectSignaturesEx))
  
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
}

