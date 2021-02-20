package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultExtensionMethodOperationsAsync extends StObject {
  
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
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
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String, successCallback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: String,
    Input: String,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
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
