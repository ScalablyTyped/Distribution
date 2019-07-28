package typings.mfiles

import typings.mfiles.MFilesNs.MFNamedValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedValueStorageOperationsAsync extends js.Object {
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

