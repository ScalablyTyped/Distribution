package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends StObject {
  
  val filesystem: FileSystem = js.native
  
  val fullPath: String = js.native
  
  def getMetadata(): Unit = js.native
  def getMetadata(onSuccess: js.Function1[/* arg */ Metadata, Unit]): Unit = js.native
  def getMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def getMetadata(onSuccess: Unit, onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  
  def getParent(): Unit = js.native
  def getParent(onSuccess: js.Function1[/* arg */ FileSystemDirectoryEntry, Unit]): Unit = js.native
  def getParent(
    onSuccess: js.Function1[/* arg */ FileSystemDirectoryEntry, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def getParent(onSuccess: Unit, onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  
  val isDirectory: Boolean = js.native
  
  val isFile: Boolean = js.native
  
  val name: String = js.native
  
  def remove(): Unit = js.native
  def remove(onSuccess: js.Function0[Unit]): Unit = js.native
  def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def remove(onSuccess: Unit, onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  
  def setMetadata(): Unit = js.native
  def setMetadata(onSuccess: js.Function1[/* arg */ Metadata, Unit]): Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, Unit],
    onError: js.Function1[/* arg */ FileError, Unit],
    options: Any
  ): Unit = js.native
  def setMetadata(onSuccess: js.Function1[/* arg */ Metadata, Unit], onError: Unit, options: Any): Unit = js.native
  def setMetadata(onSuccess: Unit, onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def setMetadata(onSuccess: Unit, onError: js.Function1[/* arg */ FileError, Unit], options: Any): Unit = js.native
  def setMetadata(onSuccess: Unit, onError: Unit, options: Any): Unit = js.native
  
  def toURL(): String = js.native
}
