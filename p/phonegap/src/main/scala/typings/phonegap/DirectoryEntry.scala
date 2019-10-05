package typings.phonegap

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryEntry extends FileSystemEntry {
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

@JSGlobal("DirectoryEntry")
@js.native
object DirectoryEntry extends Instantiable2[/* name */ String, /* root */ DirectoryEntry, DirectoryEntry]

