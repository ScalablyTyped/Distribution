package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultElectronicSignatureOperations extends js.Object {
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: java.lang.String): IObjectVersionAndProperties
  def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: java.lang.String): IObjectVersionAndProperties
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean
  ): IObjectVersionAndProperties
  def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: scala.Boolean): IObjectVersionAndProperties
}

object IVaultElectronicSignatureOperations {
  @scala.inline
  def apply(
    AddEmptySignature: (IObjVer, java.lang.String) => IObjectVersionAndProperties,
    AddEmptySignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignature: (IObjVer, java.lang.String) => IObjectVersionAndProperties,
    DisconnectSignatureEx: (IObjVer, java.lang.String, scala.Boolean) => IObjectVersionAndProperties,
    DisconnectSignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignaturesEx: (IObjVer, scala.Boolean) => IObjectVersionAndProperties
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal(AddEmptySignature = js.Any.fromFunction2(AddEmptySignature), AddEmptySignatures = js.Any.fromFunction1(AddEmptySignatures), DisconnectSignature = js.Any.fromFunction2(DisconnectSignature), DisconnectSignatureEx = js.Any.fromFunction3(DisconnectSignatureEx), DisconnectSignatures = js.Any.fromFunction1(DisconnectSignatures), DisconnectSignaturesEx = js.Any.fromFunction2(DisconnectSignaturesEx))
  
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
}

