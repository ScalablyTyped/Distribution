package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultElectronicSignatureOperationsAsync extends js.Object {
  
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def AddEmptySignatures(ObjVer: IObjVer): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignatures(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: String,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DisconnectSignatures(ObjVer: IObjVer): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatures(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
