package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryEntry extends FileSystemEntry {
  def createReader(): DirectoryReader = js.native
  def getDirectory(
    path: java.lang.String,
    options: Flags,
    successCallback: js.Function1[/* result */ this.type, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def getFile(
    path: java.lang.String,
    options: Flags,
    successCallback: js.Function1[/* result */ FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def removeRecursively(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
}

@JSGlobal("DirectoryEntry")
@js.native
object DirectoryEntry
  extends ScalablyTyped.runtime.Instantiable2[/* name */ java.lang.String, /* root */ DirectoryEntry, DirectoryEntry]

