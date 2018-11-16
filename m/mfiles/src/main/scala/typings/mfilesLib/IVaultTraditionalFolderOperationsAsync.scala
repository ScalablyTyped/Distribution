package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultTraditionalFolderOperationsAsync extends js.Object {
  def GetTraditionalFolderContents(Folder: scala.Double): scala.Unit = js.native
  def GetTraditionalFolderContents(
    Folder: scala.Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, scala.Unit]
  ): scala.Unit = js.native
  def GetTraditionalFolderContents(
    Folder: scala.Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetTraditionalFolderContents(
    Folder: scala.Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

