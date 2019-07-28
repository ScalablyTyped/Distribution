package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultExtensionMethodOperationsAsync extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String): Unit = js.native
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String, successCallback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

