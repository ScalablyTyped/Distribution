package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemDirectoryEntry
  extends StObject
     with FileSystemEntry {
  
  def createReader(): DirectoryReader = js.native
  
  def getDirectory(
    path: String,
    options: Flags,
    successCallback: js.Function1[/* result */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  def getFile(
    path: String,
    options: Flags,
    successCallback: js.Function1[/* result */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  def removeRecursively(successCallback: js.Function0[Unit], errorCallback: js.Function1[/* error */ FileError, Unit]): Unit = js.native
}
