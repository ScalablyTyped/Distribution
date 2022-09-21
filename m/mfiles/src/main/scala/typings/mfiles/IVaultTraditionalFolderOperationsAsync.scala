package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultTraditionalFolderOperationsAsync extends StObject {
  
  def GetTraditionalFolderContents(Folder: Double): Unit = js.native
  def GetTraditionalFolderContents(Folder: Double, successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit]): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: js.Function1[/* result */ ITraditionalFolderContents, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(
    Folder: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTraditionalFolderContents(Folder: Double, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
}
