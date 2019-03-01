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
    AddEmptySignature: js.Function2[IObjVer, java.lang.String, IObjectVersionAndProperties],
    AddEmptySignatures: js.Function1[IObjVer, IObjectVersionAndProperties],
    DisconnectSignature: js.Function2[IObjVer, java.lang.String, IObjectVersionAndProperties],
    DisconnectSignatureEx: js.Function3[IObjVer, java.lang.String, scala.Boolean, IObjectVersionAndProperties],
    DisconnectSignatures: js.Function1[IObjVer, IObjectVersionAndProperties],
    DisconnectSignaturesEx: js.Function2[IObjVer, scala.Boolean, IObjectVersionAndProperties]
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddEmptySignature")(AddEmptySignature)
    __obj.updateDynamic("AddEmptySignatures")(AddEmptySignatures)
    __obj.updateDynamic("DisconnectSignature")(DisconnectSignature)
    __obj.updateDynamic("DisconnectSignatureEx")(DisconnectSignatureEx)
    __obj.updateDynamic("DisconnectSignatures")(DisconnectSignatures)
    __obj.updateDynamic("DisconnectSignaturesEx")(DisconnectSignaturesEx)
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
}

