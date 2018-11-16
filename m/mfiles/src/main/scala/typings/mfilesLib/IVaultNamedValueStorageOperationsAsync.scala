package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedValueStorageOperationsAsync extends js.Object {
  def GetNamedValues(NamedValueType: mfilesLib.MFilesNs.MFNamedValueType, Namespace: java.lang.String): scala.Unit = js.native
  def GetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit]
  ): scala.Unit = js.native
  def GetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValueNames: IStrings
  ): scala.Unit = js.native
  def RemoveNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValues: INamedValues
  ): scala.Unit = js.native
  def SetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValues: INamedValues,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValues: INamedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetNamedValues(
    NamedValueType: mfilesLib.MFilesNs.MFNamedValueType,
    Namespace: java.lang.String,
    NamedValues: INamedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

