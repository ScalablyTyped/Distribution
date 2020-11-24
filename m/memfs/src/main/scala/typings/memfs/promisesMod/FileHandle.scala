package typings.memfs.promisesMod

import typings.memfs.volumeMod.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/promises", "FileHandle")
@js.native
class FileHandle protected () extends IFileHandle {
  def this(vol: Volume, fd: Double) = this()
  
  def sync(): js.Promise[Unit] = js.native
  
  var vol: js.Any = js.native
}
