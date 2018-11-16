package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEntry extends FileSystemEntry {
  def copyTo(
    parentEntry: DirectoryEntry,
    file: java.lang.String,
    onSuccess: js.Function1[/* arg */ DirectoryEntry, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def createWriter(): scala.Unit = js.native
  def createWriter(onSuccess: js.Function1[/* arg */ FileWriter, scala.Unit]): scala.Unit = js.native
  def createWriter(
    onSuccess: js.Function1[/* arg */ FileWriter, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def file(): scala.Unit = js.native
  def file(onSuccess: js.Function1[/* arg */ stdLib.File, scala.Unit]): scala.Unit = js.native
  def file(
    onSuccess: js.Function1[/* arg */ stdLib.File, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def moveTo(
    parentEntry: DirectoryEntry,
    file: java.lang.String,
    onSuccess: js.Function1[/* arg */ DirectoryEntry, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
}

