package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultExtensionMethodOperationsAsync extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: java.lang.String): scala.Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DoesActiveVaultExtensionMethodExist(
    MethodIdentifier: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ExecuteVaultExtensionMethod(MethodIdentifier: java.lang.String, Input: java.lang.String): scala.Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: java.lang.String,
    Input: java.lang.String,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: java.lang.String,
    Input: java.lang.String,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ExecuteVaultExtensionMethod(
    MethodIdentifier: java.lang.String,
    Input: java.lang.String,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

