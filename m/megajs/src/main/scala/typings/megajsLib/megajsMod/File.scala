package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("megajs", "File")
@js.native
class File protected () extends js.Object {
  def this(options: java.lang.String) = this()
  def this(options: FileOptions) = this()
  var attributes: js.Object = js.native
  var children: js.Array[File] = js.native
  var directory: scala.Boolean = js.native
  var downloadId: java.lang.String = js.native
  var key: nodeLib.Buffer = js.native
  var name: java.lang.String = js.native
  var nodeId: java.lang.String = js.native
  var size: scala.Double = js.native
  var timestamp: scala.Double = js.native
  def download(): nodeLib.streamMod.Readable = js.native
  def download(options: DownloadOptions): nodeLib.streamMod.Readable = js.native
  def download(options: DownloadOptions, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def loadAttributes(): nodeLib.streamMod.Readable = js.native
  def loadAttributes(cb: js.Any): nodeLib.streamMod.Readable = js.native
}

@JSImport("megajs", "File")
@js.native
object File extends js.Object {
  def fromURL(options: java.lang.String): megajsLib.megajsMod.File = js.native
  def fromURL(options: megajsLib.megajsMod.FileOptions): megajsLib.megajsMod.File = js.native
  def unpackAttributes(at: js.Any): stdLib.JSON = js.native
}

