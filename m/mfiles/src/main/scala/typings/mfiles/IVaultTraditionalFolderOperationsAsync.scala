package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultTraditionalFolderOperationsAsync extends js.Object {
  
  def GetTraditionalFolderContents(Folder: Double): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(Folder: Double, successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit]): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
