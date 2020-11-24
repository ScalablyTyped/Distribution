package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends js.Object {
  
  var filesystem: FileSystem = js.native
  
  var fullPath: String = js.native
  
  def getMetadata(): Unit = js.native
  def getMetadata(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def getMetadata(onSuccess: js.Function1[/* arg */ Metadata, Unit]): Unit = js.native
  def getMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  
  def getParent(): Unit = js.native
  def getParent(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def getParent(onSuccess: js.Function1[/* arg */ DirectoryEntry, Unit]): Unit = js.native
  def getParent(
    onSuccess: js.Function1[/* arg */ DirectoryEntry, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  
  var isDirectory: Boolean = js.native
  
  var isFile: Boolean = js.native
  
  var name: String = js.native
  
  def remove(): Unit = js.native
  def remove(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def remove(onSuccess: js.Function0[Unit]): Unit = js.native
  def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  
  def setMetadata(): Unit = js.native
  def setMetadata(onSuccess: js.UndefOr[scala.Nothing], onError: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
  def setMetadata(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def setMetadata(
    onSuccess: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* arg */ FileError, Unit],
    options: js.Any
  ): Unit = js.native
  def setMetadata(onSuccess: js.Function1[/* arg */ Metadata, Unit]): Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.UndefOr[scala.Nothing],
    options: js.Any
  ): Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit],
    options: js.Any
  ): Unit = js.native
  
  def toURL(): String = js.native
}
