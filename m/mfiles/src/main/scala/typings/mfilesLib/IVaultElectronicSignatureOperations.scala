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

