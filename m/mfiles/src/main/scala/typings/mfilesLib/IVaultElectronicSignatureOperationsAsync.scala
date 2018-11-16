package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultElectronicSignatureOperationsAsync extends js.Object {
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: java.lang.String): scala.Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddEmptySignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddEmptySignatures(ObjVer: IObjVer): scala.Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddEmptySignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: java.lang.String): scala.Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DisconnectSignature(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean
  ): scala.Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DisconnectSignatureEx(
    ObjVer: IObjVer,
    SignatureIdentifier: java.lang.String,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignatures(ObjVer: IObjVer): scala.Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DisconnectSignatures(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: scala.Boolean): scala.Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DisconnectSignaturesEx(
    ObjVer: IObjVer,
    InvalidateDisconnectedSignatures: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

