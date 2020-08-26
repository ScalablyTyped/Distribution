package typings.memfs.promisesMod

import typings.memfs.volumeMod.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/promises", "FileHandle")
@js.native
class FileHandle protected () extends IFileHandle {
  def this(vol: Volume, fd: Double) = this()
  var vol: js.Any = js.native
  def sync(): js.Promise[Unit] = js.native
}

