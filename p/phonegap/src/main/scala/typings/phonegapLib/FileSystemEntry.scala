package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemEntry extends js.Object {
  var filesystem: FileSystem = js.native
  var fullPath: java.lang.String = js.native
  var isDirectory: scala.Boolean = js.native
  var isFile: scala.Boolean = js.native
  var name: java.lang.String = js.native
  def getMetadata(): scala.Unit = js.native
  def getMetadata(onSuccess: js.Function1[/* arg */ Metadata, scala.Unit]): scala.Unit = js.native
  def getMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def getParent(): scala.Unit = js.native
  def getParent(onSuccess: js.Function1[/* arg */ DirectoryEntry, scala.Unit]): scala.Unit = js.native
  def getParent(
    onSuccess: js.Function1[/* arg */ DirectoryEntry, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def remove(onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(onSuccess: js.Function0[scala.Unit], onError: js.Function1[/* arg */ FileError, scala.Unit]): scala.Unit = js.native
  def setMetadata(): scala.Unit = js.native
  def setMetadata(onSuccess: js.Function1[/* arg */ Metadata, scala.Unit]): scala.Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def setMetadata(
    onSuccess: js.Function1[/* arg */ Metadata, scala.Unit],
    onError: js.Function1[/* arg */ FileError, scala.Unit],
    options: js.Any
  ): scala.Unit = js.native
  def toURL(): java.lang.String = js.native
}

